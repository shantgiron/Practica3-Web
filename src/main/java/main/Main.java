package main;

import controller.InicioController;
import controller.LoginController;
import spark.Spark;
import util.Path;

import static spark.Spark.get;
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
    }
}
