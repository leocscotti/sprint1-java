package br.com.fiap.jadv.challenge.visionaryai.entidades;

import br.com.fiap.jadv.challenge.visionaryai.dtos.ClienteDto;
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
@Table(name = "tb_cliente")
@NoArgsConstructor
@Getter
@Setter
public class Cliente {
	@Id
	@GeneratedValue(
			generator = "id_cliente", 
			strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "id_cliente", 
			sequenceName = "sq_t_cliente",
			allocationSize = 1)
	private Integer id;
	
	@Column(name = "nm_cliente")
	private String nome;
	
	public Cliente(ClienteDto cliente) {
		this.nome= cliente.nomeDoCliente();
	}
}