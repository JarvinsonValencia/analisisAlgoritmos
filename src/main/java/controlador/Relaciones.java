package controlador;

import logica.GestionRespuestas;
import modelo.dao.RespuestasDao;
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

/**
 * Clase Relaciones encargada de ejecutar dichas relaciones de las Clases de gestion, vista y dao 
 * con la clase Coordinador
 * */

public class Relaciones {
 
	public Relaciones(){
		
		/**
		 * Primeramente se Instancia y inicializan las clases que se usaran
		 * 
		 * */
		
		Coordinador miCoordinador = new Coordinador();
		JPAUtil miJPAUtil = new JPAUtil();
		GestionRespuestas miGestionRespuestas = new GestionRespuestas();
		RespuestasDao miRespuestasDao = new RespuestasDao();
		
		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		PreguntaUno miPreguntaUno = new PreguntaUno();
		PreguntaDos miPreguntaDos = new PreguntaDos();
		PreguntaTres miPreguntaTres = new PreguntaTres();
		PreguntaCuatro miPreguntaCuatro = new PreguntaCuatro();
		PreguntaCinco miPreguntaCinco = new PreguntaCinco();
		TestFinal miTestFinal = new TestFinal();
		TestSatisfaccion miTestSatisfaccion = new TestSatisfaccion();
		Informacion miInformacion = new Informacion();
		ListaRespuestas miListaRespuestas = new ListaRespuestas();
		CoeficienteCorrelacional miCoeficiente = new CoeficienteCorrelacional();
		
		/**
		 * Por otro lado se le da el control de las clases al coordinador
		 * 
		 * */
		
		miCoordinador.setJPAUtil(miJPAUtil);
		miCoordinador.setGestionRespuestas(miGestionRespuestas);
		miCoordinador.setRespuestasDao(miRespuestasDao);
		miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setPreguntaUno(miPreguntaUno);
		miCoordinador.setPreguntaDos(miPreguntaDos);
		miCoordinador.setPreguntaTres(miPreguntaTres);
		miCoordinador.setPreguntaCuatro(miPreguntaCuatro);
		miCoordinador.setPreguntaCinco(miPreguntaCinco);
		miCoordinador.setTestFinal(miTestFinal);
		miCoordinador.setTestSatisfaccion(miTestSatisfaccion);
		miCoordinador.setInformacion(miInformacion);
		miCoordinador.setMiListaRespuestas(miListaRespuestas);
		miCoordinador.setMiCoeficiente(miCoeficiente);
		
		/**
		 * se le da el coordinador a todas las clases para que asi exista ese control dado 
		 * por el coordinador
		 * 
		 * */
		
		
		miJPAUtil.setCoordinador(miCoordinador);
		miGestionRespuestas.setCoordinador(miCoordinador);
		miRespuestasDao.setCoordinador(miCoordinador);
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miPreguntaUno.setCoordinador(miCoordinador);
		miPreguntaDos.setCoordinador(miCoordinador);
		miPreguntaTres.setCoordinador(miCoordinador);
		miPreguntaCuatro.setCoordinador(miCoordinador);
		miPreguntaCinco.setCoordinador(miCoordinador);
		miTestFinal.setCoordinador(miCoordinador);
		miTestSatisfaccion.setCoordinador(miCoordinador);
		miInformacion.setCoordinador(miCoordinador);
		miListaRespuestas.setCoordinador(miCoordinador);
		miCoeficiente.setCoordinador(miCoordinador);
		
		/*Y Se da inicio al programa con la ventana Principal*/
		
		miVentanaPrincipal.setVisible(true);
	}
	
}
