package chandu;


import java.io.IOException;
import java.lang;
import java.util.*;

public static Optionmenu extends Account
{
Scanner menuInput = new Scanner(System.in);
Decimalformat moneyformat = new Decimalformat("'$'###,##.00");

HashMap<integer,integer> data = new HashMap <integer ,integer>();

Public void getlogin() throws IOException {
int x=1;
do {
      try {
            data.put(12345 ,123);
            data.put(67890,678);
         System.out.println( "wellcome to ATM \n");
        System.out.println("enter your Identity number\n");
              setCustomerNumber(menuInput.nextInt());
        System.out.println("enter your pin number");
               setPinNumber(menuInput.nextInt());

       }
catch (Exception e)
{
System.out.println("\n"+ Invalid  Charecters. only enter numbers");
x=2; 
}
for (Map.Entry entry : data.entrySet())
{
   if(entry.getKey()== getCustomerNumber() && entry.getvalue()==getPinNumber())
          getAccountType();
   }
   }
       System.out.println(" Invalid Identity or pin number");
}
while(x==1) 
}

public void getAccountType() {
    	System.out.println("select the account you want to  access");
    	System.out.println("Type 1- Current account");
    	System.out.println("Type 2- Savings account");
	System.out.println("Type 3- Exit");
	System.out.println("choice :  ");
      int select = menuInput.nextInt();
   switch (select) {
    case 1: getCurrent();
 		break;
    case 2: getSavings();
	        break;
    case 3: System.out.println(" \n Thank you for visiting this ATM, bye") ;
	      break;
     default :System.out.println("Invalid choice \n");
              getAccountType() ;
	}
	}
     public void getCurrent() {
         System.out.println("Current Account");
	System.out.println("Type 1- View balance ");
	System.out.println("Type 2- withdraw money");
	System.out.println("Type 3- Deposit money");
	System.out.println("Type 4- exit");
	System.out.println("enter your choice : ");
        int select = menuInput.nextInt();
          switch(select) {
            case 1: System.out.println("Checking account Balance:"+moneyFormat.format(getCurrentBalance));
			getAccountType(); 
			break;
            case 2:    getCurrentWithdrawInput();
			getAccountType();
			break;
	    case 3:   getCurrentDepositInput();
			getAccountType();
			break;
	    case 4: System.out.println("Thank you for visiting ATM , bye");
			break;
	   default: System.out.println("Invalid choice");
                     getCurrent() ;

}             	

}
 	public void getSavings() {
    		System.out.println("Savings Account");
	System.out.println("Type 1- View balance ");
	System.out.println("Type 2- withdraw money");
	System.out.println("Type 3- Deposit money");
	System.out.println("Type 4- exit");
	System.out.println("enter your choice : ");
        int select = menuInput.nextInt();
          switch(select) {
	case 1: System.out.println("Savings account Balance:"+moneyFormat.format(getSavingsBalance));
			getAccountType(); 
			break;
            case 2:    getSavingsWithdrawInput();
			getAccountType();
			break;
	    case 3:   getSavingsDepositInput();
			getAccountType();
			break;
	    case 4: System.out.println("Thank you for visiting ATM , bye");
			break;
	   default: System.out.println("Invalid choice");
                     getSavings() ;
	}
	}
     }