import java.util.ArrayList;

public class singular extends square{

    singular(int rows, int cols, ArrayList<ArrayList<Integer>> matval) {
        super(rows, cols, matval);
        //TODO Auto-generated constructor stub
    }
    // @Override
    // int determinant() {
    //     return 0;
    // }
    @Override
    ArrayList<ArrayList<Integer>> inverse() {
        System.out.println("Can not be calculated");
        ArrayList<ArrayList<Integer>> n=new ArrayList<>();
        return n;
    }
}
