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
    @Override
    ArrayList<ArrayList<Integer>> inverse() {
        ArrayList<ArrayList<Integer>> n=new ArrayList<>();
        if(rows==cols){
            if(rows==1){
                ArrayList<Integer> t=new ArrayList<>();
                t.add(matval.get(0).get(0));
                n.add(t);
                return n;
            }else{
                System.out.println("Inverse does not exist");
                return n;
            }
        }else{
            System.out.println("Inverse does not exist");
            return n;
        }
    }
    
}
