package dao;

import model.Articulo;

import java.util.List;

public interface ArticuloDAO extends DAOPA<Articulo, Long>  {
    @Override
    void insertar(Articulo articulo);

    @Override
    void actualizar(Articulo articulo);

    @Override
    void borrar(Articulo articulo);

    @Override
    List<Articulo> encontrarTodos();

    @Override
    Articulo encontrarPorId(Long id);

}
