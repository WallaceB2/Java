package wallace.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wallace.livraria.dtos.AutorRequestDTO;
import wallace.livraria.dtos.AutorResponseDTO;
import wallace.livraria.entity.Autor;
import wallace.livraria.repository.AutorRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AutorService {
    @Autowired
    private AutorRepository repository;

    public AutorResponseDTO create(AutorRequestDTO obj){
        Autor autor = new Autor();
        autor.setNome(obj.getNome());
        Autor savedAutor = repository.save(autor);
        return toResponseDTO(savedAutor);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public AutorResponseDTO getId(Long id){
        Optional<Autor> obj = repository.findById(id);
        return obj.map(this::toResponseDTO).orElse(null);
    }

    public List<AutorResponseDTO> getAll(){
        return repository.findAll().stream().map(this::toResponseDTO).collect(Collectors.toList());
    }

    public AutorResponseDTO update(Long id, AutorRequestDTO obj){
        Optional<Autor> newObj = repository.findById(id);
        if (newObj.isPresent()) {
            Autor autor = newObj.get();
            autor.setNome(obj.getNome());
            Autor updatedAutor = repository.save(autor);
            return toResponseDTO(updatedAutor);
        }
        return null;
    }

    private AutorResponseDTO toResponseDTO(Autor autor) {
        AutorResponseDTO dto = new AutorResponseDTO();
        dto.setId(autor.getId());
        dto.setNome(autor.getNome());
        return dto;
    }
}
