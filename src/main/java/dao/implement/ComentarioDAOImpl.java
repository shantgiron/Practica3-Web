package dao.implement;

import model.Comentario;
import database.ConexionDB;
import dao.ComentarioDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComentarioDAOImpl implements ComentarioDAO {

    private static final Logger logger = LoggerFactory.getLogger(ArticuloDAOImpl.class);

    private final String INSERT = "INSERT INTO COMENTARIO (ID,COMENTARIO, AUTOR_ID, ARTICULO_ID) VALUES (?,?,?,?)";
    private final String DELETE = "DELETE FROM COMENTARIO WHERE ID = ? AND COMENTARIO = ? AND AUTOR_ID = ? AND ARTICULO_ID = ?";
    private final String UPDATE = "UPDATE COMENTARIO SET COMENTARIO = ?, AUTOR_ID = ?, ARTICULO_ID = ? WHERE ID = ?";
    private final String SELECT = "SELECT ID,COMENTARIO,AUTOR_ID,ARTICULO_ID FROM COMENTARIO";
    private final String SELECT_POR_ID = "SELECT ID,COMENTARIO,AUTOR_ID,ARTICULO_ID FROM COMENTARIO WHERE ID = ?";

    private final String INSERT_ARTICULO_COMENTARIOS = "INSERT INTO ARTICULO_COMENTARIOS (ID, ARTICULO_ID, COMENTARIO_ID) VALUES (?,?,?)";

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private Statement statement = null;

    @Override
    public void insertar(Comentario comentario) {
        try {
            ConexionDB conexionDB = new ConexionDB();

            connection = conexionDB.getConexion();
            preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setLong(1, comentario.getId());
            preparedStatement.setString(2, comentario.getComentario());
            preparedStatement.setLong(3, comentario.getAutor().getId());
            preparedStatement.setLong(4, comentario.getArticulo().getId());

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            logger.debug("Error al hacer el insert en la clase comentario.", e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    logger.debug("Error al cerrar el prepared statement", e);
                }
            }

            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    logger.debug("Error al cerrar la conexion de la bd", e);
                }
        }
    }

    @Override
    public void actualizar(Comentario comentario) {
        try {
            ConexionDB conexionDB = new ConexionDB();

            connection = conexionDB.getConexion();
            preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, comentario.getComentario());
            preparedStatement.setLong(2, comentario.getAutor().getId());
            preparedStatement.setLong(3, comentario.getArticulo().getId());
            preparedStatement.setLong(4, comentario.getId());

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            logger.debug("Error al hacer el update en la clase comentario.", e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    logger.debug("Error al cerrar el prepared statement", e);
                }
            }

            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    logger.debug("Error al cerrar la conexion de la bd", e);
                }
        }
    }

    @Override
    public void borrar(Comentario comentario) {
        try {
            ConexionDB conexionDB = new ConexionDB();

            connection = conexionDB.getConexion();
            preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setLong(1, comentario.getId());
            preparedStatement.setString(2, comentario.getComentario());
            preparedStatement.setLong(3, comentario.getAutor().getId());
            preparedStatement.setLong(4, comentario.getArticulo().getId());

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            logger.debug("Error al hacer el delete en la clase comentario.", e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    logger.debug("Error al cerrar el prepared statement", e);
                }
            }

            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    logger.debug("Error al cerrar la conexion de la bd", e);
                }
        }
    }

    @Override
    public List<Comentario> encontrarTodos() {
        List<Comentario> list = null;
        Comentario comentario = null;

        try {
            list = new ArrayList<>();

            ConexionDB conexionDB = new ConexionDB();
            connection = conexionDB.getConexion();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SELECT);

            while (resultSet.next()) {
                comentario = new Comentario();
                comentario.setId(resultSet.getLong("ID"));
                comentario.setComentario(resultSet.getString("COMENTARIO"));
                comentario.setAutor(new UsuarioDAOImpl().encontrarPorId(resultSet.getLong("AUTOR_ID")));
                comentario.setArticulo(new ArticuloDAOImpl().encontrarPorId(resultSet.getLong("ARTICULO_ID")));

                list.add(comentario);
            }

            resultSet.close();

            return list;
        } catch (SQLException e) {
            logger.debug("Error al hacer select.", e);
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    logger.debug("Error al cerrar el statement en el insert.");
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    logger.debug("Error al cerrar la conexion en el insert", e);
                }
            }
        }
    }

    @Override
    public Comentario encontrarPorId(Long id) {
        return null;
    }
}

