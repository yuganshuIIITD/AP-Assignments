package Assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;





public class course {
    String course_name;
    ArrayList<instructor> course_instructors=new ArrayList<>();
    ArrayList<lectureslide> lec_slide=new ArrayList<>();
    ArrayList<quiz> quizs=new ArrayList<>();
    ArrayList<assignment> ass=new ArrayList<>();
    ArrayList<lecturevid> lec_video=new ArrayList<>();
    ArrayList<students> stu=new ArrayList<>();
    ArrayList<comment> commentlist=new ArrayList<>();
    course(String course_name){
        this.course_name=course_name;
    }
    Scanner sc=new Scanner(System.in);
    void print_slide_mat(){
        for(int i=0;i<lec_slide.size();i++){
            System.out.println("Title: "+ lec_slide.get(i).getLecname());
            for(int k=0;k<lec_slide.get(i).getNo_of_slides();k++){
                System.out.println("Slide "+ k +lec_slide.get(i).content.get(k));
            }
            System.out.println("No of slides: "+ lec_slide.get(i).getNo_of_slides());
            System.out.println("Date of upload : "+ lec_slide.get(i).current_Date);
            System.out.println("Uploaded by : "+ lec_slide.get(i).prof);
        }
        System.out.println(" ");
    }
    void print_vid_mat(){
        for(int i=0;i<lec_video.size();i++){
            System.out.println("Title of video: "+lec_video.get(i).getTopic());
            System.out.println("Video file: "+ lec_video.get(i).getFile_name());
            System.out.println("Date of upload : "+ lec_video.get(i).current_Date);
            System.out.println("Uploaded by : " + lec_video.get(i).prof);
        }
    }
    void print_assesment(){
        for(int i=0;i<ass.size();i++){
            System.out.println("ID: "+i+ "Assignment: "+ass.get(i).getProblem_statement()+ "MAX MARKS: "+ass.get(i).getMarks());
            System.out.println("---------------------------------------------------");
        }
        for(int k=0;k<quizs.size();k++){
            int temp=k+ass.size();
            System.out.println("ID: "+temp+"Question: "+quizs.get(k).getQuestion());
            System.out.println("---------------------------------------------------");
        }
    }
    void print_comments(){
        for(int i=0;i<commentlist.size();i++){
            System.out.println(commentlist.get(i).getComment()+ " - "+ commentlist.get(i).getName());
            System.out.println(commentlist.get(i).current_Date);
        }
        System.out.println("\n");
    }
    void close_assement(){
        HashMap<Integer,String> tmap=new HashMap<>();
        int index=0;
        for(int i=0;i<ass.size();i++){
            if(ass.get(i).status.equals("open")){
            tmap.put(index,ass.get(i).getProblem_statement());
            System.out.println("ID: "+index+ "Assignment: "+ass.get(i).getProblem_statement()+ "MAX MARKS: "+ass.get(i).getMarks());
            System.out.println("---------------------------------------------------");
            index++;
            }
        }
        int index2=0;
        for(int k=0;k<quizs.size();k++){
            int temp=index2+index;
            if(quizs.get(k).getStatus().equals("open")){
            tmap.put(temp,quizs.get(k).getQuestion());
            System.out.println("ID: "+temp+"Question: "+quizs.get(k).getQuestion());
            System.out.println("---------------------------------------------------");
            index2++;
            }
        }
        System.out.println("Enter id of assignment to close: ");
        int id =sc.nextInt();
        String q=tmap.get(id);
        for(int i=0;i<ass.size();i++){
            if(ass.get(i).getProblem_statement()==q){
                ass.get(i).status="closed";
            }
        }
        for(int k=0;k<quizs.size();k++){
            if(quizs.get(k).getQuestion()==q){
                quizs.get(k).setStatus("closed");
            }
        }
    }
}
