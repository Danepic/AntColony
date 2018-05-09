package danepic.cities;

public class H extends TemplateCity {
	
	private int[] bCities = {3, 3, 4, 6, 5, 4, 7, 0, 7};
	private int nextCity;
	
	public H(int nextCity) {
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
