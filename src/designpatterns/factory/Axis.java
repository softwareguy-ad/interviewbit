package designpatterns.factory;

public class Axis implements Bank{
    @Override
    public int getInterest() {
        return 9;
    }

    @Override
    public String getName() {
        return Axis.class.getName();
    }
}
