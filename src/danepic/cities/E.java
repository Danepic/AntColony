package danepic.cities;

public class E extends TemplateCity {
	
	private int[] bCities = {4, 5, 7, 4, 0, 5, 6, 5, 8};
	private int nextCity;
	
	public E(int nextCity) {
		this.nextCity = nextCity;
	}
	
	public int getNextCityDistance() {
		return this.bCities[this.nextCity];
	}

	public int[] getbCities() {
		return bCities;
	}

	public void setbCities(int[] bCities) {
		this.bCities = bCities;
	}

	public int getNextCity() {
		return nextCity;
	}

	public void setNextCity(int nextCity) {
		this.nextCity = nextCity;
	}
	
	
}
