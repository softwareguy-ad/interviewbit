package designpatterns.factory;

public class TestPatterns {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank("HDFC");
        System.out.println(bank.getInterest());
    }
}
