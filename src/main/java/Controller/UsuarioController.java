package Controller;

import interfaces.IUsuarioController;
import interfaces.IEntity;
import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioController implements IUsuarioController {	
	
	private UsuarioDAO _dao = new UsuarioDAO();

	public void add(Usuario usuario) {
		_dao.add(usuario);
	}

	public void update(Usuario usuario) {
		_dao.update(usuario);
	}

	public void removeByPrimaryKey(Usuario usuario) {
		_dao.removeByPrimaryKey(usuario, usuario.getPrimaryKey());
	}

	public void removeByObject(Usuario usuario) {
		_dao.removeByObject(usuario);
	}

	public IEntity listByPrimaryKey(Usuario usuario) {
		return _dao.listByPrimaryKey(usuario.getClass(), usuario.getPrimaryKey());
	}

	public IEntity listByObject(Usuario usuario) {
		return _dao.listByObject(usuario);
	}

}
