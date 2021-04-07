import java.util.Random;
import java.util.Scanner;

public class Lotto {

    final int HOW_MANY_NUMBERS = 6;

    public int[] givenNumbers = new int[6];
    public int[] randomNumbers = new int[6];
    Random generator = new Random();
    int match = 0;

    public Lotto(int[] givenNumbers, int[] randomNumbers, Random generator, int match) {
        this.givenNumbers = givenNumbers;
        this.randomNumbers = randomNumbers;
        this.generator = generator;
        this.match = match;
    }

    public void giveNumbers() {
        System.out.println("Podaj 6 różnych licz z przedziału 1 - 46");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < HOW_MANY_NUMBERS; i++) {

            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Podaj liczbę");
            }
            givenNumbers[i] = scanner.nextInt();


            for (int j = 0; j < HOW_MANY_NUMBERS; j++) {
                if (numberExistInArray(i, j)) {
                    i--;
                    System.out.println("Ta liczba została już wybrana, podaj nową");
                }
            }
            if (this.givenNumbers[i] < 1 || this.givenNumbers > 46) {
                System.out.println("Liczba powinna być z zakresu 1 do 46");
                i--;
            } else {
                System.out.println("OK");
            }
            scanner.close();

        }

    }


    public void randomNumbers() {

        for (int i = 0; i < HOW_MANY_NUMBERS; i++) {
            this.randomNumbers[i] = generator.nextInt(46);
            for (int j = 0; j < HOW_MANY_NUMBERS; j++) {
                if (numberExistInArray(i, j)) {
                    i--;
                }
            }
        }

    }

    public void loopFromArray(int[] array) {
        for (int i = 0; i < HOW_MANY_NUMBERS; i++) {
            System.out.println(array[i]);
        }
    }

    public void showNumbers(int[] givenNumbers, int[] lottoNumbers) {
        System.out.println("Wybrane liczby to: ");
        loopFromArray(givenNumbers);

        System.out.println("Wylosowane liczby to: ");
        loopFromArray(lottoNumbers);
    }


}
