package util;

public class Path {
    public static class Web {
        //Para el manejo de las rutas
        public static final String INDEX = "/index";
        public static final String LOGIN = "/login";
        public static final String NO_ENCONTRADO = "*";
        public static final String INICIO = "/homePage";
        public static final String CREAR_USUARIO = "/crearUsuario";
        public static final String COMENTARIOS = "/comentario";
        public static final String VER_ARTICULO = "/verArticulo";
        public static final String ARTICULOS = "/verTodosArticulos";

    }

    //al no especificar la extension del archivo, thymeleaf sabe que es HTML
    public static class Template {
        public static final String INDEX = "/index";
        public static final String INICIO = "/HomePage";
        public static final String ARTICULO= "/articulo/CrearArticulo";
        public static final String LOGIN = "/login/Login";
        public static final String NO_ENCONTRADO = "/NotFound";
        public static final String VER_ARTICULO = "/articulo/VerArticulo";
        public static final String CREAR_USUARIO = "/usuario/CrearUsuario";

    }
}
