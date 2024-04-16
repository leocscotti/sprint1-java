package br.com.fiap.jadv.challenge.visionaryai.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import br.com.fiap.jadv.challenge.visionaryai.dtos.EmpresaDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "t_empresa")
@NoArgsConstructor
@Getter
@Setter
public class Empresa {
	@Id
	@GeneratedValue(
			generator = "id_empresa", 
			strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "id_empresa", 
			sequenceName = "sq_t_empresa",
			allocationSize = 1)
	private Integer id;
	
	@Column(name = "cnpj")
	private String cnpj;
	
	@Column(name = "ds_email")
	private String email;
	
	@Column(name = "nm_empresa")
	private String nome;
	
	@Column(name = "st_empresa")
	private boolean situacao;
	
	
	
	public Empresa(EmpresaDto empresa) {
        this.cnpj = empresa.cnpj();
        this.nome = empresa.nomeDaEmpresa();
        this.email = empresa.emailDaEmpresa();
        this.situacao = empresa.situacaoDaEmpresa();
		
	}

	
}
