package com.mfg.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				
				if (PanelUno.checkBoxSM.isSelected()) sexo = PanelUno.checkBoxSM.getText();
				else if(PanelUno.checkBoxSF.isSelected()) sexo = PanelUno.checkBoxSF.getText(); 
				edad = PanelUno.lista.getSelectedItem().toString(); //WEY EN LA BASE DE DATOS CAMBIA EL TIPO DE DATO SEXO A VARCHAR(15)
				presion = Float.parseFloat(PanelUno.entradaPS.getText());
				if(PanelUno.checkBoxHS.isSelected()) hipertension = PanelUno.checkBoxHS.getText();
				else if(PanelUno.checkBoxHN.isSelected()) hipertension = PanelUno.checkBoxHN.getText();
				if(PanelUno.checkBoxFS.isSelected()) fumador = PanelUno.checkBoxFS.getText();
				else if(PanelUno.checkBoxFN.isSelected()) fumador = PanelUno.checkBoxFN.getText();
				if(PanelUno.checkBoxDS.isSelected()) diabetes = PanelUno.checkBoxDS.getText();
				else if(PanelUno.checkBoxDN.isSelected()) diabetes = PanelUno.checkBoxDN.getText();
				HDL = Float.parseFloat(PanelUno.entradaHDL.getText());
				colesterol = Float.parseFloat(PanelUno.entradaC.getText());
				glucosa = Integer.parseInt(PanelUno.entradaG.getText());
				pulso = Integer.parseInt(PanelUno.entradaP.getText());
				// Se ejecuta método que guarda registro en la BD.
				
				
				
				
				
				manipulaBase.Insertar(sexo, edad,presion,hipertension,fumador,diabetes,HDL,colesterol,glucosa,pulso); 
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
				
				}
			else if(e.getSource() == PanelUno.calcular) {
				//Aqui se calculara el riesgo cardiovascular
			}
			
			}
	}
	

