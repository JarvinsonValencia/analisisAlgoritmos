package controlador;

import java.util.ArrayList;

/**
 * Esta clase Coordinador es la que nos ayudara a comunicarnos desde la vista grafica hasta el modelo controlador
 * en otras palabras comunicarnos desde la vista hasta la logica, y asi respetar el patron de diseño MVC
 * */

import java.util.List;

import logica.GestionRespuestas;
import modelo.dao.RespuestasDao;
import modelo.entidades.Respuestas;
import vista.gui.CoeficienteCorrelacional;
import vista.gui.Informacion;
import vista.gui.ListaRespuestas;
import vista.gui.PreguntaCinco;
import vista.gui.PreguntaCuatro;
import vista.gui.PreguntaDos;
import vista.gui.PreguntaTres;
import vista.gui.PreguntaUno;
import vista.gui.TestFinal;
import vista.gui.TestSatisfaccion;
import vista.gui.VentanaPrincipal;

public class Coordinador {
	
	/**
	 * las otras cosas llegan por medio de importacion. se instacian y se inicializar en los metodos set de cada Clase
	 * */
	
	private JPAUtil miJPAUtil;
	private GestionRespuestas miGestionRespuestas;
	private RespuestasDao miRespuestasDao;
	private VentanaPrincipal miVentanaPrincipal;
	private PreguntaUno miPreguntaUno;
	private PreguntaDos miPreguntaDos;
	private PreguntaTres miPreguntaTres;
	private PreguntaCuatro miPreguntaCuatro;
	private PreguntaCinco miPreguntaCinco;
	private TestFinal miTestFinal;
	private TestSatisfaccion miTestSatisfaccion;
	private Informacion miInformacion;
	private ListaRespuestas miListaRespuesta;
	private CoeficienteCorrelacional miCoeficiente;
	
	/**
	 * Todos los metodos que comiencen con el set hacen referencia a la inicializacion de las demas clases para 
	 * que asi el coordinador tenga control en ellas
	 * */

	public void setJPAUtil(JPAUtil miJPAUtil) {

		this.miJPAUtil = miJPAUtil;
	}

	public void setGestionRespuestas(GestionRespuestas miGestionRespuestas) {

		this.miGestionRespuestas = miGestionRespuestas;
	}

	public void setRespuestasDao(RespuestasDao miRespuestasDao) {

		this.miRespuestasDao = miRespuestasDao;
	}

	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {

		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	
	public void setPreguntaUno(PreguntaUno miPreguntaUno) {
		// TODO Auto-generated method stub
		this.miPreguntaUno = miPreguntaUno;
	}

	public void setPreguntaDos(PreguntaDos miPreguntaDos) {
		// TODO Auto-generated method stub
		this.miPreguntaDos=miPreguntaDos;
	}

	public void setPreguntaTres(PreguntaTres miPreguntaTres) {
		// TODO Auto-generated method stub
		this.miPreguntaTres = miPreguntaTres;
	}
	
	public void setPreguntaCuatro(PreguntaCuatro miPreguntaCuatro) {
		this.miPreguntaCuatro = miPreguntaCuatro;
	}
	
	public void setPreguntaCinco(PreguntaCinco miPreguntaCinco) {
		this.miPreguntaCinco = miPreguntaCinco;
	}

	public void setTestFinal(TestFinal miTestFinal) {
		// TODO Auto-generated method stub
		this.miTestFinal= miTestFinal;
	}
	
	public void setTestSatisfaccion(TestSatisfaccion miTestSatisfaccion) {
		// TODO Auto-generated method stub
		this.miTestSatisfaccion = miTestSatisfaccion;
	}
	
	public void setInformacion(Informacion miInformacion) {
		// TODO Auto-generated method stub
		this.miInformacion= miInformacion;
	}
	
	public void setMiListaRespuestas(ListaRespuestas miListaRespuestas) {
		// TODO Auto-generated method stub
		this.miListaRespuesta = miListaRespuestas;
	}
	
	public void setMiCoeficiente(CoeficienteCorrelacional miCoeficiente) {
		// TODO Auto-generated method stub
		this.miCoeficiente = miCoeficiente;
	}

	
	/**
	 * los siguientes metodos con la palabra mostrar son los encargados de mostrar las ventanas para que el usuario 
	 * pueda visualizarlas y asi interactuar con ellas,
	 * 
	 * principalmente el metodo encargado de hacer posible esa visualizacion es un metodo nativo de JavaSwing el cual es
	 * setVisible que funcion con valor booleano, true para mostrar y false para esconder ya que se esconde y no se finaliza
	 * la vida de la ventana
	 * 
	 * para finalizar la vida de la ventana se utiliza el dispose encargado de cerrar la ventana y asi no desperdiciar recursos
	 * habran otros metodos los cuales se explicaran en las clases dueñas de estos metodos
	 * */
	
	public void mostrarPregunta1(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		this.miVentanaPrincipal.vaciar();
		this.miVentanaPrincipal.setVisible(false);
		this.miPreguntaUno.reiniciarNivel();
		this.miPreguntaUno.recibirRespuesta(miRespuesta);
		this.miPreguntaUno.setVisible(true);
	}

	public void mostrarPregunta2(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		this.miPreguntaUno.dispose();
		this.miPreguntaDos.reiniciarNivel();
		this.miPreguntaDos.recibirRespuesta(miRespuesta);
		this.miPreguntaDos.setVisible(true);
	}

	public void mostrarPregunta3(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		this.miPreguntaDos.dispose();
		this.miPreguntaTres.reiniciarNivel();
		this.miPreguntaTres.recibirRespuesta(miRespuesta);
		this.miPreguntaTres.setVisible(true);
	}

	public void mostrarPregunta4(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		this.miPreguntaTres.dispose();
		this.miPreguntaCuatro.reiniciarNivel();
		this.miPreguntaCuatro.recibirRespuesta(miRespuesta);
		this.miPreguntaCuatro.setVisible(true);
	}

	public void mostrarPregunta5(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		this.miPreguntaCuatro.dispose();
		this.miPreguntaCinco.reiniciarNivel();
		this.miPreguntaCinco.recibirRespuesta(miRespuesta);
		this.miPreguntaCinco.setVisible(true);
	}

	public void mostrarTest(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		Respuestas miRespuestaNueva = new Respuestas();
		miRespuestaNueva=miGestionRespuestas.calcularPromedioTest(miRespuesta);
		
		this.miPreguntaCinco.dispose();
		this.miTestFinal.LlenarDatos(miRespuestaNueva);
		this.miTestFinal.setVisible(true);
	}

	public void mostrarTestSatisfaccion(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		this.miTestFinal.dispose();
		this.miTestSatisfaccion.reiniciar();
		this.miTestSatisfaccion.enviarRespuesta(miRespuesta);
		this.miTestSatisfaccion.setVisible(true);
	}
	
	public void mostrarVentanaPrincipal() {
		// TODO Auto-generated method stub
		this.miTestSatisfaccion.dispose();
		this.miVentanaPrincipal.setVisible(true);
	}
	

	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		List<Respuestas> miListaRespuestas = new ArrayList<Respuestas>();
		miListaRespuestas = this.miRespuestasDao.obtenerLista();
		this.miInformacion.obtenerLista(miListaRespuestas);
		this.miInformacion.setVisible(true);
	}
	
	public void mostrarLista() {
		// TODO Auto-generated method stub
		this.miListaRespuesta.construirTabla();
		this.miListaRespuesta.setVisible(true);
	}

	public void mostrarCoeficiente() {
		// TODO Auto-generated method stub
		this.miCoeficiente.limpiar();
		this.miCoeficiente.setVisible(true);
	}
	

	/**
	 * el metodo guardarRespuesta es el encargado de enviar los datos de la respuesta a la base de datos 
	 * mediante el Dao el cual por dentro contiene el acceso a la base de datos
	 * */
	public boolean guardarRespuesta(Respuestas miRespuesta) {
		
		Respuestas miRespuestaNueva = new Respuestas();
		miRespuestaNueva=miGestionRespuestas.calcularPromedioTest(miRespuesta);
		boolean confirmacion=miRespuestasDao.guardarRespuesta(miRespuestaNueva);
		
		return confirmacion;
	}
	
	
	/**
	 * el metodo actualizaRespuesta es el encargado de insertar un objeto respuesta a la base de datos donde este ya existe
	 * y asi actualizarlo, en este caso agregandole las respuestas de Satisfaccion*/
	public void actualizaRespuesta(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		miRespuestasDao.actualizarRespuesta(miRespuesta);
	}
	
	
	/**
	 * Estos 5 metodos son los encargados de obtener mediante la gestion de respuestas el promedio de la pregunta que se desea
	 * y las correctas y incorrectas respuestas de dicha pregunta
	 * 
	 * recibiendo por parametros un objeto lista el cual es una lista de respuestas
	 * */
	
	public ArrayList<Object> obtenerValorRespuestaUno(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		ArrayList<Object> valoresRespuestaUno = miGestionRespuestas.obtenerValoresRespuestaUno(miListaRespuestas);
		return valoresRespuestaUno;
	}

	public ArrayList<Object> obtenerValorRespuestaDos(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		ArrayList<Object> valoresRespuestaDos = miGestionRespuestas.obtenerValoresRespuestaDos(miListaRespuestas);
		return valoresRespuestaDos;
	}

	public ArrayList<Object> obtenerValorRespuestaTres(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		ArrayList<Object> valoresRespuestaTres = miGestionRespuestas.obtenerValoresRespuestaTres(miListaRespuestas);
		return valoresRespuestaTres;
	}

	public ArrayList<Object> obtenerValorRespuestaCuatro(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		ArrayList<Object> valoresRespuestaCuatro = miGestionRespuestas.obtenerValoresRespuestaCuatro(miListaRespuestas);
		return valoresRespuestaCuatro;
	}

	public ArrayList<Object> obtenerValorRespuestaCinco(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		ArrayList<Object> valoresRespuestaCinco = miGestionRespuestas.obtenerValoresRespuestaCinco(miListaRespuestas);
		return valoresRespuestaCinco;
	}

	
	
	/*
	 * estos tres metodos estan encargados de obtener el promedio de las preguntas de satisfaccion
	 *	
	 * recibiendo por parametros un objeto lista el cual es una lista de respuestas
	 **/
	public double obtenerPromedioPreguntaSa1(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		return miGestionRespuestas.obtenerPromedioPreguntaSa1(miListaRespuestas);
	}

	public double obtenerPromedioPreguntaSa2(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		return miGestionRespuestas.obtenerPromedioPreguntaSa2(miListaRespuestas);
	}

	public double obtenerPromedioPreguntaSa3(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		return miGestionRespuestas.obtenerPromedioPreguntaSa3(miListaRespuestas);
	}

	
	/*
	 * este metodo se encarga de obtener datos de la base de datos organizados
	 * de mayor a menor dependiendo de su nota final del test gracias a la clase gestion de respuestas **/
	public ArrayList<Respuestas> obtenerDatosOrganizados() {
		// TODO Auto-generated method stub
		List<Respuestas> miListaRespuestas = new ArrayList<Respuestas>();
		miListaRespuestas = this.miRespuestasDao.obtenerLista();
		List<Respuestas> miListaRespuestasOrganizadas = new ArrayList<Respuestas>();
		miListaRespuestasOrganizadas = this.miGestionRespuestas.ordenarLista(miListaRespuestas);
		
		return (ArrayList<Respuestas>) miListaRespuestasOrganizadas;
	}


	/*
	 * este metodo es el encargado de devolver el coeficiente correlacional de las preguntas seleccionadas por el usuario
	 * **/
	public double obtenerCoeficiente(String obtenido1, String obtenido2) {
		// TODO Auto-generated method stub
		List<Respuestas> miListaRespuestas = new ArrayList<Respuestas>();
		miListaRespuestas = this.miRespuestasDao.obtenerLista();
		List<Integer> valor1=miGestionRespuestas.obtenerValoresCoeficiente(obtenido1, miListaRespuestas);
		List<Integer> valor2=miGestionRespuestas.obtenerValoresCoeficiente(obtenido2, miListaRespuestas);
		double coeficiente=miGestionRespuestas.obtenerCoeficiente(valor1, valor2);
		
		return coeficiente;
	}







}
