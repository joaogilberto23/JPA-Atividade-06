package dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Controller.UsuarioController;
import model.Usuario;
import model.embeddable.Endereco;

public class Testes {

	private UsuarioController us = new UsuarioController();

	@Test
	public void testarInserir() {

		// arrange

		Usuario usuario = new Usuario();

		usuario.setId(1);
		usuario.setNome("João Gilberto");

		Endereco endereco = new Endereco();

		endereco.setLogradouro("Estrada do Bonsucesso");
		endereco.setNumero(114);
		endereco.setComplemento("-");
		endereco.setBairro("Bonsucesso");
		endereco.setCidade("Olinda");
		endereco.setUf("PE");
		endereco.setCep(53240150);
		
		usuario.setEndereco(endereco);

		// act

		us.add(usuario);
		Usuario expected = (Usuario) us.listByObject(usuario);

		// assert

		assertEquals(expected.toString(), usuario.toString());

	}

}
