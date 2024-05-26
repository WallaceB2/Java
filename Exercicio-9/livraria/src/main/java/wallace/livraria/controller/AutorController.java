package wallace.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wallace.livraria.dtos.AutorRequestDTO;
import wallace.livraria.dtos.AutorResponseDTO;
import wallace.livraria.service.AutorService;

import java.util.List;

@RestController
@RequestMapping(value = "/autor")
public class AutorController {
    @Autowired
    private AutorService service;

    @PostMapping
    public ResponseEntity<AutorResponseDTO> create(@RequestBody AutorRequestDTO obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<AutorResponseDTO> getId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.getId(id));
    }

    @GetMapping
    public ResponseEntity<List<AutorResponseDTO>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<AutorResponseDTO> update(@PathVariable Long id, @RequestBody AutorRequestDTO obj){
        return ResponseEntity.ok().body(service.update(id, obj));
    }
}
