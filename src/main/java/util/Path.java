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
        public static final String INICIO = "/Inicio";
        public static final String ARTICULO = "/CrearArticulo";
        public static final String LOGIN = "/login/Login";
        public static final String NO_ENCONTRADO = "/Notfound";
        public static final String VER_ARTICULO = "/VerArticulo";
        public static final String CREAR_USUARIO = "/CrearUsuario";

    }
}
