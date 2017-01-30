/** The class StringArrayTools implements a variety of basic array tasks
  * using an array of strings.
  * 
  * The array has a fixed length MAX_NUMS but the actual number of elements
  * that are used can vary.
  * 
  * @author Amanda Young 
  */

import java.util.Scanner;

public class StringArrayTools
{
  
  private String[] arrayData;
  private int arrayCount;
  public final int MAX_NUMS = 100;
  
  // ------------------ CONSTRUCTOR ----------------------------
  /** The contsructor merely creates the array.
    * It does not fill it with any data.  That is left up to 
    * the fillRandom or fillKeyboard methods.
    */
  
  public StringArrayTools()
  {
    arrayData = new String[MAX_NUMS];
    arrayCount = 0;
  }
  
  /** Returns the number of objects in the array.
    * @return the count of items in the array. */
  public int getCount()
  {
    return arrayCount;
  }
  
  // ------------------- METHODS TO FILL THE ARRAY -------------------------
  /** Adds an element to the end of the array. 
    * @param n The element to add
    * @return whether the element was successfully added
    */
  public boolean addItem (String s)
  {
    if (arrayCount < MAX_NUMS)
    {
      arrayData[arrayCount] = s;
      arrayCount++;
      return true;
    }
    else
      return false;
  }
  
    /** Fills the array nums with integers from 1 to n
    * @param n Upper bound for numbers with which to fill the array.
    * @param count the array to fill.  Returns a modified array.
    */
  /**
  public void fillRandom (int n, int count) // fill random up to 100 and 3 (100,3) n = 100 count = 3 
  {
    if (count > MAX_NUMS)       // check that it's not too many items
      count = MAX_NUMS;
    for (int i = 0; i < count; i++)
      addItem((string)(Math.random() * s) + 1);
  }
  */
  
  /** Fills the array with strings entered by the user
    * @param nums the array to fill.  Returns a modified array.
    */
  public void fillKeyboard ()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println ("Please enter new strings on different lines.");
    System.out.println ("Use a string with length 0 to signal the end of the list.");
    
    arrayCount = 0;
    String s = keyboard.nextLine();
    while (s.length() != 0)                 // stop input a string with a lenth of 0 
    {
      addItem(s);
      s = keyboard.nextLine();
    }
    keyboard.close();
  }
  
  // -------------------- METHODS TO WORK WITH THE ARRAY --------------------------
  /** Prints the array, spaces between numbers.
    */
  public void printArray ()
  {
    for (int i = 0; i < arrayCount; i++)
      System.out.print (arrayData[i]);
  }
  
  /** Finds the sum of an integer array
    * @return the sum of the elements in the array
    */
  /**
  public int sumArray ()
  {
    int sum = 0;
    for (int i = 0; i < arrayCount; i++)
      sum = sum + arrayData[i]; // doesnt make sense with strings 
    return sum;
  }
  **/
  
  /** Finds the largest String of the array
    * @return the largest string in the array 
    **/
    
  public String getMax () 
{
  String MaxString = arrayData [0];
  for (int i=1; i<arrayCount; i++) 
  {
    if (arrayData[i].compareTo(MaxString) > 0)
          MaxString = arrayData[i];
  }
return MaxString;
}

 
  /** Finds the smallest number of the integer array
    * @return the smallest number 
    **/
  public String getMin() 
{
  String minString = arrayData[0];
  for (int i=0; i<arrayCount; i++) 
  {
    if (arrayData[i].compareTo(minString) < 0)
          minString = arrayData [i];
  }
return minString;
}
  
  /** Finds the location of the mac string in the array
    * @return the location of the max string in the array  
    **/
  
  public int getMaxIndex() 
  {
    int n = 0;
    
    for (int i =1; i <arrayCount; i++)
    {
      if (arrayData[i].compareTo(arrayData[n]) > 0) //same as the original get max
      {
        n = i; 
      }
    }
    return n; 
  }
  
  

  /** Find the min strings of the integer array 
    * @return the min string of the array 
    **/
  
 public int getMinIndex()
   {
    int n = 0;
    
    for (int i =1; i <arrayCount; i++)
    {
      if (arrayData[i].compareTo(arrayData[n]) < 0) //same as the original get min
      {
        n = i; 
      }
    }
    return n; 
  }
  
    
  
  /** Tests the various array tools */
  public static void main (String[] args)
  {
    StringArrayTools myArray = new StringArrayTools();
    //myArray.fillRandom(100, 12);
    myArray.fillKeyboard ();
    myArray.printArray ();
    System.out.println ("There are " + myArray.getCount() + " strings in the array.");
    //System.out.println ("The sum is " + myArray.sumArray());
    
    // Un-comment these lines one at a time after you have written the appropriate code
       System.out.println ("The largest item is " + myArray.getMax() ); 
       System.out.println ("The largest item is at index " + myArray.getMaxIndex());

       System.out.println ("The smallest item is " + myArray.getMin() );
       System.out.println ("The smallest item is at index " + myArray.getMinIndex());
    
  }
}
