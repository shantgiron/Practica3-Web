package controller;

import spark.QueryParamsMap;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap;
import java.util.Map;

import model.Usuario;
import service.UsuarioService;
import util.Path;
import util.TemplateUtil;


public class LoginController {
    public static Route paginaIndex = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();

        return TemplateUtil.renderThymeleaf(model, Path.Template.INDEX);
    };

    public static Route paginaLogin = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();

       // return null;
        return TemplateUtil.renderThymeleaf(model, Path.Template.LOGIN);
    };

    public static Route login = (request, response) -> {
        QueryParamsMap map = request.queryMap();

        UsuarioService usuarioService = new UsuarioService();
        Usuario usuario = usuarioService.encontrarPorCuentaUsuario(map.get("usuario").value());

        if (usuario != null) {
            //Iniciar sesion
            if (map.get("password").value().equals(usuario.getPassword())) {
                response.redirect(Path.Web.INICIO);
                return null;
            }
        }

        //No se inicio sesion
        return "Usuario o contrasena incorrecta.";
    };
}



