public class RandomNumberGame {

    public static void main(String[] args) {
        int answer = (int)(Math.random() *9) +1;
        int input = 0; //user input storage
        int count = 0; //number of attempts storage

        //Scanner class used to get user inputs
        java.util.Scanner inputScan = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.print("Please type a number between 1 and 10: ");
            input = inputScan.nextInt (); //store  user input

            if(answer > input) {
                System.out.println("Hint: Number is Larger!");
            } else if(answer < input) {
                System.out.println("Hint: Number is Smaller!");
            } else {
                System.out.println("Correct!");
                System.out.println("You guessed " + count + " times.");
                break;
            }

        } while(true); //infinite loop

    }//end of main
} //end of class

