package service;

import dtos.ClienteDto;
import mappers.ClienteMapper;
import modelos.Cliente;
import modelos.Transacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PagamentoService {
    @Autowired
    private ClienteMapper clienteMapper;

    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    private PagamentoService() {
        Transacao transacao = new Transacao("Arthur", "Wallace", 500.0);
        Cliente cliente = new Cliente(1500.0, "abc", "abc", transacao);
        listaClientes.add(cliente);
    }

    public List<ClienteDto> getListaClientes() {
        List<ClienteDto> listaDto = listaClientes.stream().map(clienteMapper::toDto).toList();
        return listaDto;
    }

    public ClienteDto saveCliente(ClienteDto clienteDto) {
        Cliente cliente = clienteMapper.toEntity(clienteDto);
        cliente.setCliente(new Cliente(1500.0, "abcde", "wallace", null));
        listaClientes.add(cliente);
        return clienteMapper.toDto(cliente);
    }

}
