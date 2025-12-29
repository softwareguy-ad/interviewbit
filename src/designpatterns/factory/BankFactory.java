package designpatterns.factory;

public class BankFactory {
    public static Bank getBank(String bankName){
        switch (bankName){
            case "Axis":
                return new Axis();
            case "HDFC":
                return new HDFC();
            default:
                return null;
        }
    }
}
