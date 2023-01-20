package br.com.pablo.site.api.paciente;

import br.com.pablo.site.api.endereco.DadosEndereco;
import br.com.pablo.site.api.medico.Especialidade;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\.?\\d{2}")
        String cpf,
        @NotNull @Valid DadosEndereco endereco) {
}
