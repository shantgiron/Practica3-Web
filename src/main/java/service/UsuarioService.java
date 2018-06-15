package service;

import dao.UsuarioDAO;
import dao.implement.UsuarioDAOImpl;
import model.Usuario;
import java.util.List;

public class UsuarioService  extends UsuarioDAOImpl implements UsuarioDAO {
    @Override
    public void insertar(Usuario usuario) {
        super.insertar(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        super.actualizar(usuario);
    }

    @Override
    public void borrar(Usuario usuario) {
        super.borrar(usuario);
    }

    @Override
    public List<Usuario> encontrarTodos() {
        return super.encontrarTodos();
    }

    @Override
    public Usuario encontrarPorId(Long id) {
        return super.encontrarPorId(id);
    }

    @Override
    public Usuario encontrarPorNombre(String nombre) {
        return super.encontrarPorNombre(nombre);
    }

    @Override
    public Usuario encontrarPorCuentaUsuario(String usuario) {
        return super.encontrarPorCuentaUsuario(usuario);
    }
}

