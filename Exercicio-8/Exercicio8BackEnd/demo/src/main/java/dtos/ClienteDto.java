package dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ClienteDto(
        @NotNull
        @Positive(message = "Precisa de um saldo")
        String saldo,
        @NotNull
        @NotBlank(message = "Precisa de uma senha")
        String senha,

        @NotBlank(message = "Precisa de um nome")
        String nome,
        @NotNull
        Double transacao
) {}
