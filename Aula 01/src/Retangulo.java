
public class Retangulo extends Semelhantes implements Diagonal{
	
	public Retangulo (double base, double altura) {
		super(base, altura);
	}
	
	double perimetro(){
		return ((base*2) + (altura*2));
	}
	
	@Override
	public double diagonal(){
		return (Math.sqrt(Math.pow(altura, 2)) + (Math.pow(base, 2)));
	}
}
