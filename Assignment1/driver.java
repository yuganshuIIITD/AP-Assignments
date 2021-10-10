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
                int gap;
                if(doses>1){
                System.out.println("Enter the gap between doses ");
                    gap=sc.nextInt();
                }else{
                    gap=0;
                }
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
                h.sl=new slots();
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
                System.out.println("Enter patient unique id: ");
                Long citid=sc.nextLong();
                System.out.println("1. Search by pincode");
                System.out.println("2. Search by vaccine");
                System.out.println("3. Exit ");
                System.out.println("Enter option");
                int opt=sc.nextInt();
                List<Integer>AH=new ArrayList<>();
                if(opt==1){
                    System.out.println("Enter pincode");
                    int pincode=sc.nextInt();
                    for(int i=0;i<hoslist.size();i++){
                        if(hoslist.get(i).pincode==pincode){
                            AH.add(hoslist.get(i).id);
                            System.out.println(hoslist.get(i).id + " " + hoslist.get(i).name);
                        }
                    }
                    System.out.println("Enter hospital id: ");
                    int hid=sc.nextInt();
                    for(int i=0;i<hoslist.size();i++){
                        if(hoslist.get(i).id==hid){
                            hoslist.get(i).print_slots(vlist);
                            System.out.println("Choose slot ");
                            int in=sc.nextInt();
                            int index=0;
                            for(Integer a: hoslist.get(i).sl.slot.keySet()){
                                int ans=a;
                                int vacindex;
                                if(index==in){
                                    int temp=hoslist.get(i).sl.slot.get(a);
                                    vacindex=hoslist.get(i).sl.type.get(a);
                                    String vacname=vlist.get(vacindex);
                                    for(int j=0;j<citlist.size();j++){
                                        if(citlist.get(j).unique_id==citid){
                                            citlist.get(j).no_of_doses++;
                                            citlist.get(j).vaccine=vacname;
                                            for(int k=0;k<vaclist.size();k++){
                                                if(vaclist.get(k).name==vacname){
                                                    if(citlist.get(j).no_of_doses<vaclist.get(k).doses){
                                                        citlist.get(j).vaccination_status="PARTIALLY VACCINATED";
                                                    }else{
                                                        citlist.get(j).vaccination_status="FULLY VACCINATED";
                                                    }
                                                }
                                            }    
                                        }
                                    }
                                    hoslist.get(i).sl.slot.replace(a, temp,temp-1);
                                    break;
                                }else{
                                    index++;
                                }
                            }
                           
                        }
                    }
                }else if(opt==2){
                    sc.nextLine();
                    System.out.println("Enter name of vaccine ");
                    String invac=sc.nextLine();
                    int vindex=0;
                    while(vlist.get(vindex)!=invac){
                        vindex++;
                    }
                    for(int i=0;i<hoslist.size();i++){
                        int temp=0;
                        for(Integer a: hoslist.get(i).sl.type.keySet()){
                            if(hoslist.get(i).sl.type.get(a)==vindex){
                                temp=1;
                            }
                        }
                        if(temp==1){
                            System.out.println(hoslist.get(i).id + " " + hoslist.get(i).name);
                        }
                    }
                    System.out.println("Enter hospital id: ");
                    int hid=sc.nextInt();
                    for(int i=0;i<hoslist.size();i++){
                        if(hoslist.get(i).id==hid){
                            hoslist.get(i).print_slots(vlist);
                            System.out.println("Choose slot ");
                            int in=sc.nextInt();
                            int index=0;
                            for(Integer a: hoslist.get(i).sl.slot.keySet()){
                                int ans=a;
                                int vacindex;
                                if(index==in){
                                    int temp=hoslist.get(i).sl.slot.get(a);
                                    vacindex=hoslist.get(i).sl.type.get(a);
                                    String vacname=vlist.get(vacindex);
                                    for(int j=0;j<citlist.size();j++){
                                        if(citlist.get(j).unique_id==citid){
                                            citlist.get(j).no_of_doses++;
                                            citlist.get(j).vaccine=vacname;
                                            System.out.println(citlist.get(j).name+" vaccinated with "+ vacname);
                                            for(int k=0;k<vaclist.size();k++){
                                                if(vaclist.get(k).name==vacname){
                                                    if(citlist.get(j).no_of_doses<vaclist.get(k).doses){
                                                        citlist.get(j).vaccination_status="PARTIALLY VACCINATED";
                                                    }else{
                                                        citlist.get(j).vaccination_status="FULLY VACCINATED";
                                                    }
                                                }
                                            }    
                                        }
                                    }
                                    hoslist.get(i).sl.slot.replace(a, temp,temp-1);
                                    break;
                                }else{
                                    index++;
                                }
                            }
                           
                        }
                    }
                }


                
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
                        System.out.println("Vaccination Status: " + citlist.get(i).vaccination_status);
                        System.out.println("Vaccine given: "+ citlist.get(i).vaccine);
                        System.out.println("Number of Doses given: " + citlist.get(i).no_of_doses);
                        
                    }
                }

            }

        }

    }
}