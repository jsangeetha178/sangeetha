package p1;
import java.util.Scanner;

import p1.AccountDetails;
import p1.ContactDetails;
import p1.KYCVerification;

public class MainClass {
	
	AccountDetails[] allAccount = new AccountDetails[1515151];
	

	Scanner sc=new Scanner(System.in);
	Scanner scStr=new Scanner(System.in);
	
	public static void main(String[] args) {
		
	MainClass mc=new MainClass();
	
	while(true) {
		System.out.println("-----To Perform Task-----");
		System.out.println("1. Add User Details");
		System.out.println("2. Deposit Operaion");
		System.out.println("3. All User Details");
		System.out.println("4. User Contact Details");
		System.out.println("5. User KYC Verification");
		System.out.println("6. User Balance");
		System.out.println("7. Change Mobile no");
		System.out.println("8. Change EmailId");
		
		System.out.println("0. Exit");
		
		System.out.println("Enter your choice :-");
		
		switch (mc.sc.nextInt()){
			
			case 1:
				mc.addUserDetails();
				break;
			case 2:
				mc.depositeoperation();
				break;
			case 3:
				mc.allDetails();
				break;
			case 4:
				mc.userContactDetails();
				break;
			case 5:
				mc.userKYCdetails();
				break;
			case 6:
				mc.userBalance();
				break;
			case 7:
				mc.changeMobileNo();
				break;
			case 8:
				mc.changeEmailId();
				break;
				
			default:
				System.out.println("Exit");
				System.exit(0);
		
		     }
		}
	}

		public void addUserDetails() {
			
			System.out.println("Enter user name");
			String username=scStr.nextLine();
			System.out.println("Enter pan no");
			String pannumber=scStr.nextLine();
			System.out.println("Enter aadhar no");
			long aadharno=sc.nextInt();
			System.out.println("Enter Document type");
			String doctype=scStr.nextLine();
			System.out.println("Ente account no");
			long accno=sc.nextInt();
			
		}
		
		public void depositeoperation() {
			
			System.out.println("\n ========  Deposit Use Case ==============\n");
			
			
			System.out.println(" Enter Payee Account Number ");
			int payeeAccNumber = sc.nextInt();
			
			System.out.println(" Enter Amount to be Deposit :-  ");
			int amount  = sc.nextInt();
			
			
			
			AccountDetails ownerAccount = null;
			boolean foundPayeeAccount = false;
			
			int noofAccounts;
			for(int i = 0;i< noofAccounts ;i++)
			{
				AccountDetails a = noofAccounts[i];
				if(a.getAccountnumber() == payeeAccNumber)
				{
					foundPayeeAccount = a;
					foundPayeeAccount = true;
				}
									
			}
			
			if(foundPayeeAccount)
				
				
			{
				
			ownerAccount.setBalance(ownerAccount.getBalance()-amount);
		    foundPayeeAccount.setBalance(foundPayeeAccount.getBalance()+amount);
				
				System.out.println(" Deposit Done ");
				System.out.println(" Cheack Balance ");
				System.out.println(foundPayeeAccount.getAccountNumber()+" - "+(foundPayeeAccount.getBalance()+amount));
			
				
			}
		}
		
		public void allDetails() {
			
			System.out.println("Enter the Account Number");
			long searchAccountNumber = sc.nextInt();
			System.out.println("Enter the user name");
			String serachUserName = sc.nextLine();
			
		}
		public void userContactDetails() {
			System.out.println("Enter the phone Number");
			long phoneNumber = sc.nextInt();
		}
		
		public void userKYCdetails() {
			System.out.println("Enter the KYC details");
			int kycdetails= sc.nextInt();
			
		}
        
		public void userBalance() {
			
		}
		
        public void changeMobileNo() {
        	System.out.println("change phone number");
    		long changeMobileNO = sc.nextInt();
			
		}
        
        public void changeEmailId() {
			System.out.println("change EmailId");
			long changeEmailId=sc.nextInt();
		}
        
        public void addAccount() {

    		Random myRandom = new Random();
    		int carId = myRandom.nextInt();

    		System.out.println("Enter User Name ");
    		String username = scStr.nextLine();

    		
    		System.out.println("Enter Password ");
    		String password = scStr.nextLine();

    		System.out.println("Enter Insial Account Balance ");

    		int balance = sc.nextInt();

    		System.out.println("Enter Insial Account Number ");

    		int accountNumber = sc.nextInt();

    		System.out.println("Enter Housenumber ");
    		String housenumber = scStr.nextLine(); //

    		System.out.println("Enter city ");
    		String cityname = scStr.nextLine();

    		System.out.println("Enter State ");
    		String statename = scStr.nextLine();

    		System.out.println("Enter Country ");
    		String countryname = scStr.nextLine();

    		System.out.println("Enter Phone Number ");
    		long mobilenumber = scStr.nextInt();

    		System.out.println("Enter Pincode ");
    		long pincode = scStr.nextInt();

    		System.out.println("Enter MailID ");
    		long emailid = scStr.nextLine();

    		int cashback = 0;
    		// private String localityName1;

    		ContactDetails c = new ContactDetails(housenumber, cityname, statename, countryname, pincode, mobilenumber, emailid);
    		AccountDetails e = new AccountDetails(username, password, balance, cashback, accountNumber);

    		e.setE(c);

    		noofAccounts[noofAccounts++] = e;
    		System.out.println(" " + c);
    		System.out.println(" Added in the List ");

    	}

    	public void viewAccountDetails() {
    		System.out.println("Enter Searched AccountNumber  ");
    		int searchAccountNumber = sc.nextInt();

    		
    		AccountDetails a = get.AccountById(searchAccountNumber);

    		 System.out.println(a);
    	}

        public void printAccountDetails(AccountDetails a) {
    		System.out.print("\n" + a.getAccountnumber() + "\t");
    		System.out.print(a.getUsername() + "\t");
    		System.out.print(a.getBalance() + "\t");
    		System.out.print(a.getPassword() + "\t");
    		System.out.println("\n---------------------------------------------\n");

    	}
       public void printContactDetails(ContactDetails c) {
    	   System.out.print("\n" + c.getLocalityName1() + "\t");
    		System.out.print(c.getCityname() + "\t");
    		System.out.print(c.getStatename() + "\t");
    		System.out.print(c.getPincode()+ "\t");
    		System.out.print(c.getEmailid() + "\t");
    		System.out.print(c.getHousenumber() + "\t");
    		System.out.println("\n---------------------------------------------\n");
           }

}
