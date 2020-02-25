package epam.Logger;


import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double principle,rateOfInterest,timeInYears;
		int numberOfTimesToCompound;
		Logger logger=LogManager.getLogger();
		InterestCalculator object=new InterestCalculator();
		logger.error("1.Simple Interest:");
		logger.error("2.Compound Interest");
		logger.error("Enter your choice:");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:logger.error("Enter principal amount to calculate simple interest");
				principle=scanner.nextDouble();
				logger.error("Enter rate of interest :");
				rateOfInterest=scanner.nextDouble();
				logger.error("Enter time in years:");
				timeInYears=scanner.nextInt();
				logger.error("Simple interest is :"+object.calculateSimpleInterest(principle, rateOfInterest, timeInYears));
				break;
		case 2:logger.error("Enter principal amount to calculate compound interest");
				principle=scanner.nextDouble();
				logger.error("Enter rate of interest :");
				rateOfInterest=scanner.nextDouble();
				logger.error("Enter time in years:");
				timeInYears=scanner.nextDouble();	
				logger.error("Enter number of times to be compounded :");
				numberOfTimesToCompound=scanner.nextInt();
				logger.error("Compound interest is :"+object.calculateCompoundInterest(principle, rateOfInterest, timeInYears,numberOfTimesToCompound));
				break;
		default:logger.error("Enter a valid input!!");
				break;
		}
		
	}

}

