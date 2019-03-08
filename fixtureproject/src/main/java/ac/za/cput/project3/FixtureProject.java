package ac.za.cput.project3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FixtureProject {

    public String concatString(String first, String second) {
        return first.concat(second);
    }

    public void ObjectIdentity()
    {
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("1.0");
        BigDecimal b3 = b1;
    }


    public List<String> FailTest()
    {
        List<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.remove(2);
        colours.set(2, "Black");

        /*for (int i = 0; i < colours.size(); i++) {
            System.out.println("List : " +colours.get(i));
        }

        System.out.println("The list does contains : " + colours.contains("Yellow"));
        System.out.println("The list does contains : " + colours.contains("Black"));

        System.out.println("\n");
        */
        return colours;
    }

    public Map Map() {
        //Map
        Map map = new HashMap();
        map.put(1, "Toyota");
        map.put(2, "BMW");
        map.put(3, "VW");
        map.put(4, "Mercedes");

        try {
            TimeUnit.MILLISECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return map;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

}
