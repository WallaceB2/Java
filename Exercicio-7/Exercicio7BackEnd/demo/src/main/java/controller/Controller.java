package controller;

import dtos.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.PagamentoService;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    PagamentoService pagamentoService;

    @GetMapping("/clientes")
    public ResponseEntity<Object> getClientes(){
        List<ClienteDto> listaClientes = pagamentoService.getListaClientes();
        return ResponseEntity.status(200).body(listaClientes);
    }
    @PostMapping("/clientes")
    public ResponseEntity<Object> saveCliente(@RequestBody ClienteDto clienteDto) {
        ClienteDto createdClienteDTO = pagamentoService.saveCliente(clienteDto);
        return ResponseEntity.status(201).body(createdClienteDTO);
    }
}
