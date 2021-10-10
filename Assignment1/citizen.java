package Assignment1;

public class citizen {
    String name;
    int age;
    String unique_id;
    String vaccination_status;
    int due_date;
    String vaccine;
    int no_of_doses;
    citizen(String name,int age,String unique_id){
        this.name=name;
        this.age=age;
        this.unique_id=unique_id;
        vaccination_status="REGISTERED";
        no_of_doses=0;
        this.due_date=-1;
        }
    void printdetails(){
        System.out.println("Citizen Name: "+name+"  Age: "+age+"  Unique ID: "+unique_id);
    }
}
