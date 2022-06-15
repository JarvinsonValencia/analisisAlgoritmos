package controlador;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Esta clase es la encargada de entender y encontrar la base de datos,
 * la cual se conecta mediante un archivo xml llamado persistence 
 * el cual por dentro tiene unos parametros predestinados para comunicarse con la 
 * base de datos.
 * se conecta mediante la variable de la linea 18 llamada UNIDAD_DE_PERSISTENCIA
 * se conecta gracias a las dependencias de javax.persistence
 * **/

public class JPAUtil {

	Coordinador miCoordinador;
	
	private static final String UNIDAD_DE_PERSISTENCIA="PensamientoComputacionalTest";
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(factory==null) {
			factory=Persistence.createEntityManagerFactory(UNIDAD_DE_PERSISTENCIA);
		}
		return factory;
	}
	
	public static void shutdown() {
		if(factory!=null) {
			factory.close();
			factory=null;
		}	
	}
	
	public void setCoordinador(Coordinador miCoordinador) {
		// TODO Auto-generated method stub
		this.miCoordinador = miCoordinador;
	}

}
