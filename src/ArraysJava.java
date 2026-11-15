import java.util.Arrays;
public class ArraysJava {
    public static void main(String[] args){

        String[] fruits = {"apple", "orange", "coconut"};//name of array should be descriptive


        //int numOfFruits = fruits.length;

        /*for(int i = 0; i < fruits.length; i++){

            System.out.print(fruits[i] + " ");//Arrays print the local in memory

        }*/
        //Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapples");

        for(String fruit : fruits) {//enhanced loop simplifies iteration
            System.out.println(fruit);
        }

    }
}
