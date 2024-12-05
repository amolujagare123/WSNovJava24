package pack2;

import pack1.Java1;

public class Java3  extends Java1 {



    public static void main(String[] args) {
        Java1 ob = new Java1();
        ob.a = 90;
        ob.d = 45.67;
        ob.c = 'j';
        ob.str = "str";
        ob.display();

        Java3 j3 = new Java3();
        j3.c = 'g';
    }

}
