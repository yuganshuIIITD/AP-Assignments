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
        ArrayList<ArrayList<Integer>> n=new ArrayList<>();
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        ArrayList<Integer> a3=new ArrayList<>();
        int det=determinant();
        if(det==0){
            System.out.println("Inverse does not exist");
            return n;
        }
        if(rows==2){
           a1.add(matval.get(0).get(0));
           a1.add(-matval.get(0).get(1));
           a2.add(-matval.get(1).get(0));
           a2.add(matval.get(1).get(1));
           n.add(a1);
           n.add(a2);
           return n;
            
        }else if(rows==3){
            
            int v1=((matval.get(1).get(1)*matval.get(2).get(2))-(matval.get(1).get(2)*matval.get(2).get(1)))/det;
            int v2=((matval.get(2).get(0)*matval.get(1).get(2))-(matval.get(1).get(0)*matval.get(2).get(2)))/det;
            int v3=((matval.get(1).get(0)*matval.get(2).get(2))-(matval.get(1).get(1)*matval.get(2).get(0)))/det;
            int v4=((matval.get(0).get(2)*matval.get(2).get(1))-(matval.get(0).get(1)*matval.get(2).get(2)))/det;
            int v5=((matval.get(0).get(0)*matval.get(2).get(2))-(matval.get(2).get(0)*matval.get(0).get(2)))/det;
            int v6=((matval.get(2).get(0)*matval.get(0).get(1))-(matval.get(0).get(0)*matval.get(2).get(1)))/det;
            int v7=((matval.get(0).get(1)*matval.get(1).get(2))-(matval.get(1).get(1)*matval.get(0).get(2)))/det;
            int v8=-((matval.get(0).get(0)*matval.get(1).get(2))-(matval.get(1).get(0)*matval.get(0).get(2)))/det;
            int v9=((matval.get(0).get(0)*matval.get(1).get(1))-(matval.get(1).get(0)*matval.get(0).get(1)))/det;
            a1.add(v1);
            a1.add(v4);
            a1.add(v7);
            a2.add(v2);
            a2.add(v5);
            a2.add(v8);
            a3.add(v3);
            a3.add(v6);
            a3.add(v9);
            n.add(a1);
            n.add(a2);
            n.add(a3);
            return n;


        }
        return matval;
    }
}
