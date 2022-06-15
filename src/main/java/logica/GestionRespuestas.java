package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import controlador.Coordinador;
import modelo.entidades.Respuestas;
import vista.gui.CoeficienteCorrelacional;

/*
 * en esta clase se ubica la gestion de las respuestas esto quiere decir que la logica de negocio
 * esta ubicada en esta clase, cada uno de sus metodos son los encargados de devolver una respuesta
 * correcta y concreta
 * **/

public class GestionRespuestas {
	
	Coordinador miCoordinador;
	
	/*
	 *en este metodo se hara el set de coordinador quiere decir la conexion entre gestion de respuesta y coordinador 
	 * */
	public void setCoordinador(Coordinador miCoordinador) {
		// TODO Auto-generated method stub
		this.miCoordinador = miCoordinador;
	}
	
	
	/*
	 * este metodo se encarga de calcular el promedio final de cada respuesta ejecutada,
	 * mediante metodos matematicas como la suma y la division entre la cantidad de preguntas**/
	public Respuestas calcularPromedioTest(Respuestas miRespuesta) {
		
		int nota1, nota2, nota3, nota4, nota5;
		nota1=miRespuesta.getPreguntaUno();
		nota2=miRespuesta.getPreguntaDos();
		nota3=miRespuesta.getPreguntaTres();
		nota4=miRespuesta.getPreguntaCuatro();
		nota5=miRespuesta.getPreguntaCinco();
		
		int totalSum=nota1+nota2+nota3+nota4+nota5;
		double total=totalSum;
		double promedio=(total/5);
		double notaTotal=promedio;
		
		miRespuesta.setCalificacionTest(notaTotal);
		
		return miRespuesta;
		
	}
	
	
	/*
	 * estos metodos llamados ObtenerValoresRespuesta son los encargados de iterar sobre la lista obtenida de la 
	 * base de datos y validar cuantas son correctas, incorrectas y cuanto es el promedio de cada pregunta
	 * se hicieron metodos individuales para tener una optima respuesta
	 * 
	 * **/
	public ArrayList<Object> obtenerValoresRespuestaUno(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		ArrayList<Object> miListaValoresUno = new ArrayList<Object>();
		
		int correctas=0;
		int incorrectas=0;
		double respuestas=0;
		double promedio;
		
		for (Respuestas respuesta : miListaRespuestas) {
			if(respuesta.getPreguntaUno()==2) {
				correctas=correctas+1;
			}else {
				incorrectas=incorrectas+1;
			}
			respuestas=respuestas+respuesta.getPreguntaUno();
			
		}
		

		int cantidad=miListaRespuestas.size();
		
		promedio=(respuestas/cantidad);

		double promedioTotal = Math.round(promedio*100.0)/100.0;
		
		miListaValoresUno.add(promedioTotal);
		miListaValoresUno.add(correctas);
		miListaValoresUno.add(incorrectas);
		
		return miListaValoresUno;
	}

	public ArrayList<Object> obtenerValoresRespuestaDos(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		ArrayList<Object> miListaValoresDos = new ArrayList<Object>();
		
		int correctas=0;
		int incorrectas=0;
		double respuestas=0;
		double promedio;
		
		for (Respuestas respuesta : miListaRespuestas) {
			if(respuesta.getPreguntaDos()==2) {
				correctas=correctas+1;
			}else {
				incorrectas=incorrectas+1;
			}
			respuestas=respuestas+respuesta.getPreguntaDos();
			
		}
		

		int cantidad=miListaRespuestas.size();
		
		promedio=(respuestas/cantidad);

		double promedioTotal = Math.round(promedio*100.0)/100.0;
		
		miListaValoresDos.add(promedioTotal);
		miListaValoresDos.add(correctas);
		miListaValoresDos.add(incorrectas);
		
		return miListaValoresDos;
	}

	public ArrayList<Object> obtenerValoresRespuestaTres(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		ArrayList<Object> miListaValoresTres = new ArrayList<Object>();
		
		int correctas=0;
		int incorrectas=0;
		double respuestas=0;
		double promedio;
		
		for (Respuestas respuesta : miListaRespuestas) {
			if(respuesta.getPreguntaTres()==2) {
				correctas=correctas+1;
			}else {
				incorrectas=incorrectas+1;
			}
			respuestas=respuestas+respuesta.getPreguntaTres();
			
		}
		

		int cantidad=miListaRespuestas.size();
		
		promedio=(respuestas/cantidad);

		double promedioTotal = Math.round(promedio*100.0)/100.0;
		
		miListaValoresTres.add(promedioTotal);
		miListaValoresTres.add(correctas);
		miListaValoresTres.add(incorrectas);
		
		return miListaValoresTres;
	}

	public ArrayList<Object> obtenerValoresRespuestaCuatro(List<Respuestas> miListaRespuestas) {
		ArrayList<Object> miListaValoresCuatro = new ArrayList<Object>();
		
		int correctas=0;
		int incorrectas=0;
		double respuestas=0;
		double promedio;
		
		for (Respuestas respuesta : miListaRespuestas) {
			if(respuesta.getPreguntaCuatro()==2) {
				correctas=correctas+1;
			}else {
				incorrectas=incorrectas+1;
			}
			respuestas=respuestas+respuesta.getPreguntaCuatro();
			
		}
		

		int cantidad=miListaRespuestas.size();
		
		promedio=(respuestas/cantidad);

		double promedioTotal = Math.round(promedio*100.0)/100.0;
		
		miListaValoresCuatro.add(promedioTotal);
		miListaValoresCuatro.add(correctas);
		miListaValoresCuatro.add(incorrectas);
		
		return miListaValoresCuatro;
	}

	public ArrayList<Object> obtenerValoresRespuestaCinco(List<Respuestas> miListaRespuestas) {
		ArrayList<Object> miListaValoresCinco = new ArrayList<Object>();
		
		int correctas=0;
		int incorrectas=0;
		double respuestas=0;
		double promedio;
		
		for (Respuestas respuesta : miListaRespuestas) {
			if(respuesta.getPreguntaCinco()==2) {
				correctas=correctas+1;
			}else {
				incorrectas=incorrectas+1;
			}
			respuestas=respuestas+respuesta.getPreguntaCinco();
			
		}
		

		int cantidad=miListaRespuestas.size();
		
		promedio=(respuestas/cantidad);

		double promedioTotal = Math.round(promedio*100.0)/100.0;
		
		miListaValoresCinco.add(promedioTotal);
		miListaValoresCinco.add(correctas);
		miListaValoresCinco.add(incorrectas);
		
		return miListaValoresCinco;
	}

	
	/*
	 * los metodos de obtenerPromediio se utilizan paRA ITERAR una lista dada por una peticion a la base
	 * de datos, y se cuenta las respuestas y se les hace la debida operacion matematica para obtener su
	 * promedio
	 * **/
	public double obtenerPromedioPreguntaSa1(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		double respuestas=0;
		double promedio;
		
		for (Respuestas respuesta : miListaRespuestas) {

			respuestas=respuestas+respuesta.getPreguntaUnoSatisfaccion();
			
		}
		
		int cantidad=miListaRespuestas.size();
		
		promedio=(respuestas/cantidad);

		double promedioTotal = Math.round(promedio*100.0)/100.0;

		return promedioTotal;
	}

	public double obtenerPromedioPreguntaSa2(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		double respuestas=0;
		double promedio;
		
		for (Respuestas respuesta : miListaRespuestas) {

			respuestas=respuestas+respuesta.getPreguntaDosSatisfaccion();
			
		}
		
		int cantidad=miListaRespuestas.size();
		
		promedio=(respuestas/cantidad);

		double promedioTotal = Math.round(promedio*100.0)/100.0;

		return promedioTotal;
	}

	public double obtenerPromedioPreguntaSa3(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		double respuestas=0;
		double promedio;
		
		for (Respuestas respuesta : miListaRespuestas) {

			respuestas=respuestas+respuesta.getPreguntaTresSatisfaccion();
			
		}
		
		int cantidad=miListaRespuestas.size();
		
		promedio=(respuestas/cantidad);

		double promedioTotal = Math.round(promedio*100.0)/100.0;

		return promedioTotal;
	}
	
	
	
	/*
	 * metodo que ordena la lista de mayor a menor mediante una clase llamada comparatorRespuestas
	 * la cual por dentro tiene la logica de ordenamiento de mayor a menor gracias a la implementacion de la clase 
	 * COMPARATOR**/
	public List<Respuestas> ordenarLista(List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		
		Collections.sort(miListaRespuestas, new ComparatorRespuestas());
		System.out.println(miListaRespuestas);
		
		return miListaRespuestas;
	}
	
	
	/*
	 * Obtener Valores Coeficiente
	 * se encarga de la obtencion dependiendo del string llegado por parametro
	 * mediante unas condicionales almacena en un List de Integers almacena cada valor de 
	 * respuesta dada**/
	public List obtenerValoresCoeficiente(String obtenido1, List<Respuestas> miListaRespuestas) {
		// TODO Auto-generated method stub
		
		List miLista = new ArrayList<Integer>();
		
		if(obtenido1.equals("1")) {
			
			for(Respuestas miRespuesta : miListaRespuestas){
				miLista.add(miRespuesta.getPreguntaUno());
			}
			
		}else if(obtenido1.equals("2")) {
			
			for(Respuestas miRespuesta : miListaRespuestas){
				miLista.add(miRespuesta.getPreguntaDos());
			}
			
		}else if(obtenido1.equals("3")) {
			
			for(Respuestas miRespuesta : miListaRespuestas){
				miLista.add(miRespuesta.getPreguntaTres());
			}
			
		}else if(obtenido1.equals("4")) {
			
			for(Respuestas miRespuesta : miListaRespuestas){
				miLista.add(miRespuesta.getPreguntaCuatro());
			}
			
		}else if(obtenido1.equals("5")) {
			
			for(Respuestas miRespuesta : miListaRespuestas){
				miLista.add(miRespuesta.getPreguntaCinco());
			}
			
		}else if(obtenido1.equals("Satisfaccion 1")) {
			
			for(Respuestas miRespuesta : miListaRespuestas){
				miLista.add(miRespuesta.getPreguntaUnoSatisfaccion());
			}
			
		}else if(obtenido1.equals("Satisfaccion 2")) {
			
			for(Respuestas miRespuesta : miListaRespuestas){
				miLista.add(miRespuesta.getPreguntaDosSatisfaccion());
			}
			
		}else if(obtenido1.equals("Satisfaccion 3")) {
			
			for(Respuestas miRespuesta : miListaRespuestas){
				miLista.add(miRespuesta.getPreguntaTresSatisfaccion());
			}
			
		}
		
		return miLista;
		
	}

	
	/*
	 * este metodo es el que se encarga de realizar la logica matematica y estadistica de el coeficiente de
	 * correlacion, donde se necesitan valores de X y Y, X al cuadrado y Y al cuadrado, la suma de estos y division entre X y Y**/
	public double obtenerCoeficiente(List valor1, List valor2) {
		
		System.out.println(valor1);
		System.out.println(valor2);
		// TODO Auto-generated method stub

		double xSum = 0;
		double ySum = 0;
		double xP2Sum = 0;
		double yP2Sum = 0;
		double xySum = 0;
		int len = valor1.size();
		for (int i = 0; i < valor2.size(); i++) {
			
			double number1=Double.parseDouble(valor1.get(i).toString());
			xSum = xSum + number1;
			double number2=Double.parseDouble(valor2.get(i).toString());
			ySum = ySum + number2;
			xP2Sum = xP2Sum + Math.pow(number1, 2);
			yP2Sum = yP2Sum + Math.pow(number2, 2);
			
			int number11 = Integer.parseInt(valor1.get(i).toString());
			int number22 = Integer.parseInt(valor2.get(i).toString());
			xySum = xySum + Math.multiplyExact(number11, number22);
 
		}
		double Rxy =((len * xySum) - (xSum * ySum)) / (Math.sqrt(((len * xP2Sum) - Math.pow(xSum, 2)) * ((len * yP2Sum) - Math.pow(ySum, 2))));
		System.out.println("Rxy"+Rxy);
		System.out.println( Math.round(Rxy*100.0)/100.0);
		return Math.round(Rxy*100.0)/100.0;

	}
	

}
