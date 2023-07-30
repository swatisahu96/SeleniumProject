package Exception.Practice;

public class Exp01 {

    public static void main(String[] args) {

        String s = args[0];
        int x= Integer.parseInt(s);
        int d10=10/x;
        //when args[0] -> index out of bound exception
        //when args[0] is abc  x will give -> Number format exception
        // 10/0 -> Arimethatic exception

        System.out.println("Output is: "+d10);



    }


}
