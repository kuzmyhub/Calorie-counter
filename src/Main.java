import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        StepTracker stepTracker = new StepTracker();
        StepTracker.MonthData monthData = stepTracker.new MonthData();
        StepTracker.InputUserMonthDataSteps inputUserMonthDataSteps = stepTracker.new InputUserMonthDataSteps();



        while (userInput != 0) {
            if (userInput == 1) {
                // kod "Ввести кол-во шагов за опр-й день"
                System.out.println("Введите название месяца\n" +
                        "Формат ввода:\n" +
                        "янв, февр, март, апр, май, июнь, июль, " +
                        "авг, сент, окт, нояб, дек");
                inputUserMonthDataSteps.inputUserMonth();
                while (inputUserMonthDataSteps.inputUserMonth()) {
                    System.out.println("Такого месяца нет. Попробуйте ещё раз!");
                    inputUserMonthDataSteps.inputUserMonth();
                }

                System.out.println("Укажите номер дня (от 1 до 30):");
                inputUserMonthDataSteps.inputUserData();

                System.out.println("Укажите количество шагов");
                inputUserMonthDataSteps.inputUserSteps();

            } else if (userInput == 2) {
                // kod "Напечатать статистику за опр-й мсяц"

            } else if (userInput == 3) {
                // kod "Изменить цель по кол-ву шагов"

            }


            printMenu();
            userInput = scanner.nextInt();
        }



    }

    private static void printMenu() {
        System.out.println("Целевое колличество шагов =\n " +
                "Выберете действие:\n" +
                "1 - Ввести колличество шагов за определённый день\n" +
                "2 - Напечатать статистику за определённый день\n" +
                "3 - Изменить цель по колличеству шагов в день\n" +
                "0 - Выйти из приложения");
    }


}
