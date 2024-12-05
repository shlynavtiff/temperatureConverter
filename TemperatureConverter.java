package loops;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] Args) {
        Scanner x = new Scanner(System.in);

        String choice = null;
        String continueChoice;
        String currentChoice = null;

        do {
            // Main menu
            if (choice == null || choice.equalsIgnoreCase("M")) {
                System.out.println("------------------------------------------");
                System.out.println("----------Temperature Converter-----------");
                System.out.println("------------------------------------------");
                System.out.println("Select a Conversion to perform: ");
                System.out.println("[A] Celsius to Fahrenheit");
                System.out.println("[B] Celsius to Kelvin");
                System.out.println("[C] Fahrenheit to Celsius");
                System.out.println("[D] Fahrenheit to Kelvin");
                System.out.println("[E] Kelvin to Celsius");
                System.out.println("[F] Kelvin to Fahrenheit");
                System.out.println("[X] To terminate the program");
                while (true) {
                    System.out.print("Enter conversion (A - F): ");
                    choice = x.next();

                    if (!choice.equalsIgnoreCase("A") && !choice.equalsIgnoreCase("B") &&
                        !choice.equalsIgnoreCase("C") && !choice.equalsIgnoreCase("D") &&
                        !choice.equalsIgnoreCase("E") && !choice.equalsIgnoreCase("F") &&
                        !choice.equalsIgnoreCase("X")) {
                        System.out.println("Invalid Choice. Please enter a valid value.");
                    } else {
                        break;
                    }
                }
            }

            double temp = 0; // Input temperature

            // Perform the conversion
            switch (choice.toUpperCase()) {
                case "A":
                    currentChoice = "A";
                    while (true) {
                    	System.out.println();
                    	System.out.println("---Celsius to Fahrenheit---");
                        System.out.print("Enter value to convert: ");
                        if (x.hasNextDouble()) {
                            temp = x.nextDouble();
                            break;
                        } else {
                            System.out.println("Invalid Input. Please enter a valid value to convert.");
                            x.next();
                        }
                    }
                    double resultA = (temp * 9 / 5) + 32;
                    System.out.println();
                    System.out.printf("%.2f°C = %.2f°F\n", temp, resultA);
                    break;
                    
                case "B":
                    currentChoice = "B";
                    while (true) {
                    	System.out.println();
                    	System.out.println("---Celsius to Kelvin---");
                    	System.out.print("Enter value to convert: ");
                    	if (x.hasNextDouble()) {
                    		temp = x.nextDouble();
                    		break;
                    	} else {
                    		System.out.println("Invalid Input. Please enter a valid value to convert.");
                            x.next();
                    	}
                    }        
                    double resultB = temp + 273.15;
                    System.out.println();
                    System.out.printf("%.2f°C = %.2fK\n", temp, resultB);
                    break;
                    
                case "C":
                    currentChoice = "C";
                    System.out.println();
                	System.out.println("---Fahrenheit to Celcius---");
                    System.out.print("Enter value to convert: ");
                    while (true) {
                    	if (x.hasNextDouble()) {
                    		temp = x.nextDouble();
                    		break;
                    	} else {
                    		System.out.println("Invalid Input. Please enter a valid value to convert.");
                            x.next();
                    	}
                    }
                    double resultC = (temp - 32) * 5 / 9;
                    System.out.println();
                    System.out.printf("%.2f°F = %.2f°C\n", temp, resultC);
                    break;
                    
                case "D":
                    currentChoice = "D";
                    System.out.print("Enter value to convert: ");
                    System.out.println();
                	System.out.println("---Fahrenheit to Kelvin---");
                    while (true) {
                    	if (x.hasNextDouble()) {
                    		 temp = x.nextDouble();
                    		 break;
                    	} else {
                    		System.out.println("Invalid Input. Please enter a valid value to convert.");
                    		 x.next();
                    	}
                    }
                   
                    double resultD = ((temp - 32) * 5 / 9) + 273.15;
                    System.out.println();
                    System.out.printf("%.2f°F = %.2fK\n", temp, resultD);
                    break;
                    
                case "E":
                    currentChoice = "E";
                    System.out.print("Enter value to convert: ");
                    System.out.println();
                	System.out.println("---Kelvin to Celcius---");
                    while (true) {
                    	if (x.hasNextDouble()) {
                    		temp = x.nextDouble();
                    		break;
                    	} else {
                    		System.out.println("Invalid Input. Please enter a valid value to convert.");
                    	}
                    }
                    
                    double resultE = temp - 273.15;
                    System.out.println();
                    System.out.printf("%.2fK = %.2f°C\n", temp, resultE);
                    break;
                    
                case "F":
                    currentChoice = "F";
                    System.out.print("Enter value to convert: ");
                    System.out.println();
                	System.out.println("---Kelvin to Fahrenheit---");
                    while (true) {
                    	if (x.hasNextDouble()) {
                    		temp = x.nextDouble();
                    		break;
                    	} else {
                    		System.out.println("Invalid Input. Please enter a valid value to convert.");
                    	}
                    }
                    double resultF = (temp - 273.15) * 9 / 5 + 32;
                    System.out.println();
                    System.out.printf("%.2fK = %.2f°F\n", temp, resultF);
                    break;
                    
                case "X":
                    System.out.println("The program will now close.");
                    x.close();
                    return;
                    
                default:
                    System.out.println("Invalid selection, please try again.");
                    break;
            }

            // Prompt user for next action
            System.out.println("\nDo you want to convert another temperature?");
            System.out.println("[Y] Repeat last conversion");
            System.out.println("[M] Main Menu");
            System.out.println("[X] Close the program");
            while (true) {
                continueChoice = x.next();
                if (!continueChoice.equalsIgnoreCase("Y") &&
                    !continueChoice.equalsIgnoreCase("M") &&
                    !continueChoice.equalsIgnoreCase("X")) {
                    System.out.println("Invalid Choice. Only select Y, M, or X.");
                } else {
                    break;
                }
            }

            // Handle user choice
            if (continueChoice.equalsIgnoreCase("Y")) {
                choice = currentChoice; // Repeat last conversion
            } else if (continueChoice.equalsIgnoreCase("M")) {
                choice = null; // Go back to main menu
            } else if (continueChoice.equalsIgnoreCase("X")) {
                System.out.println("The program will now close.");
                break;
            }

        } while (!"X".equalsIgnoreCase(continueChoice));

        x.close();
    }
}
