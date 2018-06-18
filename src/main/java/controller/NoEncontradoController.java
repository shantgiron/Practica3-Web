package controller;
import java.util.HashMap;
import java.util.Map;

import spark.Route;
import util.Path;
import util.TemplateUtil;


public class NoEncontradoController {
        public static Route noEncontrado = (request, response) -> {
            Map<String, Object> parametros = new HashMap<>();
            response.status(404);
            return TemplateUtil.renderThymeleaf(parametros, Path.Template.NO_ENCONTRADO);
        };
    }

