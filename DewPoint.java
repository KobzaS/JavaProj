/////////////////////////////////////////////////////////
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class DewPoint
{
	
	public void dewPoint_accept()
	{
	
	   String choice = "";

	   Accept stdin = new Accept();
      double begTemp, endTemp;
	   int relHum;
   
	   do 
      {
	   	System.out.println ("Please enter the starting air temperature in celsius; it must be above -4.5c and below 145c: ");
	   	begTemp = stdin.AcceptInputDouble();
         if (begTemp <= -4.5 || begTemp >= 145)
         {
	   		do
            {
	   			System.out.println ("The starting air temp must be above -4.5c and less than 145c please re-enter ");
	   			System.out.println ("Please enter the starting air temperature in celsius; it must be above -4.5c and below 145c: ");
	   			begTemp = stdin.AcceptInputDouble();
	   		}while (begTemp <= -4.5 || begTemp >= 145);
	   	}
	   	System.out.println ("Please enter the ending air temperature in celsius; it must be above -4.5c and below 145c: ");
	   	endTemp = stdin.AcceptInputDouble();
	   	if (endTemp >= 145 || endTemp <= -4.5)
         {
	   		do
            {
	   			System.out.println ("The ending air temperature must be above -4.5c and below 145c please re-enter ");
	   			System.out.println ("Please enter the ending air temperature in celsius; it must be above -4.5c and below 145c: ");
	   			endTemp = stdin.AcceptInputDouble();
	   		}while (endTemp >= 145 || endTemp <= -4.5);
	   	}
	   	System.out.println ("Please enter the relative humidity as an integer from 5% to 9%: ");
	   	relHum = stdin.AcceptInputInt();
	   	if (relHum < 5 || relHum > 9)
         {
	   		do
            {
	   			System.out.println ("Relative humidity must be between 5% and 9%. Please re-enter");
	   			System.out.println ("Please enter the relative humidity as an integer from 5% to 9%: ");
	   			relHum = stdin.AcceptInputInt();
	   		}while(relHum < 5 || relHum > 9);
	   	}
         choice = "e";
	   }while (choice != "e");
	   dewPointDisplay(begTemp, endTemp, relHum);
	   
	}
	
	public double dewPointCalc(double tempoCurTemp, double relHum)
   {			
		
		double interMath, expo, tempMath, tempMath2; 
		double dewTemp = 0;
		double frac = 0.125;
      
		if (relHum == 5)
		{
			interMath = relHum/100;
			expo = Math.pow(interMath, frac);
			tempMath = 112 + 0.9*tempoCurTemp;
			tempMath2 = 0.1*tempoCurTemp;
			dewTemp = (expo * tempMath + tempMath2 - 112);
			return dewTemp;
		}
		else if (relHum == 6) 
		{
			interMath = relHum/100;
			expo = Math.pow(interMath, frac);
			tempMath = 112 + 0.9*tempoCurTemp;
			tempMath2 = 0.1*tempoCurTemp;
			dewTemp = (expo * tempMath + tempMath2 - 112);
			return dewTemp;
		}
		else if (relHum == 7)
		{
			interMath = relHum/100;
			expo = Math.pow(interMath, frac);
			tempMath = 112 + 0.9*tempoCurTemp;
			tempMath2 = 0.1*tempoCurTemp;
			dewTemp = (expo * tempMath + tempMath2 - 112);
			return dewTemp;
		}
		else if (relHum == 8)
		{
			interMath = relHum/100;
			expo = Math.pow(interMath, frac);
			tempMath = 112 + 0.9*tempoCurTemp;
			tempMath2 = 0.1*tempoCurTemp;
			dewTemp = (expo * tempMath + tempMath2 - 112);
			return dewTemp;
		}
		else
		{
			interMath = relHum/100;
			expo = Math.pow(interMath, frac);
			tempMath = 112 + 0.9*tempoCurTemp;
			tempMath2 = 0.1*tempoCurTemp;
			dewTemp = (expo * tempMath + tempMath2 - 112);
			return dewTemp;
		}
	}
	
	public void dewPointDisplay(double begTemp, double endTemp, int relHum)
   {
	
	   double hum5, hum6, hum7, hum8, hum9, transTemp;
	   final String DEGREE = "\u00b0";
      String curTemp;
	   String form5, form6, form7, form8, form9;
	   char exit;
	   Accept stdin = new Accept();
	   Screen scrollScr = new Screen();
	   DecimalFormat decFor = new DecimalFormat("###0.0");
      
      if (begTemp > endTemp)
      {
         transTemp = begTemp;
         begTemp = endTemp;
         endTemp = transTemp;  
	   }
      
	   scrollScr.scrollScreen ('=', 90, 1);
      
	   if (relHum == 5)
	   {
	   	System.out.println("Temp\t\t5%");
	   	for (double i = begTemp; i < endTemp;)
	   	{
	   		hum5 = dewPointCalc(i, 5);
            form5 = decFor.format(hum5);
            curTemp = decFor.format(i);
	   		System.out.println(curTemp+DEGREE+"C\t\t"+form5);
	   		i += 0.5;
	   	}
	   	hum5 = dewPointCalc(endTemp, 5);
	   	form5 = decFor.format(hum5);
	   	System.out.println(endTemp+DEGREE+"C\t\t"+form5);
	   } 
      else if (relHum == 6)
	   {
	   	System.out.println("Temp\t\t5%\t\t6%");
	   	for (double i = begTemp; i < endTemp;)
	   	{
	   		hum5 = dewPointCalc(i, 5);
	   		hum6 = dewPointCalc(i, 6);
	   		form5 = decFor.format(hum5);
	   		form6 = decFor.format(hum6);
            curTemp = decFor.format(i);
	   		System.out.println(curTemp+DEGREE+"C\t\t"+form5+"\t\t"+form6);
	   		i += 0.5;
	   	}
	      hum5 = dewPointCalc(endTemp, 5);
	      hum6 = dewPointCalc(endTemp, 6);
	      form5 = decFor.format(hum5);
	      form6 = decFor.format(hum6);
	      System.out.println(endTemp+DEGREE+"C\t\t"+form5+"\t\t"+form6);
	   } 
      else if (relHum == 7)
	   {
	   	System.out.println("Temp\t\t5%\t\t6%\t\t7%");
	   	for (double i = begTemp; i < endTemp;)
	   	{
	   		hum5 = dewPointCalc(i, 5);
	   		hum6 = dewPointCalc(i, 6);
	   		hum7 = dewPointCalc(i, 7);
	   		form5 = decFor.format(hum5);
	   		form6 = decFor.format(hum6);
	   		form7 = decFor.format(hum7);
            curTemp = decFor.format(i);
	   		System.out.println(curTemp+DEGREE+"C\t\t"+form5+"\t\t"+form6+"\t\t"+form7);
	   		i += 0.5;
	   	}
	      hum5 = dewPointCalc(endTemp, 5);
	      hum6 = dewPointCalc(endTemp, 6);
	      hum7 = dewPointCalc(endTemp, 7);
	      form5 = decFor.format(hum5);
	      form6 = decFor.format(hum6);
	      form7 = decFor.format(hum7);
	      System.out.println(endTemp+DEGREE+"C\t\t"+form5+"\t\t"+form6+"\t\t"+form7);
	   }
      else if (relHum == 8)
	   {
	   	System.out.println("Temp\t\t5%\t\t6%\t\t7%\t\t8%");
	   	for (double i = begTemp; i < endTemp;)
	   	{
	   		hum5 = dewPointCalc(i, 5);
	   		hum6 = dewPointCalc(i, 6);
	   		hum7 = dewPointCalc(i, 7);
	   		hum8 = dewPointCalc(i, 8);
	   		form5 = decFor.format(hum5);
	   		form6 = decFor.format(hum6);
	   		form7 = decFor.format(hum7);
	   		form8 = decFor.format(hum8);
            curTemp = decFor.format(i);
	   		System.out.println(curTemp+DEGREE+"C\t\t"+form5+"\t\t"+form6+"\t\t"+form7+"\t\t"+form8);
	   		i += 0.5;
	   	}
	   	hum5 = dewPointCalc(endTemp, 5);
	   	hum6 = dewPointCalc(endTemp, 6);
	   	hum7 = dewPointCalc(endTemp, 7);
	   	hum8 = dewPointCalc(endTemp, 8);
	   	form5 = decFor.format(hum5);
	   	form6 = decFor.format(hum6);
	   	form7 = decFor.format(hum7);
	   	form8 = decFor.format(hum8);
	   	System.out.println(endTemp+DEGREE+"C\t\t"+form5+"\t\t"+form6+"\t\t"+form7+"\t\t"+form8);
	   }
      else
	   {
	   	System.out.println("Temp\t\t5%\t\t6%\t\t7%\t\t8%\t\t9%");
		   for (double i = begTemp; i < endTemp;)
		   {
		   	hum5 = dewPointCalc(i, 5);
		   	hum6 = dewPointCalc(i, 6);
		   	hum7 = dewPointCalc(i, 7);
		   	hum8 = dewPointCalc(i, 8);
		   	hum9 = dewPointCalc(i, 9);
		   	form5 = decFor.format(hum5);
		   	form6 = decFor.format(hum6);
		   	form7 = decFor.format(hum7);
		   	form8 = decFor.format(hum8);
		   	form9 = decFor.format(hum9);
            curTemp = decFor.format(i);
		   	System.out.println(curTemp+DEGREE+"C\t\t"+form5+"\t\t"+form6+"\t\t"+form7+"\t\t"+form8+"\t\t"+form9);
		   	i += 0.5;
		   }
		   hum5 = dewPointCalc(endTemp, 5);
		   hum6 = dewPointCalc(endTemp, 6);
		   hum7 = dewPointCalc(endTemp, 7);
		   hum8 = dewPointCalc(endTemp, 8);
		   hum9 = dewPointCalc(endTemp, 9);
		   form5 = decFor.format(hum5);
		   form6 = decFor.format(hum6);
		   form7 = decFor.format(hum7);
		   form8 = decFor.format(hum8);
		   form9 = decFor.format(hum9);
		   System.out.println(endTemp+DEGREE+"C\t\t"+form5+"\t\t"+form6+"\t\t"+form7+"\t\t"+form8+"\t\t"+form9);
      }  
   
	   Menu callMenu = new Menu();
	   System.out.println("Press \"e\" to exit, or hit any other letter and enter to continue");
	   exit = stdin.AcceptInputChar();
	   if (exit == 'e' || exit == 'E')
	   {
         scrollScr.scrollScreen(80);
	   	callMenu.mainmenu();
	   	callMenu.acceptselection();
	   }
	   else if (exit != 'e' && exit != 'E')
	   {
	   	dewPoint_accept();
	   }
   }
}
