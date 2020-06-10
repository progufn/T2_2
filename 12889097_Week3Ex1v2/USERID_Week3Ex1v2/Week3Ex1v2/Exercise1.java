
/**
 * Mastery Test Week 3 Exercise 1. Thread 2.
 * - Swap two numbers.
 * 
 * @author (your name) 
 */
public class Exercise1
{
    public static int[] swap(int[] elements)
    {
        int temp;
        
        // In the coming weeks, the lecturer will explain all of the code above. But for now here is an explanation:
        // 1. In the code above we have provided an integer array "elements", containing two elements.
        // 2. In the code above we have also provided another integer variable called "temp".
        // In the space provided below, write code to swap the values in "elements[0]" and "elements[1]".
        // Do NOT initialise "elements[0]" or "elements[1]". Just write the three lines that swap the values.
        // Add your code BELOW this line. Do NOT change anything ABOVE this comment line.
        
        temp = elements[0];
        elements[0] = elements[1];
        elements[1] = temp;
        
       
        // Add your code ABOVE this line. Do NOT change anything BELOW this comment line.
        return elements;
    }
}
