package controller;

import spark.*;

import java.util.HashMap;
import java.util.Map;

import model.Usuario;
import service.UsuarioService;
import spark.template.thymeleaf.ThymeleafTemplateEngine;
import util.Path;
import util.TemplateUtil;


public class LoginController {
    public static Route paginaIndex = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();

        return TemplateUtil.renderThymeleaf(model, Path.Template.INDEX);
    };

    public static Route paginaLogin = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();

        String username = request.cookie("username");
        String password = request.cookie("password");

        if (username == null)
            username = "";

        if (password == null)
            password = "";

        model.put("username", username);
        model.put("password", password);

       // return null;
        return new ThymeleafTemplateEngine().render(new ModelAndView(model, Path.Template.LOGIN));
    };

    public static Route login = (request, response) -> {
        QueryParamsMap map = request.queryMap();

        response.cookie("username", map.get("usuario").value(), 3600);
        response.cookie("password", map.get("password").value(), 3600);

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



