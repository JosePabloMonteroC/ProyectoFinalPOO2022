package com.mfg.modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 * La clase establece la conexion inicial a la base de datos.
 * Utilizando java.sql nos comunicamos al servidor SQL en este caso conectado a nuestra computadora utilizando XAMPP.
 * 
 * @author Emilio Rom�n y Jos� Pablo Montero
 *
 */
public class ConectarBD {
	static Connection conn;
	
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost:3306/proyectofinal2022";
	
	/**
	 * M�todo que crea la conexi�n con el servidor, en caso de fallar arrojar� un error de SQL
	 */
	public ConectarBD(){
		
		try{
			
			Class.forName(driver);
			// Gestiona la conexión a la BD
			conn = DriverManager.getConnection(url,user,password);
			if (conn != null){
				JOptionPane.showMessageDialog(null, "Se conecto a la base de datos: 'Proyecto Final'","Mens",JOptionPane.INFORMATION_MESSAGE);
			}			
		}catch (ClassNotFoundException | SQLException e){
			System.out.println("Código de Error: " + ((SQLException) e).getErrorCode() + "\n" +
					"SLQState: " + ((SQLException) e).getSQLState() + "\n" +
					"Mensaje: " + e.getMessage() + "\n");
			System.out.println("NO Se conectó");
		}
	}

	// Desde otra clase probamos  la conexion
	/**
	 * Getter de la conexi�n en caso de necesitarla desde otra clase
	 * @return
	 */
	public Connection getConnection(){
		return conn;
	}

	/**
	 * M�todo que imprime en caso de que la conexi�n termine
	 */
	public void DesConnection(){
		if(conn == null){
			System.out.println("Termino la conexion");

		}
	}
}

