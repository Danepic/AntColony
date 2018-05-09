package danepic.cities;

public class I extends TemplateCity {
	
	private int[] bCities = {7, 5, 9, 2, 8, 6, 3, 7, 0};
	private int nextCity;
	
	public I(int nextCity) {
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
