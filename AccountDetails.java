package p1;

public class AccountDetails {

	private long accountnumber;
	private String username;
	private String password;
	private int balance;
	private KYCVerification KYCdetails;
	private ContactDetails contactdetails;
	private int deposite;
	private int withdrawal;
	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDetails(String username, String password, int balance, int deposite, int withdrawal) {
		super();
		this.accountnumber = accountnumber;
		this.username = username;
		this.password = password;
		this.balance = balance;
		KYCdetails = kYCdetails;
		this.contactdetails = contactdetails;
		this.deposite = deposite;
		this.withdrawal = withdrawal;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public KYCVerification getKYCdetails() {
		return KYCdetails;
	}
	public void setKYCdetails(KYCVerification kYCdetails) {
		KYCdetails = kYCdetails;
	}
	public ContactDetails getContactdetails() {
		return contactdetails;
	}
	public void setContactdetails(ContactDetails contactdetails) {
		this.contactdetails = contactdetails;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}
	public int getWithdrawal() {
		return withdrawal;
	}
	public void setWithdrawal(int withdrawal) {
		this.withdrawal = withdrawal;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountnumber=" + accountnumber + ", username=" + username + ", password=" + password
				+ ", balance=" + balance + ", KYCdetails=" + KYCdetails + ", contactdetails=" + contactdetails
				+ ", deposite=" + deposite + ", withdrawal=" + withdrawal + ", getAccountnumber()=" + getAccountnumber()
				+ ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getBalance()="
				+ getBalance() + ", getKYCdetails()=" + getKYCdetails() + ", getContactdetails()=" + getContactdetails()
				+ ", getDeposite()=" + getDeposite() + ", getWithdrawal()=" + getWithdrawal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setE(ContactDetails c) {
		// TODO Auto-generated method stub
		
	}
	
	
}
