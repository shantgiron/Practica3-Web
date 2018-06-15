package service;


import dao.EtiquetaDAO;
import dao.implement.EtiquetaDAOimpl;
import model.Etiqueta;

import java.util.List;

public class EtiquetaService  extends EtiquetaDAOimpl implements EtiquetaDAO {
    @Override
    public void insertar(Etiqueta etiqueta) {
        super.insertar(etiqueta);
    }

    @Override
    public void actualizar(Etiqueta etiqueta) {
        super.actualizar(etiqueta);
    }

    @Override
    public void borrar(Etiqueta etiqueta) {
        super.borrar(etiqueta);
    }

    @Override
    public List<Etiqueta> encontrarTodos() {
        return super.encontrarTodos();
    }

    @Override
    public Etiqueta encontrarPorId(Long id) {
        return super.encontrarPorId(id);
    }
}
