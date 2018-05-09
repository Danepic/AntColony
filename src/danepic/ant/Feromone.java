package danepic.ant;

import danepic.cities.TemplateCity;

public class Feromone {
	public static TemplateCity bestWay;
	public static int bestWayTemporaly = 0;
	
	public static void calculateFeromone(TemplateCity city) {
		if(city.getNextCityDistance() < bestWayTemporaly || bestWayTemporaly == 0) {
			//Quanto maior a distancia, menor o feromonio
			bestWayTemporaly = city.getNextCityDistance();
			bestWay.getNextCity();
		}
	}
	
	public TemplateCity getBestWay() {
		return bestWay;
	}
	public void setBestWay(TemplateCity bestWay) {
		this.bestWay = bestWay;
	}
	public int getBestWayTemporaly() {
		return bestWayTemporaly;
	}
	public void setBestWayTemporaly(int bestWayTemporaly) {
		this.bestWayTemporaly = bestWayTemporaly;
	}
	
}
