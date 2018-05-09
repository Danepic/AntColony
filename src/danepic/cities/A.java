package danepic.cities;

public class A extends TemplateCity {
	
	private int[] aCities = {0, 7, 3, 6, 4, 5, 4, 3, 7};
	private int nextCity;
	
	public A(int nextCity) {
		this.nextCity = nextCity;
	}
	
	public int getNextCityDistance() {
		return this.aCities[this.nextCity];
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
