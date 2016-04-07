package h1.wanghuan.ds.s99exercise;

/**
 * Created by wanghuan on 16/4/2.
 */
public class MiddleDivide {

    /**
     *  int middleDivide(List[n] a, int N){
     *      int i = n/2;
     *      int M = a[i];
     *      if(M == N){
     *          return i;
     *      }else if(M > N){
     *          return middleDivide(a[i] , N);
     *      }else{
     *          return middleDivide(a[i-a] , N);
     *      }
     *  }
     *
     *  S(n) =
     *  T(n) =
     *
     */

    /**
     *
     //typedef int ElemType;
     //typedef int index;
     index binSearch(ElemType List[], ElemType x, index head, index tail) {
     while (head <= tail) {
     index mid = (head + tail) / 2;
     if (List[mid] == x) {
     return mid;
     } else if (List[mid] > x) {
     tail = mid - 1;
     } else {
     head = mid + 1;
     }
     }
     return -1;
     }

     index binSearch(ElemType List[], ElemType x, index head, index tail) {
     index mid = (head + tail) / 2;
     if (List[mid] == x) {
     return mid;
     } else if (List[mid] > x) {
     binSearch(List, x, head, mid - 1);
     } else {
     binSearch(List, x, mid + 1, tail);
     }
     return -1;
     }
     *
     */
}
