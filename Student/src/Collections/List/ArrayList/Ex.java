package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {

        List li= List.of("Orange", "Apple", "Banana", "Grapes");

        //li.add() not allowed
        System.out.println(li.size());
        System.out.println(li.get(1));

        System.out.println("----------");

        List list= new ArrayList(); //Dynamic dispatch

        list.add("Green");
        list.add("Yellow");
        list.add("Blue");
        list.add("Violet");

        System.out.println("Initial Colours:"+list);
        list.add(1,"Pink");//Shifts the element
        System.out.println("Colours:"+list);
        list.set(2,"White");//Replaces the element
        System.out.println("Set Example Replacing yellow: "+list);
        list.remove("Pink");
        System.out.println(list);



    }

}
