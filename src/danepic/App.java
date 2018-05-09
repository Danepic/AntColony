package danepic;

import danepic.ant.Ant;
import danepic.ant.Feromone;

public class App {
	public static void main(String[] args) {
		Ant formiga = new Ant(7);
		System.out.println(formiga.toString());

		Ant formiga2 = new Ant(7);
		System.out.println(formiga.toString());
		
		Ant formiga3 = new Ant(7);
		System.out.println(formiga.toString());
	}
}
