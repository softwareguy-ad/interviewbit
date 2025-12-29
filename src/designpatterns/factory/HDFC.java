package designpatterns.factory;

public class HDFC implements Bank{
    @Override
    public int getInterest() {
        return 10;
    }

    @Override
    public String getName() {
        return HDFC.class.getName();
    }
}
