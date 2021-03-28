package OOP3Arrays.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

    public static void main(String[] args) {

        // Assuntos pendentes (Interfaces / Generics / Lambda)

        List<String> strList = new ArrayList<>();
        strList.add("Paulo");
        strList.add("Alf");
        strList.add("Alex");
        strList.add("Joanne1");
        strList.add("Joanne2");
        strList.add("Joanne3");
        strList.add("Joanne4");
        strList.add("Peter");
        strList.add("Parker");
        strList.add("Pocahontas");
        strList.add("Frank");
        strList.add("Julia");
        strList.add("Fernando");

        strList.remove("Alf"); //it'll be compared and removed if matches someone inside the list
        strList.remove(3);

        // Remove all name starting with "A"
        strList.removeIf(x -> x.charAt(0) == 'A'); //Lambda function
        System.out.println(strList);
        System.out.println(strList.indexOf("Alex"));
        System.out.println(strList.indexOf("Judith")); //will return -1 because it doesn't exist

        //Filter all names starting with P
        List<String> result = strList.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList()); // Convert strList to strem and then convert back to list (WTF???)
        System.out.println(result);

        //Find first element starting with F
        String firstNameWithF = strList.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
        System.out.println(firstNameWithF);

        List<Integer> intList = new ArrayList<>();

        intList.add(4);
        intList.add(37);
        intList.add(46);
        intList.add(78);
        intList.add(3);
        intList.add(0, 103);


        System.out.println(intList.indexOf(3));

        intList.remove(2);
        System.out.println(intList.size());



        for (Integer i : intList) {
            if (i % 2 == 0) {
                continue;
            } else {

                System.out.println(i);
            }
        }
    }
}
