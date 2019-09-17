package model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import interfaces.IEntity;
import model.embeddable.Endereco;

@Entity
@Table (name = "usuario")
public class Usuario implements IEntity{
	
	@Id
	private int id;
	@Column (nullable = false)
	private String nome;
	
	@Embedded
	private Endereco enderco;
		
	public Usuario() {

	}
	
	public Usuario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public Object getPrimaryKey() {
		return getId();
	}

}
