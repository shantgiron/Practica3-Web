package database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
        private final Logger logger = LoggerFactory.getLogger(ConexionDB.class);

        private final String DRIVER = "org.h2.Driver";
        private final String DB_NAME = "H2/BLOG";
        private final int PORT = 9092;
        private final String URL_SERVIDOR = "jdbc:h2:mem:" + DB_NAME;
        private final String URL_EMBEBIDA = "jdbc:h2:~/test";
        private final String USERNAME = "shantgiron";
        private final String PASSWORD = "shant88888";

        private Connection connection = null;

        public Connection getConexion() {
            try {
                Class.forName(DRIVER);

                connection = DriverManager.getConnection(URL_SERVIDOR, USERNAME, PASSWORD);

                return connection;
            } catch (ClassNotFoundException | SQLException e) {
                logger.debug("Error al extraer la conexion de la base de datos.", e);
                return null;
            } catch (NullPointerException e) {
                logger.debug("El servidor no ha sido iniciado.");
                return null;
            }
        }
    }




