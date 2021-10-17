package Assignment2;

import java.util.ArrayList;
import java.util.Date;

public class lectureslide {
    private String lecname;
    private int no_of_slides;
    String prof;
    ArrayList<String> content=new ArrayList<>();
    Date current_Date;
    public String getLecname() {
        return lecname;
    }
    public void setLecname(String lecname) {
        this.lecname = lecname;
    }
    public int getNo_of_slides() {
        return no_of_slides;
    }
    public void setNo_of_slides(int no_of_slides) {
        this.no_of_slides = no_of_slides;
    }

}
