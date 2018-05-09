package danepic.cities;

public class G extends TemplateCity {
	
	private int[] bCities = {4, 6, 8, 9, 6, 8, 0, 7, 3};
	private int nextCity;
	
	public G(int nextCity) {
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
