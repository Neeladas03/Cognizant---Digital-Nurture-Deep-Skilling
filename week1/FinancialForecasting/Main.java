
public class Main {
    public static void main(String[] args) {
        double initialValue = 10000;
        double rate = 0.05; // 5% growth
        int years = 10;

        System.out.println(" Forecast using Recursion:");
        double resultRecursive = ForecastCalculator.forecastRecursive(initialValue, rate, years);
        System.out.printf("Value after %d years: Rs: %.2f\n", years, resultRecursive);

        System.out.println("\n Forecast using Memoization:");
        Double[] memo = new Double[years + 1];
        double resultMemo = ForecastCalculator.forecastMemoized(initialValue, rate, years, memo);
        System.out.printf("Value after %d years: Rs: %.2f\n", years, resultMemo);
    }
}
