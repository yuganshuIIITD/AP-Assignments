package Assignment1;

public class citizen {
    String name;
    int age;
    Long unique_id;
    citizen(String name,int age,Long unique_id){
        this.name=name;
        this.age=age;
        this.unique_id=unique_id;
    }
    void printdetails(){
        System.out.println("Citizen Name: "+name+"  Age: "+age+"  Unique ID: "+unique_id);
    }
}
