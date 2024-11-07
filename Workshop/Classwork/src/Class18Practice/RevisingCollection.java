package Class18Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RevisingCollection {

    HashMap<String, Integer> intStringMap;
    HashSet<String> stringSet;
    ArrayList<Integer> intList;
    HashSet<HashMap> mapSet;
    ArrayList<HashMap> mapList;

    public RevisingCollection() {

        // 1. Initialization

        this.intStringMap = new HashMap<>();
        this.stringSet = new HashSet<>();
        this.intList = new ArrayList<>();
        this.mapSet = new HashSet<>();
        this.mapList = new ArrayList<>();

        // 2. Adding elements

        this.intStringMap.put("One", 1);
        this.intStringMap.put("Two", 2);

        // 3. Printing the complete map (1st version)

        System.out.println("Printing the complete map (1st version)");
        System.out.println(this.intStringMap);

        // Optional: Using lambda to print

//        this.intStringMap.forEach((k, v) -> System.out.println(k + " : " + v));

        // 4. Adding entries to stringSet

        this.stringSet.add("Hello");
        this.stringSet.add("World");
        this.stringSet.add("Hello");
        this.stringSet.add("World");
        this.stringSet.add("Hola");

        // 5. Printing the complete stringSet

        System.out.println("Printing the complete stringSet");

        System.out.println(this.stringSet);

        // 6. Adding elements to intList

        this.intList.add(1);
        this.intList.add(2);
        this.intList.add(1);
        this.intList.add(2);
        this.intList.add(3);

        // 7. Printing the complete intList

        System.out.println("Printing the complete intList");
        System.out.println(this.intList);

        // 8. Making the strings from stringSet and integers from intList as keys and values respectively

        // Nice solution because the map does not keep duplicates,
        // and this simple approach would add dupes otherwise

        for (String s : this.stringSet) {
            for (Integer i : this.intList) {
                this.intStringMap.put(s, i);
            }
        }

        // 9. Printing the complete map (2nd version)

        System.out.println("Printing the complete map (2nd version)");
        System.out.println(this.intStringMap);

        // 10. Adding the stringIntMap to the mapList twice

        this.mapList.add(this.intStringMap);
        this.mapList.add(this.intStringMap);

        // 11. Printing the complete mapList

        System.out.println("Printing the complete mapList");
        System.out.println(this.mapList);

        // 12. Adding the stringIntMap to the mapSet twice

        this.mapSet.add(this.intStringMap);
        this.mapSet.add(this.intStringMap);

        // 13. Printing the complete mapSet

        System.out.println("Printing the complete mapSet");
        System.out.println(this.mapSet);

        // 14. Adding a new entry to mapSet

        HashMap<String, Integer> newMap = new HashMap<>();
        newMap.put("Three", 3);

        this.mapSet.add(newMap);

        // 15. Adding a new entry to mapSet anonymously

        this.mapSet.add(new HashMap<String, Integer>());

        // 16. Changing structure of stringIntMap

        // (done within editor)

    }

}
