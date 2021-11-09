import java.util.ArrayList;

public class nullmat extends matrix{

    nullmat(int rows, int cols, ArrayList<ArrayList<Integer>> matval) {
        super(rows, cols, matval);
        //TODO Auto-generated constructor stub
    }
    @Override
    int determinant() {
        if(rows==cols){
            return 0;

        }else{
            System.out.println("Determinant can not be calculated");
            return -1000;
        }
    }
    
}
