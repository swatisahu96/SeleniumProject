package Wrapper;

public class WrapperClass {

    public static void main(String[] args) {

        /* Primitive to String  */

        int x = 10;
        int y = 10;
        String s1 = String.valueOf(x);
        String s2 = String.valueOf(y);
        String s3 = s1 + s2;
        //String s4= x+y;  //will throw error
        System.out.println(s3);


        char ch='A';
        String s4= String.valueOf(ch);
        String s5= Character.toString(ch);// Will print 'A'
        String s6= Integer.toString(ch);// will print ASCII value
        System.out.println(s5);

        //======================

        /* String to primitive */

//        String s7 = "ABC";
//        int b = Integer.parseInt(s7);
//        System.out.println("String to primitive:"+b);//THis will give numberFormat exception

        String s8 = "10";
        int c = Integer.parseInt(s8);
        System.out.println("String to primitive:"+c);

        /* Primitive to Wrapper  */

        int d= 20;
        Integer i= new Integer(d);
        System.out.println(i);
        //OR
        Integer i2= Integer.valueOf(d);
        System.out.println(i2);

        /*  Wrapper to Primitive  */
        Integer i3= 50;
        int pri= i3.intValue();
        System.out.println(pri);

        /* String to Wrapper Objects */
        String s9 = "BCDE";
        Integer i4 = new Integer(s9);
        System.out.println(i4);

        /* Wrapper Object to String  */
        Integer i5 = new Integer(100);
        String pop = Integer.toString(i5);

        /* Wrapper class helpful methods */
        System.out.println(" Wrapper helpful methods: "+Integer.MAX_VALUE);
        System.out.println(" Wrapper helpful methods: "+Integer.MIN_VALUE);








    }


}
