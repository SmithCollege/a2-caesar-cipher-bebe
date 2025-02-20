// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

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
    CaesarCipher(int offset){
        this.offset = offset;
        Character[] alphabet = new Character[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = Character.valueOf((char) ('a' + i));
        }
        DynamicArray<Character> cipher = new DynamicArray<>(offset, alphabet);
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == val){
                return i;
            } 
            else{
                return null;
            }
        }
    }

    /** Encode a message using the cipher
     * @param String message to encode
     * @return encoded message */  
    public String encode(String message){
        for (int i = 0; i < message.length; i++) {
            String letter = message.charAt(i);
            // have a letter and want to encode it by adding an offset to that letter of the alphabet
            
            String encoded_letter = alphabet.DynamicArray.get(i, offset);
            String[] encoded_message = new String[message.length];
            message.DynamicArray.set(i + offset, letter);
             
        }
        }

        
         
     

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        // Fill in here and update return statement based on your code
        return new String(); // subtract offset from index
    }


    public static void main(String[] args) {
    }
    
}
