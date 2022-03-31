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

        public void inputUserMonth() {
            while (true) {
                String userMonth = scanner.nextLine();
                boolean isEqualsMonth = userMonth.equals("янв") ||
                        userMonth.equals("февр") ||
                        userMonth.equals("март") ||
                        userMonth.equals("апр") ||
                        userMonth.equals("май") ||
                        userMonth.equals("июнь") ||
                        userMonth.equals("июль") ||
                        userMonth.equals("авг") ||
                        userMonth.equals("сент") ||
                        userMonth.equals("окт") ||
                        userMonth.equals("нояб") ||
                        userMonth.equals("дек");
                if (isEqualsMonth) {
                    break;
                } else {
                    System.out.println("Некорректный ввод. Попробуйте ещё раз.");
                }
            }
        }

         public void inputUserData () {
             Integer userData = scanner.nextInt();

         }

         public void inputUserSteps () {
             Integer userSteps  = scanner.nextInt();

         }

         public void enteringIndicatorsInTheTable() {

         }
     }
}
