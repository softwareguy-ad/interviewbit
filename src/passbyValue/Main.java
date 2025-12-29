package passbyValue;
class Main {
    public static void main(String[] args)
    {
        // t is a reference
        Test t = new Test(5);
        // Reference is passed and a copy of reference
        // is created in change()
        System.out.println("Obj address before: "+t);
        change(t);
        System.out.println("Obj address After: "+t);

        // Old value of t.x is printed
        System.out.println(t.x);

    }
    public static void change(Test t)
    {
        // We changed reference to refer some other location
        // now any changes made to reference are not
        // reflected back in main
        //t = new Test();
        t.x = 10;
    }
}