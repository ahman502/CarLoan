public class CarLoan {

  //instance fields/attributes
  int carLoan = 10000;    //car loan amount set to 10000
  int loanLength = 3;    //loan length of 3 years
  int interestRate = 5;   //interest rate of 5%
  int downPayment = 2000;    //down payment initialized to 2000
  String carName;

  //requirements method to take out a car loan
  public void loanRequirements(String n, int l, int ll, int ir, int dp) {

    carName = n;
    carLoan = l;
    loanLength = ll;
    interestRate = ir;
    downPayment = dp;

    System.out.println("---------- " + n + " ----------");

    //loan length and interest rate have to be greater than 0
    if (ll <= 0 || ir <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    }
    //if the down payment is equal to or more than the loan itself, then loan can be paid in full, at once
    else if (dp >= l) {
      System.out.println("The car can be paid in full.");
    }
    //otherwise we need to calculate the monthly loan payments
    else {
      int remainingBalance = l - dp;
      int months = ll * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * ir) / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println("Your monthly payment is: $" + monthlyPayment + "\n");
    }
  }

  //main method
	public static void main(String[] args) {

    //new instance of class CarLoan
    CarLoan honda = new CarLoan();
    //testing the loan requirement method on the instance
    honda.loanRequirements("Honda", 10000, 3, 5, 2000);

    //new instance of class CarLoan
    CarLoan cadillac = new CarLoan();
    //testing the loan requirement method on the instance
    cadillac.loanRequirements("Cadillac", 15780, 2, 10, 230);

    //new instance of class CarLoan
    CarLoan mitsubishi = new CarLoan();
    //testing the loan requirement method on the instance
    mitsubishi.loanRequirements("Mitsubishi", 1000, 1, 8, 2000);

	}
}
