package dao;

import model.Usuario;

public interface UsuarioDAO extends DAO<Usuario, Long>{
    @Override
    void insertar(Usuario usuario);

    @Override
    void actualizar(Usuario usuario);

    @Override
    void borrar(Usuario usuario);

    @Override
    List<Usuario> encontrarTodos();

    @Override
    Usuario encontrarPorId(Long id);

    Usuario encontrarPorNombre(String nombre);

    Usuario encontrarPorCuentaUsuario(String usuario);
}
