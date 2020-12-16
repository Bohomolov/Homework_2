import java.util.Random;

public class Homework_2 {
    Random random = new Random();

    public void getRandom() {
        int randomValue = random.nextInt();
        System.out.println(randomValue);
    }

    public void getRandomTenTime() {
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt();
            System.out.println(randomValue);
        }
    }

    public void getRandomInTheRangeTillTen() {
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(10);
            System.out.println(randomValue);
        }
    }

    public void getRandomInTheRangeFromTwentyTillFifty() {
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(31) + 20;
            System.out.println(randomValue);
        }
    }

    public void getRandomInTheRangeFromMinusTenTillTen() {
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(21) - 10;
            System.out.println(randomValue);
        }
    }

    public void getRandomInTheRangeFromMinusTenTillThirtyFive() {
        for (int i = 0; i < random.nextInt(16) + 3; i++) {
            int randomValue = random.nextInt(46) - 10;
            System.out.println(randomValue);
        }
    }
}
