public class Insurance{
	private int insuranceCode;
	private int duration;
	private Customer customer;
	private int insuranceCost=100;
	public static int count=0;

	public static Insurance[] insuranceArray=new Insurance[10];

	public Insurance(int duration, Customer customer){

		count+=1;
		this.insuranceCode=count;
		this.duration=duration;
		this.customer=customer;
		insuranceArray[count-1]=this;
	}

	public int getInsuranceCode(){
		return insuranceCode;
	}
	public void setInsuranceCode(){
		this.insuranceCode=insuranceCode;
	}
	public int getDuration(){
		return duration;
	}
	public void setDuration(){
		this.duration=duration;
	}
	public Customer getCustomer(){
		return customer;
	}
	public void setCustomer(){
		this.customer=customer;
	}
	public String toString(){
		return "Insurance Code: "+insuranceCode+", Duration: "+duration+", Customer: "+customer.toString();

	}

	public int calculateInsuranceCost(){
		return insuranceCost;
	}
	public static void printInsurances(){
		for(int i=0;i<insuranceArray.length;i++){
			if(insuranceArray[i]!=null){
				System.out.println(insuranceArray[i]);
			}
		}
	}
	public static void printSpecificInsurance(int insuranceCode){
		for(int i=0;i<insuranceArray.length;i++){
			if(insuranceArray[i]!=null && insuranceArray[i].getInsuranceCode()==insuranceCode){
				System.out.println(insuranceArray[i]);
			}
		}
	}
	public static void printSpecificInsuranceByCustomer(int customerCode){
		for(int i=0;i<insuranceArray.length;i++){
			if(insuranceArray[i]!=null && insuranceArray[i].getCustomer().getCustomerCode()==customerCode){
				System.out.println(insuranceArray[i]);
			}
		}
	}
}