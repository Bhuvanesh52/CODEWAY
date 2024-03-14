package codeway.atmInterface;

public class ATM_Entity {
	private String UserName,PassWord;
	private int Balance_Amount;
	
	ATM_Entity(String UserName,String PassWord)
	{
		this.UserName=UserName;
		this.PassWord=PassWord;
		this.Balance_Amount=500;//Minimum Balance
	}
	ATM_Entity(String UserName,String PassWord,int Balance_Amount)
	{
		this.UserName=UserName;
		this.PassWord=PassWord;
		this.Balance_Amount=Balance_Amount;
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public int getBalance_Amount() {
		return Balance_Amount;
	}
	public void setBalance_Amount(int balance_Amount) {
		Balance_Amount += balance_Amount;
	}
	public void WDBalance_Amount(int balance_Amount) {
		Balance_Amount -= balance_Amount;
	}
}
