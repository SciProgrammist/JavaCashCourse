// Importamos las clases necesarias para el manejar la base de datos.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

// Trabajar de manera general la interaccion con la base de datos. RECOMENDACIONES.
import java.sql.*;

public class Main {

    // Manejos de excepciones RECOMENDCIONES.
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        // 1) Paso crear una conexion a la base de datos.
        Connection connection = null; // Buena consideracion, nombres de objetos en minuscula y como la clase. RECOMEND.
        // 2) Se definira un statment para poder ejecutar las consultas deseadas.
        Statement statement = null; // Buena consideracion. RECOMENDACIONES.
        // 3) Ahora con un Resultset se podra almacenar los datos obtenidos de la consulta.
        ResultSet resultSet = null; // Buena consideracion de nombre. RECOMENDACIONES.

        try {
            // La conexion nos da permiso.
            /**
             * connection = DriverManager.getConnection(DBUtils.MYSQL_DB, DBUtils.MYSQL_USER, DBUtils.MYSQL_PASSWORD);
             * System.out.println("Connected!!");
             */
            connection = DBUtils.getConnection(DBType.MYSQLDB);

            // Se crea la declaracion del statement que se va a implementar en la BD con la conexion ya establecida.
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            /**
             * -TYPE_SCROLL_INSENSITIVE solo se toman los datos del momento que se hace la consulta de una base
             *  de datos dinamica, sin importar que estos hayan cambiado luego.
             *
             * -CONCUR_READ_ONLY es el tipo de permiso que tendra el ResultSet.
             */

            // SELECT

            resultSet = statement.executeQuery("SELECT * FROM users");
            /**
             *  Existen 3 formas de ejecutar una consulta en Java:
             *  executeQuery: regresa un objeto statement. <- para las selecciones de datos de un Basa de Datos.
             *  execute: devuelve un valor booleano. <- consultas un poco complejas
             *  executeUpDate: nos regresa un valor de tipo int. <- para eliminar, actualizar, etc...
             *
             */

            //Para mostrar los datos que nos obtenemos de nuestro resultSet.
            while(resultSet.next()){
                System.out.println(resultSet.getString("id") +
                        " " +  resultSet.getString("nombre") +
                        " " + resultSet.getString("correo")+
                        " " + resultSet.getString("nacionalidad"));
            }


            /** INSERT
             * //Se define la setencia sql que en este caso es insert.
             * String sqlqueryInsert = "INSERT INTO users VALUES (?,?,?,?)"; // Nombre de variable de sql correcto.
             * PreparedStatement preparedStatement = connection.prepareStatement(sqlqueryInsert);
             * preparedStatement.setString(1,"1010");
             * preparedStatement.setString(2,"Maria");
             * preparedStatement.setString(3,"maria@maria.com");
             * preparedStatement.setString(4,"Argentina");
             *
             * int result = preparedStatement.executeUpdate();
             *
             * if(result == 1) System.out.println("Record successfully inserted.");
             * else System.out.println("Error");
             *
             */

            /** UPDATE
             * String sqlqueryUpdate = "update users set correo = ? where id = ? ";
             * PreparedStatement preparedStatement = connection.prepareStatement(sqlqueryUpdate);
             * preparedStatement.setString(1,"x@x.com");
             * preparedStatement.setString(2,"1010");
             *
             * int result = preparedStatement.executeUpdate();
             *
             * if(result == 1) Sytem.out.println("Record sucessfully updated.");
             * else System.out.println("Error");
             *
             */

            /** DELETE
             * String sqlqueryDelete = "DELETE FROM users WHERE id = ?";
             * PreparedStatement preparedStatemnt = connection.prepareStatement(sqlqueryDelete);
             * preparedStatement.setString(1,"1010");
             *
             * int result = preparedStatement.executeUpdate();
             *
             * if(result == 1) System.out.println("Record successfully deleted");
             * else System.out.println("Error");
             *
             */



        } catch (SQLException e) {
            //e.printStackTrace();
            DBUtils.processException(e);
        } finally {
            // Finalmente liberamos recursos.
            if (statement != null) statement.close();
            if (resultSet != null) resultSet.close();
            if(connection != null) connection.close();

        }
    }
}