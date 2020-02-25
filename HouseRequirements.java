package epam.Logger;


import java.util.Scanner;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseRequirements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger= LogManager.getLogger();
		Scanner scannerObject= new Scanner(System.in);
		HouseConstructionCostEstimation ob=new HouseConstructionCostEstimation();
		logger.error("Enter material standard:");
		logger.error("Choose the material standard from below list:");
		logger.error("1.Standard material");
		logger.error("2.Above standard material");
		logger.error("3.High standard material");
		logger.error("4.High standard material with fully automated home");
		logger.error("Enter your choice:");
		int choice=scannerObject.nextInt();
		logger.error("Enter area of house : ");
		int area=scannerObject.nextInt();
		switch(choice) {
		case 1:logger.error("Estimated cost for the construction of house of area "+area+" square feet is "+ob.estimateCost(area,1200)+"INR");
				break;
		case 2:logger.error("Estimated cost for the construction of house of area "+area+" square feet is "+ob.estimateCost(area,1500)+"INR");
		case 3:logger.error("Estimated cost for the construction of house of area "+area+" square feet is "+ob.estimateCost(area,1800)+"INR");
				break;
		case 4:logger.error("Estimated cost for the construction of house of area "+area+" square feet is "+ob.estimateCost(area,2500)+"INR");
				break;
		default :logger.error("Choose a valid material!");
				break;
		}
	}

}