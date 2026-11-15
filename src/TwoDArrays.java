public class TwoDArrays {
    public static void main(String[] args){
        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato","onion","carrot"},
                                {"chicken", "pork", "beef", "fish"} };

        groceries[0][0] = "pinapple";
        groceries[1][1] = "garlic";
        groceries[2][3] = "tuna";
        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();//makes it a grid, collumns and rows
        }

    }
}
