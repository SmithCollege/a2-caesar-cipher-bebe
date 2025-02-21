// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    private T[] array; // inputted array
    private int offset; // amount for offset

    


    // Write a constructor to make a new DynamicArray Object from an array
    public DynamicArray(int offset, T[] array){
        this.offset = offset;
        this.array = array;
    

    }

    // Now implement the methods from IndexAccess?

    /** Returns the value stored at a given index
     * @param i index of element to read
     * @return value stored at the given index
     */
    public T get(int i){
        T array_element = array[i];
        return array_element;

    }

    /** Returns the value stored at a given index plus the offset
     * @param i index of element to read
     * @param offset adjust index by this value
     * @return value stored at the given index
     */
    public T get(int i, int offset){
        T array_element = array[i + offset];
        return array_element;

    }

    /** Stores the given value at the given index
     * @param i index of locaßtion to store
     * @param val value to store at given index
     */
    public void set(int i, T val){
        array[i] = val;

    }

}