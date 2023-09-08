import java.util.Random;
import java.util.Scanner;

public class Magic8Ball
{
    public static String getUserQuestion()
    {
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        return question;
    }

    public static void main(String[] args) {
        //Asking the user a question
        System.out.println("Please ask me a question: ");

        while (true)
        {
            getUserQuestion();

            // Get random a number from: [0, 1, 2, 3, 4, 5]
            int randomNumber = new Random().nextInt(6);

            //If the random number is 0
            if (randomNumber == 0)
            {
                System.out.println("It is certain.");
            }
            // If the random number is 1
            else if (randomNumber == 1)
            {
                System.out.println("The odds aren't good :(");
            }
            // If the random number is 2
            else if (randomNumber == 2)
            {
                System.out.println("You wish.");
            }
            // If the random number is 3
            else if (randomNumber == 3)
            {
                System.out.println("Ask your mom.");
            }
            // If the random number is 4
            else if (randomNumber == 4)
            {
                System.out.println("Without a doubt.");
            }
            // If the random number is 5
            else
            {
                System.out.println("Ask again later.");
            }
            System.out.println(" ");
            System.out.println("Please ask me another question: ");
        }

    }
}




