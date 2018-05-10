package danepic.ant;

import danepic.cities.TemplateCity;

public class Feromone {
	public static int bestCity;
	public static int bestWayTemporaly;
	
	public static void calculateFeromone(TemplateCity city) {
		if(city.getNextCityDistance() < bestWayTemporaly || bestWayTemporaly == 0) {
			//Quanto maior a distancia, menor o feromonio
			bestWayTemporaly = city.getNextCityDistance();
			bestCity = city.getNextCity();
		}
	}
	
	public static void resetRanking() {
		bestWayTemporaly = 0;
		bestCity = 0;
	}
	
	public int getBestWay() {
		return bestCity;
	}

	public int getBestWayTemporaly() {
		return bestWayTemporaly;
	}
	
}
