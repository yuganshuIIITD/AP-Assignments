package Assignment1;

import java.util.List;

public class hospitals {
    String name;
    int pincode;
    int id;
    slots sl;
    hospitals(String name, int pincode,int id){
        this.name=name;
        this.pincode=pincode;
        this.id=id;
    }    
    void printdetail(){
        System.out.println("Hospital Name : "+name+", Pincode : "+pincode);
        System.out.println("Unique ID : "+id);
    }
    void print_slots(List<String> vlist){
        for(Integer a: sl.slot.keySet()){
            System.out.println("Day: "+ a +" vaccine "+vlist.get(sl.type.get(a))+" Available Quantity: "+sl.slot.get(a));
        }

    }
}
