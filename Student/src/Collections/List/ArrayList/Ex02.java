package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {

        List<String> li = new ArrayList();//Ordered collection
        //Duplicate & null values are allowed

        li.add("Orange");
        li.add("Apple");
        li.add("Banana");
        li.add("Grapes");

        System.out.println("Fruit");
        for (Object o : li) {
            System.out.println(o);
            // here we can't modify collection
        }

        List list = new ArrayList(); //Dynamic dispatch
        list.add("Green");
        list.add("Yellow");
        list.add("Blue");
        list.add("Violet");

        Iterator i = list.iterator();
        System.out.println("Colours:");
        while (i.hasNext()) {
    //we can modify elements
            System.out.println(i.next());
        }

        li.addAll(list);

    }
}
