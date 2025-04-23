class ReverseString {

    String reverse(String inputString) {
        String reverse = "";
        for (int i = 0; i < inputString.length(); i++) {
            reverse += inputString.charAt(inputString.length() - 1 - i);
        }
        return reverse;
    }

}
