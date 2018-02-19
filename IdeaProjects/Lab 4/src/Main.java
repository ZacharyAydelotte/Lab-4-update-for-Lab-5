import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String userInput; //user input values
        System.out.print("Enter a hexadecimal number: ");
        userInput = scnr.nextLine(); //gather input value of user
        userInput = userInput.toUpperCase(); //change any lower case digits to upper case digits
        String hexDigits =  "0123456789ABCDEF"; //Possible hex digits

        if (userInput.substring(0, 2).equals("0X")) { //hack off 0X from any input values
            userInput = userInput.substring(2); //starts two digits into the input to achieve the latter
        }
        int counter = userInput.length() - 1; //hex digit position from right to left
        long result = 0; //output
        int counterExp = 0; //base 16 exponent
        while (counter >= 0) { //process each digit from right to left
            String digit = userInput.substring(counter, counter + 1); //find hex digit equivalent to decimal output
            result += hexDigits.indexOf(digit) * (Math.pow(16, counterExp)); //update output with new decimal digits
            counterExp += 1; //increase to next base 16 exponent
            counter += -1; //countdown from right to left hex digits
        }
        System.out.print("Your number is " + result + " in decimal"); //Greetings from GitHub!
    }
}
