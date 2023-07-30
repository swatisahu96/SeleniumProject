package Collections.List.Stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {

        Stack stack= new Stack();

        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();

        for (int i=0; i<ch.length; i++){

            stack.push(String.valueOf(ch[i]));
            System.out.println(stack.get(i));
        }

        System.out.println("---------");

        for (int i=0; i<ch.length; i++){

            System.out.println(stack.pop());
        }

        Iterator i = stack.iterator();

        while(i.hasNext()){

            System.out.println(i.next());
        }




    }

}
