package com.mfg.vista;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class PanelUno extends JPanel{
	
	// Variables de inicializacion
	private static final long serialVersionUID = 1L;
	static String[] edades = new String[] {"18","19","20","21","22","23","24","25","26","27","28","29","30",
			"31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50",
			"51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70",
			"71","72","73","74","75","Mas de 75"}; 
	static JTextField textField;
	
	public static JButton guardar = new JButton("Guardar");
	public static JButton calcular = new JButton("Calcular");
	public static JRadioButton checkBoxSM = new JRadioButton("Masculino",false);
	public static JRadioButton checkBoxSF = new JRadioButton("Femenino",false);
	public static JComboBox<String> lista = new JComboBox<String>(edades);
	public static JTextField entradaPS = new JTextField(); 
	public static JRadioButton checkBoxHS = new JRadioButton("Si",false);
	public static JRadioButton checkBoxHN = new JRadioButton("No",false); 
	public static JRadioButton checkBoxFS = new JRadioButton("Si",false);
	public static JRadioButton checkBoxFN = new JRadioButton("No",false);
	public static JRadioButton checkBoxDS = new JRadioButton("Si",false);
	public static JRadioButton checkBoxDN = new JRadioButton("No",false);
	public static JTextField entradaHDL = new JTextField();
	public static JTextField entradaC = new JTextField();
	public static JTextField entradaG = new JTextField();
	public static JTextField entradaP = new JTextField();
	
	
	
	public PanelUno() {
		this.setLayout(null);
		
		//FRONT
		JLabel p = new JLabel("Conoce tu riesgo cardiovascular", SwingConstants.CENTER);
		p.setBounds(0,20,300,30);
		p.setOpaque(true);
		p.setForeground(Color.WHITE);
		p.setBackground(new Color(0,114,3));
		p.setFont(new Font("Arial", Font.BOLD,18));
		this.add(p);
		JLabel i = new JLabel("Introduce tus datos", SwingConstants.CENTER);
		i.setBounds(120,60,180,30);
		i.setOpaque(true);
		i.setForeground(Color.WHITE);
		i.setBackground(new Color(0,114,3));
		i.setFont(new Font("Arial", Font.BOLD,18));
		this.add(i);
		JLabel img = new JLabel(new ImageIcon("C:\\Users\\pepem\\Documents\\ECLIPSE\\ProyectoFinalPOO2022\\ProyFinal2022\\src\\com\\mfg\\vista\\heart.png"));
		img.setPreferredSize(new Dimension(550,550));
		img.setBounds(30,120,250,250);
		img.setOpaque(true);
		this.add(img);
		
		//Sexo
		JLabel etiqueta = new JLabel("Sexo", SwingConstants.CENTER);
		// x, y, L, A
		etiqueta.setBounds(300,60,60,20);
		// El componente se tiene que agregar al Panel
		etiqueta.setOpaque(true);
		etiqueta.setForeground(Color.BLACK);
		//etiqueta.setBackground(new Color(255,255,255));
		etiqueta.setFont(new Font("Century Gothic", Font.ITALIC,20));
		this.add(etiqueta);
		checkBoxSM.setBounds(380,60,87,30);
		this.add(checkBoxSM);
		checkBoxSF.setBounds(479,60,87,30);
		this.add(checkBoxSF);
		ButtonGroup sexo = new ButtonGroup();
		sexo.add(checkBoxSM);
		sexo.add(checkBoxSF);
		
		//Edad
		JLabel edad = new JLabel ("Edad", SwingConstants. CENTER);
		edad.setBounds (300, 100, 60, 20) ;
		edad.setOpaque(true);
		edad.setForeground(Color.BLACK);
		//edad.setBackground(new Color (158,158,158) );
		edad. setFont (new Font ("Century Gothic", Font.ITALIC, 20));
		this.add (edad);
		lista.setBounds(380, 100, 100, 20);
		this.add(lista);

		//Presion
		JLabel etiquetaPS = new JLabel ("Presion(mmHg)", SwingConstants. CENTER);
		etiquetaPS.setBounds (302, 140, 154, 27) ;
		etiquetaPS.setOpaque(true);
		etiquetaPS.setForeground(Color.BLACK);
		//etiquetaPS.setBackground(new Color (158,158,158) );
		etiquetaPS. setFont (new Font ("Century Gothic", Font.ITALIC, 20));
		this.add (etiquetaPS);
		entradaPS.setBounds(480, 147, 111, 20);
		this.add(entradaPS);
		
		//Hipertension
		JLabel etiquetaHiper = new JLabel ("Hipertensión", SwingConstants. CENTER);
		etiquetaHiper.setBounds (290, 180, 154, 27) ;
		etiquetaHiper.setOpaque(true);
		etiquetaHiper.setForeground(Color.BLACK);
		//etiquetaHDL.setBackground(new Color (158,158,158) );
		etiquetaHiper. setFont (new Font ("Century Gothic", Font.ITALIC, 20));
		this.add (etiquetaHiper);
		checkBoxHS.setBounds(449,185,39,20);
		this.add(checkBoxHS);
		checkBoxHN.setBounds(500,185,41,20);
		this.add(checkBoxHN);
		ButtonGroup hiper = new ButtonGroup();
		hiper.add(checkBoxHS);
		hiper.add(checkBoxHN);
		
		//FUMADOR
		JLabel etiquetaFuma = new JLabel ("Fumador", SwingConstants. CENTER);
		etiquetaFuma.setBounds (270, 220, 154, 27) ;
		etiquetaFuma.setOpaque(true);
		etiquetaFuma.setForeground(Color.BLACK);
		//etiquetaHDL.setBackground(new Color (158,158,158) );
		etiquetaFuma.setFont (new Font ("Century Gothic", Font.ITALIC, 20));
		this.add (etiquetaFuma);
		checkBoxFS.setBounds(449,225,39,20);
		this.add(checkBoxFS);
		checkBoxFN.setBounds(500,225,41,20);
		this.add(checkBoxFN);
		ButtonGroup fuma = new ButtonGroup();
		fuma.add(checkBoxFS);
		fuma.add(checkBoxFN);
		
		//DIABETES
		JLabel etiquetaDiabetes = new JLabel ("Diabetes", SwingConstants. CENTER) ;
		etiquetaDiabetes.setBounds (270, 260, 154, 27) ;
		etiquetaDiabetes.setOpaque(true);
		etiquetaDiabetes.setForeground(Color.BLACK);
		//etiquetaHDL.setBackground(new Color (158,158,158) );
		etiquetaDiabetes.setFont (new Font ("Century Gothic", Font.ITALIC, 20));
		this.add (etiquetaDiabetes);
		checkBoxDS.setBounds(449,265,39,20);
		this.add(checkBoxDS);
		checkBoxDN.setBounds(500,265,41,20);
		this.add(checkBoxDN);
		ButtonGroup diabetes = new ButtonGroup();
		diabetes.add(checkBoxDS);
		diabetes.add(checkBoxDN);
		
		//HDL
		JLabel etiquetaHDL = new JLabel ("HDL", SwingConstants. CENTER) ;
		etiquetaHDL.setBounds (241, 300, 165, 20) ;
		etiquetaHDL.setOpaque(true);
		etiquetaHDL.setForeground(Color.BLACK);
		//etiquetaHDL.setBackground(new Color (158,158,158) );
		etiquetaHDL. setFont (new Font ("Century Gothic", Font.ITALIC, 20));
		this.add (etiquetaHDL);
		entradaHDL.setBounds(380, 305, 112, 20);
		this.add(entradaHDL);
		
		//Colesterol
		JLabel etiquetaC = new JLabel ("Colesterol", SwingConstants. CENTER) ;
		etiquetaC.setBounds (265, 340, 170, 20);
		etiquetaC.setOpaque(true);
		etiquetaC.setForeground(Color.BLACK);
		//etiquetaHDL.setBackground(new Color (158,158,158) );
		etiquetaC.setFont (new Font ("Century Gothic", Font.ITALIC, 20));
		this.add (etiquetaC);
		entradaC.setBounds(420, 345, 112, 20);
		this.add(entradaC);
		
		//Glucosa
		JLabel etiquetaG = new JLabel("Glucosa", SwingConstants. CENTER);
		etiquetaG.setBounds(256,375,170,20);
		etiquetaG.setOpaque(true);
		etiquetaG.setForeground(Color.BLACK);
		etiquetaG.setFont(new Font("Century Gothic", Font.ITALIC, 20));
		this.add (etiquetaG);
		entradaG.setBounds(420, 375, 112, 20);
		this.add(entradaG);
		
		//Pulso
		JLabel etiquetaP = new JLabel("Pulso", SwingConstants. CENTER);
		etiquetaP.setBounds(242,410,170,20);
		etiquetaP.setOpaque(true);
		etiquetaP.setForeground(Color.BLACK);
		etiquetaP.setFont(new Font("Century Gothic", Font.ITALIC, 20));
		this.add(etiquetaP);
		entradaP.setBounds(373, 412, 112, 20);
		this.add(entradaP);
		
		//Calcular
		calcular.setBounds(300,465,96,20);
		calcular.setOpaque(true);
		calcular.setForeground(Color.WHITE);
		calcular.setBackground(new Color(0,114,3));
		calcular.setFont(new Font("Arial",Font.BOLD,15));
		this.add(calcular);
		
		//Guardar
		guardar.setBounds(450,465,96,20);
		guardar.setOpaque(true);
		guardar.setForeground(Color.WHITE);
		guardar.setBackground(new Color(0,114,3));
		guardar.setFont(new Font("Arial",Font.BOLD,15));
		this.add(guardar);	
		
	}

}
