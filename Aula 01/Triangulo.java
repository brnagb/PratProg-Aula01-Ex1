
public class Triangulo extends Poligono {
	
	public int lado1;
	public int lado2;
	
	public Triangulo(double base, double altura, int lado1, int lado2){
		super(base, altura);
		setLado1(lado1);
		setLado2(lado2);
	
	}
	@Override
	double area() {
		return base*altura/2;
	}

	@Override
	double perimetro() {
		return (lado1 + lado2 + base);
	}
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

}
