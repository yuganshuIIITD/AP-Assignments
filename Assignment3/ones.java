import java.util.ArrayList;

public class ones extends matrix{

    ones(int rows, int cols, ArrayList<ArrayList<Integer>> matval) {
        super(rows, cols, matval);
        //TODO Auto-generated constructor stub
    }
    @Override
    int determinant() {
        if(rows==cols){
            if(rows==1){
                return 1;
            }else{
                return 0;
            }

        }else{
            System.out.println("Determinant can not be calculated");
            return -1000;
        }
    }
    
}
