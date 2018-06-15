package service;

import dao.ComentarioDAO;
import dao.implement.ComentarioDAOImpl;
import model.Comentario;


import java.util.List;

public class ComentarioService  extends ComentarioDAOImpl implements ComentarioDAO{

    @Override
    public void insertar(Comentario comentario) {
        super.insertar(comentario);
    }

    @Override
    public void actualizar(Comentario comentario) {
        super.actualizar(comentario);
    }

    @Override
    public void borrar(Comentario comentario) {
        super.borrar(comentario);
    }

    @Override
    public List<Comentario> encontrarTodos() {
        return super.encontrarTodos();
    }

    @Override
    public Comentario encontrarPorId(Long id) {
        return super.encontrarPorId(id);
    }

}
