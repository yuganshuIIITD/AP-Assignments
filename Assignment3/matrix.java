import java.util.ArrayList;

public class matrix {
    int rows;
    int cols;
    ArrayList<String> type=new ArrayList<>();
    ArrayList<ArrayList<Integer>> matval=new ArrayList<>();
    matrix(int rows,int cols,ArrayList<ArrayList<Integer>> matval){
        this.rows=rows;
        this.cols=cols;
        this.matval=matval;
    }

}
