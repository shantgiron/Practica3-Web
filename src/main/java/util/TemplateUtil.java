package util;

import java.util.Map;
import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;
public class TemplateUtil {
    public static String renderThymeleaf(Map<String, Object> parametros, String path){
        return new ThymeleafTemplateEngine().render (new ModelAndView(parametros, path));
    }
}
