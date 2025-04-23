class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numeroString = "" + numberToCheck;
        int digitos[] = new int[numeroString.length()];
        int digitoArmstrong = 0;
        for (int i = 0; i < numeroString.length(); i++) {
            digitos[i] = numeroString.charAt(i) - '0';
        }

        for (int digito : digitos) {
            digitoArmstrong += Math.pow(digito, digitos.length);
        }

        return numberToCheck == digitoArmstrong;
    }

}
