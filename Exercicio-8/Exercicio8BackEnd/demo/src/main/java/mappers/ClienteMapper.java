package mappers;

import dtos.ClienteDto;
import modelos.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public ClienteDto toDto(Cliente cliente) {
        return new ClienteDto(
                cliente.getNome(),
                cliente.getSaldo().toString(),
                cliente.getSenha(),
                cliente.getTransacao()
        );
    }

    public Cliente toEntity(ClienteDto clienteDto) {
        return new Cliente(
                0,
                clienteDto.saldo(),
                clienteDto.senha(),
                null
        );
    }
}
