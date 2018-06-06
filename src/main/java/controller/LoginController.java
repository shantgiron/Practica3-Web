package controller;

import spark.QueryParamsMap;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap;
import java.util.Map;

//FALTAN IMPORTS DE CLASES, PATH, TEMPLATE...
public class LoginController {
    public static Route paginaLogin = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();

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



