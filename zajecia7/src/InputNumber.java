import java.util.Scanner;
public class InputNumber {
    private static int readNumer(){
        int userInputNumber = 0;
        String userInput;
        System.out.println("Please insert a new number");
        Scanner scan = new Scanner(System.in);
        userInput = scan.nextLine();
        try {
            userInputNumber = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("The input is not a number. Inserting 0");
            return userInputNumber;
        }
        try{
            if (userInputNumber < 0){
                throw new NegativeNumberException("The number is less than 0");
            }
        } catch(NegativeNumberException e){
            System.out.println(e.getMessage() + ", Inserting 0");
            return 0;
        }
        return userInputNumber;
    }
    public static void fillArray(int[] arr){
        for(int x = 0; x < arr.length; x++){
            arr[x] = readNumer();
        }
    }
}
