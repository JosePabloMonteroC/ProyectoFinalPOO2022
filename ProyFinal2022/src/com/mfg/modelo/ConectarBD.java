package com.mfg.modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 * La clase establece la conexion inicial a la base de datos.
 * Utilizando java.sql nos comunicamos al servidor SQL en este caso conectado a nuestra computadora utilizando XAMPP.
 * 
 * @author Emilio Román y José Pablo Montero
 *
 */
public class ConectarBD {
	static Connection conn;
	
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost:3306/proyectofinal2022";
	
	/**
	 * Método que crea la conexión con el servidor, en caso de fallar arrojará un error de SQL
	 */
	public ConectarBD(){
		
		try{
			
			Class.forName(driver);
			// Gestiona la conexiÃ³n a la BD
			conn = DriverManager.getConnection(url,user,password);
			if (conn != null){
				JOptionPane.showMessageDialog(null, "Se conecto a la base de datos: 'Proyecto Final'","Mens",JOptionPane.INFORMATION_MESSAGE);
			}			
		}catch (ClassNotFoundException | SQLException e){
			System.out.println("CÃ³digo de Error: " + ((SQLException) e).getErrorCode() + "\n" +
					"SLQState: " + ((SQLException) e).getSQLState() + "\n" +
					"Mensaje: " + e.getMessage() + "\n");
			System.out.println("NO Se conectÃ³");
		}
	}

	// Desde otra clase probamos  la conexion
	/**
	 * Getter de la conexión en caso de necesitarla desde otra clase
	 * @return
	 */
	public Connection getConnection(){
		return conn;
	}

	/**
	 * Método que imprime en caso de que la conexión termine
	 */
	public void DesConnection(){
		if(conn == null){
			System.out.println("Termino la conexion");

		}
	}
}

