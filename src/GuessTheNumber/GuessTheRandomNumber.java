package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheRandomNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int user_num;
        int n;


        do {
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter the number of participate student : ");
            int par_std = sc.nextInt();
            sc.nextLine();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();

            String[] userName = new String[par_std];
            int[] win_data = new int[par_std];

            for (int i = 0; i < par_std; i++) {

                int count = 1;
                Random random = new Random();
                int comp_num = random.nextInt(100);
//              int comp_num = 50;
                System.out.printf("Enter %d student name : ", i + 1);
                userName[i] = sc.nextLine();
                System.out.println();
                System.out.println("$$$$$$$$$$$$$$$$ GAME START $$$$$$$$$$$$$$$$");
                System.out.println();
                System.out.println("````` Range 1 to 100 `````");
                System.out.println();
                System.out.println("*************************************************");
                System.out.println();

                do {
                    System.out.print("Guess the number : ");
                    user_num = sc.nextInt();
                    sc.nextLine();

                    if (user_num == comp_num) {
                        System.out.println();
                        System.out.printf("You guess the right number is %d times\n", count);
                        System.out.printf("Thank You %s\n", userName[i]);
                        System.out.println();
                        System.out.println("*************************************************");
                        System.out.println();
                    } else if (user_num > comp_num) {
                        System.out.println("Try smaller number.");
                        System.out.println();
                        count++;
                    } else {
                        System.out.println("Try greater number.");
                        System.out.println();
                        count++;
                    }
                } while (user_num != comp_num);

                win_data[i] = count;

            }

            System.out.println("************ RESULT ************");
            System.out.println();
            System.out.println("+---------------------------------+----------------+");
            System.out.println("| Students Names                  | Timing         |");
            System.out.println("+---------------------------------+----------------+");
            for (int i = 0; i < par_std; i++) {
                System.out.printf("| %-32s| %-8d times |\n", userName[i], win_data[i]);
            }
            System.out.println("+---------------------------------+----------------+");
            System.out.println();
            System.out.println();

            int min = win_data[0];
            int idx = 0;

            for (int i = 0; i < par_std; i++) {
                if (min > win_data[i]) {
                    min = win_data[i];
                    idx = i;
                }
            }

            System.out.println("$$$$$$$$$$$$$$$$$$$$ WINNER STUDENTS NAMES $$$$$$$$$$$$$$$$$$$$");
            for (int i = 0; i < par_std; i++) {
                if (win_data[idx] == win_data[i]) {
                    System.out.println();
                    System.out.printf(">>> %s <<<  is the Winner of this Game", userName[i]);
                    System.out.println();
                }
            }


            System.out.println();
            System.out.println("========= GAME OVER =========");
            System.out.println();
            System.out.println("Press any number into Re-run program");
            System.out.println("Press 0 into Exit Program");
            n = sc.nextInt();
            System.out.println();

            if (n == 0) {
                System.out.println("Your program is successfully Exit.");
            }

        } while (n != 0);

    }
}
