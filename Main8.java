package question8;
// Write a program that prompts the user to input a positive integer.
// It should then output a message indicating whether the number is a prime number.
public class Main8 {
    public static void main(
            String[] args) {
        int initial_value = 31;
        int check_number = 2;


        while (check_number<initial_value) {

            if (initial_value % check_number == 0) {
                System.out.println("it is not a prime number");
                break;
            } else if( check_number ==initial_value-1) {
                System.out.println("it is a prime number");
                break;
            }
                else

            check_number++;


        }

    }
}
