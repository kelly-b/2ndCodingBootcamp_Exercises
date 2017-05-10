public class Customer{
	private final int customerCode;
	private String name=" ";
	private int yearOfBirth=0;
	private String sex;
	public static int count=0;

	public static Customer[] customerArray=new Customer[10];

	public Customer(String name, int yearOfBirth, String sex){
		count += 1;
		this.customerCode=count;
		this.name=name;
		this.yearOfBirth=yearOfBirth;
		this.sex=sex;
		customerArray[count-1]=this;
	}

	public int getCustomerCode(){
		return customerCode;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		this.name=name;
	}
	public int getYearOfBirth(){
		return yearOfBirth;
	}
	public void setYearOfBirth(){
		this.yearOfBirth=yearOfBirth;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(){
		this.sex=sex;
	}
	public String toString(){
		return "Customer Code: "+customerCode+", Name: "+name+", Year of birth: "+yearOfBirth+", Sex: "+sex;
	}
}