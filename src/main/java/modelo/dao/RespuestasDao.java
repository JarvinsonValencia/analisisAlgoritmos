package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import controlador.JPAUtil;
import modelo.entidades.Respuestas;
import controlador.Coordinador;


/*
 * Clase respuesta Dao encargada de hacer el gestionamiento de almacenado, obtencion de respuestas de 
 * la base de datos predeterminada**/
public class RespuestasDao {
	
	Coordinador miCoordinador;
	
	/*El entityManager es el encargado de hacer la conexion con la Clase JPAUTil anteriormente vista**/
	EntityManager entityManager=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	
	/**Este metodo se encarga de realizar el guardado o inserccion a la base de datos
	 * mediante el entityManager y sus metodos propis getTransaction, que se entiende como 
	 * el realizante de una transaccion, el begin el que comienza la transaccion, 
	 * el persist el que realiza la persistencia a la base de datos,
	 * por ultimo el commit el que guarda lo realizado*/
	public boolean guardarRespuesta(Respuestas miRespuestaNueva) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();;
		entityManager.persist(miRespuestaNueva);
		entityManager.getTransaction().commit();
		
		return true;
	}

	/**Este metodo se encarga de realizar la actualziacion a la base de datos
	 * mediante el entityManager y sus metodos propis getTransaction, que se entiende como 
	 * el realizante de una transaccion, el begin el que comienza la transaccion, 
	 * el merge el que hace la fusion y comparacion de objeto de la base de datos,
	 * por ultimo el commit el que guarda lo realizado*/
	public void actualizarRespuesta(Respuestas miRespuesta) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.merge(miRespuesta);
		entityManager.getTransaction().commit();
		
		System.out.println("actualizo correctamente");
	}
	
	/*
	 * en este metodo obtener lista se crea un query encargado de realizar la peticion
	 * con el entityManager de mano mediante un consulta SQL con algo de query
	 * 
	 * donde la r hace referencia al objeto que se obtendra
	 * 
	 * **/
	public List<Respuestas> obtenerLista() {
		// TODO Auto-generated method stub
		List<Respuestas> listaRespuestas = new ArrayList<Respuestas>();
		Query query= entityManager.createQuery("SELECT r FROM Respuestas r");
		listaRespuestas=query.getResultList();
		
		return listaRespuestas;
	}

	
	/*metodo encargada de la conexion con el coordinador**/
	public void setCoordinador(Coordinador miCoordinador) {
		// TODO Auto-generated method stub
		this.miCoordinador = miCoordinador;
	}



}
