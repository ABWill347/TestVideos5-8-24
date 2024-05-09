package Practice;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        Set coffee = new HashSet<>();
        coffee.add("Arabica");
        coffee.add("Robusta");
        coffee.add("Liberica");
        coffee.add("Catuai");
        System.out.println(coffee.size());
        System.out.println(coffee);
        for (Object printAllCoffee : coffee) {//If you don't want to use objects, you will need to insert<String> next to set
            System.out.println(printAllCoffee);
        }
        var i = coffee.iterator();
        while (i.hasNext()) {
            System.out.println("While loop " + i.next());
        }
        coffee.forEach(x -> System.out.println("For Each method " + x));
//coffee.forEach(System.out::println); another way to do the loop above


        System.out.println("==============");

        List coffeeType = new ArrayList<>();
        coffeeType.add("Espresso");
        coffeeType.add("Cappuccino");
        coffeeType.add("Flat white");
        coffeeType.add("Late");
        System.out.println(coffeeType.size());
        System.out.println(coffeeType.get(0));
        System.out.println(coffeeType);
        for (Object printAllCoffeeType : coffeeType) {
            System.out.println(printAllCoffeeType);

        }

        System.out.println("===============");

        Queue milkType = new LinkedList();
        milkType.add("Whole");
        milkType.add("2%");
        milkType.add("Oat");
        milkType.add("Almond");
        System.out.println(milkType.size());
        milkType.remove();//automatically removes the head of the queue
        System.out.println(milkType);
        System.out.println(milkType.peek());//Shows the head of the queue\
        for (Object printAllMilType : milkType) {
            System.out.println(printAllMilType);
        }


        System.out.println("===============");
        Map<String, Integer> sugarAmountFlavor = new HashMap<>();
        sugarAmountFlavor.put("Vanilla", 25);
        sugarAmountFlavor.put("Caramel", 50);
        sugarAmountFlavor.put("Salted caramel", 15);
        System.out.println(sugarAmountFlavor.size());
        System.out.println(sugarAmountFlavor.get("Vanilla"));
        System.out.println(sugarAmountFlavor.entrySet());
        sugarAmountFlavor.remove("Vanilla");
        System.out.println(sugarAmountFlavor);
//        for (Map.Entry<String,Integer>printAllSugar:sugarAmountFlavor.entrySet()){
//            System.out.println(printAllSugar);
//        }
        for (var printAllSugar : sugarAmountFlavor.entrySet()) {
            System.out.println(printAllSugar.getKey());
        }
        sugarAmountFlavor.forEach(
                (k,v)-> System.out.println("Sugar Type "+k+"- Calories "+v)
        );

        System.out.println("===============");

        Map<String, Integer> firstTest = TestResults.getOriginalGrades();
        Map<String, Integer> seccondTest = TestResults.getMakeUpGrades();

        for(var students : seccondTest.entrySet()){
            int firstGrade = firstTest.get(students.getKey());
            int secondGrade = seccondTest.get(students.getKey());

            if(secondGrade > firstGrade){
                firstTest.put(students.getKey(), secondGrade);
            }System.out.println(students.getKey() + " Highest grade:" + firstTest.get(students.getKey()));
        }



    }


}






