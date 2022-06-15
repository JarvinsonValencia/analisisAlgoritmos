package vista.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;

import controlador.Coordinador;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;

/*
 * esta clase es la encargada de mostrar la ventana que realizara la logica de
 * coeficiente correlacional**/
public class CoeficienteCorrelacional extends JDialog implements ActionListener {

	private Coordinador miCoordinador;
	private Container miContenedor;
	private JLabel lblTitulo;
	private JLabel lblMensaje;
	private JLabel preguntaSeleccionadaUno;
	private JLabel preguntaSeleccionadaDos; 
	private JComboBox comboBoxUno;
	private JComboBox comboBoxDos;
	private JButton btnCalcular;
	private JButton btnAtras;
	private JLabel lblResultado;
	private JLabel lblResultado_1;
	
	/*
	 * este metodo es el constructor de esta clase, para asi contruir los primeros elementos y parametros para
	 * la ventana**/
	public CoeficienteCorrelacional() {
		
		setSize(600,500);
		setResizable(false);
		setTitle("Pensamiento Computacional");
		setLocationRelativeTo(null);
		iniciarComponentes();	
	}
	
	public void iniciarComponentes() {
		miContenedor= getContentPane();
		miContenedor.setLayout(null);
		
		lblTitulo = new JLabel("Coeficiente Correcional");
		lblTitulo.setForeground(new Color(0, 51, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo.setBounds(147, 33, 295, 32);
		miContenedor.add(lblTitulo);
		
		lblMensaje = new JLabel("Seleccione las preguntas para establecer el coeficiente correlacional");
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMensaje.setBounds(62, 74, 467, 32);
		miContenedor.add(lblMensaje);
		
		preguntaSeleccionadaUno = new JLabel("Pregunta: ");
		preguntaSeleccionadaUno.setFont(new Font("Tahoma", Font.BOLD, 18));
		preguntaSeleccionadaUno.setBounds(128, 144, 96, 32);
		miContenedor.add(preguntaSeleccionadaUno);
		
		preguntaSeleccionadaDos = new JLabel("Pregunta: ");
		preguntaSeleccionadaDos.setFont(new Font("Tahoma", Font.BOLD, 18));
		preguntaSeleccionadaDos.setBounds(370, 144, 96, 32);
		miContenedor.add(preguntaSeleccionadaDos);
		
		comboBoxUno = new JComboBox();
		comboBoxUno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxUno.addItem("Seleccione");
		comboBoxUno.addItem("1");
		comboBoxUno.addItem("2");
		comboBoxUno.addItem("3");
		comboBoxUno.addItem("4");
		comboBoxUno.addItem("5");
		comboBoxUno.addItem("Satisfaccion 1");
		comboBoxUno.addItem("Satisfaccion 2");
		comboBoxUno.addItem("Satisfaccion 3");
		comboBoxUno.setBounds(104, 187, 126, 22);
		miContenedor.add(comboBoxUno);
		
		comboBoxDos = new JComboBox();
		comboBoxDos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxDos.addItem("Seleccione");
		comboBoxDos.addItem("1");
		comboBoxDos.addItem("2");
		comboBoxDos.addItem("3");
		comboBoxDos.addItem("4");
		comboBoxDos.addItem("5");
		comboBoxDos.addItem("Satisfaccion 1");
		comboBoxDos.addItem("Satisfaccion 2");
		comboBoxDos.addItem("Satisfaccion 3");
		comboBoxDos.setBounds(348, 187, 126, 22);
		miContenedor.add(comboBoxDos);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblResultado.setBounds(178, 234, 236, 42);
		miContenedor.add(lblResultado);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBackground(new Color(204, 255, 204));
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCalcular.setBounds(324, 351, 142, 54);
		btnCalcular.addActionListener(this);
		miContenedor.add(btnCalcular);
			
		btnAtras = new JButton("ATRAS");
		btnAtras.setBackground(new Color(204, 255, 204));
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAtras.setBounds(104, 351, 159, 54);
		btnAtras.addActionListener(this);
		miContenedor.add(btnAtras);
		
		lblResultado_1 = new JLabel("No Seleccionado Aun");
		lblResultado_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado_1.setBounds(200, 287, 181, 42);
		getContentPane().add(lblResultado_1);
		
	}

	/*este metodo es el encargado de escuchar los eventos de cada boton
	 * donde mediante las condiciones se evalua cual boton fue ejecutado**/
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnCalcular) {
			
			String obtenido1= (String) comboBoxUno.getSelectedItem();
			String obtenido2= (String) comboBoxDos.getSelectedItem();
			
			if(obtenido1.equals("Seleccione") || obtenido2.equals("Seleccione")  ) {
				lblResultado_1.setText("Porfavor Seleccione las dos Preguntas");
			}else {
				double coeficiente=this.miCoordinador.obtenerCoeficiente(obtenido1, obtenido2);
				String cadena="    El coeficiente Correlacional";
				String cadena2="    Es de :"+coeficiente;
				lblResultado.setText(cadena);
				lblResultado_1.setText(cadena2);
			}			
			
			
		}else if(e.getSource()==btnAtras) {
			this.dispose();
		}
	}

	/*
	 * estee metodo es el encargado de ejecutar la conexion con el coordinador**/
	public void setCoordinador(Coordinador miCoordinador) {
		// TODO Auto-generated method stub
		this.miCoordinador = miCoordinador;
	}
	
	/*
	 * este metodo es el encargado de limpiar los campos que se ingresan para averiguar el coeficiente correlacional**/
	public void limpiar() {
		lblResultado.setText("");
		lblResultado_1.setText("      No Seleccionado Aun");
		comboBoxUno.setSelectedIndex(0);
		comboBoxDos.setSelectedIndex(0);
		
	}
}
