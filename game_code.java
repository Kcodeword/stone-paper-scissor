import java.util.Random;
import java.util.Scanner;

public class game_code {
    public static void main(String[] args) {



                // 0 = rock
                // 1 = paper
                // 2 = scissor
                Scanner sc = new Scanner(System.in);
                System.out.println(" 0 for rock \n 1 for paper \n 2 for scissor \n ");
                int userInput = sc.nextInt();

                Random random = new Random();
                int botInput = random.nextInt(3);

                if (userInput == botInput ){
                    System.out.println("the game is Draw");
                } else if (userInput == 0 && botInput == 2 || userInput == 1 && botInput == 0 || userInput == 2 && botInput == 1 ) {

                    System.out.println("user  win the game ");

                } else {
                    System.out.println("boat win the game ");
                }


                if (botInput == 0){
                    System.out.println("boat chose rock");

                } else if (botInput == 1) {
                    System.out.println("boat chose paper");

                } else if (botInput == 2) {
                    System.out.println("bot chose scissor");


                }

            }
        }



