package exception;

public class ExceptionHandler {
    /*
    Notes
    1.Can try exist without catch?
    Yes, it should have finally block

    2. If both catch and finally have return statement which one will return?
    Value from finally will be returned.
    If catch only have return value from catch will be returned

    3. Explain exception propagation in java
    In case of Unchecked exception is propagated top to bottom of calling method by default
    In case of Checked exception we need to handle propagation using throws key word in method definition

    4. Types of exceptions
    Checked - checked at compile time, Every class except Runtime Exception
    Unchecked - checked at run time, All sub classes of RunTimeException

     */
    public static int checkException() {
        int value = 1;
        try {
            //return value;
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            value = 2;
            System.out.println("Exception caught value is " + value);
            return value;
        }/*catch (ArithmeticException e){
            value = 4;
            System.out.println("Exception caught " + e);
        }*/
        finally {
            value = 3;
            System.out.println("Finally value is now " + value);
            //return value; // value is being returned inside finally
        }
        //return value;
    }

    public static void main(String[] args) {
        System.out.println("Returned Value=" + checkException());
    }
}
