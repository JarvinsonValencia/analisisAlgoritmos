package vista.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.util.*;

import controlador.Coordinador;
import modelo.entidades.Respuestas;

/*
 * La clase informacion sera la encargada de mostrar los datos de cada pregunta
 * promedio, correctas e incorrectas, el promedio de las preguntas de satisfaccion**/
public class Informacion extends JDialog implements ActionListener{
	
	JPanel miContenedor;
	private JTextField txtPromedio1;
	private JTextField txtCorrectasUno;
	private JTextField txtIncorrectasUno;
	private JTextField txtPromedio2;
	private JTextField txtCorrectasDos;
	private JTextField txtIncorrectasDos;
	private JTextField txtPromedio3;
	private JTextField txtCorrectasTres;
	private JTextField txtIncorrectasTres;
	private JTextField txtPromedio4;
	private JTextField txtCorrectasCuatro;
	private JTextField txtIncorrectasCuatro;
	private JTextField txtPromedio5;
	private JTextField txtCorrectasCinco;
	private JTextField txtIncorrectasCinco;
	private Coordinador miCoordinador;
	private JButton btnAtras;
	private JButton btnCoeficienteCR;
	private JButton btnVerLista;
	private ArrayList<Object> valoresPreguntaUno;
	private ArrayList<Object> valoresPreguntaDos;
	private ArrayList<Object> valoresPreguntaTres;
	private ArrayList<Object> valoresPreguntaCuatro;
	private ArrayList<Object> valoresPreguntaCinco;
	private double promedioPregunta1Sa;
	private double promedioPregunta2Sa;
	private double promedioPregunta3Sa;
	private JTextField txtPromedioP1;
	private JTextField txtPromedioP2;
	private JTextField txtPromedioP3;
	
	/*
	 * metodo constructor de esta clase encargado de iniciar esta ventana, y de iniciar los 
	 * componentes de dicha ventana**/
	public Informacion() {
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		setSize(700,850);
		setResizable(false);
		setTitle("Pensamiento Computacional");
		setLocationRelativeTo(null);
		iniciarComponentes();	
	}
	
	public void iniciarComponentes() {
		JScrollPane miScroll = new JScrollPane();
		miScroll.setBounds(10,20,20,20);
		
		miContenedor= new JPanel();
		miContenedor.setLayout(null);
		
		txtCorrectasUno = new JTextField();
		txtCorrectasUno.setBounds(259, 118, 43, 24);
		txtCorrectasUno.setFont(new Font("",4,18));
		txtCorrectasUno.setForeground(new Color(0, 128, 0));
		miContenedor.add(txtCorrectasUno);
		txtCorrectasUno.setColumns(10);
		txtCorrectasUno.setEditable(false);
		
		JLabel lblCorrectasUno = new JLabel("Correctas:");
		lblCorrectasUno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCorrectasUno.setBounds(168, 113, 81, 32);
		miContenedor.add(lblCorrectasUno);
		
		JLabel lblTitulo = new JLabel("Informacion Global Del Test");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setBounds(171, 11, 335, 51);
		miContenedor.add(lblTitulo);
		
		JLabel lblPreguntaUno = new JLabel("Promedio Global Pregunta Uno:");
		lblPreguntaUno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreguntaUno.setBounds(36, 78, 253, 14);
		miContenedor.add(lblPreguntaUno);
		
		txtPromedio1 = new JTextField();
		txtPromedio1.setBounds(288, 73, 43, 24);
		miContenedor.add(txtPromedio1);
		txtPromedio1.setColumns(10);
		txtPromedio1.setFont(new Font("",4,18));
		txtPromedio1.setEditable(false);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 62, 635, 14);
		miContenedor.add(separator);
		
		JLabel lblIncorrectasUno = new JLabel("Incorrectas:");
		lblIncorrectasUno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIncorrectasUno.setBounds(330, 113, 99, 32);
		miContenedor.add(lblIncorrectasUno);
		
		txtIncorrectasUno = new JTextField();
		txtIncorrectasUno.setColumns(10);
		txtIncorrectasUno.setBounds(432, 118, 43, 24);
		txtIncorrectasUno.setFont(new Font("",4,18));
		txtIncorrectasUno.setForeground(Color.red);
		txtIncorrectasUno.setEditable(false);
		miContenedor.add(txtIncorrectasUno);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(21, 156, 635, 14);
		miContenedor.add(separator_1);
		
		JLabel lblPreguntaDos = new JLabel("Promedio Global Pregunta Dos:");
		lblPreguntaDos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreguntaDos.setBounds(36, 177, 253, 14);
		miContenedor.add(lblPreguntaDos);
		
		txtPromedio2 = new JTextField();
		txtPromedio2.setColumns(10);
		txtPromedio2.setBounds(288, 174, 43, 24);
		txtPromedio2.setFont(new Font("",4,18));
		txtPromedio2.setEditable(false);
		miContenedor.add(txtPromedio2);
		
		JLabel lblCorrectasDos = new JLabel("Correctas:");
		lblCorrectasDos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCorrectasDos.setBounds(168, 214, 81, 32);
		miContenedor.add(lblCorrectasDos);
		
		JLabel lblIncorrectasDos = new JLabel("Incorrectas:");
		lblIncorrectasDos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIncorrectasDos.setBounds(330, 214, 99, 32);
		miContenedor.add(lblIncorrectasDos);
		
		txtCorrectasDos = new JTextField();
		txtCorrectasDos.setColumns(10);
		txtCorrectasDos.setBounds(259, 220, 43, 24);
		txtCorrectasDos.setFont(new Font("",4,18));
		txtCorrectasDos.setForeground(new Color(0, 128, 0));
		txtCorrectasDos.setEditable(false);
		miContenedor.add(txtCorrectasDos);
		
		txtIncorrectasDos = new JTextField();
		txtIncorrectasDos.setColumns(10);
		txtIncorrectasDos.setBounds(432, 220, 43, 24);
		txtIncorrectasDos.setFont(new Font("",4,18));
		txtIncorrectasDos.setForeground(Color.red);
		txtIncorrectasDos.setEditable(false);
		miContenedor.add(txtIncorrectasDos);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(21, 257, 635, 14);
		miContenedor.add(separator_1_1);
		
		JLabel lblPreguntaTres = new JLabel("Promedio Global Pregunta Tres:");
		lblPreguntaTres.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreguntaTres.setBounds(36, 273, 253, 14);
		miContenedor.add(lblPreguntaTres);
		
		txtPromedio3 = new JTextField();
		txtPromedio3.setColumns(10);
		txtPromedio3.setBounds(288, 271, 43, 24);
		txtPromedio3.setFont(new Font("",4,18));
		txtPromedio3.setEditable(false);
		miContenedor.add(txtPromedio3);
		
		JLabel lblCorrectasTres = new JLabel("Correctas:");
		lblCorrectasTres.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCorrectasTres.setBounds(168, 311, 81, 32);
		miContenedor.add(lblCorrectasTres);
		
		txtCorrectasTres = new JTextField();
		txtCorrectasTres.setColumns(10);
		txtCorrectasTres.setBounds(259, 316, 43, 24);
		txtCorrectasTres.setFont(new Font("",4,18));
		txtCorrectasTres.setForeground(new Color(0, 128, 0));
		txtCorrectasTres.setEditable(false);
		miContenedor.add(txtCorrectasTres);
		
		txtIncorrectasTres = new JTextField();
		txtIncorrectasTres.setColumns(10);
		txtIncorrectasTres.setBounds(432, 316, 43, 24);
		txtIncorrectasTres.setFont(new Font("",4,18));
		txtIncorrectasTres.setForeground(Color.red);
		txtIncorrectasTres.setEditable(false);
		miContenedor.add(txtIncorrectasTres);
		
		JLabel lblIncorrectasTres = new JLabel("Incorrectas:");
		lblIncorrectasTres.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIncorrectasTres.setBounds(330, 311, 99, 32);
		miContenedor.add(lblIncorrectasTres);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(21, 354, 635, 14);
		miContenedor.add(separator_1_1_1);
		
		JLabel lblPreguntaCuatro = new JLabel("Promedio Global Pregunta Cuatro:");
		lblPreguntaCuatro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreguntaCuatro.setBounds(36, 371, 284, 14);
		miContenedor.add(lblPreguntaCuatro);
		
		txtPromedio4 = new JTextField();
		txtPromedio4.setColumns(10);
		txtPromedio4.setBounds(308, 369, 43, 24);
		txtPromedio4.setFont(new Font("",4,18));
		txtPromedio4.setEditable(false);
		miContenedor.add(txtPromedio4);
		
		JLabel lblCorrectasCuatro = new JLabel("Correctas:");
		lblCorrectasCuatro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCorrectasCuatro.setBounds(168, 408, 81, 32);
		miContenedor.add(lblCorrectasCuatro);
		
		JLabel lblIncorrectasCuatro = new JLabel("Incorrectas:");
		lblIncorrectasCuatro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIncorrectasCuatro.setBounds(330, 408, 99, 32);
		miContenedor.add(lblIncorrectasCuatro);
		
		txtCorrectasCuatro = new JTextField();
		txtCorrectasCuatro.setColumns(10);
		txtCorrectasCuatro.setBounds(259, 414, 43, 24);
		txtCorrectasCuatro.setFont(new Font("",4,18));
		txtCorrectasCuatro.setForeground(new Color(0, 128, 0));
		txtCorrectasCuatro.setEditable(false);
		miContenedor.add(txtCorrectasCuatro);
		
		txtIncorrectasCuatro = new JTextField();
		txtIncorrectasCuatro.setColumns(10);
		txtIncorrectasCuatro.setBounds(432, 414, 43, 24);
		txtIncorrectasCuatro.setFont(new Font("",4,18));
		txtIncorrectasCuatro.setForeground(Color.red);
		txtIncorrectasCuatro.setEditable(false);
		miContenedor.add(txtIncorrectasCuatro);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBounds(21, 451, 635, 14);
		miContenedor.add(separator_1_1_1_1);
		
		JLabel lblPreguntaCinco = new JLabel("Promedio Global Pregunta Cinco:");
		lblPreguntaCinco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreguntaCinco.setBounds(36, 467, 266, 14);
		miContenedor.add(lblPreguntaCinco);
		
		txtPromedio5 = new JTextField();
		txtPromedio5.setColumns(10);
		txtPromedio5.setBounds(308, 465, 43, 24);
		txtPromedio5.setFont(new Font("",4,18));
		txtPromedio5.setEditable(false);
		miContenedor.add(txtPromedio5);
		
		JLabel lblCorrectasCinco = new JLabel("Correctas:");
		lblCorrectasCinco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCorrectasCinco.setBounds(168, 505, 81, 32);
		miContenedor.add(lblCorrectasCinco);
		
		JLabel lblIncorrectasCinco = new JLabel("Incorrectas:");
		lblIncorrectasCinco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIncorrectasCinco.setBounds(330, 505, 99, 32);
		miContenedor.add(lblIncorrectasCinco);
		
		txtCorrectasCinco = new JTextField();
		txtCorrectasCinco.setColumns(10);
		txtCorrectasCinco.setBounds(259, 512, 43, 24);
		txtCorrectasCinco.setFont(new Font("",4,18));
		txtCorrectasCinco.setForeground(new Color(0, 128, 0));
		txtCorrectasCinco.setEditable(false);
		miContenedor.add(txtCorrectasCinco);
		
		txtIncorrectasCinco = new JTextField();
		txtIncorrectasCinco.setColumns(10);
		txtIncorrectasCinco.setBounds(432, 512, 43, 24);
		txtIncorrectasCinco.setFont(new Font("",4,18));
		txtIncorrectasCinco.setForeground(Color.red);
		txtIncorrectasCinco.setEditable(false);
		miContenedor.add(txtIncorrectasCinco);
		
		JSeparator separator_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1.setBounds(21, 560, 635, 14);
		miContenedor.add(separator_1_1_1_1_1);
		
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAtras.setBackground(new Color(224, 255, 255));
		btnAtras.setBounds(76, 726, 142, 51);
		btnAtras.addActionListener(this);
		miContenedor.add(btnAtras);
		
		btnCoeficienteCR = new JButton("Coeficiente");
		btnCoeficienteCR.setBackground(new Color(204, 255, 204));
		btnCoeficienteCR.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCoeficienteCR.setBounds(459, 726, 142, 51);
		btnCoeficienteCR.addActionListener(this);
		miContenedor.add(btnCoeficienteCR);
		
		btnVerLista = new JButton("Ver Lista");
		btnVerLista.setBackground(new Color(255, 255, 153));
		btnVerLista.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnVerLista.setBounds(266, 726, 142, 51);
		btnVerLista.addActionListener(this);
		miContenedor.add(btnVerLista);
		
		JSeparator separator_1_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1_1.setBounds(21, 701, 635, 14);
		miContenedor.add(separator_1_1_1_1_1_1);
		
		JLabel lblPreguntasSatisfaccion = new JLabel("Promedio Global Preguntas De Satisfaccion");
		lblPreguntasSatisfaccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreguntasSatisfaccion.setBounds(168, 585, 350, 14);
		miContenedor.add(lblPreguntasSatisfaccion);
		
		JLabel lblPreguntaSa1 = new JLabel("Pregunta 1");
		lblPreguntaSa1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreguntaSa1.setBounds(135, 626, 99, 32);
		miContenedor.add(lblPreguntaSa1);
		
		JLabel lblPreguntaSa2 = new JLabel("Pregunta 2");
		lblPreguntaSa2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreguntaSa2.setBounds(287, 626, 99, 32);
		miContenedor.add(lblPreguntaSa2);
		
		JLabel lblPreguntaSa3 = new JLabel("Pregunta 3");
		lblPreguntaSa3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPreguntaSa3.setBounds(448, 626, 99, 32);
		miContenedor.add(lblPreguntaSa3);
		
		txtPromedioP1 = new JTextField();
		txtPromedioP1.setForeground(new Color(0, 0, 0));
		txtPromedioP1.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtPromedioP1.setColumns(10);
		txtPromedioP1.setBounds(155, 666, 43, 24);
		txtPromedioP1.setEditable(false);
		miContenedor.add(txtPromedioP1);
		
		txtPromedioP2 = new JTextField();
		txtPromedioP2.setForeground(new Color(0, 0, 0));
		txtPromedioP2.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtPromedioP2.setColumns(10);
		txtPromedioP2.setBounds(308, 669, 43, 24);
		txtPromedioP2.setEditable(false);
		miContenedor.add(txtPromedioP2);
		
		txtPromedioP3 = new JTextField();
		txtPromedioP3.setForeground(new Color(0, 0, 0));
		txtPromedioP3.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtPromedioP3.setColumns(10);
		txtPromedioP3.setBounds(463, 669, 43, 24);
		txtPromedioP3.setEditable(false);
		miContenedor.add(txtPromedioP3);
		
		miContenedor.setPreferredSize(new Dimension(250,950));
		
		miScroll.setViewportView(miContenedor);
		add(miScroll);
	}

	/*
	 * este metodo es el escuchador de eventos de los botones, donde e es dicho evento
	 * provocado por un boton, mediante condiciones se verifica cual boton fue**/
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnAtras) {
			this.dispose();
		}else if(e.getSource()==btnVerLista) {
			this.miCoordinador.mostrarLista();
			System.out.println("presiono");
		}else if(e.getSource()==btnCoeficienteCR) {
			this.miCoordinador.mostrarCoeficiente();
		}
	}

	/*
	 * este metodo se encarga de la conexion del coordinador **/
	public void setCoordinador(Coordinador miCoordinador) {
		// TODO Auto-generated method stub
		this.miCoordinador = miCoordinador;
	}

	/*
	 * este metodo es el encargado de obtener la lista desde el coordinador que este caso
	 * desde el coordinador se obtieene dicha lista de respuestas**/
	public void obtenerLista(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		this.valoresPreguntaUno = new ArrayList<Object>();
		this.valoresPreguntaUno=miCoordinador.obtenerValorRespuestaUno(miListaRespuestas);
		Double promedio1=(Double) valoresPreguntaUno.get(0);
		int correctas1=(Integer) valoresPreguntaUno.get(1);
		int incorrectas1=(Integer) valoresPreguntaUno.get(2);
		txtPromedio1.setText(""+promedio1);
		txtCorrectasUno.setText(""+correctas1);
		txtIncorrectasUno.setText(""+incorrectas1);
		
		this.valoresPreguntaDos = new ArrayList<Object>();
		this.valoresPreguntaDos=miCoordinador.obtenerValorRespuestaDos(miListaRespuestas);
		Double promedio2=(Double) valoresPreguntaDos.get(0);
		int correctas2=(Integer) valoresPreguntaDos.get(1);
		int incorrectas2=(Integer) valoresPreguntaDos.get(2);
		txtPromedio2.setText(""+promedio2);
		txtCorrectasDos.setText(""+correctas2);
		txtIncorrectasDos.setText(""+incorrectas2);
		
		
		this.valoresPreguntaTres = new ArrayList<Object>();
		this.valoresPreguntaTres=miCoordinador.obtenerValorRespuestaTres(miListaRespuestas);
		Double promedio3=(Double) valoresPreguntaTres.get(0);
		int correctas3=(Integer) valoresPreguntaTres.get(1);
		int incorrectas3=(Integer) valoresPreguntaTres.get(2);
		txtPromedio3.setText(""+promedio3);
		txtCorrectasTres.setText(""+correctas3);
		txtIncorrectasTres.setText(""+incorrectas3);
		
		this.valoresPreguntaCuatro = new ArrayList<Object>();
		this.valoresPreguntaCuatro=miCoordinador.obtenerValorRespuestaCuatro(miListaRespuestas);
		Double promedio4=(Double) valoresPreguntaCuatro.get(0);
		int correctas4=(Integer) valoresPreguntaCuatro.get(1);
		int incorrectas4=(Integer) valoresPreguntaCuatro.get(2);
		txtPromedio4.setText(""+promedio4);
		txtCorrectasCuatro.setText(""+correctas4);
		txtIncorrectasCuatro.setText(""+incorrectas4);
		
		this.valoresPreguntaCinco = new ArrayList<Object>();
		this.valoresPreguntaCinco=miCoordinador.obtenerValorRespuestaCinco(miListaRespuestas);
		Double promedio5=(Double) valoresPreguntaCinco.get(0);
		int correctas5=(Integer) valoresPreguntaCinco.get(1);
		int incorrectas5=(Integer) valoresPreguntaCinco.get(2);
		txtPromedio5.setText(""+promedio5);
		txtCorrectasCinco.setText(""+correctas5);
		txtIncorrectasCinco.setText(""+incorrectas5);
		
		this.promedioPregunta1Sa = miCoordinador.obtenerPromedioPreguntaSa1(miListaRespuestas);
		txtPromedioP1.setText(""+this.promedioPregunta1Sa);
		
		this.promedioPregunta2Sa = miCoordinador.obtenerPromedioPreguntaSa2(miListaRespuestas);
		txtPromedioP2.setText(""+this.promedioPregunta2Sa);
		
		this.promedioPregunta3Sa = miCoordinador.obtenerPromedioPreguntaSa3(miListaRespuestas);
		txtPromedioP3.setText(""+this.promedioPregunta3Sa);
	}
}