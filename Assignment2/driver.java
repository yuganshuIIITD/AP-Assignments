package Assignment2;

import java.util.Date;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        course C1=new course("AP");
        instructor I1=new instructor("yuganshu");
        instructor I2=new instructor("mohit");
        students S1=new students();
        S1.setName("Aditi");
        students S2=new students();
        S2.setName("Pranav");
        students S0=new students();
        S0.setName("Shrugal");
        C1.course_instructors.add(I1);
        C1.course_instructors.add(I2);
        while(true){
            System.out.println("Welcome to Backpack");
            System.out.println("1. Enter as instructor");
            System.out.println("2. Enter as student");
            System.out.println("3. Exit");
            int in =sc.nextInt();
            if(in==3){
                break;
            }else if(in==2){
                System.out.println("1. View lecture matirial ");
                System.out.println("2. View Assesments");
                System.out.println("3. Submit Assesments");
                System.out.println("4. View Grades");
                System.out.println("5. View Comments");
                System.out.println("6. Add Comments");
                System.out.println("7. Logout");
                int input = sc.nextInt();
                System.out.println("Students:");
                for(int j=0;j<C1.stu.size();j++){
                    System.out.println(j+ "-"+ C1.stu.get(j).getName());
                }
                int choice=sc.nextInt();
                students temp=C1.stu.get(choice);
                if(input==7){
                    break;
                }else if(input==1){
                    C1.print_slide_mat();
                    C1.print_vid_mat();
                    System.out.println("Welcome "+ temp.getName());
                }else if(input==2){
                    C1.print_assesment();
                }else if(input==3){

                }else if(input==4){

                }else if(input==5){
                    C1.print_comments();
                    System.out.println("Welcome "+ temp.getName());
                }else if(input==6){
                    sc.nextLine();
                    String com=sc.nextLine();
                    comment c=new comment();
                    c.setComment(com);
                    c.setName(temp.getName());
                    Date current_Date = new Date();
                    c.current_Date=current_Date;
                    C1.commentlist.add(c);
                    System.out.println("Welcome "+ temp.getName());
                }

            }else if(in==1){
                System.out.println("Instructors: ");
                for(int k=0;k<C1.course_instructors.size();k++){
                    System.out.println(k+ "- " + C1.course_instructors.get(k).instructor_name);

                }
                int choice=sc.nextInt();
                instructor temp=C1.course_instructors.get(choice);
                while(true){
                System.out.println("1. Add class material");
                System.out.println("2. Add Assesment");
                System.out.println("3. View Lecture material");
                System.out.println("4. View assesment");
                System.out.println("5. Grade assesment");
                System.out.println("6. Close assesment");
                System.out.println("7. View comments");
                System.out.println("8. Add comment");
                System.out.println("9. Logout");
                int input=sc.nextInt();
                if(input==9){
                    break;
                }else if(input==1){
                    System.out.println("1. Add lecture slides");
                    System.out.println("2. Add  video lecture");
                    int i=sc.nextInt();
                    if(i==1){
                        System.out.println("Enter topic of slides");
                        sc.nextLine();
                        String topic=sc.nextLine();
                        System.out.println("Enter no slides");
                        int no=sc.nextInt();
                        sc.nextLine();
                        lectureslide l=new lectureslide();
                        l.setNo_of_slides(no);
                        l.setLecname(topic);
                        System.out.println("Enter content of slides");
                        for(int j=0;j<no;j++){
                            System.out.println("Enter content of slide " + j + ": ");
                            String content=sc.nextLine();
                            l.content.add(content);
                        }
                        Date current_Date = new Date();
                        l.current_Date=current_Date;
                        l.prof=temp.instructor_name;
                        C1.lec_slide.add(l);
                        System.out.println("Welcome "+ temp.instructor_name);

                    }else if(i==2){
                        sc.nextLine();
                        System.out.println("Enter topic of video: ");
                        String topic=sc.nextLine();
                        System.out.println("Enter file name : ");
                        String filename=sc.nextLine();
                        lecturevid v=new lecturevid();
                        v.setFile_name(filename);
                        v.setTopic(topic);
                        Date current_Date = new Date();
                        v.current_Date=current_Date;
                        v.prof=temp.instructor_name;
                        C1.lec_video.add(v);
                        System.out.println("Welcome "+ temp.instructor_name);
                    }
                }else if(input==2){
                    System.out.println("1. Add assignment");
                    System.out.println("2. Add quiz");
                    int c=sc.nextInt();
                    if(c==1){
                        sc.nextLine();
                        System.out.println("Enter problem statement : ");
                        String problem_statement=sc.nextLine();
                        System.out.println("Enter marks  : ");
                        int marks=sc.nextInt();
                        assignment a=new assignment();
                        a.status="open";
                        a.setMarks(marks);
                        a.setProblem_statement(problem_statement);
                        C1.ass.add(a);
                        System.out.println("Welcome "+ temp.instructor_name);


                    }else if(c==2){
                        sc.nextLine();
                        System.out.println("Enter quiz question : ");
                        String question=sc.nextLine();
                        quiz q=new quiz();
                        q.setStatus("open");
                        q.setQuestion(question);
                        C1.quizs.add(q);
                        System.out.println("Welcome "+ temp.instructor_name);
                    
                    }
                }else if(input==3){
                    C1.print_slide_mat();
                    C1.print_vid_mat();
                    System.out.println("Welcome "+ temp.instructor_name);
                }else if(input==4){
                    C1.print_assesment();
                    System.out.println("Welcome "+ temp.instructor_name);
                }else if(input==5){

                }else if(input==6){
                    System.out.println("list of open assesments : ");
                    C1.close_assement();
                    System.out.println("Welcome "+ temp.instructor_name);
                }else if(input==7){
                    C1.print_comments();
                    System.out.println("Welcome "+ temp.instructor_name);

                }else if(input==8){
                    sc.nextLine();
                    String com=sc.nextLine();
                    comment c=new comment();
                    c.setComment(com);
                    c.setName(temp.instructor_name);
                    Date current_Date = new Date();
                    c.current_Date=current_Date;
                    C1.commentlist.add(c);
                    System.out.println("Welcome "+ temp.instructor_name);
                }
            }
            
            }
            
        }
    }
}
