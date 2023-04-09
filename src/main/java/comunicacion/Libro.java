package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
////////// Constructor /////////////////7
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, 
			String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
//// Metodos Abstractos ////////////////////7
	//Metodo palabras totales
	@Override
	public int palabrasTotales(int wordspp) {
		return wordspp*2*getPaginas();
	}
	
	// Metodo interpretacion
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	
	//Metodo to String
	@Override 
	public String toString() {
		return 
		getOrigen()+"\n"+
		getTitulo()+"\n"+
		getAutor()+"\n"+
		getPaginas()+"\n"+
		getCo_autor()+"\n"+
		getEditorial()+"\n"+
		getEdicion()+"\n";
	}
	
	
////// Metodos get y set //////////////
	public String getCo_autor() {
		return co_autor;
	}
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	

}
