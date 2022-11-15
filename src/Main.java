import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        StepTracker stepTracker = new StepTracker();
        Converter convert = new Converter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловть в Step Tracker!");
        System.out.println("Что желаете ?");
        printMenu();

        int userInput = scanner.nextInt();
        while(userInput != 0) {
            if (userInput == 1) {
                System.out.println("Выберите месяц от 1-го до 12-го.");
                int i = scanner.nextInt();
                System.out.println("выберите день от 1-го до 30-го.");
                int b = scanner.nextInt();
                System.out.println("Введите количество шагов.");
                int z = scanner.nextInt();
                stepTracker.monthToData[i-1].StepsInDai(b,z);
                System.out.println(" ");
                printMenu();
                userInput = scanner.nextInt();
            }
            else if (userInput==2) {
                System.out.println("Выберите месяц от 1-го до 12-го.");
                int i = scanner.nextInt();
                stepTracker.monthToData[i-1].printStepsInMonth();
                System.out.println(" ");
                System.out.println("Всего пройдено шагов- " + stepTracker.monthToData[i-1].allSteps(stepTracker.allStepsInMonth));
                System.out.println(" ");
                System.out.println("Максимальное количество шагов за один день - "+ stepTracker.monthToData[i-1].maxSteps(stepTracker.maxStepsInDay));
                System.out.println(" ");
                stepTracker.monthToData[i-1].mediumStep(stepTracker.mediumSteps);
                System.out.println(" ");
                System.out.println("Пройдено за месяц в км - "+convert.kilometersPassed(stepTracker.monthToData[i-1].allSteps(stepTracker.allStepsInMonth)));
                System.out.println(" ");
                System.out.println("Количество сожжённых килокалорий - "+ convert.burnedCalories(stepTracker.monthToData[i-1].allSteps(stepTracker.allStepsInMonth)));
                System.out.println(" ");
                System.out.println("Дней подряд, когда количество шагов было больше цели - " + stepTracker.monthToData[i-1].goodSeries(stepTracker.series,stepTracker.integerNumberOfSteps) );
                System.out.println(" ");
                printMenu();
                userInput = scanner.nextInt();
            }
            else if(userInput==3){
                System.out.println("Нынешняя цель - "+ stepTracker.integerNumberOfSteps);
                System.out.println("Какую ставим цель?");
                int task = scanner.nextInt();
                System.out.println("Значение изменено.");
                System.out.println("Цель по количеству шагов в день - " + stepTracker.taskBySteps(task));
                System.out.println(" ");
                printMenu();
                userInput = scanner.nextInt();
            }
            else if (userInput== 4){
                break;
            }
            else {
                System.out.println("Такой функции нет!");
                System.out.println(" ");
                printMenu();
                userInput = scanner.nextInt();
            }
        }
        System.out.println("Приложение закрыто.");
        System.out.println("До свидания!");
    }

    private static void printMenu(){
        System.out.println("1. Вести количество шагов за определённый день.");
        System.out.println("2. Узнать статистику за определённый месяц.");
        System.out.println("3. Изменить цель по количеству шагов за день.");
        System.out.println("4. Выйти из  приложения.");
    }}
