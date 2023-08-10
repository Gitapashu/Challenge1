import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

/*        IntegerPrinter t=new IntegerPrinter(10);
        t.print();

        Printer<Integer> printInteger = new Printer<>(20);
        Printer<String> printString = new Printer<>("Printing String");
        Printer<Double> printDouble = new Printer<>(11.3);

        printInteger.print();
        printString.print();
        printDouble.print();

        ArrayList<Cat> cats= new ArrayList<Cat>();
        cats.add(new Cat());
        //cats.add(new Dog());

        Cat myCat= cats.get(0);*/

        IntegerPrinter.shout("ASHU",29);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        //printList(intList);
        printList(intList);
        //printList2(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("BanManus",2));
        //printList(catList);
        printList(catList);
        printList2(catList);
        System.out.println(printList2(catList));
        System.out.println(catList);

    }

    /*private static void printList(List<Object> myList){
        System.out.println();
    }*/

      private static void printList(List<?> myList){
        System.out.println();
    }

    private static boolean printList2(List<? extends Animal> myList){
        System.out.println(myList);

        return false;
    }


}