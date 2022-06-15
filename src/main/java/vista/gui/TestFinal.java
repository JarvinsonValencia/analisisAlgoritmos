package vista.gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.Coordinador;
import modelo.entidades.Respuestas;

import java.awt.Color;

/*
 * Esta clase es la ventana de resultados de la prueba donde se
 * muestran cuantas tuvo correctas**/
public class TestFinal extends JDialog implements ActionListener{
	
	private Container miContenedor;
	private JLabel txtTitulo;
	private JLabel infoTest;
	private JLabel txtTestSatisfaccion;
	private JButton btnTestSatisfaccion;
	private JLabel lblResult;
	private Coordinador miCoordinador;
	private Respuestas miRespuesta;
	
	/*
	 * este metodo es el constructor de la clase y por dentro iniciar el metodo
	 * iniciar componentes**/
	public TestFinal() {
		iniciarComponentes();	
		setSize(560,465);
		setResizable(false);
		setTitle("Pensamiento Computacional");
		setLocationRelativeTo(null);
	}
	
	public void iniciarComponentes(){
		miContenedor = getContentPane();
		miContenedor.setLayout(null);
		
		Font fuenteBtn = new Font("", 4, 20);
		
		txtTitulo = new JLabel();
		txtTitulo.setForeground(new Color(0, 0, 255));
		txtTitulo.setText("Resumen Del Test");
		txtTitulo.setSize(224, 50);
		txtTitulo.setLocation(164, 25);
		txtTitulo.setFont(new Font("Dialog", Font.BOLD, 25));
		
		txtTestSatisfaccion = new JLabel();
		txtTestSatisfaccion.setSize(431, 50);
		txtTestSatisfaccion.setLocation(54, 284);
		txtTestSatisfaccion.setText("Porfavor Realiza el siguiete Test de Satisfaccion");
		txtTestSatisfaccion.setFont(fuenteBtn);
		
		btnTestSatisfaccion= new JButton();
		btnTestSatisfaccion.setBackground(new Color(135, 206, 235));
		btnTestSatisfaccion.setText("Realizar Test");
		btnTestSatisfaccion.setSize(274, 50);
		btnTestSatisfaccion.setLocation(137, 345);
		btnTestSatisfaccion.setFont(new Font("",4,20));
		btnTestSatisfaccion.addActionListener(this);
		
		infoTest = new JLabel();
		infoTest.setText("/5");
		infoTest.setSize(117, 140);
		infoTest.setLocation(251, 104);
		infoTest.setFont(new Font("Century Gothic", Font.BOLD, 99));
		miContenedor.add(txtTestSatisfaccion);
		miContenedor.add(txtTitulo);
		miContenedor.add(btnTestSatisfaccion);
		miContenedor.add(infoTest);
		
		lblResult = new JLabel("0");
		lblResult.setFont(new Font("Century Gothic", Font.BOLD, 99));
		lblResult.setBounds(188, 114, 78, 120);
		getContentPane().add(lblResult);
	}
	
	/*
	 * El metodo escuchar de eventos es el action performed
	 * donde e es el evento del button o componentes que se le agrego
	 * addActionListener(this)**/
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnTestSatisfaccion) {
			
			miCoordinador.mostrarTestSatisfaccion(this.miRespuesta);
			
		}
		
	}
	
	/*
	 * metodo encargado de conectarse con el coordinador**/
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
	
	/*
	 * metodo encargado de llenar los datos de las respuestas para saber cuantas correctas tuvo
	 * se hace con condiciones y un llamado desde coordinador**/
	public void LlenarDatos(Respuestas miRespuestaNueva) {
		// TODO Auto-generated method stub
		this.miRespuesta = miRespuestaNueva;
		System.out.println(miRespuestaNueva);
		int contador=0;
		boolean condicion1=miRespuestaNueva.getPreguntaUno()>1 ? true : false;
		if(condicion1==true) {
			contador= contador + 1;
		}else {
			contador= contador + 0;
		}
		
		boolean condicion2=miRespuestaNueva.getPreguntaDos()>1 ? true : false;
		if(condicion2==true) {
			contador= contador + 1;
		}else {
			contador= contador + 0;
		}
		
		boolean condicion3=miRespuestaNueva.getPreguntaTres()>1 ? true : false;
		if(condicion3==true) {
			contador= contador + 1;
		}else {
			contador= contador + 0;
		}
		
		boolean condicion4=miRespuestaNueva.getPreguntaCuatro()>1 ? true : false;
		if(condicion4==true) {
			contador= contador + 1;
		}else {
			contador= contador + 0;
		}
		
		boolean condicion5=miRespuestaNueva.getPreguntaCinco()>1 ? true : false;
		if(condicion5==true) {
			contador= contador + 1;
		}else {
			contador= contador + 0;
		}
		
		lblResult.setText(""+contador);
		
	}
}
