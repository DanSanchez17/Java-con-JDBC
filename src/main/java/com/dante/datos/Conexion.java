package com.dante.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *En esta clase crearemos la conexion a la base de datos pevieamente creada en mysql
 * como buenas practicas se define esta clase en el paquete de datos
 * 
 * @author Dante Sánchez
 */
public class Conexion {
    
    //primero crear nuestras variables FINALES donde contengan la url, el usuario y la contraseña de nuestra bd
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    
    //ahora vamos a crear un metodo llamado getConnection que regrese un objeto de tipo Connection donde se hara la conexion a la bd
    //sera publico, estatico y regrsara un objeto tipo Connection (debemos importar la clase Connection )
    public static Connection getConnection() throws SQLException{
        //llamamos a la clase DriverManager para ocupar el metodo getconnection de esa clase y lo llenamos con nuestras variables
        //y este mismo codigo es el que vamos a retornar (return)
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);//lanza para poner una SQLexception
        
    } //pide un tipo de regreso (return)
    
    
    
    //AHORA hay que agregar los metodo para cerrar los objetos de las conexiones (BUENAS PRACTICAS)
    //CREAREMOS metodos llamados igual(close), PERO sobrecargados, es decir recibiran diferentes objetos, cada uno con su objeto
    
    //metodo para cerrar nuestros ResultSet
    public static void close(ResultSet rs) throws SQLException{
        //lo mandamos a cerrar solamente
        rs.close();//arroja una excepcion SQL, la añadimos
        
    }
    
    
    //metodo para cerrar nuestros Statement
    public static void close(Statement st) throws SQLException{
        //lo cerramos
        st.close();
    }
    
    
    //metodo para cerrar nuestros PreparedStatement (SE OCUPA MAS ESTE QUE STATEMENT PORQUE TIENE UN MEJOR FUNCIONAMIENTO)
    public static void close(PreparedStatement ps) throws SQLException{
        //cerramos la conexion
        ps.close();
        
    }
    
    
    
    //por ultimo cerramos nuestra conexion a la bd
    public static void close(Connection cn) throws SQLException{
        cn.close();
    }
    
    
}
