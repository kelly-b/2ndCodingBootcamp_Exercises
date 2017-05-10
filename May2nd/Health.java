public class Health extends Insurance{
	private int medicalExpense;
	public static int count=0;

	public Health[] healthArray=new Health[10];

	public Health(int duration, Customer customer, int medicalExpense){
		super(duration, customer);
		this.medicalExpense=medicalExpense;
		count+=1;
		healthArray[count-1]=this;
		System.out.println(this);
	}

	public int getMedicalExpense(){
		return medicalExpense;
	}
	public void setMedicalExpense(){
		this.medicalExpense=medicalExpense;
	}
	@Override
	public String toString(){
		return super.toString()+", Medical Expense: "+medicalExpense;
	}
	public double calculateCost(){
		double cost;
		int extra=0;
		if((super.getCustomer().getSex()).equals("male")){
			extra=50;
		}
		cost=(double)super.calculateInsuranceCost()+7.*(2017-super.getCustomer().getYearOfBirth())+extra+0.025*getMedicalExpense();
		return cost;
	}

}