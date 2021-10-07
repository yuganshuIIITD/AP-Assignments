package Assignment1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Assignment1.vaccine> vaclist=new ArrayList<>();
        List<hospitals> hoslist=new ArrayList<>();
        int hosid=100000;
        while(true){
            System.out.println("CoWin Portal initialized...");
            System.out.println("................................\n");
            System.out.println("1. Add Vaccine");
            System.out.println("2. Register Hospital");
            System.out.println("3. Register Citizen");
            System.out.println("4. Add Slot for Vaccination");
            System.out.println("5. Book Slot for Vaccination");
            System.out.println("6. List all slots for a hospital");
            System.out.println("7. Check Vaccination Status");
            System.out.println("8. Exit");
            System.out.println("Enter query number you want to perform");
            int option=sc.nextInt();
            if(option==8){
                break;
            }else if(option==1){
                System.out.println("Enter the name of vaccine ");
                sc.nextLine();
                String name=sc.nextLine();
                System.out.println("Enter number of total doses required ");
                int doses=sc.nextInt();
                System.out.println("Enter the gap between doses ");
                int gap=sc.nextInt();
                vaccine v = new vaccine(name, doses, gap);
                vaclist.add(v);
                v.printdetails();
            }else if(option==2){
                System.out.println("Enter name of hospital ");
                sc.nextLine();
                String hos_name=sc.nextLine();
                System.out.println("Enter hospital pincode ");
                int pincode=sc.nextInt();
                hospitals h =new hospitals(hos_name, pincode, hosid);
                hoslist.add(h);
                h.printdetail();
                hosid++;
            }

        }

    }
}