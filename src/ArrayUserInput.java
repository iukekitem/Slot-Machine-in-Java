import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] foods;   // Declares a variable that can refer to a String array
        int size;

        System.out.print("What # of food do you want?: ");
        //At this point, foods does not contain an array yet. Then the user chooses the size:
        size = scanner.nextInt();
        scanner.nextLine(); // to clear the buffer and let the new scanner pick up the next value

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();

        }

        for(String food : foods){
            System.out.println(food);
        }

    }
}
