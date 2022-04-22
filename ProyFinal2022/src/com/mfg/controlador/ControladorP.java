package com.mfg.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.mfg.modelo.*;
import com.mfg.vista.*;

public class ControladorP implements ActionListener{
	
	// Instancia del frame principal
	FramePrincipal vista;
	ManipulaBaseDatos manipulaBase; // Instancia de clase con métodos que manipula la BD
	
	public ControladorP(FramePrincipal frame1,ManipulaBaseDatos manupulaB){
	this.vista = frame1;
	this.manipulaBase = manupulaB;
	// Al botón que genera acción se debe asignar un addActionListener
	PanelUno.guardar.addActionListener(this);
	}
	
	
	//Metodo que implementa Action
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String edad= "";
		String sexo= "";
		float presion=0;
		String hipertension=""; //EN TU BASE DE DATOS CAMBIA TODOS LOS TIPOS DE DATOS PARA QUE COINCIDAN AQUI...
		String fumador="";
		String diabetes="";
		float HDL=0;
		float colesterol=0;
		int glucosa=0;
		int pulso=0;
		
		
			if(e.getSource() == PanelUno.guardar){
				try {
					
				edad = PanelUno.lista.getSelectedItem().toString(); 
				presion = Float.parseFloat(PanelUno.entradaPS.getText());
					if (presion>200||presion<40) {
						throw new Exception("Error en presion");
					}
				HDL = Float.parseFloat(PanelUno.entradaHDL.getText());
					if (HDL>100||HDL<10) {
						throw new Exception("Error en HDL");
					}
				colesterol = Float.parseFloat(PanelUno.entradaC.getText());
					if (colesterol>280||colesterol<40) {
						throw new Exception("Error en Colesterol");
					}
				glucosa = Integer.parseInt(PanelUno.entradaG.getText());
					if (glucosa>300||glucosa<50) {
						throw new Exception("Error en Glucosa");
					}
				pulso = Integer.parseInt(PanelUno.entradaP.getText());
					if (pulso>170||pulso<30) {
						throw new Exception("Error en Pulso");
					}
				

				
				if (PanelUno.checkBoxSM.isSelected()) sexo = PanelUno.checkBoxSM.getText();
				else if(PanelUno.checkBoxSF.isSelected()) sexo = PanelUno.checkBoxSF.getText(); 
				if(PanelUno.checkBoxHS.isSelected()) hipertension = PanelUno.checkBoxHS.getText();
				else if(PanelUno.checkBoxHN.isSelected()) hipertension = PanelUno.checkBoxHN.getText();
				if(PanelUno.checkBoxFS.isSelected()) fumador = PanelUno.checkBoxFS.getText();
				else if(PanelUno.checkBoxFN.isSelected()) fumador = PanelUno.checkBoxFN.getText();
				if(PanelUno.checkBoxDS.isSelected()) diabetes = PanelUno.checkBoxDS.getText();
				else if(PanelUno.checkBoxDN.isSelected()) diabetes = PanelUno.checkBoxDN.getText();
				if(sexo.isEmpty()||hipertension.isEmpty()||fumador.isEmpty()||diabetes.isEmpty()) {
					throw new Exception("Error: Datos incompletos");
				}
			
				
				// Se ejecuta método que guarda registro en la BD.	
				System.out.println(sexo);
				System.out.println(edad);
				System.out.println(presion);
				System.out.println(hipertension);
				System.out.println(fumador);
				System.out.println(diabetes);
				System.out.println(HDL);
				System.out.println(colesterol);
				System.out.println(glucosa);
				System.out.println(pulso);
				
				manipulaBase.Insertar(sexo, edad,presion,hipertension,fumador,diabetes,HDL,colesterol,glucosa,pulso); 
				
				} 	catch(Exception ex){
					JOptionPane.showMessageDialog(null,ex.toString(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
					
				}
				
				

			
				}
			else if(e.getSource() == PanelUno.calcular) {
				//Aqui se calculara el riesgo cardiovascular
			}
			


		}
}
	

