package models;

public class Encoding {
    private String plainText;


    public String getPlainText() {
        return plainText;
    }

    static  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String encrypt(String plainText, int Key){
        plainText = plainText.toUpperCase();
        String getCipherText = "";
        for (int i=0;i<plainText.length(); i++){
            int charIndex = alphabet.indexOf(plainText.charAt(i));
            int newIndex = (charIndex  - Key)%26 ;
            if (newIndex <0){
                newIndex = alphabet.length() + newIndex;
            }
            char cipherChar = alphabet.charAt(newIndex);
            getCipherText = getCipherText  + cipherChar;
        }

        return getCipherText ;
    }

}
