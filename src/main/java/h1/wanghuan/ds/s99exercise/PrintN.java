package h1.wanghuan.ds.s99exercise;

/**
 * Created by wanghuan on 16/4/1.
 */
public class PrintN {

    public void printN1(int n){
        for (int i = 0; i < n; i++){
            System.out.print(i);
        }
    }

    public void printN2(int n){
        if (n > 0){
            printN2(n-1);
            System.out.print(n);
        }
    }
}
