package comunicacion;


public class Alfabeto extends Pictograma{
	// Atributos
	private String[] letras;
	private String interpretacion;
	
////////Constructor //////////////////
	public Alfabeto(String origen,String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
		
	}
//////Metodos de la Clase//////////////////
	
	//Metodo Cantidad Letras
	
	public int cantidadLetras() {
		int letrasTotal = getLetras().length;
		return letrasTotal;
	}
	

/////// Metodos abstractos/////////////////////
	
	//metodo Interpretacion
	@Override 
	public String interpretacion() {
		return interpretacion;
	}
	
	//Metodo to string
	@Override 
	public String toString() {
		String alfabeto = "";
		for(int i = 0; i < letras.length; i++) {
			alfabeto += letras[i];
			if (i < letras.length-1) {
				alfabeto += ", ";	
			}
		
		}
	return alfabeto;
		
	}
	
	
/////////////Metodos get y set////////////////
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras=letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
