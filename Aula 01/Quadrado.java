
public class Quadrado extends Semelhantes implements Diagonal{
	
	public Quadrado (double base, double altura) {
		super(base, altura);
	}
	double perimetro(){
		return (base*4);
	}
	
	@Override
	public double diagonal(){
		return (super.getAltura()*Math.sqrt(2));
	}
}
