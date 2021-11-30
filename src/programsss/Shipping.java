package programsss;

import java.util.Scanner;

public class Shipping {
	static int priority, distance,temp;
    static double weight;
	private static Scanner a;
	public static void main(String[] args) {
          a = new Scanner(System.in);
          //Scanner a = new Scanner(System.in);
          System.out.println("Enter Priority of shipping:");
          System.out.println("        For non urgent Shipping Enter '1'");
          System.out.println("        For Urgent Shipping Enter '2'");
          priority=a.nextInt();
          System.out.println("Enter Distance of the shipment:");
          distance=a.nextInt();
          System.out.println("Enter weight of the package:");
          weight=a.nextDouble();
          switch (priority) {
		case 1:
			if(weight<=5) {
				System.out.println("Dispach the package by post");
			} else if(distance<=250) {
				System.out.println("Dispatch the package by Lorry");
			} else {
				System.out.println("Dispatch the package by Train");
			} break;
		case 2:
			if(distance<50) {
				temp = 1;
			} else if (distance>50) {
				temp = 2;
			}
			switch (temp) {
			case 1:if(weight<100) {
					System.out.println("Dispatch the package by Van");
				} else {
					System.out.println("Dispatch the package by Train");
				}
				break;
			case 2: System.out.println("Dispatch the package by Train");
                break;
			default:
				break;
			}
            break;
		default:
			break;
		}   
	}
}
