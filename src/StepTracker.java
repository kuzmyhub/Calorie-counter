import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class StepTracker {
    HashMap<Integer, MonthData> monthToDate = new HashMap<>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToDate.put(i, new MonthData());

        }
    }

    class MonthData {
        ArrayList<Integer> dateToCalories = new ArrayList<>();

        public MonthData() {
            for (int i = 0; i < 30; i++) {
                dateToCalories.add(0);

            }
        }
    }

}
