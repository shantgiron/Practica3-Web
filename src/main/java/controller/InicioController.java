package controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.Request;
import spark.Response;
import spark.Route;
//FALTAN IMPORTS de clases

public class InicioController {

    public static Route paginaInicio = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        ArticuloService articuloService = new ArticuloService();

        List<Articulo> list = articuloService.encontrarTodos();

        model.put("articulos", list);

        String valor = "";

        return TemplateUtil.renderThymeleaf(model, Path.Template.INICIO);
    };
}
