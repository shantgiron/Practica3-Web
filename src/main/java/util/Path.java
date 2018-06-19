package util;

public class Path {
    public static class Web {
        //Para el manejo de las rutas
        public static final String INDEX = "/index";
        public static final String LOGIN = "/login";
        public static final String NO_ENCONTRADO = "*";
        public static final String INICIO = "/inicio";
        public static final String CREAR_USUARIO = "/crearUsuario";
        public static final String COMENTARIOS = "/templates/comentario/";
        public static final String VER_ARTICULO = "/templates/articulo/";
        public static final String ARTICULOS = "/templates/verTodosArticulos";

    }

    //al no especificar la extension del archivo, thymeleaf sabe que es HTML
    public static class Template {
        public static final String INDEX = "/index";
        public static final String INICIO = "/templates/Inicio";
        public static final String ARTICULO = "/templates/CrearArticulo";
        public static final String LOGIN = "/templates/login/Login";
        public static final String NO_ENCONTRADO = "/templates/Notfound";
        public static final String VER_ARTICULO = "/templates/VerArticulo";
        public static final String CREAR_USUARIO = "/templates/CrearUsuario";

    }
}
