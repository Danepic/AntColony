package danepic.cities;

public class F extends TemplateCity {
	
	private int[] bCities = {5, 8, 4, 6, 5, 0, 8, 4, 6};
	private int nextCity;
	
	public F(int nextCity) {
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
