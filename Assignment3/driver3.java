
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class driver3 {
    HashMap<Integer,ArrayList<String>> matlabel=new HashMap<>();
    public static void main(String[] args) {
    HashMap<Integer,matrix> matid=new HashMap<>();
    int id=0;
    Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("---------Menu---------");
            System.out.println("1. Enter Matrix ");
            System.out.println("2. Enter Matrix of specific type ");
            System.out.println("3. Change Elements of Matrix ");
            System.out.println("4. Display Matrix Labels");
            System.out.println("5. Add");
            System.out.println("6. Sub");
            System.out.println("7. Mul");
            System.out.println("8. Div");
            System.out.println("9. Element Wise operation");
            System.out.println("10. Transpose");
            System.out.println("11. Inverse");
            System.out.println("12. Mean");
            System.out.println("13. Determinant");
            System.out.println("14. Compute A + A transpose");
            System.out.println("15. Compute Eigen vectors and values");
            System.out.println("16. Get Matrix of required label type");
            int input=sc.nextInt();
            if(input==1){
                System.out.println("Enter no of rows in matrix");
                int r=sc.nextInt();
                System.out.println("Enter no of columns in matrix");
                int c=sc.nextInt();
                ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                for(int i=0;i<r;i++){
                    ArrayList<Integer> temp=new ArrayList<>();
                    for(int j=0;j<c;j++){
                        temp.add(sc.nextInt());
                    }
                    par.add(temp);
                }
                int check=checktype(par,r,c);
                if(check==1){
                    matrix m1=new rectangular(r, c, par);
                    matid.put(id, m1);
                    id++;
                }else if(check==2){
                    matrix m1=new row(r, c, par);
                    matid.put(id, m1);
                    id++;
                }else if(check==3){
                    matrix m1=new column(r, c, par);
                    matid.put(id, m1);
                    id++;
                }else if(check==4){
                    matrix m1=new square(r, c, par);
                    matid.put(id, m1);
                    id++;
                }else if(check==5){
                    matrix m1=new symmetric(r, c, par);
                    matid.put(id, m1);
                    id++;
                }else if(check==6){
                    matrix m1=new skew(r, c, par);
                    matid.put(id, m1);
                    id++;
                }else if(check==7){
                    matrix m1=new ut(r, c, par);
                    matid.put(id, m1);
                    id++;
                }else if(check==8){
                    matrix m1=new lt(r, c, par);
                    matid.put(id, m1);
                    id++;
                }else if(check==9){
                    matrix m1=new singular(r, c, par);
                    matid.put(id, m1);
                    id++;

                }else if(check==10){
                    matrix m1=new diagonal(r, c, par);
                    matid.put(id, m1);
                    id++;

                }else if(check==11){
                    matrix m1=new scalar(r, c, par);
                    matid.put(id, m1);
                    id++;

                }else if(check==12){
                    matrix m1=new identity(r, c, par);
                    matid.put(id, m1);
                    id++;

                }else if(check==13){
                    matrix m1=new singelton(r, c, par);
                    matid.put(id, m1);
                    id++;

                }else if(check==14){
                    matrix m1=new ones(r, c, par);
                    matid.put(id, m1);
                    id++;

                }else if(check==15){
                    matrix m1=new nullmat(r, c, par);
                    matid.put(id, m1);
                    id++;

                }
            }else if(input==2){
                System.out.println("Choose matrix type");
                System.out.println("1. Rectangular");
                System.out.println("2. Row");
                System.out.println("3. Column");
                System.out.println("4. Square");
                System.out.println("5. Symmetric");
                System.out.println("6. Skew Symmetric");
                System.out.println("7. Upper triangular");
                System.out.println("8. Lower triangular");
                System.out.println("9. Singular ");
                System.out.println("10. Diagonal");
                System.out.println("11. Scalar");
                System.out.println("12. Identity");
                System.out.println("13. Singelton");
                System.out.println("14. Ones");
                System.out.println("15. Null");

                int in=sc.nextInt();



            }else if(input==3){
                int choosen_mat;
                for(int key: matid.keySet()){
                    
                }

            }else if(input==4){

            }else if(input==5){

            }else if(input==6){

            }else if(input==7){

            }else if(input==8){

            }else if(input==9){

            }else if(input==10){
            
            }else if(input==11){

            }else if(input==12){

            }else if(input==13){

            }else if(input==14){

            }else if(input==15){

            }else if(input==16){

            }
        }
    }





    public static int checktype(ArrayList<ArrayList<Integer>> par,int r,int c){

        boolean on=true;
        int t=par.get(0).get(0);
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(par.get(i).get(j)!=t){
                    on=false;
                    break;
                }
            }
        }
        if(on=true){
            if(t==1){
                return 14;
            }
            if(t==0){
                return 15;
            }
        }
        if(r==c){
            if(r==1){
                return 9;
            }
            boolean symmetric=true;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(par.get(i).get(j)!=par.get(j).get(i)){
                        symmetric=false;
                        break;
                    }
                }
            }
            if(symmetric==true){
                boolean diagonal=true;
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        if(i!=j){
                            if(par.get(i).get(j)!=0){
                                diagonal=false;
                                break;
                            }
                        }
                    }
                }
                if(diagonal==true){
                    boolean scalar=true;
                    int temp=par.get(0).get(0);
                    for(int i=1;i<r;i++){   
                        if(par.get(i).get(i)!=temp){
                            scalar=false;
                            break;
                        }
                    }
                    if(scalar==true){
                        if(par.get(0).get(0)==1){
                            return 12;
                        }else{
                            return 11;
                        }
                    
                    }else{
                        return 10;
                    }
                }else{
                    return 5;
                }
            }
            boolean skew=true;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(par.get(i).get(j)!=-(par.get(j).get(i))){
                        skew=false;
                        break;
                    }
                }
            }
            if(skew==true){
                return 6;
            }
            boolean lowert=true;
            for(int i=0;i<r;i++){
                for(int j=i+1;j<r;j++){
                    if(par.get(i).get(j)!=0){
                        lowert=false;
                        break;
                    }
                }
            }
            if(lowert==true){
                return 8;
            }
            boolean uppert=true;
            for(int i=0;i<r;i++){
                for(int j=0;j<i;j++){
                    if(par.get(i).get(j)!=0){
                        uppert=false;
                        break;
                    }
                }
            }
            if(uppert==true){
                return 7;
            }
            int d=-1;
            if(r==2){
                 d=(par.get(0).get(0)*par.get(1).get(1))-(par.get(0).get(1)*par.get(1).get(0));
            }else if(r==3){
                int d1=(par.get(0).get(0))*(par.get(1).get(1)*par.get(2).get(2))-(par.get(1).get(2)*par.get(2).get(1));
                int d2=(par.get(0).get(1))*(par.get(1).get(0)*par.get(2).get(2))-(par.get(1).get(2)*par.get(2).get(0));
                int d3=(par.get(0).get(2))*(par.get(1).get(0)*par.get(2).get(1))-(par.get(1).get(1)*par.get(2).get(0));
                d=d1-d2+d3;

            }
            if(d==0){
                return 9;
            }
            return 4;
        }
        if(r!=c){
            if(r==1){
                return 2;
            }else if(c==1){
                return 3;
            }else{
                return 1;
            }
        }
       return 0; 
    }
}







