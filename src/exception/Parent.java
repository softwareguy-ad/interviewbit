package exception;

public class Parent {
    public static void main(String[] args) {
        Child c  =  new Child();
        System.out.print("Returned Value is "+c.method1()[0]);

    }
}

class Child {

    public int[] method1() {
        int value = 10;
        int[] arr = {1};
        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught value is " + arr[0]);
            return arr; // value is being returned from inside catch
        } finally {
            arr[0] = 2;
            System.out.println("Finally value is " + arr[0]);
            //return arr;
        }
        System.out.println("Excecuted this line");
        return arr; //returning a referential type variable
    }
}
