package javaConcepts;

public class InsuffientBalance extends Exception {
double amount;
	public InsuffientBalance(double amt) {
		this.amount = amt;
		System.out.println("Amount needed in your account "+this.amount);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
