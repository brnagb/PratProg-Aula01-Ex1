
public class Semelhantes extends Poligono {
	
	public Semelhantes (double base, double altura) {
		super(base, altura);
	}
	
	@Override
	double area() {
		return base*altura;
	}

	@Override
	double perimetro() {
		return 0;
	}
}
