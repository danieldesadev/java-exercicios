package entities;

public class Bank {

    private int accNumber;
    private String accHolder;
    private double accValue;

    public Bank(int accNumber, String accHolder, double accValue) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.accValue = accValue;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getAccValue() {
        return accValue;
    }

    public void initialDeposit(double accValue) { this.accValue+=accValue;}

    public void depositValue(double accValue) {this.accValue+=accValue;}

    public void withdrawValue(double accValue) {this.accValue-=accValue;}

    public String toString(){
        return "Account: "+
                accNumber +
                ", Holder: " +
                accHolder +
                ", Balance: $ "+
                String.format("%.2f", accValue);


    }
}
