import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int retry;
	int typeChoice;	
		
		
			System.out.println("===============Welcome to BMI Calculator! ==============\n");
									
		System.out.println(" Pick a type of computing:\n");
		
	do {
		
		System.out.println(" 1. Metric System BMI");
		System.out.println(" 2. Imperial System BMI");
		
		System.out.print(" Enter your choice here: ");
		typeChoice = sc.nextInt();
		
		
		if(typeChoice == 1){
			
		float weight, height;
		
		
		System.out.println(" \nYou chose Metric Sytem BMI"); 
		
	while (true) {	
	System.out.print(" \nEnter your Weight (Kilograms/Kg): ");
		weight = sc.nextFloat();
		
		if (weight >= 20 && weight <=460){
			break;
		}
			System.out.println(weight + " is out of range or invalid, please input a weight between 20kg and 460kg.\n");
		}
		
		while (true) {
		System.out.print(" Enter your Height (meters/m): ");
		height = sc.nextFloat();
		
		if (height >=0.80 && height <= 2.60){
			break;
		}
			System.out.println(height + " is out of range or invalid, please input a height between 0.80m and 2.60m.\n");
		}
	
	float totBmi =  weight / (height * height);		
		
		System.out.printf(" Your BMI is: %.2f", totBmi); 
		
		if (totBmi <= 18.5){
			System.out.println(" \nYou are underweight.\n" ); 
		}else if(totBmi <= 24.9){
			System.out.println(" \nYou are on normal weight.\n" ); 
		} else if(totBmi <= 29.9){
			System.out.println(" \nYou are overweight.\n" );
		}else if(totBmi<= 39.9){
			System.out.println(" \nYou are obese.\n" );
		} else if(totBmi >= 40.0){
			System.out.println(" \nYou are morbidly obese.\n" );
		}else{
			System.out.println(" Please try again.\n" ); 
		}
				
		} else if(typeChoice == 2){
			
			float pounds, inches;
			
			System.out.println(" \nYou chose Imperial Sytem BMI"); 
			
			while (true){
			System.out.print(" \nEnter your Weight (Pounds/lb): ");
		pounds = sc.nextFloat();
		
		if (pounds > 44.0 && pounds <= 1014.1){
			break;
		}
			System.out.println(pounds + " is out of range or invalid, please input a weight between 44.1 lb and 1014.1 lb.\n");
			}
			
			while(true){
		System.out.print(" Enter your Height (Inches/in): ");
		inches = sc.nextFloat();
		
		if (inches >=31.5 && inches <= 102.4){
			break;
		}
			System.out.println(inches + "is out of range or invalid, please input a height between 31.5 in and 102.4 in.\n");
			
		}
		
		float totIBmi =  (pounds * 703) / (inches * inches);		
		
		System.out.printf(" Your BMI is: %.2f", totIBmi); 
		if (totIBmi <= 18.5){
			System.out.println(" \nYou are underweight.\n" ); 
		}else if(totIBmi <= 24.9){
			System.out.println(" \nYou are on normal weight.\n" ); 
		} else if(totIBmi <= 29.9){
			System.out.println(" \nYou are overweight.\n" );
		}else if(totIBmi<= 39.9){
			System.out.println(" \nYou are obese.\n" );
		} else if(totIBmi >= 40.0){
			System.out.println(" \nYou are morbidly obese.\n" );
		}else{
			System.out.println(" Please try again.\n" ); 
		}
		
		}else{
			System.out.println(" Please choose 1-2 only. ");
			}
	
			while (true) {
    System.out.print("\nDo you want to continue? (1 for YES, 0 for NO): ");
    retry = sc.nextInt();

    if (retry == 1 || retry == 0) {
        break;
    }
    
    System.out.println("Invalid choice. Please enter 1 or 0 only.");
}
		
		} while (retry == 1);	
		
		System.out.println(" Thank you for using my BMI Calculator");
		
		sc.close();
	}

}
