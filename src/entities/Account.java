package entities;

public class Account {

    private int number;
    private String holder;
    private double value;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getValue() {
        return value;
    }



    public void deposit(double value){
        System.out.println(" Updated account (+) "+String.format("%.2f",value));
        this.value += value;
    }

    public void withdraw(double value){
        double tax = 5.0;
        System.out.println(" Updated account (-) "+String.format("%.2f",value));
        this.value -= (value + tax);
    }

    public String toString(){
        return "Account "+this.number+", Holder: "+this.holder+", Balance: $ "+String.format("%.2f",this.value);
    }
}
