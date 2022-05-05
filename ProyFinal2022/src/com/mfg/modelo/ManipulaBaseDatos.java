package com.mfg.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Clase para comunicarse con la base de datos para operarla por medio de querys
 *  
 * @author Emilio Román y José Pablo Montero
 *
 */
public class ManipulaBaseDatos {
	static ConectarBD conectar;
	
	/**
	 * Método constructor para la clase que inicializa la conexión con la base de datos
	 */
	public ManipulaBaseDatos() {
		conectar = new ConectarBD();
	}

	/**
	 * Método que manda un query a la base para insertar los datos a la tabla de usuarios
	 * 
	 * @param sexo String con el sexo (masculino/femenino)
	 * @param edad String con la edad (18-75+)
	 * @param presion float con el valor de la presion
	 * @param hipertension String con la hipertension (Si/No)
	 * @param fumador String si el usuario es fumador (Si/No)
	 * @param diabetes String con la condicion diabetica (Si/No)
	 * @param HDL float con el valor de HDL
	 * @param colesterol float con el valor del colesterol
	 * @param glucosa int con el valor de la glucosa
	 * @param pulso int con el valor del pulso maximo
	 */
	
	public void Insertar(String sexo, String edad, float presion, String hipertension, String fumador, String diabetes, float HDL, float colesterol, int glucosa, int pulso) {
		System.out.println("Insertando datos");
		
		try {
		String query = "INSERT INTO usuario (Sexo, Edad, Presion, Hipertension, Fumador,Diabetes,HDL,Colesterol,Glucosa,Pulso) VALUES (?,?,?,?,?,?,?,?,?,?)";
		//Méotodo para insertar en la BD
	
		
				//Objeto tipo Connection
				Connection con = conectar.getConnection();
				//Se pasa query como parametro
				PreparedStatement prest = con.prepareStatement(query);
				//Ingreso de valores
				prest.setString(1,sexo);
				prest.setString(2,edad);
				prest.setFloat(3,presion);
				prest.setString(4,hipertension);
				prest.setString(5,fumador);
				prest.setString(6,diabetes);
				prest.setFloat(7,HDL);
				prest.setFloat(8,colesterol);
				prest.setInt(9,glucosa);
				prest.setInt(10,pulso);
				
				//Ejecuta query
				prest.executeUpdate();
				System.out.println("El registro se insertó de forma correcta");
			}
			catch (SQLException e) {
				System.out.println("No se pudo insertar el registro. ");
				System.out.println(e.getErrorCode());
			}
			
	}
	}