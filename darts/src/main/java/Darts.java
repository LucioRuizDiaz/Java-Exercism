class Darts {
    int score(double xOfDart, double yOfDart) {
        int score = 0;
        if (vector(xOfDart, yOfDart) <= 10) {
            score = 1;
        }
        if (vector(xOfDart, yOfDart) <= 5) {
            score = 5;
        }
        if (vector(xOfDart, yOfDart) <= 1) {
            score = 10;
        }
        return score;
    }

    double vector(double xOfDart, double yOfDart) {
        return Math.sqrt((xOfDart * xOfDart) + (yOfDart * yOfDart));
    }
}
