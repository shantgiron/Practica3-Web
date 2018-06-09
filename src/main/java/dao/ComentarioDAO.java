package dao;

import model.Comentario;

import java.util.List;

public interface ComentarioDAO  extends DAO<Comentario, Long>{
    @Override
    void insertar(Comentario comentario);

    @Override
    void actualizar(Comentario comentario);

    @Override
    void borrar(Comentario comentario);

    @Override
    List<Comentario> encontrarTodos();

    @Override
    Comentario encontrarPorId(Long id);
}
