
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasDayWithoutBirds = false;
        int[] birdsLastWeek = this.getLastWeek();
        for (int i = 0; i < birdsLastWeek.length; i++) {
            if (birdsLastWeek[i] == 0) {
                hasDayWithoutBirds = true;
            }
        }
        return hasDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[] birdsLastWeek = this.getLastWeek();
        int amountOfBirds = 0;
        for (int i = 0; i < numberOfDays; i++) {
            if (i >= birdsLastWeek.length) {
                continue;
            } else {
                amountOfBirds += birdsLastWeek[i];
            }
        }
        return amountOfBirds;
    }

    public int getBusyDays() {
        int[] birdsLastWeek = this.getLastWeek();
        int busyDays = 0;
        for (int b : birdsLastWeek) {
            if (b >= 5)
                busyDays += 1;
        }
        return busyDays;
    }
}
