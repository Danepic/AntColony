package danepic.cities;

public class B extends TemplateCity {
	
	private int[] bCities = {7, 0, 3, 5, 5, 8, 6, 3, 5};
	private int nextCity;
	
	public B(int nextCity) {
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
