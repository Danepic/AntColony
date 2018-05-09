package danepic.cities;

public class D extends TemplateCity {
	
	private int[] bCities = {6, 5, 5, 0, 4, 6, 9, 6, 2};
	private int nextCity;
	
	public D(int nextCity) {
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
