import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		
	ArrayList<Figura> figuras = new ArrayList<>(); 
	
	figuras.add(new Quadrado(5, 5));
	figuras.add(new Retangulo(12, 6));
	figuras.add(new Losangulo(6, 6));
	figuras.add(new Trapezio(10, 5, 6, 5, 8));
	figuras.add(new Triangulo(6, 6, 5, 3));
	figuras.add(new Circulo(9));
	
		for(Figura fig:figuras){
	
			System.out.println(fig.area());
			System.out.println(fig.perimetro());
			
			if(fig instanceof Diagonal){
			System.out.println(((Diagonal)fig).diagonal());
			
			}
		}
	}
}
