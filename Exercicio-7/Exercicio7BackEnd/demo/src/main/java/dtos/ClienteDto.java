package dtos;

public record ClienteDto(
        String saldo,
        String senha,
        String nome,
        Double transacao
) {}
