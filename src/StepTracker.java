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

        @Override
        public String toString() {

            return "1-й день: " + dataToSteps.get(0).toString() + ", " +
                    "2-й день: " + dataToSteps.get(1).toString() + ", " +
                    "3-й день: " + dataToSteps.get(2).toString() + ", " +
                    "4-й день: " + dataToSteps.get(3).toString() + ", " +
                    "5-й день: " + dataToSteps.get(4).toString() + ", " +
                    "6-й день: " + dataToSteps.get(5).toString() + ", " +
                    "7-й день: " + dataToSteps.get(6).toString() + ", " +
                    "8-й день: " + dataToSteps.get(7).toString() + ", " +
                    "9-й день: " + dataToSteps.get(8).toString() + ", " +
                    "10-й день: " + dataToSteps.get(9).toString() + ", " +
                    "11-й день: " + dataToSteps.get(10).toString() + ", " +
                    "12-й день: " + dataToSteps.get(11).toString() + ", " +
                    "13-й день: " + dataToSteps.get(12).toString() + ", " +
                    "14-й день: " + dataToSteps.get(13).toString() + ", " +
                    "15-й день: " + dataToSteps.get(14).toString() + ", " +
                    "16-й день: " + dataToSteps.get(15).toString() + ", " +
                    "17-й день: " + dataToSteps.get(16).toString() + ", " +
                    "18-й день: " + dataToSteps.get(17).toString() + ", " +
                    "19-й день: " + dataToSteps.get(18).toString() + ", " +
                    "20-й день: " + dataToSteps.get(19).toString() + ", " +
                    "21-й день: " + dataToSteps.get(20).toString() + ", " +
                    "22-й день: " + dataToSteps.get(21).toString() + ", " +
                    "23-й день: " + dataToSteps.get(22).toString() + ", " +
                    "24-й день: " + dataToSteps.get(23).toString() + ", " +
                    "25-й день: " + dataToSteps.get(24).toString() + ", " +
                    "26-й день: " + dataToSteps.get(25).toString() + ", " +
                    "27-й день: " + dataToSteps.get(26).toString() + ", " +
                    "28-й день: " + dataToSteps.get(27).toString() + ", " +
                    "29-й день: " + dataToSteps.get(28).toString() + ", " +
                    "30-й день: " + dataToSteps.get(29).toString();
            }
        }





     class Input {
        Scanner scanner = new Scanner(System.in);

        public Integer inputMonth() {
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

         public Integer inputData() {
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

         public Integer inputSteps() {
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
     }

    class Statistic {
        StepTracker stepTracker = new StepTracker();

        public void saveAll (Integer month, Integer data, Integer steps) {
            stepTracker.monthToData.computeIfAbsent(month, m -> new MonthData()).dataToSteps.put(data, steps);
            System.out.println("В " + (month + 1) + "-м месяце ваша статистика: " + stepTracker.monthToData.get(month));
        }

        public void printStatistic(Integer month) {
            System.out.println("Ваша статистика:\n" + stepTracker.monthToData.get(month) + "\n");
        }
    }
}
