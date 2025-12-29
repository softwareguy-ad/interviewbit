package designpatterns.observer;

public class Test {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Etv etv = new Etv();

        agency.addObserver(etv);
        agency.setNews("Revanth reddy is new prime minister of india");
    }
}
