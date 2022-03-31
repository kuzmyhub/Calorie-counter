import java.util.Scanner;
import java.util.HashMap;

public class StepTracker {
    HashMap<Integer, MonthData> monthToData = new HashMap<>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());

        }
    }

    class MonthData {
        HashMap<Integer, Integer> dataToSteps = new HashMap<>();

        public MonthData() {
            for (int i = 0; i < 30; i++) {
                dataToSteps.put(i, 0);
            }
        }
     }





     class InputUserMonthDataSteps {
        Scanner scanner = new Scanner(System.in);

        public Integer inputUserMonth() {
            while (true) {
                String userMonth = scanner.nextLine();
                int monthToNumber = 0;
                if (userMonth.equals("янв")) {
                    monthToNumber = 0;
                    return monthToNumber;
                } else if (userMonth.equals("февр")) {
                    monthToNumber = 1;
                    return monthToNumber;
                } else if (userMonth.equals("март")) {
                    monthToNumber = 2;
                    return monthToNumber;
                } else if (userMonth.equals("апр")) {
                    monthToNumber = 3;
                    return monthToNumber;
                } else if (userMonth.equals("май")) {
                    monthToNumber = 4;
                    return monthToNumber;
                } else if (userMonth.equals("июн")) {
                    monthToNumber = 5;
                    return monthToNumber;
                } else if (userMonth.equals("июл")) {
                    monthToNumber = 6;
                    return monthToNumber;
                } else if (userMonth.equals("авг")) {
                    monthToNumber = 7;
                    return monthToNumber;
                } else if (userMonth.equals("сент")) {
                    monthToNumber = 8;
                    return monthToNumber;
                } else if (userMonth.equals("окт")) {
                    monthToNumber = 9;
                    return monthToNumber;
                } else if (userMonth.equals("нояб")) {
                    monthToNumber = 10;
                    return monthToNumber;
                } else if (userMonth.equals("дек")) {
                    monthToNumber = 11;
                    return monthToNumber;
                } else {
                    System.out.println("Некорректный ввод. Попробуйте ещё раз.");
                }
            }
        }

         public Integer inputUserData() {
             Integer userData = scanner.nextInt();
             return userData;

         }

         public Integer inputUserSteps() {
             Integer userSteps  = scanner.nextInt();
             return userSteps;

         }

         public void savingIndicatorsInTheTable(Integer month, Integer data, Integer steps) {
             MonthData monthData = new MonthData();
             StepTracker stepTracker = new StepTracker();

             monthData.dataToSteps.replace(data, steps);
             stepTracker.monthToData.replace(month, monthData);

             System.out.println("В " + month + " месяце " + "ваша статистика" + stepTracker.monthToData.get(month));






         }
     }
}
