public class Life extends Insurance{
	private int amountInvested;
	public static int count=0;

	public Life[] lifeArray=new Life[10];

	public Life(int duration, Customer customer, int amountInvested){
		super(duration, customer);
		this.amountInvested=amountInvested;
		count+=1;
		lifeArray[count-1]=this;
		System.out.println(this);
	}
	public int getAmountInvested(){
		return amountInvested;
	}
	public void setAmountInvested(){
		this.amountInvested=amountInvested;
	}
	@Override
	public String toString(){
		return super.toString()+", Amount Invested: "+amountInvested;
	}
	public double calculateCost(){
		double cost;
		cost=(double)super.calculateInsuranceCost()+5.*(2017-super.getCustomer().getYearOfBirth())+0.05*getAmountInvested();
		return cost;
	}
}