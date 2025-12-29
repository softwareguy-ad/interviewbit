package polymarphism;

public class MethodOverload {
    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, long b) {
        System.out.println("b method invoked");
    }

    // void sum(long a,int b){System.out.println("b method invoked");}

    public static void main(String args[]) {
        MethodOverload obj = new MethodOverload();
        obj.sum(20, 20);//now ambiguity
    }
}