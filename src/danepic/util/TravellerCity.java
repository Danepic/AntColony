package danepic.util;

import java.util.List;
import java.util.Random;

import danepic.cities.A;
import danepic.cities.B;
import danepic.cities.C;
import danepic.cities.D;
import danepic.cities.E;
import danepic.cities.F;
import danepic.cities.G;
import danepic.cities.H;
import danepic.cities.I;
import danepic.cities.TemplateCity;

public class TravellerCity {
	
	public static Random random;
	
	public static TemplateCity nextCity(int city, List<Integer> visitedCities) {
		random = new Random();
		int nextCity = 0;
		int contador = 0;
		
		System.out.println("Cidades visitadas: " + visitedCities.toString());
		
		while(contador < visitedCities.size()) {
			if(visitedCities.size() == 9) {
				nextCity = 99;
				break;
			}
			
			nextCity = random.nextInt(9);
			//System.out.println("Próxima cidade: " + nextCity);
			
			for (Integer integer : visitedCities) {
				if(nextCity != integer) {
					contador ++;
					//System.out.println("Cidade " + nextCity + " é diferente da cidade " + integer);
				}else {
					contador = 0;
					//System.out.println("Cidade: " + nextCity + " já está na lista de cidades visitadas.");
					break;
				}
			}
		}
		
		if(city == 0) {
			System.out.println("Saindo da cidade A");
			System.out.println("Próxima cidade: " + nextCity);
			A a = new A(nextCity);
			return a;
		}else if(city == 1) {
			System.out.println("Saindo da cidade B");
			System.out.println("Próxima cidade: " + nextCity);
			B b = new B(nextCity);
			return b;			
		}else if(city == 2) {
			System.out.println("Saindo da cidade C");
			System.out.println("Próxima cidade: " + nextCity);
			C c = new C(nextCity);
			return c;			
		}else if(city == 3) {
			System.out.println("Saindo da cidade D");
			System.out.println("Próxima cidade: " + nextCity);
			D d = new D(nextCity);
			return d;			
		}else if(city == 4) {
			System.out.println("Saindo da cidade E");
			System.out.println("Próxima cidade: " + nextCity);
			E e = new E(nextCity);
			return e;			
		}else if(city == 5) {
			System.out.println("Saindo da cidade F");
			System.out.println("Próxima cidade: " + nextCity);
			F f = new F(nextCity);
			return f;			
		}else if(city == 6) {
			System.out.println("Saindo da cidade G");
			System.out.println("Próxima cidade: " + nextCity);
			G g = new G(nextCity);
			return g;			
		}else if(city == 7) {
			System.out.println("Saindo da cidade H");
			System.out.println("Próxima cidade: " + nextCity);
			H h = new H(nextCity);
			return h;			
		}else if(city == 8) {
			System.out.println("Saindo da cidade I");
			System.out.println("Próxima cidade: " + nextCity);
			I i = new I(nextCity);
			return i;			
		}else {
			throw new RuntimeException("Erro inesperado!");
		}
	}
}
