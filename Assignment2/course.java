package Assignment2;

import java.util.ArrayList;



public class course {
    String course_name;
    ArrayList<instructor> course_instructors=new ArrayList<>();
    ArrayList<lectureslide> lec_slide=new ArrayList<>();
    ArrayList<quiz> quizs=new ArrayList<>();
    ArrayList<assignment> ass=new ArrayList<>();
    ArrayList<lecturevid> lec_video=new ArrayList<>();
    ArrayList<students> stu=new ArrayList<>();
    course(String course_name){
        this.course_name=course_name;
    }
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
}
