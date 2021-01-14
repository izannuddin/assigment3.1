import java.util.Scanner;
import java.util.*;
public class aassigment3 {

	public static void main(String[] args) {
		
		
			printInfo();
			printitems();
			printtotal();

		}	
			public static void printInfo() {
			Scanner sc = new Scanner(System.in);	
				
			
			System.out.println("**************WELCOME TO IZANS BEUTY**********");
			System.out.println("Please tell me about yourself.");
			System.out.println("What is your name?");
			String name = sc.next();
			System.out.println("How old are you? ");
			int age = sc.nextInt();
			System.out.println("What is your id number?");
			int id = sc.nextInt();
			System.out.println("What is your gender?");
			char gender = sc.next().charAt(0);
			System.out.println("What is your phone number?");
			int phone = sc.nextInt();
			System.out.println(" ");
			
			
			
			System.out.println("\nName: " + name);
			System.out.println("Age: " + age);
			System.out.println("Id number: " + id);
			System.out.println("Gender: " + gender);
			System.out.println("HP: " + phone);
			
			}
			
			public static void printitems() {	
			
			
			System.out.println("product makeup");
			System.out.println();
			
			System.out.println("TODAY IS A SPECIAL DAY PROMOSI!!!!!!!");
			System.out.println();
			
			String[] makeup = {"lipstick","maskara","eyeliner","foundation","blusher"};
			
			System.out.println(makeup[0] + " RM20");
			System.out.println(makeup[1] + " RM25");
			System.out.println(makeup[2] + " RM15");
			System.out.println(makeup[3] + " RM30");
			System.out.println(makeup[4] + " RM10");
			}
			
			
			
			public static void printtotal() { 
			
				Scanner in = new Scanner(System.in);
				 
				System.out.println("****************************************************");
				int q1= 0, q2=0, q3=0, q4=0, q5=0;
				int item1=0,item2=0,item3=0,item4=0,item5=0;
				
				String[] makeup = {"lipstick","maskara","eyeliner","foundation","blusher"};
				int price [] = {20,25,15,30,10};
				
				
				System.out.print("HOW MANY YOU WANT?");
				System.out.println();
				
				
				System.out.println(makeup[0]);
				q1=in.nextInt();
				item1 = (price[0] *q1);
				System.out.println(makeup[0] + " RM " + item1);	
				System.out.println();
				
				System.out.print("quantity product you want:");
				System.out.println(makeup[1]);
				q2=in.nextInt();
				item2 = (price[1]*q2);
				System.out.println(makeup[1] + " RM " + item2);
				System.out.println();
				
				
				System.out.print("quantity product you want:");
				System.out.println(makeup[2]);
				 q3=in.nextInt();
				item3 = (price[2]*q3);
				System.out.println(makeup[2] + " RM " + item3);
				System.out.println();
				
				System.out.print("quantity product you want:");
				System.out.println(makeup[3]);
				q4=in.nextInt();
				item4 = (price[3]*q4);
				System.out.println(makeup[3] + " RM " + item4);
				System.out.println();
				
				System.out.print("quantity product you want:");
				System.out.println(makeup[4]);
				q5=in.nextInt();
				item5 = (price[4]*q5);
				System.out.println(makeup[4] + " RM " + item5);
				System.out.println();
				
				System.out.println();
				double total = (item1+item2+item3+item4+item5);
				
				
				System.out.println("Total price : RM"+ total);
				
				}
		}
	}

}
