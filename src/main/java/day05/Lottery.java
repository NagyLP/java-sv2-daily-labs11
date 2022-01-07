package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private final int totalPiecesNumbers;
    private final int pullVolumen;
    private final Random random;

    public Lottery(int totalNumbers, int numberOfDraws) {
        this.totalPiecesNumbers = totalNumbers;
        this.pullVolumen = numberOfDraws;
        random = new Random();
    }

    public int getTotalPiecesNumbers() {
        return totalPiecesNumbers;
    }

    public int getPullVolumen() {
        return pullVolumen;
    }

    public List<Integer> draw() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < pullVolumen) {
            int pull = random.nextInt(totalPiecesNumbers) + 1;
            if (!numbers.contains(pull)) {
                numbers.add(pull);
            }
        }
        return numbers;




//    public static void main(String[] args) {
//
//        int[] lottery = new int[5];
//        int randomNum;
//
//        for (int i = 0; i < 5; i++) {
//            randomNum = (int) (Math.random() * 90);
//            for (int k = 0; k < i; k++) {
//                if (lottery[i] == randomNum)
//                {
//                    randomNum = (int) (Math.random() * 90);
//                }
//
//            }
//            lottery[i] = randomNum;
//        }
//
//        for (int i = 0; i < lottery.length; i++)
//            System.out.print(lottery[i] + " ");
//    }
    }
}