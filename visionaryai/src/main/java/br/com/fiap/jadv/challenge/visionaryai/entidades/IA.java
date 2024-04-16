package br.com.fiap.jadv.challenge.visionaryai.entidades;

import br.com.fiap.jadv.challenge.visionaryai.dtos.IaDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_ia")
@NoArgsConstructor
@Getter
@Setter

public class IA {
	
	@Id
	@GeneratedValue(
			generator = "id_ia", 
			strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "id_ia", 
			sequenceName = "sq_t_ia",
			allocationSize = 1)
	private Integer id;
	
	@Column(name = "tp_ia")
	private String tipo;
	
	@Column(name = "ds_ia")
	private String descricao;
	
	@Column(name = "acuracia")
	private String acuracia;
	
	@Column(name = "st_ia")
	private boolean status;
	
	public IA(IaDto ia) {
		
		this.tipo= ia.tipoDaIa();
		this.descricao= ia.descricaoDaIa();
		this.acuracia= ia.acuraciaDaIa();
		this.status= ia.statusDaIa();
	}
}
