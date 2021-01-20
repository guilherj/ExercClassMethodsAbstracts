package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double annual_income, Double healthExpenditures) {
		super(name, annual_income);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double taxPaid = 0.0;
		
		if (super.getAnnual_income() < 20000.00) {
			taxPaid = super.getAnnual_income() * 0.15;
			
		} else if (super.getAnnual_income() >= 20000.00) {
			taxPaid = super.getAnnual_income() * 0.25;
		}
		if(healthExpenditures > 0) {
			healthExpenditures = healthExpenditures * 0.50;
		}
		double taxPaidFinal = taxPaid - healthExpenditures;
		return taxPaidFinal;
	}

}
