package dao;

import java.util.List;

public interface DAOPA <T, K extends Long>{
    void insertar(T t);

    void actualizar(T t);

    void borrar(T t);

    List<T> encontrarTodos();

    T encontrarPorId(K id);

}
