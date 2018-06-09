package dao;


import java.util.List;

import model.Etiqueta;

public interface EtiquetaDAO extends DAO <Etiqueta, Long> {
    @Override
    void insertar(Etiqueta etiqueta);

    @Override
    void actualizar(Etiqueta etiqueta);

    @Override
    void borrar(Etiqueta etiqueta);

    @Override
    List<Etiqueta> encontrarTodos();

    @Override
    Etiqueta encontrarPorId(Long id);

}
