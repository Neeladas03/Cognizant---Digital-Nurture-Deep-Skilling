
public class ForecastCalculator {

    // Recursive method to calculate future value
    public static double forecastRecursive(double initialValue, double rate, int years) {
        if (years == 0) return initialValue;
        return forecastRecursive(initialValue, rate, years - 1) * (1 + rate);
    }

    // Optimized method using memoization
    public static double forecastMemoized(double initialValue, double rate, int years, Double[] memo) {
        if (years == 0) return initialValue;
        if (memo[years] != null) return memo[years];
        memo[years] = forecastMemoized(initialValue, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }
}
