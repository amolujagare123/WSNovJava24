public class MyClass {

    int a;
    double d;
    char c;
    String str; // data members

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        int i;
        i = 10;

        MyClass ob = new MyClass();
        ob.a = 90;
        ob.d = 45.67;
        ob.c = 'j';
        ob.str = "str";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 93;
        ob2.d = 15.17;
        ob2.c = 't';
        ob2.str = "amol";
        ob2.display();
    }

}
