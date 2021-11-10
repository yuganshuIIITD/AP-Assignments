import java.util.ArrayList;

public class square extends matrix{

    square(int rows, int cols, ArrayList<ArrayList<Integer>> matval) {
        super(rows, cols, matval);
        //TODO Auto-generated constructor stub
    }

    int determinant(){
        if(rows==2){
            return((matval.get(0).get(0)*matval.get(1).get(1))-(matval.get(1).get(0)*matval.get(0).get(1)));
        }else if(rows==1){
            return(matval.get(0).get(0));
        }else{
            int d1=matval.get(0).get(0)*((matval.get(1).get(1)*matval.get(2).get(2))-(matval.get(1).get(2)*matval.get(2).get(1)));
            int d2=matval.get(0).get(1)*((matval.get(1).get(0)*matval.get(2).get(2))-(matval.get(1).get(2)*matval.get(2).get(0)));
            int d3=matval.get(0).get(2)*((matval.get(1).get(0)*matval.get(2).get(1))-(matval.get(1).get(1)*matval.get(2).get(0)));
            int d=d1+d3-d2;
            return d;
        }
    }
    @Override
    ArrayList<ArrayList<Integer>> inverse() {
        if(rows==2){
            return matval;
        }
        return matval;
    }
}
