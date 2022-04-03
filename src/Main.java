import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        StepTracker stepTracker = new StepTracker();
        StepTracker.MonthData monthData = new StepTracker.MonthData();
        StepTracker.InputUserMonthDataSteps inputUserMonthDataSteps = stepTracker.new InputUserMonthDataSteps();
        StepTracker.Statistic statistic = stepTracker.new Statistic();

        while (userInput != 0) {
            if (userInput == 1) {
                // kod "Ввести кол-во шагов за опр-й день"

                int month = inputUserMonthDataSteps.inputUserMonth();

                int data = inputUserMonthDataSteps.inputUserData();

                int steps = inputUserMonthDataSteps.inputUserSteps();

                inputUserMonthDataSteps.savingIndicatorsInTheTable(month, data, steps);

            } else if (userInput == 2) {
                // kod "Напечатать статистику за опр-й мсяц"

                int month = inputUserMonthDataSteps.inputUserMonth();

                statistic.printStatistic(month);

            } else if (userInput == 3) {
                // kod "Изменить цель по кол-ву шагов"

            }


            printMenu();
            userInput = scanner.nextInt();
        }



    }

    private static void printMenu() {
        System.out.println("Выберете действие:\n" +
                "1 - Ввести колличество шагов за определённый день\n" +
                "2 - Напечатать статистику за определённый месяц\n" +
                "3 - Изменить цель по колличеству шагов в день\n" +
                "0 - Выйти из приложения");
    }


}
