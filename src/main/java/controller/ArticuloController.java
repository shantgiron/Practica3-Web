package controller;

import model.Comentario;
import model.Articulo;

import service.ArticuloService;
import util.TemplateUtil;
import util.Path;

import spark.QueryParamsMap;
import spark.Route;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArticuloController {
    public static Route ver = (request, response) -> {
        Map<String, Object> parametros = new HashMap<>();
        QueryParamsMap queryParamsMap = request.queryMap();

        Long id = Long.parseLong(queryParamsMap.get("id").value());

        Articulo articulo = new ArticuloService().encontrarPorId(id);
        List<Comentario> list = articulo.getListaComentarios();

        parametros.put("templates/articulo", articulo);
        parametros.put("comentarios", list);

       // return null;
        return TemplateUtil.renderThymeleaf(parametros, Path.Template.VER_ARTICULO);
    };
}


