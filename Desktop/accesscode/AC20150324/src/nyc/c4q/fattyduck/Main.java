package nyc.c4q.fattyduck;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Duck");
        System.out.println("What is your names, hit space and enter to finish?");
        while (true) {
            String newName= scan.nextLine();
            names.add(newName);
            if (newName.equals("")) {
                break;
            }

        }
        for (int i = names.size()-1; i >= 0; i--) {
                System.out.println(names.get(i));
            }
        if(names.contains("duck")) {
            System.out.println("Yes!!!!!");
        }else{
            System.out.println("Nooo!!!!");
        }
    }
}