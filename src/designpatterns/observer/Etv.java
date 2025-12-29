package designpatterns.observer;

public class Etv implements Channel {
    String news;

    @Override
    public void update(String s) {
        System.out.println("Received news : " + s);
    }
}
