import java.util.Scanner;

public class StepTracker {
    double mediumSteps = 0;
    int series = 0;
    int maxStepsInDay = 0;
    int integerNumberOfSteps = 10000;
    int allStepsInMonth = 0;
    MonthData[] monthToData;
    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    int taskBySteps( int task){
        integerNumberOfSteps = task;
        return integerNumberOfSteps;
    }
    class MonthData{
        int[] day = new int[30];
        int series = 0;
        int stepsPerMonth = 0;
        int maxStepsInDay = 0;
        void printStepsInMonth(){
            System.out.println("Пройдено шагов по дням:");
            for(int i = 0;i < day.length;i++){
                System.out.print("["+(i + 1) +"-й день:" + day[i] + "]");
            }  System.out.println(" ");
        }
        void StepsInDai(int b,int z){


            if (z>=0){
            day[b-1] = z;
                System.out.println("Количество шагов за этот день сохранено.");
        } else {
                System.out.println("Количество шагов не должно быть отрицательным. ");
    }
        }
        int allSteps(int allStepsInMonth){
            for (int i=0;i < day.length;i++){
                allStepsInMonth = allStepsInMonth + day[i];
            } return allStepsInMonth;
        }
        int maxSteps(int maxStepsInDay){
            for(int i = 0;i < day.length;i++){
                if (day[i] > maxStepsInDay){
                    maxStepsInDay = day[i];
                }
            } return maxStepsInDay;
        }
        void mediumStep(double mediumSteps){
            for (int m : day){
                mediumSteps += m;
            }
            System.out.println("Среднее количество шагов за день - " + mediumSteps/day.length);
    }
    int goodSeries(int series,int integerNumberOfSteps){
            int x = 0;
            for (int i = 0;i < day.length;i++){
                if(day[i] >= integerNumberOfSteps){
                    x = x + 1;
                } else if (x > series){
                    series = x;
                   x=0;
                } else {
                    x= 0;
                }
            } return series;
    }

} }
