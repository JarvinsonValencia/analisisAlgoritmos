package vista.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.entidades.Respuestas;

import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame implements ActionListener{
	
	
	private Coordinador miCoordinador;
	private Container miPanel;
	private JLabel lblTitulo;
	private JLabel lblMensaje;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JButton btnComenzar;
	private JLabel lblAlerta;
	JButton btnVerHistorial;
	
	
	/*
	 * este metodo es el constructor de esta clase cuando se ejecuta el constructor se ejecuta el metodo iniciar componentes
	 * encargado de disparar la creacion de componentes que constituyen la ventana**/
	public VentanaPrincipal() {
		iniciarComponentes();	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setResizable(false);
		setTitle("Pensamiento Computacional");
		setLocationRelativeTo(null);
	}
	
	public void iniciarComponentes(){
		miPanel =getContentPane();
		miPanel.setLayout(null);
		
		lblTitulo = new JLabel();
		lblTitulo.setBounds(137, 85, 333, 49);
		lblTitulo.setText("Bienvenidos!!");
		lblTitulo.setForeground(Color.BLUE);
		Font fuente = new Font("",4,50);
		lblTitulo.setFont(fuente);
		miPanel.add(lblTitulo);
		
		lblMensaje = new JLabel();
		lblMensaje.setBounds(71,145,420,49);
		lblMensaje.setText("Se le hara un Test de Pensamiento Computacional");
		lblMensaje.setFont(new Font("",4,18));
		miPanel.add(lblMensaje); 
		
		lblNombre = new JLabel();
		lblNombre.setBounds(169,175,235,49);
		lblNombre.setText("Porfavor Ingrese Su Nombre:");
		lblNombre.setFont(new Font("",4,18));
		miPanel.add(lblNombre); 
		
		txtNombre = new JTextField();
		txtNombre.setBounds(171,223,215,36);
		txtNombre.setFont(new Font("",4,18));
		txtNombre.setAlignmentX(CENTER_ALIGNMENT);
		txtNombre.setAlignmentY(CENTER_ALIGNMENT);
		miPanel.add(txtNombre);
		
		btnComenzar = new JButton();
		btnComenzar.setBackground(new Color(152, 251, 152));
		btnComenzar.setFont(new Font("Calibri", Font.BOLD, 26));
		btnComenzar.setText("Comenzar");
		btnComenzar.setBounds(171,277,215,49);
		btnComenzar.addActionListener(this);
		miPanel.add(btnComenzar);
		
		lblAlerta = new JLabel();
		lblAlerta.setText("Ingrese su Nombre Porfavor");
		lblAlerta.setForeground(Color.red);
		lblAlerta.setFont(new Font("Calibri",4,20));
		lblAlerta.setBounds(160,337,242,36);
		lblAlerta.setVisible(false);
		miPanel.add(lblAlerta);
		
		btnVerHistorial = new JButton("Ver Historial");
		btnVerHistorial.setBackground(new Color(224, 255, 255));
		btnVerHistorial.setBounds(169, 384, 217, 49);
		btnVerHistorial.setFont(new Font("Calibri", Font.BOLD, 26));
		btnVerHistorial.addActionListener(this);
		miPanel.add(btnVerHistorial);
	}
	
	/*
	 * este metodo es el escuchador de los eventos Action Listener
	 * que dispara los metodos dependiendo del boton que lo ejecuta**/
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btnComenzar) {
			
			if(txtNombre.getText().length()>0) {
				Respuestas miRespuesta = new Respuestas();
				miRespuesta.setNombreEstudiante(txtNombre.getText());
				miCoordinador.mostrarPregunta1(miRespuesta);
				
			}else {
				lblAlerta.setVisible(true);
			}

		}else if(e.getSource()==btnVerHistorial) {
			this.miCoordinador.mostrarInformacion();
		}
	}
	
	/*
	 * este metodo es el que conecta con el coordinador**/
	public void setCoordinador(Coordinador miCoordinador) {
		// TODO Auto-generated method stub
		this.miCoordinador = miCoordinador;
	}
	
	/*
	 * metodo encargado de vaciar el input del nombre**/
	public void vaciar() {
		// TODO Auto-generated method stub
		txtNombre.setText("");
		lblAlerta.setVisible(false);
	}
}	