package until;

import spark.template.thymeleaf.ThymeleafTemplateEngine;
import spark.ModelAndView;


import java.util.Map;
public class TemplateUntil {
    public static String renderThymeleaf(Map<String, Object> parametros, String path) {
        return new ThymeleafTemplateEngine().render(new ModelAndView(parametros, path));
    }
}
