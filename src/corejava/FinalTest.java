package corejava;

public class FinalTest {
    static final int finalVarl;
    static
    {
        finalVarl =10;
    }

    // Calling finalize is deprecatted as of java 9
    protected void finalize() throws Throwable
    {
        try {

            System.out.println("inside demo's finalize()");
        }
        catch (Throwable e) {

            throw e;
        }
        finally {

            System.out.println("Calling finalize method"
                    + " of the Object class");

            // Calling finalize() of Object class
            super.finalize();
        }
    }

    // When a final var is assigned to object it is called reference final var
    // internal state of ref final can be changed like String buffer
    public static void main(String[] args) {
        System.out.println("Value of final var = " + finalVarl);

        // ref final var
        StringBuffer stringBuffer = new StringBuffer("Prep");
        stringBuffer.append(" Interview");
        System.out.println("This wont throw an error " + stringBuffer);
    }
}
