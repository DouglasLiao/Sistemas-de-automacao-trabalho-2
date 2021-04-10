package com.integracao.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Disciplina implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	
	private String codigo;
	private String nome;	
	private String cargahoraria;
	private String equivalentes;
	private String ementa;
	private String prerequisitos;
	
	public Disciplina() {
	}
	


	public Disciplina(Integer id, String codigo,String nome, String cargahoraria, String equivalentes, String ementa, String prerequisitos) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
		this.cargahoraria = cargahoraria;
		this.equivalentes = equivalentes;
		this.ementa = ementa;
		this.prerequisitos = prerequisitos;

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


	public String getEquivalentes() {
		return equivalentes;
	}



	public void setEquivalentes(String equivalentes) {
		this.equivalentes = equivalentes;
	}



	public String getEmenta() {
		return ementa;
	}



	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}



	public String getPrerequisitos() {
		return prerequisitos;
	}



	public void setPrerequisitos(String prerequisitos) {
		this.prerequisitos = prerequisitos;
	}

	
	public String getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
