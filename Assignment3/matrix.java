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
    ArrayList<ArrayList<Integer>> transpose(){
        ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
        for(int i=0;i<cols;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<rows;j++){
                temp.add(matval.get(j).get(i));

            }
            ret.add(temp);
        }
        return ret;

    }
    int determinant(){
        System.out.println("Determinant can not be calculated");
        return 0;
    }



}
