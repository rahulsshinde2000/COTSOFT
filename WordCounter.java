/*TASK 2 WordCounter

1. Prompt the user to enter a text or provide a file to count the words.
2. Read the input text or file and store it in a string.
3. Split the string into an array of words using space or punctuation as delimiters.
4. Initialize a counter variable to keep track of the number of words.
5. Iterate through the array of words and increment the counter for each word encountered.
6. Display the total count of words to the user.

You can further enhance the project by adding features such as:

7. Ignoring common words or stop words.
8. Providing statistics like the number of unique words or the frequency of each word.
9. Implementing input validation to handle empty inputs or file errors.
10. Adding a graphical user interface (GUI) for a more user-friendly experience.
*/
import java.io.*;
import java.util.Scanner;  
   
public class WordCounter   
{  
    public static void main(String[] args) 
     {
      int i,count=1;
         Scanner sc=new Scanner(System.in);
       
				
        System.out.print("Enter the string : ");
          String name = sc.nextLine();


          for(i=0;i<name.length();i++)
	    {
	       if(name.charAt(i)==' '&&name.charAt(i+1)!=' ')
               {
                 count++;
		          }	
      } 
           
          
        System.out.println("Number of words present in given string: " + count);  
				 
    }  
}
