package model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import interfaces.IEntity;
import model.embeddable.Endereco;

@Entity
public class Usuario implements IEntity {

	@Id
	private int id;
	
	@Column(nullable = false)
	private String nome;

	@Embedded
	private Endereco endereco;

	public Usuario() {
		this.endereco = new Endereco();

	}

	public Usuario(int id, String nome, Endereco endereco) {
		this.id = id;
		this.nome = nome;

		if (endereco == null)
			this.endereco = new Endereco();
		else {
			this.endereco.setLogradouro(endereco.getLogradouro());
			this.endereco.setNumero(endereco.getNumero());
			this.endereco.setComplemento(endereco.getComplemento());
			this.endereco.setBairro(endereco.getBairro());
			this.endereco.setCidade(endereco.getCidade());
			this.endereco.setUf(endereco.getUf());
			this.endereco.setCep(endereco.getCep());
		}
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
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Object getPrimaryKey() {
		return getId();
	}

	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}	

}
