package interfaces;
import model.Usuario;

public interface IUsuarioController {
	
	public void add(Usuario usuario);

	public void update(Usuario usuario);

	public void removeByPrimaryKey(Usuario usuario);

	public void removeByObject(Usuario usuario);

	public IEntity listByPrimaryKey(Usuario usuario);

	public IEntity listByObject(Usuario usuario);

}
