public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean moreThanFive = daysSkipped >= 5;
        double multiplier = moreThanFive ? 0.85 : 1;
        return multiplier;
    }

    public int bonusMultiplier(int productsSold) {
        boolean moreThan20 = productsSold >= 20;
        int multiplier = moreThan20 ? 13 : 10;
        return multiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = 1000;
        finalSalary = (finalSalary * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        boolean cap = finalSalary >= 2000;
        finalSalary = cap ? 2000 : finalSalary;
        return finalSalary;

    }
}
