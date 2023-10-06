import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> number1 = new LinkedList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(0, 2);
            number1.add(num);
            number2.add(num);
        }
        System.out.println("до сортировки: ");
        System.out.println(number1);
        System.out.println(number2);

        Collections.sort(number1);
        Collections.sort(number2)                                                                                                                             ;


        System.out.println("после сортировки: ");
        System.out.println(number1);
        System.out.println(number2);


    }
}