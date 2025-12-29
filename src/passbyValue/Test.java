package passbyValue;

class Test {
    int x;
    Test(int i) { x = i; }
    Test() { x = 0; }

    public void setX(int x) {
        this.x = x;
    }
}
