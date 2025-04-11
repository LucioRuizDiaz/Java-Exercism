class SqueakyClean {
    static String clean(String identifier) {
        String returnString = "";
        for (int i = 0; i < identifier.length(); i++) {
            char caracter = identifier.charAt(i);
            if (caracter == ' ') {
                returnString += '_';
            } else if (caracter == '-') {
                i++;
                returnString += identifier.toUpperCase().charAt(i);
            } else if (caracter == '4') {
                returnString += "a";
            } else if (caracter == '3') {
                returnString += "e";
            } else if (caracter == '0') {
                returnString += "o";
            } else if (caracter == '1') {
                returnString += "l";
            } else if (caracter == '7') {
                returnString += "t";
            } else if (!Character.isLetter(caracter)) {
                continue;
            } else {
                returnString += identifier.charAt(i);
            }
        }
        return returnString;
    }

}
