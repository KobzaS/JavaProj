/////////////////////////////////////////////////////////
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class DewPoint
{
	
	public void dewPoint_accept()
	{
	// called from acceptselection().
	// Here you accept the various values to calculate the dew point
	// Hint: a do/while loop. The main exit character here is 'e'/'E'	
	Scanner stdin = new Scanner(System.in);
	
	String choice = "";

	String tempoBegTemp, tempoEndTemp, tempoRelHum;
   double begTemp, endTemp;
	int relHum;

	do {
		System.out.println ("Please enter  START air temp in celsius (decimal) MUST be ABOVE -4.5: ");
		tempoBegTemp = stdin.nextLine();
      begTemp = Double.parseDouble (tempoBegTemp);
		if (tempoBegTemp == "e"){
			choice = "e";}
		
        else if (begTemp <= -4.5){
			while (begTemp <= -4.5){
				System.out.println ("That number was not above 4.5c. Please try again ");
				tempoBegTemp = stdin.nextLine();
            begTemp = Double.parseDouble(tempoBegTemp);}
		}
		System.out.println ("Please enter  END air temp in celsius (decimal) MUST be BELOW 145: ");
		tempoEndTemp = stdin.nextLine();
		endTemp = Double.parseDouble(tempoEndTemp);
		if (tempoEndTemp == "e"){
			choice = "e";
		} 
		else if (endTemp >= 145){
			while (endTemp >= 145){
				System.out.println ("That number was not below 145c. Please try again ");
				tempoEndTemp = stdin.nextLine();
            endTemp = Double.parseDouble(tempoEndTemp);}
		}
		System.out.println ("Please enter relative humidity (integer) FROM 5% to (9% MAX): ");
		tempoRelHum = stdin.nextLine();
		relHum = Integer.parseInt(tempoRelHum);
		if (relHum < 5){
			System.out.println ("Relative humidity was too small, defaulting to 5%");
			relHum = 5;
		}
		if (tempoRelHum == "e"){
			choice = "e";
		}
      choice = "e";
      } while (choice != "e");
	   dewPointCalc(begTemp, endTemp, relHum);

	}   

	
	
	public void dewPointCalc(double begTemp, double endTemp, int relHum){
	// here you calculate the results, from the values you passed to it from dewPoint_Accept.			
		double difTemp = (endTemp - begTemp)*2;
		int differenceTemp;
		double interMath, expo, dewTemp;
		double static frac = 1/8;
      	/*System.out.println(difTemp);
      	differenceTemp = (int)difTemp;
      	System.out.println(differenceTemp);*/
      
    	for (double i = begTemp; i < endTemp;){
      
    		if (relHum >= 5){
				interMath = 5/100;
				expo = Math.pow(interMath, frac);
				dewTemp = (expo * (112 + 0.9*i) + 0.1*i - 112);
				dewPointDisplay (i, dewTemp, 5);
				if (relHum >= 6){
					interMath = 6/100;
					expo = Math.pow(interMath, frac);
					dewTemp = (expo * (112 + 0.9*i) + 0.1*i - 112);
					dewPointDisplay (i, dewTemp, 6);
					if (relHum >= 7){
						interMath = 7/100;
						expo = Math.pow(interMath, frac);
						dewTemp = (expo * (112 + 0.9*i) + 0.1*i - 112);
						dewPointDisplay (i, dewTemp, 7);
						if (relHum >= 8){
							interMath = 8/100;
							expo = Math.pow(interMath, frac);
							dewTemp = (expo * (112 + 0.9*i) + 0.1*i - 112);
							dewPointDisplay (i, dewTemp, 8);
							if (relHum == 9){
								interMath = 9/100;
								expo = Math.pow(interMath, frac);
								dewTemp = (expo * (112 + 0.9*i) + 0.1*i - 112);
								dewPointDisplay (i, dewTemp, 9);
							}
						}
					}
				}
			}
    		i += 0.5;
    	}
		
	}
	
	/*
	public ...... dewPointDisplay(.............)
    {
	//Here you display the output in a tabular format 
	//You will need to use a nested for loop

	   
	}*/
 
   public static void main (String Args[])
   {
      DewPoint dp = new DewPoint();
      dp.dewPoint_accept();
   }  
}
