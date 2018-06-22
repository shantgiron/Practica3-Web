package main;

import controller.*;
import dao.implement.UsuarioDAOImpl;
import model.Usuario;
import spark.Spark;
import util.Path;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

public class Main {
    public static void main(String[] args) {
        Spark.staticFileLocation("/templates");

        get("/", (req, resp) -> {
            resp.redirect("/index");
            return null;
        });


        Usuario usuario = new Usuario();
        usuario.setUsername("admin");
        usuario.setPassword("admin");
        usuario.setAdministrator(true);
        usuario.setNombre("Shant");
        usuario.setAutor(true);

        new UsuarioDAOImpl().insertar(usuario);

        get(Path.Web.INICIO, InicioController.paginaInicio);
        get(Path.Web.LOGIN, LoginController.paginaLogin);
        post(Path.Web.LOGIN, LoginController.login);
        get(Path.Web.CREAR_USUARIO, CrearUsuarioController.paginaCrearUsuario);
        post(Path.Web.CREAR_USUARIO, CrearUsuarioController.crearUsuario);
        get (Path.Web.NO_ENCONTRADO, NoEncontradoController.noEncontrado);
        get(Path.Web.VER_ARTICULO, ArticuloController.ver);
       // post(Path.Web.ARTICULOS, ArticuloController.);

    }
}
