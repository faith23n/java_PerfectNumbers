///////////////////////////////////////////
// Problem 6.24 - Perfect Numbers        //  
// Purpose - To create a program that    //
//       displays the perfect numbers    //
//       between 1 and 1000.             // 
// by. Nicole Anderson                   //
// Date - October 24, 2014               //  
///////////////////////////////////////////

public class PerfectNumbers
{
   // finds all the perfect numbers from 2 to 1000
   public void displayNumbers()
   {
      for ( int i = 2; i <= 1000; i++ )
      {
         String result = isPerfect( i );

         if ( result != null )
            System.out.printf ( "%d is perfect.\n\tFactors = %s\n", i, result );
      } // end for loop
   }// end displayNumbers   
   
   public static String isPerfect( int num )
   {
      int sum = 1;
      String factors = "1 ";

      for ( int digit = 2; digit <= num / 2; digit++ )// finds the perfect numbers and its factors
      {
         if ( num % digit == 0 )
         {
            sum += digit;
            factors += digit + " ";
         } // end if
      } // end for

      if ( sum == num )
         return factors;

      return null;
   } // end method isPerfect
} // end class PerfectNumbers