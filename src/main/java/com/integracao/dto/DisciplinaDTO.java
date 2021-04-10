package com.integracao.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.integracao.domain.Disciplina;
import com.integracao.services.validation.DisciplinaUpdate;

@DisciplinaUpdate
public class DisciplinaDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotNull(message="Preenchimento Obrigatório")
	@Length(min=6, max = 8, message = "O tamanho deve ser 8 caracteres")
	private String codigo;
	
	@NotNull(message="Preenchimento Obrigatório")
	@Length(min=5, max = 120, message = "O tamanho deve ser entre 5 e 120 caracteres")
	private String nome;
	
	@NotNull(message="Preenchimento Obrigatório")	
	private String cargahoraria;
	
	@NotNull(message="Preenchimento Obrigatório")
	@Length(min=1, max = 120, message = "n, se não tiver")
	private String equivalentes;
	
	@NotNull(message="Preenchimento Obrigatório")
	@Length(min=1, max = 120, message = "n, se não tiver")
	private String prerequisitos;
	
	@NotNull(message="Preenchimento Obrigatório")
	private String ementa;
	
	
	public DisciplinaDTO() {
		
	}
	
	public DisciplinaDTO(Disciplina obj) {
		id = obj.getId();
		codigo = obj.getCodigo();
		nome = obj.getNome();
		cargahoraria = obj.getCargahoraria();
		equivalentes = obj.getEquivalentes();
		ementa = obj.getEmenta();
		prerequisitos = obj.getPrerequisitos();
	}
	
	
	public DisciplinaDTO(Integer id) {
		super();
		this.id = id;
			
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	public String getEquivalentes() {
		return equivalentes;
	}

	public void setEquivalentes(String equivalentes) {
		this.equivalentes = equivalentes;
	}

	public String getPrerequisitos() {
		return prerequisitos;
	}

	public void setPrerequisitos(String prerequisitos) {
		this.prerequisitos = prerequisitos;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}


	
	
	
}
