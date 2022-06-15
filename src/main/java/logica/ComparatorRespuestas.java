package logica;

import java.util.Comparator;

import modelo.entidades.*;

/**
 * La clase de comparatorRespuestas
 * es unica y exclusiva para el uso de ordenamiento de la lista ordenada de mayor a menor que se 
 * usara mas adelante en la ventana ListaRespuestas
 * 
 * */

public class ComparatorRespuestas implements Comparator<Respuestas>{

	public int compare(Respuestas primerRespuesta, Respuestas segundaRespuesta) {
		// TODO Auto-generated method stub
		
		int respuesta = 0;
		if(primerRespuesta.getCalificacionTest() > segundaRespuesta.getCalificacionTest()) {
			respuesta=-1;
		}else if(primerRespuesta.getCalificacionTest() < segundaRespuesta.getCalificacionTest()){
			respuesta=1;
		}else {
			respuesta=0;
		}
		
		return respuesta;
	}

}
