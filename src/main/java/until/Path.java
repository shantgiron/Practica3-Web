package until;

public class Path {
    public static class Web {
        //Para el manejo de las rutas
        public static final String LOGIN = "/login";
        public static final String NO_ENCONTRADO = "*";
        public static final String INICIO = "/inicio";
        public static final String CREAR_USUARIO = "/usuario/crearUsuario";
        public static final String COMENTARIOS = "/comentario/";
        public static final String VER_ARTICULO = "/articulo/";
        public static final String ARTICULOS = "/articulo/verTodos";

    }

    //al no especificar la extension del archivo, thymeleaf sabe que ya de por si es HTML
    public static class Template {
        public static final String INICIO = "/Inicio";
        public static final String ARTICULO = "/articulo/CrearArticulo";
        public static final String LOGIN = "/login/Login";
        public static final String NO_ENCONTRADO = "/NoEncontrado";
        public static final String VER_ARTICULO = "/articulo/VerArticulo";
        public static final String CREAR_USUARIO = "/usuario/CrearUsuario";

    }
}
