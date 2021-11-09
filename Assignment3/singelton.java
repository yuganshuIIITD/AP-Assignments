import java.util.ArrayList;

public class singelton extends scalar{

    singelton(int rows, int cols, ArrayList<ArrayList<Integer>> matval) {
        super(rows, cols, matval);
        //TODO Auto-generated constructor stub
    }
    @Override
    int determinant() {
        return matval.get(0).get(0);
    }
    @Override
    ArrayList<ArrayList<Integer>> inverse() {
        return matval;
    }
}
