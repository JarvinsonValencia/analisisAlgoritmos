package modelo.entidades;

import java.io.Serializable;

import javax.persistence.*;

/*
 * en esta clase es la responsable del almacenamiento en forma de objetos de las respuestas dadas
 * tiene 12 atributos los cuales se usan constantemente en el programa
 * 
 * en esta clase se veran anotaciones algo diferentes a las que se conocen
 * 
 * @entity es la encargada de reconocer esta clase como unaa entidad de la base de datos
 * @Table mediante esta anotacion se le pueden dar atributos a la entidad en este caso nombre
 * @id el atributo que tenga esta anotacion se reconocera como la llave primaria
 * @GeneratedValue esta anotacion se reconoce como autoincremental quiere decir que el campo idRespuesta sera autoincremental
 * @Column anotacion cuya responsabilidad es el reconocimiento de las columnas para asi poder generarlas con el persistence
 * **/


/*
 * los demas metodos son los set de actualizacion de atribus, los gets de obtencion de valor de atributos
 * y el toString que en este programa no se le dio una funcionalidad**/
@Entity
@Table(name="respuestas")
public class Respuestas  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_respuesta")
	private Long idRespuesta;
	
	@Column(nullable=false, length = 45)
	private String nombreEstudiante;
	
	@Column (name = "preguntaUno")
	private int preguntaUno;
	
	@Column (name = "preguntaDos")
	private int preguntaDos;
	
	@Column (name = "preguntaTres")
	private int preguntaTres;
	
	@Column (name = "preguntaCuatro")
	private int preguntaCuatro;
	
	@Column (name = "preguntaCinco")
	private int preguntaCinco;
	
	@Column (name = "calificacionTest")
	private double calificacionTest;
	
	@Column (name = "preguntaUnoSatisfaccion")
	private int preguntaUnoSatisfaccion;
	
	@Column (name = "preguntaDosSatisfaccion")
	private int preguntaDosSatisfaccion;
	
	@Column (name = "preguntaTresSatisfaccion")
	private int preguntaTresSatisfaccion;
	
	@Column (name = "testSatisfaccion")
	private double testSatisfaccion;
	
	public Respuestas() {
		
	}

	public Respuestas(Long idRespuesta, String nombreEstudiante, int preguntaUno, int preguntaDos, int preguntaTres,
			int preguntaCuatro, int preguntaCinco, double calificacionTest, int preguntaUnoSatisfaccion,
			int preguntaDosSatisfaccion, int preguntaTresSatisfaccion, double testSatisfaccion) {
		super();
		this.idRespuesta = idRespuesta;
		this.nombreEstudiante = nombreEstudiante;
		this.preguntaUno = preguntaUno;
		this.preguntaDos = preguntaDos;
		this.preguntaTres = preguntaTres;
		this.preguntaCuatro = preguntaCuatro;
		this.preguntaCinco = preguntaCinco;
		this.calificacionTest = calificacionTest;
		this.preguntaUnoSatisfaccion = preguntaUnoSatisfaccion;
		this.preguntaDosSatisfaccion = preguntaDosSatisfaccion;
		this.preguntaTresSatisfaccion = preguntaTresSatisfaccion;
		this.testSatisfaccion = testSatisfaccion;
	}

	public Long getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(Long idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public int getPreguntaUno() {
		return preguntaUno;
	}

	public void setPreguntaUno(int preguntaUno) {
		this.preguntaUno = preguntaUno;
	}

	public int getPreguntaDos() {
		return preguntaDos;
	}

	public void setPreguntaDos(int preguntaDos) {
		this.preguntaDos = preguntaDos;
	}

	public int getPreguntaTres() {
		return preguntaTres;
	}

	public void setPreguntaTres(int preguntaTres) {
		this.preguntaTres = preguntaTres;
	}

	public int getPreguntaCuatro() {
		return preguntaCuatro;
	}

	public void setPreguntaCuatro(int preguntaCuatro) {
		this.preguntaCuatro = preguntaCuatro;
	}

	public int getPreguntaCinco() {
		return preguntaCinco;
	}

	public void setPreguntaCinco(int preguntaCinco) {
		this.preguntaCinco = preguntaCinco;
	}

	public double getCalificacionTest() {
		return calificacionTest;
	}

	public void setCalificacionTest(double calificacionTest) {
		this.calificacionTest = calificacionTest;
	}

	public int getPreguntaUnoSatisfaccion() {
		return preguntaUnoSatisfaccion;
	}

	public void setPreguntaUnoSatisfaccion(int preguntaUnoSatisfaccion) {
		this.preguntaUnoSatisfaccion = preguntaUnoSatisfaccion;
	}

	public int getPreguntaDosSatisfaccion() {
		return preguntaDosSatisfaccion;
	}

	public void setPreguntaDosSatisfaccion(int preguntaDosSatisfaccion) {
		this.preguntaDosSatisfaccion = preguntaDosSatisfaccion;
	}

	public int getPreguntaTresSatisfaccion() {
		return preguntaTresSatisfaccion;
	}

	public void setPreguntaTresSatisfaccion(int preguntaTresSatisfaccion) {
		this.preguntaTresSatisfaccion = preguntaTresSatisfaccion;
	}

	public double getTestSatisfaccion() {
		return testSatisfaccion;
	}

	public void setTestSatisfaccion(double testSatisfaccion) {
		this.testSatisfaccion = testSatisfaccion;
	}

	@Override
	public String toString() {
		return "Respuestas [idRespuesta=" + idRespuesta + ", nombreEstudiante=" + nombreEstudiante + ", preguntaUno="
				+ preguntaUno + ", preguntaDos=" + preguntaDos + ", preguntaTres=" + preguntaTres + ", preguntaCuatro="
				+ preguntaCuatro + ", preguntaCinco=" + preguntaCinco + ", calificacionTest=" + calificacionTest
				+ ", preguntaUnoSatisfaccion=" + preguntaUnoSatisfaccion + ", preguntaDosSatisfaccion="
				+ preguntaDosSatisfaccion + ", preguntaTresSatisfaccion=" + preguntaTresSatisfaccion
				+ ", testSatisfaccion=" + testSatisfaccion + "]";
	}

}

