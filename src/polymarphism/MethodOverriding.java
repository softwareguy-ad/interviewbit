package polymarphism;

class Poly{
    protected void accessMethod(){
        System.out.println("access method");
    }
}
public class MethodOverriding extends Poly {
    @Override
    public void accessMethod() {
        System.out.println("Method Overriding");
    }
}
