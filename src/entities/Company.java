package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double annual_income, Integer numberOfEmployees) {
		super(name, annual_income);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double taxPaidFinal = 0.0;

		if (numberOfEmployees > 10) {
			taxPaidFinal = super.getAnnual_income() * 0.14;

		} else
			taxPaidFinal = super.getAnnual_income() * 0.16;

		return taxPaidFinal;
	}

}
