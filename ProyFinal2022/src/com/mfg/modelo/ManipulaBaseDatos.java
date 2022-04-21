package com.mfg.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManipulaBaseDatos {
	static ConectarBD conectar;
	
	public ManipulaBaseDatos() {
		conectar = new ConectarBD();
	}

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