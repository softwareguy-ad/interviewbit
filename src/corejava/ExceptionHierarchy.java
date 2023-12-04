package corejava;

public class ExceptionHierarchy extends ExceptionHandler{

    public void checkException(){
        callThis();
    }

    public static void main(String[] args) {
        ExceptionHierarchy exceptionHierarchy = new ExceptionHierarchy();
        exceptionHierarchy.checkException();
    }
}
