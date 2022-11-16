package datastructuremodule;


public class ArrayTest {
	
	public static void main(String[] args) {
		
		//Account accArray[] = new Account[5];
		
		System.out.println("Begin main..");

		Account accObj =  new Account(101,"John",5000);
		System.out.println("accObj : "+accObj); // +  will invoke toString() of this object
		
		accObj.withdraw(400);
		
		System.out.println("accObj : "+accObj); // +  will invoke toString() of this object
		
		//System.out.println(accArray[0]);
		
		System.out.println("End Main");
		
	}

}


class Account
{
	

	private int accountNumber;
	private String accountHolderName;
	private float accountBalance;
	
	//1
	void init() {
		
	}
	
	void transfer(float amtToTransfer) {
		
	}
	
	public Account(int accountNumber, String accountHolderName, float accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	//3
	float withdraw(float amtToWithdraw) {
		accountBalance = accountBalance - amtToWithdraw;
		return accountBalance;
	}

	//4
	float getBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	
}
/*
	First.java
  	main()
  	{
  			clearScreen(); //invoke 
  			
  	}
  	1. function without argument and without return type
  								  
  		without return			  without argument
  				|				  |
  				void clearScreen(   )
  				{
  				
  				}
  
   2. function with argument but without return value
   
   				void gotoThisLocation(float longitude, float latitude)
   				{
   				
   				}
  
   3. function with argument and with return value
   
   				float calculateSimpleInterest(float prin, int numYears, float rate)
   				{
   					float interest = (prin * numYears * rate ) / 100;
   					return interest;
   				}
  
    4. function without argument but with return value
     
    			double calculateDistatanceBetweenTheEarthAndTheSun()
    			{
    				float speedOfLight = 186000.519; // miles/sec
    				int timeTook = 480; //seconds
    				double distance = speedOfLight * timeTook;
    				return distance;
    			}
 */










// knowledge -> apply it -> WISDOM
// the word -> WATER <- is not actual WATER

