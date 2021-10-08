package Assignment1;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class slots {
    HashMap<Integer,Integer> slot;
    HashMap<Integer,Integer> type;
    slots(){
        this.slot=new HashMap<>();
        this.type=new HashMap<>();
    }
    void create_slot(int no,List<String> v){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<no;i++){
            System.out.println("Enter day for "+i+" slot");
            int day=sc.nextInt();
            System.out.println("Enter number of slots for this day ");
            int s=sc.nextInt();
            System.out.println("Select vaccine ");
            for(int j=0;j<v.size();j++){
                String temp=v.get(j);
                System.out.println(j+". "+temp);
            }
            int vac=sc.nextInt();
            if(slot.containsKey(day)){
                int a=slot.get(day);
                int b=type.get(day);
                slot.replace(day, a, a+s);
                type.replace(day,b,vac);

            }else{
                slot.put(day, s);
                type.put(day, vac);
            }
        System.out.println("Slot added by hospital for day: "+day+" Available quantity: "+s+" of vaccine "+v.get(type.get(day)));
        }

    }
}
