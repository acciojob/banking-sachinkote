package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
         this.name=name;
         this.balance=balance;
         this.minBalance=minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        String Accountno="";
        int c=digits;
        if(sum==0 || (sum/9<=digits))
        {       
        	throw new Exception("Account Number can not be generated");
        }
        else
        {
        while(c!=0)//sum=80;c=10;
        {   if(sum>9) {
         	Accountno=Accountno+"9";//9999999980
         	sum=sum-9;//71,62,53,44,35,26,17,8,0,0
         	c--;  //9,8,7,6,5 ,4  ,3,2,1,0
         	
        }
        else if(sum<9 && sum>0)
        {
        	Accountno=Accountno+sum;
        	sum=0;
        	c--;
        }
        else
        {
        	Accountno=Accountno+"0";
        	c--;
        }
        }
        }
		return Accountno;
    }

    public void deposit(double amount) {
        //add amount to balance
         this.balance=this.balance+amount;
         System.out.println("Amount deposited SuccessFully:"+balance);
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if(amount<minBalance)
        	throw new Exception("Insufficient Balance");
        else
        {
        	balance=balance-amount;
        	System.out.println("Remaning Balnce is:"+balance);
        }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

}
