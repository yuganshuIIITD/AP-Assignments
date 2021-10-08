package Assignment1;
public class vaccine {
    String name;
    int doses;
    int gap;
    vaccine(String name,int doses,int gap){
        this.name=name;
        this.doses=doses;
        this.gap=gap;
    }
    void printdetails(){
        System.out.println("Vaccine Name: "+name+", Number of Doses: "+doses+", Gap Between Doses: "+gap);
    }    
}
