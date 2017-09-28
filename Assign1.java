import java.io.*;

class Menu
{    	
   static void mainmenu()
   {
      System.out.println("Derek Mennie & Steven Kobza Temperature Analysis MENU");
      System.out.println("");
      System.out.println("1. D)ew Point Temperature");   
      for (int i = 0; i < 5; i++) 
      {
         System.out.println("");
      }         
      System.out.println("0. E)xit");
      System.out.println("");
      System.out.println("Enter selection:");    
	}
   
   void acceptselection()
   {    
      boolean terminate = false;  
      Screen scrollscr = new Screen();
      Accept charin = new Accept();
      DewPoint dew = new DewPoint();  
      char check = charin.AcceptInputChar();
      
      while (terminate == false)
      {
         if (check == '0' || check == 'e' || check == 'E')
         {  
            terminate = true;
            System.exit(0);
         }
         else if (check == '1' || check == 'd' || check == 'D')
         {
            terminate = true;
            scrollscr.scrollScreen('=', 45, 1);
            System.out.println("");
            dew.dewPoint_accept();            
         }
         else 
         {
            scrollscr.scrollScreen(80);
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