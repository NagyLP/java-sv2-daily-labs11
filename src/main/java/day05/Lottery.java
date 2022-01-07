package day05;

public class Lottery {

    public static void main(String[] args) {

        int[] lottery = new int[5];
        int randomNum;

        for (int i = 0; i < 5; i++) {
            randomNum = (int) (Math.random() * 90);
            for (int k = 0; k < i; k++) {
                if (lottery[i] == randomNum)
                {
                    randomNum = (int) (Math.random() * 90);
                }

            }
            lottery[i] = randomNum;
        }

        for (int i = 0; i < lottery.length; i++)
            System.out.print(lottery[i] + " ");

    }
}