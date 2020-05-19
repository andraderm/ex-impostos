package entities;

public abstract class TaxPayer {
	
	protected String name;
	protected Double income;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double income) {
		super();
		this.name = name;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}
	
	public abstract double Tax();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + ": $ " + String.format("%.2f", Tax()));
		return sb.toString();
	}
	
	

}
