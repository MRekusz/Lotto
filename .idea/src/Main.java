import java.util.Random;

public class Main {


    public static void main(String[] args) {

        System.out.println("Witaj w Lotto");
        Lotto lotto = new Lotto(new int[6], new int[6], new Random(), 0);


        lotto.giveNumbers();
        lotto.randomNumbers();
        lotto.showNumbers(new int[6], new int[6]);
        lotto.winOrLoose(new int[6], new int[6]);

    }
}
