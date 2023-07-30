public class HelloWorld {
void m(){

  int m;
}
char ch;
String name;


    public static void main(String[] args) {


//        System.out.println("Hello World");
//        String main= "Swati";
//        System.out.println(main+20+5);
//        System.out.println(10+20+main);
//        System.out.println((10.00/3.00));
//       /* int swati-sahu*/   //hyphen not allowed
//        int _swa$ti=10;
        //System.out.println();
        int ch1 = 'a';
        int ch2 = 'b';
        char ch4='E';
        int ch5= ch4;
        System.out.println("The ASCII value of a is: "+ch1);
        System.out.println("The ASCII value of b is: "+ch2);
        System.out.println("The ASCII value of ch4 is: "+ch5);

        char CHAR='A';
        System.out.println(CHAR);
        boolean a=true;
        System.out.println(a);
        HelloWorld hello= new HelloWorld();
        System.out.println(hello.ch);//null
        System.out.println(hello.name);

        //int a= a = a = 10;//Error why?
        System.out.println(a);
        boolean isBreakfastReady=true;// or use !
        if(isBreakfastReady || 2+2==4){
            System.out.println("Inside if condition");
        }

        int l= 45;
        final int L=50;
        System.out.println("l::"+l+"\n"+"L::"+L);

        switch(l){

            case 10: System.out.println("TEN"); break;
            case L: System.out.println("FIFTY"); break;
            case 'A': System.out.println("CHAR- A"); break;
            case 10+10+20+5: System.out.println("CONST EXPRESSION"); break;
        }

        char charDefault=	'\u0065';
        System.out.println("This is char default value:"+charDefault);
        char p= 0;
        System.out.println("This is p value:"+p);
        boolean var=!true;
        System.out.println(var);

//        int x;
//        x = 5;
//        {
//            int y = 6;
//            System.out.print(x + " " + y);
//        }
//        System.out.println(x + " " + y);



    }


}

