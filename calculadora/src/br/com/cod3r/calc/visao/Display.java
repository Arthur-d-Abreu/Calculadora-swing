package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;
import br.com.cod3r.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	//Dever de casa instalar um fonte igual da calculadora do mac e implementar 
	
	private final JLabel label;
	
	public Display(){
		//Aqui definimos que o Display está interessado em valor
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 25));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 30));
		add(label);
	}

	
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
		
}
