public class Lasagna {

    private int minutesinOven = 40;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return this.minutesinOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesSpent) {
        return this.expectedMinutesInOven() - minutesSpent;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int amountLayers) {
        return 2 * amountLayers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int amountLayers, int minutesSpent) {
        return this.preparationTimeInMinutes(amountLayers) + minutesSpent;
    }
}
