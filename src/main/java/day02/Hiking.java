package day02;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Tour> tours) {
        if (tours == null || tours.size() < 2) {
            throw new IllegalArgumentException("Input data Error.");
        }

        double sumHeight = 0;
        for (int i = 0; i < tours.size() - 1; i++) {
            if (tours.get(i).getHeight() < tours.get(i + 1).getHeight()) {
                sumHeight += tours.get(i + 1).getHeight() - tours.get(i).getHeight();
//        Math.max(tours.get(i+1).getHeight()-tours.get(i).getHeight(), 0);
            }
        }
        return sumHeight;
    }
}
