public class JedliksToyCar {

    private int meters;
    private int battery = 100;

    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + this.meters + " meters";
    }

    public String batteryDisplay() {
        String battery = "";
        if (this.battery < 1)
            battery = "Battery empty";
        else {
            battery = "Battery at " + this.battery + "%";
        }
        return battery;
    }

    public void drive() {
        if (this.battery > 0) {
            this.meters += 20;
            this.battery--;

        }
    }
}
