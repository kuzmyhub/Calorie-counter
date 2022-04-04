import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        StepTracker stepTracker = new StepTracker();
        StepTracker.Input input = stepTracker.new Input();
        StepTracker.Statistic statistic = stepTracker.new Statistic();

        while (userInput != 0) {
            if (userInput == 1) {
                // kod "Ввести кол-во шагов за опр-й день"

                int month = input.inputMonth();

                int data = input.inputData();

                int steps = input.inputSteps();

                statistic.saveAll(month, data, steps);

            } else if (userInput == 2) {
                // kod "Напечатать статистику за опр-й мсяц"

                int month = input.inputMonth();

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
