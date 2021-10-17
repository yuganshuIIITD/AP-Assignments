package Assignment2;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("Welcome to Backpack");
            System.out.println("1. Enter as instructor");
            System.out.println("2. Enter as student");
            System.out.println("3. Exit");
            int in =sc.nextInt();
            if(in==3){
                break;
            }else if(in==2){
                System.out.println("1. View lecture matirial ");
                System.out.println("2. View Assesments");
                System.out.println("3. Submit Assesments");
                System.out.println("4. View Grades");
                System.out.println("5. View Comments");
                System.out.println("6. Add Comments");
                System.out.println("7. Logout");
                int input = sc.nextInt();
                if(input==7){
                    break;
                }else if(input==1){

                }


            }else if(in==1){
                System.out.println("1. Add class material");
                System.out.println("2. Add Assesment");
                System.out.println("3. View Lecture material");
                System.out.println("4. View assesment");
                System.out.println("5. Grade assesment");
                System.out.println("6. Close assesment");
                System.out.println("7. View comments");
                System.out.println("8. Add comment");
                System.out.println("9. Logout");
                int input=sc.nextInt();
                if(input==9){
                    break;
                }else if(input==1){
                    System.out.println("1. Add lecture slides");
                    System.out.println("2. Add  video lecture");
                    int i=sc.nextInt();
                    if(i==1){
                        System.out.println("Enter topic of slides");
                        sc.nextLine();
                        String topic=sc.nextLine();
                        System.out.println("Enter no slides");
                        int no=sc.nextInt();
                        
                    }else if(i==2){

                    }
                }
            
            }
            
        }
    }
}
