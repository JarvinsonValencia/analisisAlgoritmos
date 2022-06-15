package controlador;

import controlador.Relaciones;

public class Main {

	public static void main(String[] args) {

		/**
		* En Main, clase principal y contenedora del metodo main el cual da el inicio al todo
		* el programa
		* 
		* se instancia y inicializa la clase Relaciones la cual contiene dichas relaciones con las demas
		* clases para asi evitar el sobrecargo de clases en el sistema solo se instancia una vez y por
		* el mismo modo se inicializan, asi haciendo caso a la regla del patron de diseño mvc (modelo, vista y controlador)
		*
		*/
		Relaciones misRelaciones = new Relaciones();
		System.out.println("hola");

	}

}
