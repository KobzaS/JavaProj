import java.io.*;

class Menu
{    	
    static void mainmenu()
    {
       // Display the main menu
       System.out.println("Derek Mennie & Steven Kobza Temperature Analysis MENU");
       System.out.println("");
       System.out.println("1. D)ew Point Temperature");
       
       for (int i = 0; i < 5; i++) {
         System.out.println("");
       }
         
       System.out.println("0. E)xit");
       System.out.println("");
       System.out.println("Enter selection:");    
	 }

    void acceptselection()
    {
      // use a loop to keep accepting user input
		// unless 0/e/E is entered 
      boolean terminate = false;
      
      Screen scrollscr = new Screen();
      Accept charin = new Accept();
      DewPoint dew = new DewPoint();
      
      
      char check = charin.AcceptInputChar();
      
      while (terminate == false){
         if (check == '0' || check == 'e' || check == 'E'){
            // EXIT CODE
            terminate = true;
            System.exit(0);
         }
         
         else if (check == '1' || check == 'd' || check == 'D'){
            // SELECTION CODE
            terminate = true;
            scrollscr.scrollscreen('=', 45, 1);
            System.out.println("");
            dew.dewPoint_accept();
            
            System.out.println("Press 'e' to exit, or any other letter and <Enter> to continue: ");
            check = charin.AcceptInputChar();
            
            if (check == 'e'){
               scrollscr.scrollscreen(10);
               mainmenu();
               acceptselection();
            }
            else{
               
            }
            break;
            
         }
         
         else {
            scrollscr.scrollscreen(10);
            
            mainmenu();
            
            check = charin.AcceptInputChar();  
         } 
      }
   }
}

class Assign1
{
        public static void main(String arg[]) 
        {        
			Menu m = new Menu();
         m.mainmenu();
         
         m.acceptselection();  
        }

}