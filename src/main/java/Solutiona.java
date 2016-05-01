/**
 * Created by <a href="davidsunjie.sun@gmail.com">jerrysun</a> on 4/30/16.
 */
public class Solutiona {

    public static int SumofSquare(int n) {
        int reslut = 0;
        if (n==1){
            return 1;
        }else{

        reslut = n*n + SumofSquare(n - 1);
        return reslut;
        }


    }

    public static void main(String[] args) {
        System.out.println(SumofSquare(116));
    }
}
