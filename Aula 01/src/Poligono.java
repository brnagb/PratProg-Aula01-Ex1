
public abstract class Poligono extends Figura {

	public double base; 
	public double altura;

	public Poligono (double base, double altura) {
		setBase(base);
		setAltura(altura);
	
	} 


	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}






	@Override
	abstract double perimetro();
	@Override
	abstract double area();
}

