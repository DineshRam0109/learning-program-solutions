public class FinancialForecast {

    public static double forecastRecursive(double initial, double rate, int years) {
        if (years == 0) return initial;
        return forecastRecursive(initial, rate, years - 1) * (1 + rate);
    }

    public static double forecastIterative(double initial, double rate, int years) {
        double result = initial;
        for (int i = 1; i <= years; i++) {
            result *= (1 + rate);
        }
        return result;
    }

    public static double forecastOptimized(double initial, double rate, int years) {
        return initial * Math.pow(1 + rate, years);
    }

    public static void main(String[] args) {
        double initialAmount = 10000;
        double annualRate = 0.10;
        int years = 5;

        System.out.printf("Initial Amount: Rs.%.2f\n", initialAmount);
        System.out.println("Growth Rate: 10% per year");
        System.out.println("Time Period: " + years + " years\n");

        double valueRecursive = forecastRecursive(initialAmount, annualRate, years);
        double valueIterative = forecastIterative(initialAmount, annualRate, years);
        double valueOptimized = forecastOptimized(initialAmount, annualRate, years);

        System.out.printf("Recursive Forecast: Rs.%.2f\n", valueRecursive);
        System.out.printf("Iterative Forecast: Rs.%.2f\n", valueIterative);
        System.out.printf("Optimized Forecast: Rs.%.2f\n", valueOptimized);
    }
}
