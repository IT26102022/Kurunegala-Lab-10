import java.util.Scanner;
	public class IT26102022Lab10Q1{
			public static void main(String[]args){
				Scanner input = new Scanner(System.in);
				
				System.out.print("Enter the mark(0-100):");
				int mark =input.nextInt();
				
				System.out.print("\n");
				
				assert mark >= 0 && mark <= 100:"Invalid Mark";
				
				System.out.println("Mark is Validated");
				
				
				char grade;
					if(mark >=75)
						grade = 'A';
					else if(mark >= 60)
						grade ='B';
					else if(mark >= 50)
						grade ='C';
					else if(mark >= 40) 
						grade ='D';
					else
						grade='F';
					
					
					if(mark >=75)
						assert grade == 'A':"Incorrect Grade Assigned as A";
					else if(mark >= 60)
						assert grade == 'B':"Incorrect Grade Assigned as B";
					else if(mark >= 50)
						assert grade == 'C':"Incorrect Grade Assigned as C";
					else if(mark >= 40) 
						assert grade == 'D':"Incorrect Grade Assigned as D";
					else
						assert grade == 'F':"Incorrect Grade Assigned as F";
					
					
					System.out.println("The Grade for the Entered Mark is: "+ grade);
					
				
					
			}
	}