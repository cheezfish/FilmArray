package filmarray;

import java.util.Scanner;

/**
 * @author Imran Aziz 15:11 11/10/17
 */
public class FilmArray 
{

   public static void main(String[] args) 
    {
        
       films();
       
    } //end method main
   
    public static void films() 
    {
       
        Scanner scan = new Scanner(System.in); //there is now a scanner
       
        String[] FilmNames = 
        {
           "BLADE RUNNER 2049", "THE LEGO NINJAGO MOVIE",
           "KINGSMAN: THE GOLDEN CIRCLE", "IT",
           "THE MOUNTAIN BETWEEN US"
        }; //here's my array of movies
       
       int total = 0; //declares and initalises my total gross
       
        int GrossArray[] = new int[5]; //creates an array of film grosses based on input
	for (int i = 0; i < FilmNames.length; i++) 
        { //runs through the array of film names 
			System.out.print("Movie " + (FilmNames[i]) + " grossed (in millions of dollars): ");
                        try
                        { //blocks answers that aren't integers
                            GrossArray[i] = Integer.parseInt(scan.nextLine());
                        }
                        catch(IllegalArgumentException ex) 
                        {
                            System.out.println("Nope, use a number, and a sensible one at that");
                            films();
                        }
                        total = total + GrossArray[i];//adds to the total as input is given
        }
               
        System.out.println("Total box office gross is: $" + total + " million"); //prints total 
                
        getMax(GrossArray, FilmNames);
        
    } //end method films
   
    public static void getMax(int[] GrossArray, String[] FilmNames)
    { 
        int maxValue = GrossArray[0]; 
        int m = 0;
        for(int i=1;i < GrossArray.length;i++)
        { 
            if(GrossArray[i] > maxValue)
            { 
                maxValue = GrossArray[i]; //gives us the array position of the max value
                m = i; //a variable to use with film titles that equals i
            } 
        } //end for loop
        System.out.println("Highest grossing movie is: " + FilmNames[m]);// gives us the film with the highest gross
        System.exit(0);
        
    }//end method getMax
        
}//end class