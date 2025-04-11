public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double CarsPerHour = 221 * speed;

        if (speed >= 5 && speed <= 8)
            CarsPerHour = CarsPerHour * 0.9;
        if (speed == 9)
            CarsPerHour = CarsPerHour * 0.8;
        if (speed == 10)
            CarsPerHour = CarsPerHour * 0.77;

        return CarsPerHour;
    }

    public int workingItemsPerMinute(int speed) {
        int carsPerMinute = ((int) Math.floor(productionRatePerHour(speed)) / 60);
        return carsPerMinute;
    }
}
