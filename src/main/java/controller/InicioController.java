package controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.ArticuloService;
import model.Articulo;
import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;
import util.Path;
import util.TemplateUtil;

import spark.Request;
import spark.Response;
import spark.Route;


public class InicioController {

    public static Route paginaInicio = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        ArticuloService articuloService = new ArticuloService();

        List<Articulo> list = articuloService.encontrarTodos();

        model.put("articulos", list);

        String valor = "";

        return new ThymeleafTemplateEngine().render(new ModelAndView(model, Path.Template.INICIO));
    };
}
