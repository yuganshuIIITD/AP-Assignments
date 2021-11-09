
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class driver3 {
    
    public static void main(String[] args) {
    HashMap<Integer,matrix> matid=new HashMap<>();
    HashMap<Integer,ArrayList<String>> matlabel=new HashMap<>();
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
            System.out.println("8. Get Matrix of required label type");
            System.out.println("9. Element Wise operation");
            System.out.println("10. Transpose");
            System.out.println("11. Inverse");
            System.out.println("12. Mean");
            System.out.println("13. Determinant");
            System.out.println("14. Compute A + A transpose");
            System.out.println("15. Compute Eigen vectors and values");
            System.out.println("16. Exit");
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
                ArrayList<String> l=new ArrayList<>();
                if(check==1){
                    matrix m1=new rectangular(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;
                }else if(check==2){
                    matrix m1=new row(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;
                }else if(check==3){
                    matrix m1=new column(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;
                }else if(check==4){
                    matrix m1=new square(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;
                }else if(check==5){
                    matrix m1=new symmetric(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;
                }else if(check==6){
                    matrix m1=new skew(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;
                }else if(check==7){
                    matrix m1=new ut(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;
                }else if(check==8){
                    matrix m1=new lt(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;
                }else if(check==9){
                    matrix m1=new singular(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;

                }else if(check==10){
                    matrix m1=new diagonal(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;

                }else if(check==11){
                    matrix m1=new scalar(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;

                }else if(check==12){
                    matrix m1=new identity(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;

                }else if(check==13){
                    matrix m1=new singelton(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;

                }else if(check==14){
                    matrix m1=new ones(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;

                }else if(check==15){
                    matrix m1=new nullmat(r, c, par);
                    matid.put(id, m1);
                    l=addlab(par,r,c);
                    matlabel.put(id, l);
                    id++;

                }
                System.out.println("Matrix added");
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
                ArrayList<String> l=new ArrayList<>();
                if(in==1){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    temp1.add(1);
                    temp1.add(2);
                    temp1.add(3);
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp2.add(4);
                    temp2.add(5);
                    temp2.add(6);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new rectangular(2, 3, par);
                    matid.put(id, m1);
                    l=addlab(par,2,3);
                    matlabel.put(id, l);
                    id++;


                }else if(in==2){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    temp1.add(1);
                    temp1.add(2);
                    temp1.add(3);
                    par.add(temp1);
                    matrix m1=new row(1, 3, par);
                    matid.put(id, m1);
                    l=addlab(par,1,3);
                    matlabel.put(id, l);
                    id++;

                }else if(in==3){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    ArrayList<Integer> temp3=new ArrayList<>();
                    temp1.add(1);
                    temp2.add(2);
                    temp3.add(3);
                    par.add(temp1);
                    par.add(temp2);
                    par.add(temp3);
                    matrix m1=new column(3, 1, par);
                    matid.put(id, m1);
                    l=addlab(par,3,1);
                    matlabel.put(id, l);
                    id++;


                }else if(in==4){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(1);
                    temp1.add(2);
                    temp2.add(3);
                    temp2.add(4);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new square(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;


                }else if(in==5){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(2);
                    temp1.add(2);
                    temp2.add(2);
                    temp2.add(2);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new symmetric(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;

                }else if(in==6){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(0);
                    temp1.add(-5);
                    temp2.add(5);
                    temp2.add(0);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new skew(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;

                }else if(in==7){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(1);
                    temp1.add(2);
                    temp2.add(0);
                    temp2.add(3);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new ut(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;

                }else if(in==8){ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(1);
                    temp1.add(0);
                    temp2.add(2);
                    temp2.add(3);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new lt(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;

                }else if(in==9){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(1);
                    temp1.add(2);
                    temp2.add(1);
                    temp2.add(2);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new singular(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;


                }else if(in==10){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(1);
                    temp1.add(0);
                    temp2.add(0);
                    temp2.add(2);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new diagonal(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;

                }else if(in==11){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(2);
                    temp1.add(0);
                    temp2.add(0);
                    temp2.add(2);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new scalar(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;

                }else if(in==12){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(1);
                    temp1.add(0);
                    temp2.add(0);
                    temp2.add(1);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new identity(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;
                }else if(in==13){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    temp1.add(5);
                    par.add(temp1);
                    matrix m1=new singelton(1, 1, par);
                    matid.put(id, m1);
                    l=addlab(par,1,1);
                    matlabel.put(id, l);
                    id++;

                }else if(in==14){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(1);
                    temp1.add(1);
                    temp2.add(1);
                    temp2.add(1);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new ones(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;

                }else if(in==15){
                    ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                    ArrayList<Integer> temp1=new ArrayList<>();
                    ArrayList<Integer> temp2=new ArrayList<>();
                    temp1.add(0);
                    temp1.add(0);
                    temp2.add(0);
                    temp2.add(0);
                    par.add(temp1);
                    par.add(temp2);
                    matrix m1=new nullmat(2, 2, par);
                    matid.put(id, m1);
                    l=addlab(par,2,2);
                    matlabel.put(id, l);
                    id++;

                }
                System.out.println("Matrix Added");

            }else if(input==3){
                int choosen_mat;
                for(int key: matid.keySet()){
                    System.out.println("id: "+key);
                    System.out.println(matid.get(key));
                }
                System.out.println("Enter id of matrix you want to update");
                choosen_mat=sc.nextInt();
                matrix mt=matid.get(choosen_mat);
                System.out.println("Enter new values of matrix");
                ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                for(int i=0;i<mt.rows;i++){
                    ArrayList<Integer> temp=new ArrayList<>();
                    for(int j=0;j<mt.cols;j++){
                        temp.add(sc.nextInt());
                    }
                    par.add(temp);

                }
                ArrayList<String> cmp=addlab(par, mt.rows,mt.cols);
                Boolean same=true;
                for(int i=0;i<matlabel.get(choosen_mat).size();i++){
                    if(matlabel.get(choosen_mat).contains(cmp.get(i))==false){
                        same=false;
                    }
                }
                if(same=true){
                    mt.matval=par;
                    System.out.println("Matrix Value Updated");
                }else{
                    System.out.println("Can not update such values as labels are changing");
                }
                

            }else if(input==4){
                int choosen_mat;
                for(int key: matid.keySet()){
                    System.out.println("id: "+key);
                    System.out.println(matid.get(key).matval);
                }
                System.out.println("Enter id of matrix");
                choosen_mat=sc.nextInt();
                System.out.println(matlabel.get(choosen_mat));

            }else if(input==5){
                int mat1;
                int mat2;
                for(int key: matid.keySet()){
                    System.out.println("id: "+key);
                    System.out.println(matid.get(key).matval);
                }
                System.out.println("Enter id of matrix");
                mat1=sc.nextInt();
                mat2=sc.nextInt();
                matrix ma1=matid.get(mat1);
                matrix ma2=matid.get(mat2);
                ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                if(ma1.cols==ma2.cols && ma1.rows==ma2.rows){
                    for(int i=0;i<ma1.rows;i++){
                        ArrayList<Integer> te=new ArrayList<>();
                        for(int j=0;j<ma1.cols;j++){
                            te.add(ma1.matval.get(i).get(j)+ma2.matval.get(i).get(j));
                        }
                        System.out.println(te);
                        par.add(te);
                    }

                }else{
                    System.out.println("For addition size of matrices should be same");
                }




            }else if(input==6){
                int mat1;
                int mat2;
                for(int key: matid.keySet()){
                    System.out.println("id: "+key);
                    System.out.println(matid.get(key).matval);
                }
                System.out.println("Enter id of matrix");
                mat1=sc.nextInt();
                mat2=sc.nextInt();
                matrix ma1=matid.get(mat1);
                matrix ma2=matid.get(mat2);
                ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                if(ma1.cols==ma2.cols && ma1.rows==ma2.rows){
                    for(int i=0;i<ma1.rows;i++){
                        ArrayList<Integer> te=new ArrayList<>();
                        for(int j=0;j<ma1.cols;j++){
                            te.add(ma1.matval.get(i).get(j)-ma2.matval.get(i).get(j));
                        }
                        System.out.println(te);
                        par.add(te);
                    }

                }else{
                    System.out.println("For subtraction size of matrices should be same");
                }


            }else if(input==7){
                int mat1;
                int mat2;
                for(int key: matid.keySet()){
                    System.out.println("id: "+key);
                    System.out.println(matid.get(key).matval);
                }
                System.out.println("Enter id of matrices");
                mat1=sc.nextInt();
                mat2=sc.nextInt();
                matrix ma1=matid.get(mat1);
                matrix ma2=matid.get(mat2);
                ArrayList<ArrayList<Integer>> par=new ArrayList<>();
                if(ma1.cols==ma2.rows){
                    for(int i=0;i<ma1.rows;i++){
                        for(int j=0;j<ma2.cols;j++){
                            int val=0;
                            for(int k=0;k<ma2.rows;k++){
                                val=val + (ma1.matval.get(i).get(k))*(ma2.matval.get(k).get(j));
                            }
                            System.out.print(val+" ");
                        }
                        System.out.println("\n");
                    }
                }else{
                    System.out.println("Multiplication not possible");
                }

            }else if(input==8){
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
                String type="";
                ArrayList<String> ct=new ArrayList<>();
                ct.add("Rectangular");
                ct.add("Row");
                ct.add("Column");
                ct.add("Square");
                ct.add("Symmetric");
                ct.add("Skew Symmetric");
                ct.add("Upper Triangular");
                ct.add("Lower Triangular");
                ct.add("Singular");
                ct.add("Diagonal");
                ct.add("Scalar");
                ct.add("Identity");
                ct.add("Singelton");
                ct.add("Ones");
                ct.add("Null");
                type=ct.get(in-1);
                for(int key: matlabel.keySet()){
                    if(matlabel.get(key).contains(type)==true){
                        System.out.println("id : "+key);
                        System.out.println(matid.get(key));

                    }
                }


            }else if(input==9){
                System.out.println("1. Multiply");
                System.out.println("2. Divide");

                // System.out.println("1. add");
                // System.out.println("2. sub");
                // System.out.println("3. mul");
                // System.out.println("choose which element wise operation to perform");
                int operation;
                operation=sc.nextInt();
                // int choosen_mat;
                // for(int key: matid.keySet()){
                //     System.out.println("id: "+key);
                //     System.out.println(matid.get(key));
                // }
                // System.out.println("Enter id of");
                // choosen_mat=sc.nextInt();
                // matrix mt=matid.get(choosen_mat);
                // if(operation==1){
                //     System.out.println("Enter by what no you want to add every element of the choosen matrix");
                //     int no=sc.nextInt();
                //     for(int i=0;i<mt.rows;i++){
                //         for(int j=0;j<mt.cols;j++){
                //             System.out.print(mt.matval.get(i).get(j)+no);
                //         }
                //         System.out.println("\n");
                //     }
                // }else if(operation==2){
                //     System.out.println("Enter by what no you want to sub every element of the choosen matrix");
                //     int no=sc.nextInt();
                //     for(int i=0;i<mt.rows;i++){
                //         for(int j=0;j<mt.cols;j++){
                //             System.out.print(mt.matval.get(i).get(j)-no);
                //         }
                //         System.out.println("\n");
                //     }

                // }else if(operation==3){
                //     System.out.println("Enter by what no you want to multiply every element of the choosen matrix");
                //     int no=sc.nextInt();
                //     for(int i=0;i<mt.rows;i++){
                //         for(int j=0;j<mt.cols;j++){
                //             System.out.print(mt.matval.get(i).get(j)*no);
                //         }
                //         System.out.println("\n");
                //     }

                // }
                int mat1;
                int mat2;
                for(int key: matid.keySet()){
                    System.out.println("id: "+key);
                    System.out.println(matid.get(key).matval);
                }
                System.out.println("Enter id of matrices");
                mat1=sc.nextInt();
                mat2=sc.nextInt();
                matrix ma1=matid.get(mat1);
                matrix ma2=matid.get(mat2);
                if(operation==1){
                    if(ma1.cols==ma2.cols && ma1.rows==ma2.rows){
                        for(int i=0;i<ma1.rows;i++){
                            ArrayList<Integer> res=new ArrayList<>();
                            for(int j=0;j<ma1.cols;j++){
                                res.add(ma1.matval.get(i).get(j)*ma2.matval.get(i).get(j));
                            }
                            System.out.println(res);
                        }
                    }else{
                        System.out.println("Number of rows and columns of matrix should be equal to perform element wise operation");
                    }
                    
                }else if(operation==2){
                    if(ma1.cols==ma2.cols && ma1.rows==ma2.rows){
                        for(int i=0;i<ma1.rows;i++){
                            ArrayList<Integer> res=new ArrayList<>();
                            for(int j=0;j<ma1.cols;j++){
                                res.add(ma1.matval.get(i).get(j)/ma2.matval.get(i).get(j));
                            }
                            System.out.println(res);
                        }
                    }else{
                        System.out.println("Number of rows and columns of matrix should be equal to perform element wise operation");
                    }
                }

            }else if(input==10){
                int choosen_mat;
                for(int key: matid.keySet()){
                    System.out.println("id: "+key);
                    System.out.println(matid.get(key));
                }
                System.out.println("Enter id of matrix you want to transpose");
                choosen_mat=sc.nextInt();
                matrix mt=matid.get(choosen_mat);
                System.out.println("Matrix after transpose");
                ArrayList<ArrayList<Integer>> par=mt.transpose();
                for(int i=0;i<par.size();i++){
                    System.out.println(par.get(i));
                }
                
            }else if(input==11){

            }else if(input==12){
                System.out.println("1. Row wise mean");
                System.out.println("2. Column wise mean");
                System.out.println("3. overall mean");
                int in=sc.nextInt();
                int choosen_mat;
                for(int key: matid.keySet()){
                    System.out.println("id: "+key);
                    System.out.println(matid.get(key));
                }
                System.out.println("Enter id of matrix you want to transpose");
                choosen_mat=sc.nextInt();
                matrix mt=matid.get(choosen_mat);
                if(in==1){
                    for(int i=0;i<mt.rows;i++){
                        float mean=0;
                        for(int j=0;j<mt.cols;j++){
                            mean=mean+mt.matval.get(i).get(j);
                        }
                        System.out.println(mean/mt.cols);
                    }
                }else if(in==2){
                    for(int i=0;i<mt.cols;i++){
                        float mean=0;
                        for(int j=0;j<mt.rows;j++){
                            mean=mean+mt.matval.get(j).get(i);
                        }
                        System.out.println(mean/mt.rows);
                    }

                }else if(in==3){
                    float mean=0;
                    for(int i=0;i<mt.rows;i++){
                        mean=0;
                        for(int j=0;j<mt.cols;j++){
                            mean=mean+mt.matval.get(i).get(j);
                        }
                    }
                    System.out.println(mean/(mt.cols*mt.rows));
                }


            }else if(input==13){
                int choosen_mat;
                for(int key: matid.keySet()){
                    System.out.println("id: "+key);
                    System.out.println(matid.get(key));
                }
                System.out.println("Enter id of matrix you want to find determinant");
                choosen_mat=sc.nextInt();
                matrix mt=matid.get(choosen_mat);
                int det=mt.determinant();
                if(det!=-1000){
                System.out.println("determinant of matrix is: "+det);
                }

            }else if(input==14){
                int choosen_mat;
                for(int key: matid.keySet()){
                    System.out.println("id: "+key);
                    System.out.println(matid.get(key));
                }
                System.out.println("Enter id of matrix you want to transpose and add to itself");
                choosen_mat=sc.nextInt();
                matrix mt=matid.get(choosen_mat);
                if(mt.rows==mt.cols){
                    ArrayList<ArrayList<Integer>> par=mt.transpose();
                    for(int i=0;i<mt.rows;i++){
                        ArrayList<Integer> te=new ArrayList<>();
                        for(int j=0;j<mt.cols;j++){
                            te.add(mt.matval.get(i).get(j)+mt.matval.get(j).get(i));

                        }
                        System.out.println(te);
                    }

                }else{
                    System.out.println("Can not compute A + A transpose as size is different");
                }

            }else if(input==15){

            }else if(input==16){
                break;
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
    public static ArrayList<String> addlab(ArrayList<ArrayList<Integer>> par,int r,int c){
        ArrayList<String> ret=new ArrayList<>();
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
                ret.add("Ones");
            }
            if(t==0){
                ret.add("Null");
            }
        }
        if(r==c){
            ret.add("Square");
            if(r==1){
                ret.add("Singelton");
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
                ret.add("Symmetric");
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
                    ret.add("Diagonal");
                    boolean scalar=true;
                    int temp=par.get(0).get(0);
                    for(int i=1;i<r;i++){   
                        if(par.get(i).get(i)!=temp){
                            scalar=false;
                            break;
                        }
                    }
                    if(scalar==true){
                        ret.add("Scalar");
                        if(par.get(0).get(0)==1){
                            ret.add("Identity");
                        }
                    
                    }
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
                ret.add("Skew Symmetric");
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
                ret.add("Lower Triangular");
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
                ret.add("Upper Triangular");
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
                ret.add("Singular");
            }
        }
        if(r!=c){
            ret.add("Rectangular");
            if(r==1){
                ret.add("Row");
            }else if(c==1){
                ret.add("Column");
            }
        }
        return ret;
    }
}







