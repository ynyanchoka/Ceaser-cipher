package models;



public class Decoding {

    private String cipherText;
    private static final int SHIFT_FACTOR = 5;


    public String getCipherText() {
        return cipherText;
    }
    static  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String decrypt (String cipherText, int Key) {
        cipherText = cipherText.toUpperCase();
        String getPlainText = "";
//        if ( " "){
//            return "";
//        }
        for (int i =0; i <cipherText.length(); i ++){
            int charIndex = alphabet.indexOf(cipherText.charAt(i));
            int newIndex = (charIndex + Key) %26;
            char plainChar = alphabet.charAt(newIndex);
            getPlainText = getPlainText +plainChar;

        }
        return getPlainText;


    }

}
