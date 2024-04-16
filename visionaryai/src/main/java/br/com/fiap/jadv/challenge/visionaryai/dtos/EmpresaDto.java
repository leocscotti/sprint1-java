package br.com.fiap.jadv.challenge.visionaryai.dtos;

import jakarta.validation.constraints.NotBlank;

public record EmpresaDto(
    Integer id,
    @NotBlank(message = "O CNPJ da empresa é obrigatório") String cnpj,
    @NotBlank(message = "O nome da empresa é obrigatório") String nomeDaEmpresa,
    @NotBlank(message = "O email corporativo é obrigatório") String emailDaEmpresa,
    @NotBlank(message = "Informe se a empresa está ativa ou não") boolean situacaoDaEmpresa
) {
    
}

