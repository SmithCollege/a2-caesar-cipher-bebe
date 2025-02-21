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
    public CaesarCipher(int offset){
        this.offset = offset;
        this.alphabet = new Character[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = Character.valueOf((char) ('a' + i));
        }

        this.cipher = new DynamicArray<Character>(offset, alphabet); // initializes cipher 
        for (int i = 0; i < alphabet.length; i++){ // loop to add offset to cipher
            if (i + offset < alphabet.length){
                char letter = alphabet[i + offset]; // returns char at index + offset
                cipher.set(i, letter); // sets new offsetted character to index
            } 
            else{
                int beginning_offset = alphabet.length - (alphabet.length - offset);
                char letter = alphabet[beginning_offset]; // sets chars that would be out of bounds to the beginning of alphabet
                cipher.set(i, letter); // sets new offsetted character to index

            }
        }
        
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        int index = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == val){ 
                index = i; // gets the index of char in alphabet
            }
            }
            System.out.println(index);
            return index;
        
            
    }
        

    

    /** Encode a message using the cipher
     * @param String message to encode
     * @return encoded message */  
    public String encode(String message){
        int capacity = message.length();
        StringBuilder new_message = new StringBuilder(capacity); // creates new_message for new chars to be added to
        for (int i = 0; i < capacity; i++) { 
            char letter = message.charAt(i); // get individual letter as a char
            int char_index = findIndex(letter);
            char new_char = cipher.get(char_index); // sets new_char to index of cipher
            new_message.append(new_char); // adds new char to new message 
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
        int capacity = message.length();
        StringBuilder new_message = new StringBuilder(capacity); // creates new_message for new chars to be added to
        for (int i = 0; i < capacity; i++) { 
            char letter = message.charAt(i); // get individual letter as a char
            int char_index = findIndex(letter);
            for (int j = 0; i < alphabet.length; i++){ // loop to add offset to cipher
                if (j + offset < alphabet.length){
                    char new_letter = alphabet[i + offset]; // returns char at index + offset
                    cipher.set(i, new_letter); // sets new offsetted character to index
                } 
                else{
                    int beginning_offset = alphabet.length - (alphabet.length - offset);
                    char new_letter = alphabet[beginning_offset]; // sets chars that would be out of bounds to the beginning of alphabet
                    cipher.set(i, new_letter); // sets new offsetted character to index
    
                }
                }
            char new_char = cipher.get(char_index); // sets new_char to index of cipher
            new_message.append(new_char); // adds new char to new message 
        } 
        System.out.println(new_message.toString());
        return new_message.toString();
        
        
    }


    public static void main(String[] args) {
        CaesarCipher caesar = new CaesarCipher(3);
        // caesar.findIndex('a');
        // caesar.findIndex('m');
        caesar.encode("bebe");
        caesar.encode("hello");

    
    }
}


    

