package models;



public class Decoding {

    private String cipherText;


    public String getCipherText() {
        return cipherText;
    }
    static  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String decrypt (String cipherText, int Key) {
        cipherText = cipherText.toUpperCase();
        String getPlainText = "";
        for (int i =0; i <cipherText.length(); i ++){
            int charIndex = alphabet.indexOf(cipherText.charAt(i));
            int newIndex = (charIndex + Key) %26;
            char plainChar = alphabet.charAt(newIndex);
            getPlainText = getPlainText +plainChar;

        }
        return getPlainText;


    }

}
