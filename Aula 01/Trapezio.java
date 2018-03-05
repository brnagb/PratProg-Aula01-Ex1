
public class Trapezio extends Poligono {
	
	public int lado1;
	public int lado2;
	public double baseMenor; 

	public Trapezio (double base, double altura, double baseMenor, int lado1, int lado2) {
		super(base, altura);
		setBaseMenor(baseMenor);
	}
	

	public double getBaseMenor() {
		return baseMenor;
	}



	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	@Override
	double area() {
		return (base+baseMenor*altura/2);
	}

	@Override
	double perimetro() {
		return (lado1 + lado2 + base);
	}
}
