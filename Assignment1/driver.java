package Assignment1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Assignment1.vaccine> vaclist=new ArrayList<>();
        List<String> vlist=new ArrayList<>();
        List<hospitals> hoslist=new ArrayList<>();
        List<citizen> citlist=new ArrayList<>();
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
                vlist.add(name);
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
            }else if(option==3){
                System.out.println("Enter name of citizen to register ");;
                sc.nextLine();
                String name=sc.nextLine();
                System.out.println("Enter Age ");
                int age =sc.nextInt();
                System.out.println("Enter your 12 digit unique id ");
                Long id=sc.nextLong();
                if(age<18){
                    System.out.println("Only above 18 are allowed ");
                }else{
                    citizen c=new citizen(name, age,id);
                    citlist.add(c);
                    c.printdetails();
                    
                }
            }else if(option==4){
                System.out.println("Enter hospital id for which you want to create slot ");
                int id=sc.nextInt();
                System.out.println("Enter no of slots you want to create ");
                int n=sc.nextInt();
                for(int i=0;i<hoslist.size();i++){
                    if(hoslist.get(i).id==id){
                        hoslist.get(i).sl.create_slot(n, vlist);
                    }
                }

            }else if(option==5){
                
            }else if(option==6){
                System.out.println("Enter hospital id for which you want to get slots ");
                int id=sc.nextInt();
                for(int i=0;i<hoslist.size();i++){
                    if(hoslist.get(i).id==id){
                        hoslist.get(i).print_slots(vlist);
                    }
                }

            }else if(option==7){
                System.out.println("Enter your unique id ");
                Long id=sc.nextLong();
                for(int i=0;i<citlist.size();i++){
                    if(citlist.get(i).unique_id==id){
                        
                    }
                }

            }

        }

    }
}