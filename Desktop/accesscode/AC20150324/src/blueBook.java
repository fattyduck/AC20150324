
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class blueBook {

    public static void main(String[] args) {
        // 1. Create a Scanner for user input.
        Scanner scan=new Scanner(System.in);
        String make, model;
        int year;
        // 2. Create an ArrayList that holds type Car.
        ArrayList<cars> car=new ArrayList<cars>();
        // 3. Create a few new Car objects and add them to the ArrayList.
        cars Camry= new cars("toyota","camry", 2000, 5000.00);
        cars Civic= new cars("honda", "civic", 2000, 5000.00);
        cars Jetta= new cars("vw", "jetta", 2000, 7500.00);

        car.add(Camry);
        car.add(Civic);
        car.add(Jetta);

        // 4. Prompt the user for the car's make, model, and year, and store the inputs in variables.
        System.out.println("What is the brand of your car?");
        make=scan.nextLine();
        System.out.println("What is the model of your car?");
        model=scan.nextLine();
        System.out.println("What is the year of your car?");
        year=scan.nextInt();
        // 5. Iterate over your ArrayList of cars and check for a Car instance that has the same...
        //    ...make
        //    ...model
        //    ...year
        if(make.equalsIgnoreCase(Camry.getMake())){
            if(model.equalsIgnoreCase("camry")){
                if(year==2000){
                    System.out.println("The price for the "+year+make+model+" is "+ Camry.getPrice());
                }
            }
        }else if(make.equalsIgnoreCase("honda")){
            if(model.equalsIgnoreCase("civic")){
                if(year==2000){
                    System.out.println("The price for the "+year+make+model+" is "+ Civic.getPrice());
                }
            }
        }else if(make.equalsIgnoreCase("vw")){
            if(model.equalsIgnoreCase("jetta")){
                if(year==2000){
                    System.out.println("The price for the "+year+make+model+" is "+ Jetta.getPrice());
                }
            }
        }else{
            System.out.println("Not in database!");
        }

        // 6. Print the price of that car.
    }
}