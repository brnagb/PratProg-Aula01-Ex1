
public class Circulo extends Figura {
	private double raio;
	

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double perimetro(){
		return 2*Math.PI*raio;
	}
	public double area(){
		return Math.PI*(raio*raio);
	}

}