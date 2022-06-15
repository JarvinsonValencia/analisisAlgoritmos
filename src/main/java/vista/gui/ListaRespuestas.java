package vista.gui;



import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import controlador.Coordinador;
import modelo.entidades.Respuestas;

/*clase encargada de mostrar la ventana de la lista de respuesta 
 * ordenadas de mayor a menor**/
public class ListaRespuestas extends JDialog implements ActionListener {
	
	private Coordinador miCoordinador;
	Container miContenedor;
	JTable miTabla;
	JScrollPane mibarra;
	JButton btnAtras;

	/*
	 * metodo constructor encargado de iniciar la ventana y iniciar el metodo iniciar Componentes**/
	public ListaRespuestas() {

		setSize(800,600);
		setResizable(false);
		setTitle("Pensamiento Computacional");
		setLocationRelativeTo(null);
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		miContenedor=getContentPane();
		miContenedor.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Listado de Respuestas");
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitulo.setBounds(218, 22, 350, 43);
		miContenedor.add(lblTitulo);
		
		mibarra = new JScrollPane();
		mibarra.setBounds(34, 87, 714, 400);
		miContenedor.add(mibarra);
		
		btnAtras = new JButton();
		btnAtras.setBackground(new Color(204, 255, 255));
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAtras.setText("ATRAS");
		btnAtras.setBounds(325, 498, 115, 52);
		btnAtras.addActionListener(this);
		miContenedor.add(btnAtras);

	}
	
	/*
	 * metodo encargado de contruir la tabla y llenarla de datos extraidos de la base de datos**/
	public void construirTabla() {
		// TODO Auto-generated method stub
		String titulos[]= {"Nombre", "Pregunta 1","Pregunta 2","Pregunta 3", "Pregunta 4", "Pregunta 5","Calificacion"};
		String informacion[][]=obtenerMatriz();
	
		miTabla = new JTable(informacion,titulos);
		miTabla.setBackground(new Color(255, 255, 204));
		miTabla.setFont(new Font("Calibri",4,20));
		miTabla.setGridColor(Color.BLACK);
		miTabla.getTableHeader().setFont(new Font("Calibri",4,18));
		miTabla.getTableHeader().setBackground(Color.LIGHT_GRAY);
		miTabla.getTableHeader().setForeground(Color.BLACK);
		miTabla.setRowHeight(35);
		miTabla.setEnabled(false);
		mibarra.setViewportView(miTabla);
		
	}
	
	/*
	 * obtiene la matriz de datos desde la base de datos
	 * se obtiene una matriz para asi poder llenar la tabla 
	 * de una manera mas rapida**/
	public String[][] obtenerMatriz() {
		// TODO Auto-generated method stub
		ArrayList<Respuestas>miLista=this.miCoordinador.obtenerDatosOrganizados();
		
		String matrizInfo[][] = new String[miLista.size()][7];
		
		for(int i = 0; i< miLista.size(); i++) {
			matrizInfo[i][0]=miLista.get(i).getNombreEstudiante()+"";
			matrizInfo[i][1]=miLista.get(i).getPreguntaUno()+"";
			matrizInfo[i][2]=miLista.get(i).getPreguntaDos()+"";
			matrizInfo[i][3]=miLista.get(i).getPreguntaTres()+"";
			matrizInfo[i][4]=miLista.get(i).getPreguntaCuatro()+"";
			matrizInfo[i][5]=miLista.get(i).getPreguntaCinco()+"";
			matrizInfo[i][6]=miLista.get(i).getCalificacionTest()+"";
		}
		
		return matrizInfo;
	}

	/*
	 * metodo encargado de escuchar los eventos de los botones**/
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnAtras) {
			this.dispose();
		}
	}
	
	/*
	 * metodo encargado de la conexion de nuestro coordinador**/
	public void setCoordinador(Coordinador miCoordinador) {
		// TODO Auto-generated method stub
		this.miCoordinador = miCoordinador;
	}
	

}
