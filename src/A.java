import java.sql.SQLOutput;

public class A {
    public int a=10;
    private int b=15;
    protected int c =20;
    int d=25;

    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.d);
    }
}
