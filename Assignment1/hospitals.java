package Assignment1;

public class hospitals {
    String name;
    int pincode;
    int id;
    hospitals(String name, int pincode,int id){
        this.name=name;
        this.pincode=pincode;
        this.id=id;
    }    
    void printdetail(){
        System.out.println("Hospital Name : "+name+",Pincode : "+pincode);
        System.out.println("Unique ID : "+id);
    }
}
