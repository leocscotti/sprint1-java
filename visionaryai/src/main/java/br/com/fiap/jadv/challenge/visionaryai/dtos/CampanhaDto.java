package br.com.fiap.jadv.challenge.visionaryai.dtos;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;

public record CampanhaDto(
		Integer id, 
		@NotBlank(message = "Informe se a campanha está ativa ou não") boolean statusDaCampanha,
	    @NotBlank(message = "Informe a data de início da campanha") LocalDateTime dataInicioCampanha,
	    @NotBlank(message = "Descreva sua campnha") String descricaoDaCampanha) {
}
