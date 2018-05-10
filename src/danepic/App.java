package danepic;

import java.util.Random;

import danepic.ant.Ant;
import danepic.ant.Feromone;

public class App {
	static Random RANDOM = new Random();
	
	public static void main(String[] args) {
		//Escolhe a cidade onde vai haver o formigueiro
		final int FORMIGUEIRO = RANDOM.nextInt(9);
		
		Ant formiga1 = new Ant(FORMIGUEIRO);
		Ant formiga2 = new Ant(FORMIGUEIRO);
		Ant formiga3 = new Ant(FORMIGUEIRO);
		Ant formiga4 = new Ant(FORMIGUEIRO);
		Ant formiga5 = new Ant(FORMIGUEIRO);
		Ant formiga6 = new Ant(FORMIGUEIRO);
		Ant formiga7 = new Ant(FORMIGUEIRO);
		Ant formiga8 = new Ant(FORMIGUEIRO);
		Ant formiga9 = new Ant(FORMIGUEIRO);

		System.out.println("########################### 1 #########################################");
		formiga1.travel(0);
		System.out.println(formiga1.toString());
		
		System.out.println("########################### 2 #########################################");
		formiga2.travel(0);
		System.out.println(formiga2.toString());
		
		System.out.println("########################### 3 #########################################");
		formiga3.travel(0);
		System.out.println(formiga3.toString());
		
		System.out.println("########################### 4 #########################################");
		formiga4.travel(0);
		System.out.println(formiga4.toString());
		
		System.out.println("########################### 5 #########################################");
		formiga5.travel(0);
		System.out.println(formiga5.toString());
		
		System.out.println("########################### 6 #########################################");
		formiga6.travel(0);
		System.out.println(formiga6.toString());
		
		System.out.println("########################### 7 #########################################");
		formiga7.travel(0);
		System.out.println(formiga7.toString());
		
		System.out.println("########################### 8 #########################################");
		formiga8.travel(0);
		System.out.println(formiga8.toString());
		
		System.out.println("########################### 9 #########################################");
		formiga9.travel(0);
		System.out.println(formiga9.toString());
		
		formiga1.nextTravel();
		formiga2.nextTravel();		
		formiga3.nextTravel();
		formiga4.nextTravel();		
		formiga5.nextTravel();
		formiga6.nextTravel();		
		formiga7.nextTravel();
		formiga8.nextTravel();
		formiga9.nextTravel();
		Feromone.resetRanking();
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		
		for (int i = 0; i < 8; i++) {
			formiga1.travel(Feromone.bestCity);
			System.out.println(formiga1.toString());
			System.out.println("########################### 1 #########################################");
			
			formiga2.travel(Feromone.bestCity);
			System.out.println(formiga2.toString());
			System.out.println("########################### 2 #########################################");

			formiga3.travel(Feromone.bestCity);
			System.out.println(formiga3.toString());
			System.out.println("########################### 3 #########################################");
			
			formiga4.travel(Feromone.bestCity);
			System.out.println(formiga4.toString());
			System.out.println("########################### 4 #########################################");

			formiga5.travel(Feromone.bestCity);
			System.out.println(formiga5.toString());
			System.out.println("########################### 5 #########################################");
			
			formiga6.travel(Feromone.bestCity);
			System.out.println(formiga6.toString());
			System.out.println("########################### 6 #########################################");

			formiga7.travel(Feromone.bestCity);
			System.out.println(formiga7.toString());
			System.out.println("########################### 7 #########################################");
			
			formiga8.travel(Feromone.bestCity);
			System.out.println(formiga8.toString());
			System.out.println("########################### 8 #########################################");

			formiga9.travel(Feromone.bestCity);
			System.out.println(formiga9.toString());
			System.out.println("########################### 9 #########################################");
			
			formiga1.nextTravel();
			formiga2.nextTravel();		
			formiga3.nextTravel();
			formiga4.nextTravel();		
			formiga5.nextTravel();
			formiga6.nextTravel();		
			formiga7.nextTravel();
			formiga8.nextTravel();
			formiga9.nextTravel();
			Feromone.resetRanking();
			
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("-----------------------------------------------------------------------------------");
		}
	}
}
