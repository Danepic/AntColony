package danepic.cities;

public class C extends TemplateCity {
	
	private int[] bCities = {3, 3, 0, 5, 7, 4, 8, 4, 9};
	private int nextCity;
	
	public C(int nextCity) {
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
