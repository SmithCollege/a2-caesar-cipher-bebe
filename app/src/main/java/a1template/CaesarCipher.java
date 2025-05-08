// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

import java.util.Arrays;

public class CaesarCipher {

    /** Character array to store the letters in the alphabet in order */
    Character[] alphabet;

    /** DynamicArray object providing ArrayList-like operations for Characters */
    DynamicArray<Character> cipher;

    /** Private offset that tracks how many positions to shift the index for
    * This cipher */
    private int offset;

    /** Constructor that should define the instance variables, including
     * populating the alphabet
     * @param offset Offset to use when creating `cipher` of DynamicArray type
     */
    public CaesarCipher(int offset){
        this.offset = offset;
        this.alphabet = new Character[26];
        for (int i = 0; i < 26; i++) {
            this.alphabet[i] = Character.valueOf((char) ('a' + i));
        }
        this.cipher = new DynamicArray<Character>(offset, alphabet); // initializes cipher
        
    
        }
    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == val){
                System.out.println(i);
                return i; 
            } 
            }
            return -1;
            
            
    }
    
        
            
    
        

    

    /** Encode a message using the cipher
     * @param String message to encode
     * @return encoded message */  
    public String encode(String message){
        StringBuilder new_message = new StringBuilder(); // creates new_message for new chars to be added to
        for (int i = 0; i < message.length(); i++) { 
            char letter = message.charAt(i); // get individual letter as a char
            int char_index = findIndex(letter);
            if (char_index + offset < alphabet.length){
                char ciphered_letter = cipher.get(char_index, offset);
                new_message.append(ciphered_letter);
                
            } 
            else{
                int new_index = (alphabet.length - char_index)+ 1;
                char ciphered_letter = cipher.get(new_index);
                new_message.append(ciphered_letter); // gets char
            }
         
        } 
        System.out.println(new_message.toString());
        return new_message.toString();
        }

        
         
     

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        StringBuilder new_message = new StringBuilder(); // creates new_message for new chars to be added to
        for (int i = 0; i < message.length(); i++) { 
            char letter = message.charAt(i); // get individual letter as a char
            int char_index = findIndex(letter);
            if (char_index - offset > 0){
                char ciphered_letter = alphabet[char_index - offset];
                new_message.append(ciphered_letter);
                
            } 
            else{
                int new_index = (alphabet.length -char_index + 1);
                char ciphered_letter = alphabet[new_index];
                new_message.append(ciphered_letter); // gets char
            }
         
        } 
        System.out.println(new_message.toString());
        return new_message.toString();
        
        
    }


    public static void main(String[] args) {
        CaesarCipher caesar = new CaesarCipher(3);
        // caesar.findIndex('z');
        // caesar.encode("zebra");
        caesar.decode("cheud");
        
        //caesar.findIndex('f');
        // caesar.encode("bebe");
        // caesar.encode("hello");
        // caesar.findIndex('z');
        //caesar.encode("zello");

    
    }
}



    

