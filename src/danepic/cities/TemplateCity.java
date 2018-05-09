package danepic.cities;

public class TemplateCity {
	
	private int[] aCities = {0};
	private int nextCity;
	
	public int getNextCityDistance() {
		return this.nextCity;
	}

	public int[] getaCities() {
		return aCities;
	}

	public void setaCities(int[] aCities) {
		this.aCities = aCities;
	}

	public int getNextCity() {
		return nextCity;
	}

	public void setNextCity(int nextCity) {
		this.nextCity = nextCity;
	}
	
	
}
