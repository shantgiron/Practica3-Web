package main;

import controller.CrearUsuarioController;
import controller.InicioController;
import controller.LoginController;
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

        get(Path.Web.INDEX, InicioController.paginaInicio);
        get(Path.Web.LOGIN, LoginController.paginaLogin);
        post(Path.Web.LOGIN, LoginController.login);
        get(Path.Web.CREAR_USUARIO, CrearUsuarioController.paginaCrearUsuario);
        post(Path.Web.CREAR_USUARIO, CrearUsuarioController.crearUsuario);


    }
}
