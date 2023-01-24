import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(10);
//        integerList.add(20);
//        integerList.add(30);
//        integerList.add(40);
//        integerList.add(50);
//
//        for(int i=0; i<integerList.size(); i++){
//            System.out.println(integerList.get(i));
//        }
//
//        integerList.set(4, 100);
//        System.out.println(integerList);
//
//        integerList.remove(1);
//        System.out.println(integerList);

        //HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities);
//
//        System.out.println(capitalCities.get("England"));
//
//        capitalCities.remove("England");
//        System.out.println(capitalCities);
//
////        capitalCities.clear();
////        System.out.println(capitalCities);
//
////        System.out.println(capitalCities.size());
//
//        for (String i : capitalCities.keySet()) {
//            System.out.println(i);
//        }


//        //sorted by name
        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Khali");
        names.add("Li");
        names.add("Sasho");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        }
        );

        for (String s : names) {
            System.out.println(s);
        }
    }
}