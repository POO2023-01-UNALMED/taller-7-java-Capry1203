package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
///// Constructor  //////////////////
	public Periodico(String origen, String titulo, String autor,
			int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
			
	}
	
/////// Metodos Abstractos //////////
	
	//Metodo palabras totales
	@Override
	public int palabrasTotales(int wordspp) {
		return wordspp*10*getPaginas();
		
	}
	
	//Metodo interpretacion
	public String interpretacion() {
		return interpretacion;
	}
	//Metodo toString
	@Override
	public String toString() {
		return
		getOrigen()+"\n"+
		getTitulo()+"\n"+
		getAutor()+"\n"+
		getPaginas()+"\n"+
		getFecha()+"\n"+
		getPrimicia();
	}
////// Metodos get y set ////////////////
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrimicia() {
		return primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
