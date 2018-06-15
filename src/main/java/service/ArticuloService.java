package service;


import dao.ArticuloDAO;
import dao.implement.ArticuloDAOImpl;
import model.Articulo;

import java.util.List;

public class ArticuloService  extends ArticuloDAOImpl implements ArticuloDAO {

    public ArticuloService() {
        super();
    }

    @Override
    public void insertar(Articulo articulo) {
        super.insertar(articulo);
    }

    @Override
    public void actualizar(Articulo articulo) {
        super.actualizar(articulo);
    }

    @Override
    public void borrar(Articulo articulo) {
        super.borrar(articulo);
    }

    @Override
    public List<Articulo> encontrarTodos() {
        return super.encontrarTodos();
    }

    @Override
    public Articulo encontrarPorId(Long id) {
        return super.encontrarPorId(id);
    }
}



