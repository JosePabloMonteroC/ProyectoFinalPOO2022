package com.mfg.pruebaP;

//http://www.imss.gob.mx/salud-en-linea/apps-sano/riesgo-cardiovascular-colesterol
//https://htmlcolorcodes.com/es/

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.mfg.controlador.ControladorP;
import com.mfg.modelo.*;
import com.mfg.vista.*;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		FramePrincipal frame1 = new FramePrincipal();
		ManipulaBaseDatos prueba = new ManipulaBaseDatos();
		ControladorP controlador = new ControladorP(frame1,prueba);
		frame1.setVisible(true);
		
		//prueba.Insertar(0, 33, 43, 0, 0, 0, 33, 11,1,202);

	}

}
