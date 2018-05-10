package danepic.ant;

import java.util.ArrayList;
import java.util.List;

import danepic.cities.TemplateCity;
import danepic.util.TravellerCity;

public class Ant {
	
	private List<Integer> visitedCities = new ArrayList<>();
	private int total;
	private int currentCity;
	private TemplateCity temporaryCity;
	
	public Ant(int city) {
		this.visitedCities.add(city);
		this.currentCity = city;
//		while (visitedCities.size() <= 8) {
//			TemplateCity value = TravellerCity.nextCity(city, visitedCities);
//			
//			this.visitedCities.add(value.getNextCity());
//			this.total += value.getNextCityDistance();
//			city = value.getNextCity();
//		}
	}
	
	public void travel(int city) {
		this.temporaryCity = TravellerCity.nextCity(currentCity, visitedCities);
		if(this.temporaryCity.getNextCity() != 99) {
			Feromone.calculateFeromone(this.temporaryCity);
		}
	}
	
	public void nextTravel() {
		this.visitedCities.add(Feromone.bestCity);
		this.total += Feromone.bestWayTemporaly;
		this.currentCity = Feromone.bestCity;
	}
	
	public int getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(int currentCity) {
		this.currentCity = currentCity;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Integer> getVisitedCities() {
		return visitedCities;
	}

	public void setVisitedCities(List<Integer> visitedCities) {
		this.visitedCities = visitedCities;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Ant [visitedCities=" + visitedCities + ", total=" + total + "]";
	}

	
}
