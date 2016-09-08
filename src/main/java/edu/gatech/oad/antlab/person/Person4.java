package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Ashima
 *  @version 1.2
 */
public class Person4 {
  /** Holds the persons real name */

  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        int size = input.length();
        char[] a = new char[size];
        char temp = 'a';
        int pos = 0;
        int t = 0;

        while (t < size) {
            temp = input.charAt(t);
            temp = (char)(temp + 1);
            a[pos] = temp;
            pos++;
            t++;
        }

      String end = new String(a);
      return end;
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

}

