public class Converter {
    double kilometersPassed(int allStepsInMonth){
        double km = allStepsInMonth * 0.075;
        return km;
    }
    double burnedCalories(int allStepsInMonth){
        double kcals = allStepsInMonth * 0.05;
        return kcals;
    }
}
