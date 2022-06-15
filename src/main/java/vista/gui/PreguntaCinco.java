
package vista.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controlador.Coordinador;
import modelo.entidades.Respuestas;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;

/*
 * esta clase se encargara de crear y ejecutar la ventana de la quinta pregunta**/

public class PreguntaCinco extends JFrame implements ActionListener{

	private Image imagen;
	
	private Coordinador miCoordinador;
	private Respuestas miRespuesta;
	private JPanel miContenedor;
	private JLabel lblPregunta;
	private JPanel miPanel;
	private JButton btnSubir;
	private JButton btnBajar;
	private JButton btnIzquierda;
	private JButton btnDerecha;
	private JButton btnValidar;
	private JLabel lblImagen;
	private JLabel pacman;
	private JLabel pacmanInicial;
	private JButton btnCambiarDificultad;
	private JButton btnSiguiente;
	private JTextArea recorrido;
	private JScrollPane scrollPane;
	private ArrayList<String> recorridoArray;
	private JLabel txtValidacion;
	
	/*
	 * este metodo es el constructor de esta clase cuando se ejecuta el constructor se ejecuta el metodo iniciar componentes
	 * encargado de disparar la creacion de componentes que constituyen la ventana**/
	public PreguntaCinco() {
		iniciarComponentes();	
		this.recorridoArray = new ArrayList<String>();
		setSize(600,750+140);
		setResizable(false);
		setTitle("Pensamiento Computacional");
		setLocationRelativeTo(null);
	}
	
	public void iniciarComponentes(){
		
		JScrollPane miScroll = new JScrollPane();
		miScroll.setBounds(10,20,20,20);
		
		miContenedor= new JPanel();
		miContenedor.setLayout(null);
		
		Font fuenteBtn = new Font("", 4, 20);
		
		lblPregunta= new JLabel();
		lblPregunta.setText("5. Dirige al Pacman a su Cereza");
		lblPregunta.setBounds(175,11,343,40);
		lblPregunta.setFont(new Font("Calibri",3,18));
		miContenedor.add(lblPregunta);
		
		miPanel = new JPanel();
		miPanel.setBorder(new LineBorder(Color.GRAY, 5, true));
		miPanel.setBounds(27, 47, 530, 530);
		miPanel.setLayout(null);
		miContenedor.add(miPanel);
		
		btnCambiarDificultad = new JButton();
		btnCambiarDificultad.setText("DIFICIL");
		btnCambiarDificultad.setBackground(Color.RED);
		btnCambiarDificultad.setBounds(33, 19, 132, 23);
		btnCambiarDificultad.setFont(fuenteBtn);
		btnCambiarDificultad.addActionListener(this);
		miContenedor.add(btnCambiarDificultad);
		
		btnSubir = new JButton();
		btnSubir.setBackground(new Color(204, 255, 255));
		btnSubir.setText("🢁");
		btnSubir.setBounds(131,599,101,40);
		btnSubir.setFont(fuenteBtn);
		btnSubir.addActionListener(this);
		miContenedor.add(btnSubir);
		
		btnBajar = new JButton();
		btnBajar.setBackground(new Color(204, 255, 255));
		btnBajar.setText("🢃");
		btnBajar.setBounds(131,648,101,40);
		btnBajar.setFont(fuenteBtn);
		btnBajar.addActionListener(this);
		miContenedor.add(btnBajar);
		
		btnIzquierda = new JButton();
		btnIzquierda.setBackground(new Color(204, 255, 255));
		btnIzquierda.setText("🢀");
		btnIzquierda.setBounds(27,599,101,89);
		btnIzquierda.setFont(fuenteBtn);
		btnIzquierda.addActionListener(this);
		miContenedor.add(btnIzquierda);
		
		btnDerecha = new JButton();
		btnDerecha.setBackground(new Color(204, 255, 255));
		btnDerecha.setText("🢂");
		btnDerecha.setBounds(236,599,101,89);
		btnDerecha.setFont(fuenteBtn);
		btnDerecha.addActionListener(this);
		miContenedor.add(btnDerecha);
		
		btnValidar = new JButton();
		btnValidar.setText("Validar");
		btnValidar.setBackground(new Color(204, 255, 204));
		btnValidar.setBounds(365,599,192,89);
		btnValidar.addActionListener(this);
		btnValidar.setFont(fuenteBtn);
		miContenedor.add(btnValidar);
		
		lblImagen = new JLabel();
		lblImagen.setLocation(10, 11);
		lblImagen.setSize(510, 510);
		ImageIcon image = new ImageIcon(PreguntaUno.class.getResource("/images/nivel5.png"));
		Icon icon = new ImageIcon(image.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), 6));
		
		
		pacman = new JLabel();
		pacman.setLocation(457, 458);
		pacman.setSize(60, 60);
		ImageIcon pacmanImage = new ImageIcon(PreguntaUno.class.getResource("/images/pacman.png"));
		Icon iconPacman = new ImageIcon(pacmanImage.getImage().getScaledInstance(pacman.getWidth(), pacman.getHeight(), 6));
		pacman.setIcon(iconPacman);
		pacman.setVisible(false);
		miPanel.add(pacman, BorderLayout.CENTER);
		
		pacmanInicial = new JLabel();
		pacmanInicial.setLocation(475, 474);
		pacmanInicial.setSize(30, 30);
		Icon iconPacmanI = new ImageIcon(pacmanImage.getImage().getScaledInstance(pacmanInicial.getWidth(), pacmanInicial.getHeight(), 6));
		pacmanInicial.setIcon(iconPacmanI);
		miPanel.add(pacmanInicial, BorderLayout.CENTER);
		
		lblImagen.setIcon(icon);
		miPanel.add(lblImagen, BorderLayout.CENTER);
			
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27,739,310,101);
		scrollPane.setVisible(false);
		miContenedor.add(scrollPane);
		
		recorrido = new JTextArea();
		recorrido.setFont(new Font("",4,20));
		recorrido.setVisible(true);
		recorrido.setEditable(false);
		scrollPane.setViewportView(recorrido);
		
		btnSiguiente = new JButton();
		btnSiguiente.setBounds(365, 738, 192, 102);
		btnSiguiente.addActionListener(this);
		btnSiguiente.setText("FINALIZAR");
		btnSiguiente.setFont(fuenteBtn);
		btnSiguiente.setVisible(false);
		btnSiguiente.setBackground(new Color(176, 224, 230));
		miContenedor.add(btnSiguiente);
		
		txtValidacion = new JLabel("");
		txtValidacion.setBounds(75, 699, 233, 29);
		txtValidacion.setFont(fuenteBtn);
		miContenedor.add(txtValidacion);
		
		miContenedor.setPreferredSize(new Dimension(250,600));
		
		miScroll.setViewportView(miContenedor);
		add(miScroll);
		
		
		
	}
	
	/*
	 * este metodo es el escuchador de los eventos Action Listener
	 * que dispara los metodos dependiendo del boton que lo ejecuta**/
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnSubir) {			
			subir();		
		}else if(e.getSource()==btnBajar) {		
			bajar();		
		}else if(e.getSource()==btnDerecha) {			
			avanzarDerecha();			
		}else if(e.getSource()==btnIzquierda) {		
			avanzarIzquierda();		
		}else if(e.getSource()==btnCambiarDificultad) {			
			cambiarDificultad();	
		}else if(e.getSource()==btnValidar) {			
			validar();
		}else if(e.getSource()==btnSiguiente) {
			
			mensajeDeConfirmacion(this.miRespuesta);
			miCoordinador.mostrarTest(miRespuesta);
		}
	}

	/*
	 * metodo encargado de recibir la respuesta que ira almacenando las respuestas de las preguntas
	 * y el nombre**/
	public void recibirRespuesta(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		this.miRespuesta = miRespuesta;
		System.out.println(miRespuesta);
	}
	
	/*este metodo es el que conecta con el coordinador**/
	public void setCoordinador(Coordinador miCoordinador) {
		// TODO Auto-generated method stub
		this.miCoordinador=miCoordinador;
	}
	
	/*
	 * metodo de subir es el encargado de realizar el movimiento ascendente del pacman
	 * dicho movimiento es ejecutado con coordenadas X y Y para una mejor precision
	 * donde se restan las coordenadas Y**/
	private void subir() {
		Point location=pacman.getLocation();
		
		if(location.y==15) {
			pacman.setLocation(location.x, location.y);		
			this.recorridoArray.add(btnSubir.getText().toString());

		}else if(location.y==78) {
			
			if(location.x!=140 && location.x!=267 && location.x!=457) {
				pacman.setLocation(location.x, location.y-63);
				this.recorridoArray.add(btnSubir.getText().toString());
			}else {
				pacman.setLocation(location.x, location.y);
				this.recorridoArray.add("X");
			}
		}else if(location.y==142) {
			pacman.setLocation(location.x, location.y-64);
			this.recorridoArray.add(btnSubir.getText().toString());
		}else if(location.y==204) {
			if(location.x!=77 && location.x!=267) {
				pacman.setLocation(location.x, location.y-62);
				this.recorridoArray.add(btnSubir.getText().toString());
			}else {
				pacman.setLocation(location.x, location.y);
				this.recorridoArray.add("X");
			}
			
		}else if(location.y==268) {
			pacman.setLocation(location.x, location.y-64);
			this.recorridoArray.add(btnSubir.getText().toString());
		}else if(location.y==330) {
			if(location.x!=13 && location.x!=267) {
				pacman.setLocation(location.x, location.y-62);
				this.recorridoArray.add(btnSubir.getText().toString());
			}else {
				pacman.setLocation(location.x, location.y);
				this.recorridoArray.add("X");
			}
		}else if(location.y==395) {
			if(location.x!=394) {
				pacman.setLocation(location.x, location.y-65);
				this.recorridoArray.add(btnSubir.getText().toString());
			}else {
				pacman.setLocation(location.x, location.y);
				this.recorridoArray.add("X");
			}
		}else if(location.y==458) {
			if(location.x!=140) {
				pacman.setLocation(location.x, location.y-63);
				this.recorridoArray.add(btnSubir.getText().toString());
			}else {
				pacman.setLocation(location.x, location.y);
				this.recorridoArray.add("X");
			}
		}
	}
	
	/*
	 * metodo de bajar es el encargado de realizar el movimiento descendente del pacman
	 * dicho movimiento es ejecutado con coordenadas X y Y para una mejor precision
	 * donde se suman las coordenadas Y**/
	public void bajar() {
		Point location=pacman.getLocation();
		
		if(location.y==15) {
			pacman.setLocation(location.x, location.y+63);
			this.recorridoArray.add(btnBajar.getText().toString());
		}else if(location.y==78) {
			if(location.x!=77 && location.x!=267) {
				
				pacman.setLocation(location.x, location.y+64);
				this.recorridoArray.add(btnBajar.getText().toString());
				
			}else {
				pacman.setLocation(location.x, location.y);
				this.recorridoArray.add("X");
			}
		}else if(location.y==142) {
			pacman.setLocation(location.x, location.y+62);
			this.recorridoArray.add(btnBajar.getText().toString());
		}else if(location.y==204) {
			if(location.x!=13 && location.x!=267) {
				this.recorridoArray.add(btnBajar.getText().toString());
				pacman.setLocation(location.x, location.y+64);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}else if(location.y==268) {
			if(location.x!=394) {
				pacman.setLocation(location.x, location.y+62);
				this.recorridoArray.add(btnBajar.getText().toString());
			}else {
				pacman.setLocation(location.x, location.y);
				this.recorridoArray.add("X");
			}
		}else if(location.y==330) {
			System.out.println(location.x);
			if(location.x!=140) {
				this.recorridoArray.add(btnBajar.getText().toString());
				pacman.setLocation(location.x, location.y+65);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
			
		}else if(location.y==395){
			if(location.x!=267) {
				this.recorridoArray.add(btnBajar.getText().toString());
				pacman.setLocation(location.x, location.y+63);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}else if(location.y==458) {
			this.recorridoArray.add(btnBajar.getText().toString());
			pacman.setLocation(location.x, location.y);
		}
	}
	
	/*
	 * metodo de avanzar a la derecha es el encargado de realizar el movimiento de la derecha del pacman
	 * dicho movimiento es ejecutado con coordenadas X y Y para una mejor precision
	 * donde se suman las coordenadas de X**/
	private void avanzarDerecha() {
		Point location=pacman.getLocation();
		
		if(location.x==13) {
			if(location.y!=142) {
				this.recorridoArray.add(btnDerecha.getText().toString());
				pacman.setLocation(location.x+64, location.y);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}else if(location.x==77) {
			if(location.y!=15 && location.y!=395) {
				this.recorridoArray.add(btnDerecha.getText().toString());
				pacman.setLocation(location.x+63, location.y);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}else if(location.x==140) {
			this.recorridoArray.add(btnDerecha.getText().toString());
			pacman.setLocation(location.x+63, location.y);
		}else if(location.x==203) {
			if(location.y!=15 && location.y!=142 && location.y!=268 && location.y!=458) {
				this.recorridoArray.add(btnDerecha.getText().toString());
				pacman.setLocation(location.x+64, location.y);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}else if(location.x==267) {
			this.recorridoArray.add(btnDerecha.getText().toString());
			pacman.setLocation(location.x+63, location.y);
		}else if(location.x==330) {
			if(location.y!=330) {
				this.recorridoArray.add(btnDerecha.getText().toString());
				pacman.setLocation(location.x+64, location.y);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}else if(location.x==394) {
			if(location.y!=15) {
				this.recorridoArray.add(btnDerecha.getText().toString());
				pacman.setLocation(location.x+63, location.y);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}else if(location.x==457) {
			
			this.recorridoArray.add(btnDerecha.getText().toString());
			pacman.setLocation(location.x, location.y);
		}
	}
	
	/*
	 * metodo de avanzar a la izquierda es el encargado de realizar el movimiento de la izquierda del pacman
	 * dicho movimiento es ejecutado con coordenadas X y Y para una mejor precision
	 * donde se restan las coordenadas de X**/
	public void avanzarIzquierda() {
		Point location=pacman.getLocation();
		
		if(location.x==13) {
			this.recorridoArray.add(btnIzquierda.getText().toString());
			pacman.setLocation(location.x, location.y);
		}else if(location.x==77) {
			if(location.y!=268) {
				this.recorridoArray.add(btnIzquierda.getText().toString());
				pacman.setLocation(location.x-64, location.y);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}

		}else if(location.x==140) {
			if(location.y!=15 && location.y!=142) {
				this.recorridoArray.add(btnIzquierda.getText().toString());
				pacman.setLocation(location.x-63, location.y);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}else if(location.x==203) {
			if(location.y!=15 && location.y!=395) {
				this.recorridoArray.add(btnIzquierda.getText().toString());
				pacman.setLocation(location.x-63, location.y);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}else if(location.x==267) {
			this.recorridoArray.add(btnIzquierda.getText().toString());
			pacman.setLocation(location.x-64, location.y);
		}else if(location.x==330) {
			if(location.y!=15 && location.y!=142 && location.y!=268 && location.y!=458) {
				this.recorridoArray.add(btnIzquierda.getText().toString());
				pacman.setLocation(location.x-63, location.y);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}else if(location.x==394) {
			this.recorridoArray.add(btnIzquierda.getText().toString());
			pacman.setLocation(location.x-64, location.y);
		}else if(location.x==457) {
			if(location.y!=330) {
				this.recorridoArray.add(btnIzquierda.getText().toString());
				pacman.setLocation(location.x-63, location.y);
			}else {
				this.recorridoArray.add("X");
				pacman.setLocation(location.x, location.y);
			}
		}
	}
	
	/*
	 * este metodo se encarga de cambiar la dificultad de nivel haciendo visible al pacman**/
	private void cambiarDificultad() {
		if(btnCambiarDificultad.getText().equals("DIFICIL")) {
			btnCambiarDificultad.setBackground(Color.green);
			btnCambiarDificultad.setText("FACIL");
			pacman.setVisible(true);
		}else {
			btnCambiarDificultad.setBackground(Color.RED);
			btnCambiarDificultad.setText("DIFICIL");
			pacman.setVisible(false);
		}
	}
	
	/*
	 * este metodo se ejecuta cuando se da al boton validar y asi devolver una respuesta
	 * correcta o incorrecta valida la posicion de  y Y**/
	private void validar() {
		btnSubir.setEnabled(false);
		btnBajar.setEnabled(false);
		btnDerecha.setEnabled(false);
		btnIzquierda.setEnabled(false);
		btnValidar.setEnabled(false);
		
		
		Point location = pacman.getLocation();
		
		if(this.getHeight()==890) {
			miContenedor.setPreferredSize(new Dimension(250,950));
			
			if(recorridoArray.size()==0) {
				recorrido.setText("   Sin Movimientos");
				scrollPane.setVisible(true);
				btnSiguiente.setVisible(true);
				validacion(location.x, location.y);
			}else {
				recorrido.setText("");
				recorrido.setText("Su Recorrido fue: "+"\n");
				scrollPane.setVisible(true);
				try {
					for(int i=0; i<=recorridoArray.size();i++) {
						recorrido.setText(recorrido.getText()+recorridoArray.get(i));
					}
				} catch (Exception e2) {
					// TODO: handle exception
					validacion(location.x, location.y);
					btnSiguiente.setVisible(true);
				}
			}
		}else {
			miContenedor.setPreferredSize(new Dimension(250,950));
			
			this.setSize(this.getWidth(), this.getHeight()+140);
			this.setLocationRelativeTo(null);
			
			if(recorridoArray.size()==0) {
				recorrido.setText("   Sin Movimientos");
				scrollPane.setVisible(true);
				btnSiguiente.setVisible(true);
				validacion(location.x, location.y);
			}else {
				recorrido.setText("");
				recorrido.setText("Su Recorrido fue: "+"\n");
				scrollPane.setVisible(true);
				
				try {
					for(int i=0; i<=recorridoArray.size();i++) {
						recorrido.setText(recorrido.getText()+recorridoArray.get(i));
					}
				} catch (Exception e2) {
					// TODO: handle exception
					validacion(location.x, location.y);
					btnSiguiente.setVisible(true);
				}


			}
		}

	}
	
	/*
	 * este metodo se ejecuta cuando se da al boton validar y asi devolver una respuesta
	 * correcta o incorrecta validando la posicion de la cereza**/
	public void validacion(int x, int y) {
		if(x==77) {
			
			if(y==15) {
				System.out.println("CORRECTO");
				this.txtValidacion.setForeground(Color.GREEN);
				this.txtValidacion.setText("CORRECTO");
				this.txtValidacion.setVisible(true);
				this.miRespuesta.setPreguntaCinco(2);
				this.pacman.setVisible(true);
			}else {
				System.out.println("INCORRECTO");
				this.txtValidacion.setForeground(Color.RED);
				this.txtValidacion.setText("INCORRECTO");
				this.txtValidacion.setVisible(true);
				this.miRespuesta.setPreguntaCinco(1);
				this.pacman.setVisible(true);
			}
			
		}else {
			System.out.println("INCORRECTO");
			this.txtValidacion.setForeground(Color.RED);
			this.txtValidacion.setText("INCORRECTO");
			this.txtValidacion.setVisible(true);
			this.miRespuesta.setPreguntaCinco(1);
			this.pacman.setVisible(true);
		}
	}
	
	/*Este metodo es el encargado de mostrar el mensaje de confirmacion de guardado de la 
	 * respuesta**/
	public void mensajeDeConfirmacion(Respuestas miRespuesta) {
		boolean confirmacion=miCoordinador.guardarRespuesta(miRespuesta);
		if(confirmacion==true) {
			JOptionPane.showMessageDialog(null, "Se Guardo Correctamente su Respuesta!!");
		}else {
			JOptionPane.showMessageDialog(null, "Error en el guardado de su Respuesta", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	/*
	 * metodo encargado de reiniciar el nivel asi poder jugarlo de nuevo**/
	public void reiniciarNivel() {
		// TODO Auto-generated method stub
		pacman.setLocation(457, 458);
		btnSubir.setEnabled(true);
		btnBajar.setEnabled(true);
		btnDerecha.setEnabled(true);
		btnIzquierda.setEnabled(true);
		btnValidar.setEnabled(true);
		btnSiguiente.setVisible(false);
		scrollPane.setVisible(false);
		pacman.setVisible(false);
		this.txtValidacion.setVisible(false);
		cambiarDificultad2();
		
		this.setSize(600,750);
	}
	
	private void cambiarDificultad2() {
		// TODO Auto-generated method stub
		if(btnCambiarDificultad.getText().equals("FACIL")) {
			btnCambiarDificultad.setBackground(Color.red);
			btnCambiarDificultad.setText("DIFICIL");
			pacman.setVisible(false);
		}
	}

}