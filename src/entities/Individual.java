package entities;

public class Individual extends TaxPayer{

	private double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double income, double healthExpenditures) {
		super(name, income);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double Tax() {
		double value;
		if(income < 20000.00) {
			value = income * 0.15;
		}
		else {
			value = income * 0.25;
		}
		if (healthExpenditures != 0) {
			return value - (healthExpenditures * 0.5);
		}
		return value;
	}
	
}
