package me.luciano.tarea4;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

@SuppressWarnings("serial")
public class Ventana implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	
	private JButton botonAntecedentes;
	private ArrayList<Component> components;
	private JLabel label1;
	
	public Ventana() {
		super();
		frame = new JFrame("Tarea");
		panel = new JPanel();
		label = new JLabel(Main.getPrograma().getCliente().obtenerNombre());
		
		this.components = new ArrayList<Component>();
		this.botonAntecedentes = new JButton("Antecedentes");
		
		botonAntecedentes.setBounds(20, 10, 150, 20);
		botonAntecedentes.addActionListener(this);
		
		initVentana();
	}
	
	public void initVentana() {
		frame = new JFrame("Tarea");
		panel = new JPanel();
		label = new JLabel(Main.getPrograma().getCliente().obtenerNombre());
		
		label.setVisible(false);
		label.setBounds(20, 30, 200, 30);
		
		frame.setLayout(null);
		frame.setBounds(10, 10, 800, 600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setBounds(20, 10, 100, 100);
		panel.add(botonAntecedentes);
		panel.add(label);
		
		frame.setVisible(true);
		
		System.out.println(Main.getPrograma().getCliente().obtenerAntecedentes());
	}
	
	public void ventanaAntecedentesCliente() {
		if(label.isVisible()) {
			this.label.setVisible(false);
		} else {
			this.label.setVisible(true);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botonAntecedentes) {
			ventanaAntecedentesCliente();
		}
	}
}