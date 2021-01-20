package entities;

public abstract class TaxPayer {

	private String name;
	private Double annual_income;
	

	public TaxPayer() {

	}

	public TaxPayer(String name, Double annual_income) {
		this.name = name;
		this.annual_income = annual_income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnual_income() {
		return annual_income;
	}

	public void setAnnual_income(Double annual_income) {
		this.annual_income = annual_income;
	}

	public abstract double tax();
		
		/*	
		if (annual_income < 20000.00) {
				double taxPaid = annual_income * 0.15;
			} else if (annual_income >= 20000.00) {
				double taxPaid = annual_income * 0.25;
			}
			
		} else if (type == 'c') {
			double tax = 0.16;
			double taxPaid = annual_income * tax;
		}
		*/


}
