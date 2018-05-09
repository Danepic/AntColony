package danepic.ant;

import java.util.ArrayList;
import java.util.List;

import danepic.cities.TemplateCity;
import danepic.util.TravellerCity;

public class Ant {
	
	private List<Integer> visitedCities = new ArrayList<>();
	private int total;
	
	public Ant(int city) {
		this.visitedCities.add(city);
		while (visitedCities.size() <= 8) {
			TemplateCity value = TravellerCity.nextCity(city, visitedCities);
			
			this.visitedCities.add(value.getNextCity());
			this.total += value.getNextCityDistance();
			city = value.getNextCity();
		}
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
