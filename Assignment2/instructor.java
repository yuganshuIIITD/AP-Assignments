package Assignment2;

import java.util.HashMap;
import java.util.Scanner;

public class instructor extends participants {
    String instructor_name;
    instructor(String n){
        instructor_name=n;
    }
    Scanner sc=new Scanner(System.in);
    void grade(course C){
        System.out.println("List of assesments");
        HashMap<Integer,String> tmap=new HashMap<>();
        int index=0;
        for(int i=0;i<C.ass.size();i++){
            System.out.println("ID: "+ index+" Assignment : "+ C.ass.get(i).getProblem_statement()+" Max Marks : "+ C.ass.get(i).getMarks());
            tmap.put(index,C.ass.get(i).getProblem_statement());
            index++;
        }
        System.out.println("----------------------------");
        int index2=0;
        for(int j=0;j<C.quizs.size();j++){
            int temp=index+index2;
            System.out.println("ID: "+temp+" Question: "+ C.quizs.get(j).getQuestion());
            tmap.put(temp,C.quizs.get(j).getQuestion());
            index2++;
        }
        int assid=sc.nextInt();
        String q=tmap.get(assid);
        index=0;
        HashMap<Integer,students> tempmap=new HashMap<>();
        System.out.println("Choose id of these ungraded submissions");
        for(int k=0;k<C.stu.size();k++){
            if(C.stu.get(k).sub_ass.contains(q)){
                if(C.stu.get(k).assmarks.get(q)==-1){
                    System.out.println(index+ ". "+ C.stu.get(k).getName());
                    tempmap.put(index,C.stu.get(k));
                    index++;
                }

            }
        }
        int s=sc.nextInt();
        students pointer=tempmap.get(s);
        System.out.println("submission: ");
        System.out.println("submission: "+ pointer.assfile.get(q));
        for(int l=0;l<C.ass.size();l++){
            if(C.ass.get(l).getProblem_statement()==q){
                System.out.println("Max Marks: "+C.ass.get(l).getMarks());
            }
        }
        System.out.println("Marks Scored: ");
        int m=sc.nextInt();
        pointer.assmarks.replace(q,-1, m);
        pointer.assprof.put(q,instructor_name);
    }
}
