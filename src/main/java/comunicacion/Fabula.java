package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;

/////// Constructor //////////////////
	public Fabula(String origen, String titulo, String autor, 
			int paginas, String ensenanza, String interpretacion ) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
///// Metodos abstractos //////////////7
	
	// Metodo cantidad palabras totales
	@Override 
	public int palabrasTotales(int wordspp) {
		return wordspp*1*getPaginas();
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
		getEnsenanza();
	}
///// Metodos get y set ////////////7
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
}
