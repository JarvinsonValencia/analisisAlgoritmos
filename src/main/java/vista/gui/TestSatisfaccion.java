package vista.gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controlador.Coordinador;
import modelo.entidades.Respuestas;

import java.awt.Color;

/*
 * Clase del testSatisfaccion donde se evalua la dificulta de la preguntas y otros aspectos mas**/
public class TestSatisfaccion extends JDialog implements ActionListener{
	
	private Coordinador miCoordinador;

	private Container miContenedor;
	private JLabel miTitulo;
	private JLabel preguntaUno;
	private JLabel preguntaDos;
	private JLabel preguntaTres;
	private JLabel mensaje;
	private ButtonGroup miGrupo1, miGrupo2, miGrupo3;
	private JRadioButton radio10,radio11,radio12,radio13,radio14,radio15;
	private JRadioButton radio20,radio21,radio22,radio23,radio24,radio25;
	private JRadioButton radio30,radio31,radio32,radio33,radio34,radio35;
	private JButton btnEnviar;
	private JLabel preguntaUno2;
	private JLabel preguntaDos2;
	private JLabel preguntaTres2;
	private JLabel alerta;

	private Respuestas miRespuesta;
	
	/*
	 * Metodo del constructor de la clase donde se inicializa el metodo iniciar Componentes**/
	public TestSatisfaccion() {
		setSize(600,600);
		setResizable(false);
		setTitle("Pensamiento Computacional");
		setLocationRelativeTo(null);
		iniciarComponentes();	
	}
	
	public void iniciarComponentes(){
		
		miContenedor=getContentPane();
		miContenedor.setLayout(null);
		
		miTitulo = new JLabel();
		miTitulo.setForeground(Color.BLUE);
		miTitulo.setSize(220, 46);
		miTitulo.setLocation(183, 25);
		miTitulo.setText("Test De Satisfaccion");
		miTitulo.setFont(new Font("Dialog", Font.BOLD, 22));
		miContenedor.add(miTitulo);
		
		preguntaUno = new JLabel();
		preguntaUno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		preguntaUno.setText("1. ¿Que tan divertido te parecio este juego?");
		preguntaUno.setSize(272, 32);
		preguntaUno.setLocation(46, 100);
		
		preguntaDos = new JLabel();
		preguntaDos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		preguntaDos.setText("2. ¿Que tan dificiles te parecieron los retos?");
		preguntaDos.setLocation(46, 197);
		preguntaDos.setSize(272, 50);
		
		preguntaTres = new JLabel();
		preguntaTres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		preguntaTres.setText("3. ¿Entendiste lo que debias hacer durante el juego?");
		preguntaTres.setLocation(46, 298);
		preguntaTres.setSize(272, 50);
		
		btnEnviar = new JButton();
		btnEnviar.setText("Enviar");
		btnEnviar.setBounds(195,463,195,50);
		btnEnviar.addActionListener(this);

		mensaje = new JLabel("Por favor responda las siguientes preguntas con TOTAL SINCERIDAD");
		mensaje.setFont(new Font("", Font.BOLD, 14));
		mensaje.setBounds(46, 59, 487, 46);
		miContenedor.add(mensaje);
		
		preguntaUno2 = new JLabel("Seleccione de 0 a 5, donde 0 es \"poco divertido\" y 5 es \"muy divertido\"");
		preguntaUno2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		preguntaUno2.setBounds(62, 127, 442, 14);
		miContenedor.add(preguntaUno2);
		
		preguntaDos2 = new JLabel("Seleccione de 0 a 5, donde 0 es \"muy faciles\" y 5 es \"muy dificiles\"");
		preguntaDos2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		preguntaDos2.setBounds(62, 233, 442, 14);
		miContenedor.add(preguntaDos2);
		
		preguntaTres2 = new JLabel("Seleccione de 0 a 5, donde 0 es \"No se entendia\" y 5 es \"Se entendio Facilmente\"");
		preguntaTres2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		preguntaTres2.setBounds(62, 334, 442, 14);
		miContenedor.add(preguntaTres2);
		
		miGrupo1 = new ButtonGroup();
		miGrupo2 = new ButtonGroup();
		miGrupo3 = new ButtonGroup();
		
		radio10 = new JRadioButton("0");
		radio10.setBounds(63, 165, 38, 23);
		
		radio11 = new JRadioButton("1");
		radio11.setBounds(108, 165, 38, 23);

		radio12 = new JRadioButton("2");
		radio12.setBounds(154, 165, 38, 23);
		
		radio13 = new JRadioButton("3");
		radio13.setBounds(196, 165, 38, 23);
		
		radio14 = new JRadioButton("4");
		radio14.setBounds(236, 165, 42, 23);
		
		radio15 = new JRadioButton("5");
		radio15.setBounds(280, 165, 38, 23);
		
		radio20 = new JRadioButton("0");
		radio20.setBounds(62, 268, 39, 23);
		
		radio21 = new JRadioButton("1");
		radio21.setBounds(108, 268, 38, 23);
		
		radio22 = new JRadioButton("2");
		radio22.setBounds(154, 268, 38, 23);
		
		radio23 = new JRadioButton("3");
		radio23.setBounds(196, 268, 38, 23);
		
		radio24 = new JRadioButton("4");
		radio24.setBounds(236, 268, 42, 23);
		
		radio25 = new JRadioButton("5");
		radio25.setBounds(280, 268, 38, 23);
		
		radio30 = new JRadioButton("0");
		radio30.setBounds(62, 371, 39, 23);
		
		radio31 = new JRadioButton("1");
		radio31.setBounds(108, 371, 38, 23);
		
		radio32 = new JRadioButton("2");
		radio32.setBounds(154, 371, 38, 23);
		
		radio33 = new JRadioButton("3");
		radio33.setBounds(196, 371, 38, 23);
		
		radio34 = new JRadioButton("4");
		radio34.setBounds(236, 371, 42, 23);
		
		radio35 = new JRadioButton("5");
		radio35.setBounds(280, 371, 38, 23);
		
		
		alerta = new JLabel("Por favor responda todas las preguntas");
		alerta.setForeground(Color.RED);
		alerta.setFont(new Font("Tahoma", Font.BOLD, 14));
		alerta.setBounds(154, 424, 280, 28);
		alerta.setVisible(false);
		miContenedor.add(alerta);
		
		miGrupo1.add(radio10);
		miGrupo1.add(radio11);
		miGrupo1.add(radio12);
		miGrupo1.add(radio13);
		miGrupo1.add(radio14);
		miGrupo1.add(radio15);
		miGrupo2.add(radio20);
		miGrupo2.add(radio21);
		miGrupo2.add(radio22);
		miGrupo2.add(radio23);
		miGrupo2.add(radio24);
		miGrupo2.add(radio25);
		miGrupo3.add(radio30);
		miGrupo3.add(radio31);
		miGrupo3.add(radio32);
		miGrupo3.add(radio33);
		miGrupo3.add(radio34);
		miGrupo3.add(radio35);
		
		
		miContenedor.add(radio10);
		miContenedor.add(radio11);
		miContenedor.add(radio12);
		miContenedor.add(radio13);
		miContenedor.add(radio14);
		miContenedor.add(radio15);
		miContenedor.add(radio20);
		miContenedor.add(radio21);
		miContenedor.add(radio22);
		miContenedor.add(radio23);
		miContenedor.add(radio24);
		miContenedor.add(radio25);
		miContenedor.add(radio30);
		miContenedor.add(radio31);
		miContenedor.add(radio32);
		miContenedor.add(radio33);
		miContenedor.add(radio34);
		miContenedor.add(radio35);
		miContenedor.add(preguntaUno);
		miContenedor.add(preguntaDos);
		miContenedor.add(preguntaTres);
		miContenedor.add(btnEnviar);

		
		
	}

	/*
	 * es el metodo encargado de escuchar los eventos de los botones
	 * la e representa dicho evento donde mediante condificonales se confirma**/
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnEnviar) {
			
			int uno = validarRespuestaUno();
			int dos = validarRespuestaDos();
			int tres = validarRespuestaTres();
			
			if(uno!=6 && dos!=6 && tres!=6){
				double promedio=validarPromedioSatisfaccion(uno, dos, tres);
				this.miRespuesta.setPreguntaUnoSatisfaccion(uno);
				this.miRespuesta.setPreguntaDosSatisfaccion(dos);
				this.miRespuesta.setPreguntaTresSatisfaccion(tres);
				this.miRespuesta.setTestSatisfaccion(promedio);
				miCoordinador.actualizaRespuesta(this.miRespuesta);
				miCoordinador.mostrarVentanaPrincipal();
			}else {
				alerta.setVisible(true);
			}
			
		}
		
	}

	/*
	 * metodo donde se valida las respuestas de la primer pregunta
	 * donde se ve cual respuesta eligio**/
	private int validarRespuestaUno() {
		
		if(radio10.isSelected()) {
			return 0;
		}else if(radio11.isSelected()) {
			return 1;
		}else if(radio12.isSelected()) {
			return 2;
		}else if(radio13.isSelected()) {
			return 3;
		}else if(radio14.isSelected()) {
			return 4;
		}else if(radio15.isSelected()) {
			return 5;
		}else {
			return 6;
		}
		

	}
	
	/*
	 * metodo donde se valida las respuestas de la segunda pregunta
	 * donde se ve cual respuesta eligio**/
	private int validarRespuestaDos() {
		
		if(radio20.isSelected()) {
			return 0;
		}else if(radio21.isSelected()) {
			return 1;
		}else if(radio22.isSelected()) {
			return 2;
		}else if(radio23.isSelected()) {
			return 3;
		}else if(radio24.isSelected()) {
			return 4;
		}else if(radio25.isSelected()) {
			return 5;
		}else {
			return 6;
		}
		

	}
	
	/*
	 * metodo donde se valida las respuestas de la tercer pregunta
	 * donde se ve cual respuesta eligio**/
	private int validarRespuestaTres() {
		
		if(radio30.isSelected()) {
			return 0;
		}else if(radio31.isSelected()) {
			return 1;
		}else if(radio32.isSelected()) {
			return 2;
		}else if(radio33.isSelected()) {
			return 3;
		}else if(radio34.isSelected()) {
			return 4;
		}else if(radio35.isSelected()) {
			return 5;
		}else {
			return 6;
		}
		

	}
	
	/*
	 * se valida el promedio para poder guardarlo en el objeto de respuesta**/
	private double validarPromedioSatisfaccion(int uno, int dos, int tres) {
		
		double promedio = (uno+dos+tres)/3;
		return promedio;
		
	}

	/*
	 * metodo encargado de conectarse con el coordinador**/
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	/*
	 * en este metodo se recibe la respuesta que se envio desde la quinta ventana**/
	public void enviarRespuesta(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		this.miRespuesta = miRespuesta;
	}

	/*
	 * en este metodo se reinicia la ventana para que las selecciones no sean las mismas**/
	public void reiniciar() {
		// TODO Auto-generated method stub
		miGrupo1.clearSelection();
		miGrupo2.clearSelection();
		miGrupo3.clearSelection();
	}
}
