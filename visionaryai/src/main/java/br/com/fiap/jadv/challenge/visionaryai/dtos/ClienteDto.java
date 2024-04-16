package br.com.fiap.jadv.challenge.visionaryai.dtos;

import jakarta.validation.constraints.NotBlank;

public record ClienteDto(
		 Integer id, 
		 @NotBlank(message = "O nome do cliente é obrigatório") String nomeDoCliente
	) {}

