package com.mfg.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JFrame;
/**
 * Clase que crea y le da sus caracteristicas al Frame donde se montar� la interfaz
 * @author Emilio Rom�n y Jos� Pablo Montero
 *
 */
public class FramePrincipal extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * M�todo constructor de la clase, se declara el frame, su tama�o, la ubicaci�n, si es escalable, etc.
	 */
	public FramePrincipal() {
		// titulo ventana
		super("Frame Principal Encuesta");
		setSize(680,580);
		
		
		// location top-left hand size(pixeles)
		setLocation(350,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Layout por default es FlowLayout
		setResizable(false);
		PanelUno pan1 = new PanelUno();
		this.add(pan1);
	}

}
