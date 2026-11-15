import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args){
        //Declare variables
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        //Display Welcome
        System.out.println("########################");
        System.out.println("    Welcome to SLOTS    ");
        System.out.println("Symbols: 🍒 🍉 🍊 🔔 ⭐");
        System.out.println("########################");

        //Play if balance > 0
        while (balance > 0){
            System.out.println("Current balance: $" +balance);
            System.out.print("Place your bet amount: ");         //Enter Bet Amount
            bet = scanner.nextInt();
            scanner.nextLine();

            //      Verify if bet > balance
            if(bet > balance){
                System.out.println("Insufficient funds");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0");//      Verify if bet > 0
                continue;
            }
            else{        //      Subtract bet from balance
                balance -= bet;
            }

            //Spin Row
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);         //Print Row
            payout =getPayout(row, bet);            //Get Payout
            if (payout > 0){
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry you lost this round");
            }
            //Ask to play again
            do {
                System.out.print("Do you want to play again? (Y/N): ");
                playAgain = scanner.nextLine().trim().toUpperCase();

                if (!playAgain.equals("Y") && !playAgain.equals("N")) {
                    System.out.println("Please type Y or N.");
                }

            } while (!playAgain.equals("Y") && !playAgain.equals("N"));

            if (playAgain.equals("N")) {
                break;
            }
        }
        //Display exit Message
        System.out.println("GAME OVER! Your final balance is $" + balance);

        scanner.close();
    }
    static String[] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍊", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();


        for(int i = 0; i < 3 ; i++){
            row[i] = (symbols[random.nextInt(symbols.length)]);
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("##############");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("##############");
    }
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍊" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[0].equals(row[2])){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
