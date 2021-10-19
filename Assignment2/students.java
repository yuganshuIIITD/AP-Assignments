package Assignment2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class students extends participants{
    private String name;
    HashMap<String,Integer> assmarks=new HashMap<>();
    HashMap<String,String> assfile=new HashMap<>();
    ArrayList<String> sub_ass=new ArrayList<>();
    HashMap<String,String> assprof=new HashMap<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void submit_ass(course C){
        Scanner sc=new Scanner(System.in);
        if(sub_ass.size()==C.ass.size()+C.quizs.size()){
            System.out.println("No pending assignments ");
        }else{
        System.out.println("Pending assignments : ");
        int index=0;
        HashMap<Integer,String> tmap=new HashMap<>();
        for(int i=0;i<C.ass.size();i++){
            if(!sub_ass.contains(C.ass.get(i).getProblem_statement())){
                System.out.println("ID: "+index+" Assignment "+C.ass.get(i).getProblem_statement()+" Max marks "+ C.ass.get(i).getMarks());
                tmap.put(index, C.ass.get(i).getProblem_statement());
                index++;
                
            }
            System.out.println("\n");
        }
        int index2=0;
        for(int j=0;j<C.quizs.size();j++){
            int temp=index+index2;
            if(!sub_ass.contains(C.quizs.get(j).getQuestion())){
                System.out.println("ID: "+ temp+ " Question: "+ C.quizs.get(j).getQuestion());
                tmap.put(temp,C.quizs.get(j).getQuestion());
                index2++;
            }
        }
        System.out.println("Enter id of assignment: ");
        int id=sc.nextInt();
        String ques=tmap.get(id);
        System.out.println("Enter filename of assignment : ");
        sc.nextLine();
        String fn=sc.nextLine();
        if(fn.length()>4){
        if(!fn.substring(fn.length()).equals(".mp4")  || !fn.substring(fn.length()-4).equals(".zip")){
            System.out.println("Invalid input format");

        }else{
            sub_ass.add(ques);
            assfile.put(ques,fn);
            assmarks.put(ques, -1);
        }
    }else{
        System.out.println("Invalid input format");
    }
    }
    }
    void show_grade(course C){
        System.out.println("Graded submissions ");
        for(String a: assmarks.keySet()){
            if(assmarks.get(a)!=-1){
            System.out.println("submission: "+ a + " Marks: " + assmarks.get(a));
            }
        }
        System.out.println("Ungraded submissions");
        for(String b: assmarks.keySet()){
            if(assmarks.get(b)==-1){
                System.out.println("submission "+ assfile.get(b));
            }
        }
    }
    
}
