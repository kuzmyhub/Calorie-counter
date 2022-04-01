import java.util.Scanner;
import java.util.HashMap;

public class StepTracker {
    HashMap<Integer, MonthData> monthToData = new HashMap<>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());

        }
    }

    static class MonthData {
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
            System.out.println("Введите название месяца\n" +
                    "Формат ввода:\n" +
                    "янв, февр, март, апр, май, июнь, июль, " +
                    "авг, сент, окт, нояб, дек");
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
             System.out.println("Укажите номер дня (от 1 до 30):");
             while (true) {
                 Integer userData = scanner.nextInt();
                 userData--;
                 if ((userData >= 0) && (userData <= 29)) {
                     return userData;
                 } else {
                     System.out.println("Некорректный ввод. Попробуйте ещё раз.");
                 }
             }
         }

         public Integer inputUserSteps() {
             System.out.println("Укажите количество шагов");
             while (true) {
                 Integer userSteps = scanner.nextInt();
                 if (userSteps >= 0){
                     return userSteps;
                 } else {
                     System.out.println("Некорректный ввод. Попробуйте ещё раз.");
                 }

             }

         }

         public void savingIndicatorsInTheTable(Integer month, Integer data, Integer steps) {
             MonthData monthData = new MonthData();
             StepTracker stepTracker = new StepTracker();

             monthData.dataToSteps.replace(data, steps);
             stepTracker.monthToData.replace(month, monthData);

             System.out.println("В " + (month + 1) + "-м месяце ваша статистика " + stepTracker.monthToData.get(month+1));
         }
     }

     class Statistic {
        MonthData monthData = new MonthData();
        StepTracker stepTracker = new StepTracker();


        public void printStatistic(Integer month, Integer data, Integer steps) {

            System.out.println("Количество пройденых шагов по дням в" + (month + 1) + "-м месяце:\n");

        }



     }
}
