package br.com.fiap.jadv.challenge.visionaryai.entidades;

import java.time.LocalDateTime;

import br.com.fiap.jadv.challenge.visionaryai.dtos.CampanhaDto;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "t_campanha")
@NoArgsConstructor
@Getter
@Setter

public class Campanha {

	@Id
	@GeneratedValue(
			generator = "id_campanha", 
			strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "id_campanha", 
			sequenceName = "sq_t_campanha",
			allocationSize = 1)
	private Integer id;
	
	@Column(name = "st_campanha")
	private boolean status;
	
	@Column(name = "dt_inicio")
	private LocalDateTime dataInicio;
	
	@Column(name = "dt_fim")
	private LocalDateTime dataFim;
	
	@Column(name = "ds_campanha")
	private String descricao;
	
	public Campanha(CampanhaDto campanha) {
		
		this.status= campanha.statusDaCampanha();
		this.dataInicio= campanha.dataInicioCampanha();
		this.descricao= campanha.descricaoDaCampanha();
	}
	
}
