public class Screen
{
	public static void scrollScreen(int numscroll)
    {
      for (int i = 0; i < numscroll; i++){
         //System.out.println(/b);
         System.out.println("");         
      }
      // clear the screen or a certain number of lines
		// depending on what you passed to it    
    }

    public static void scrollScreen(char displaychar, int numchar, int numline)
    {
       // display a certain number of lines
		 // using a certain character
		 // depending on what you passed to it. 
	    for (int a = 0; a < numline; a++) {
         System.out.println("");
         for (int b = 0; b < numchar; b++) {
            System.out.print(displaychar);
         } 
          
       }
       System.out.println("");
	 }     
}
