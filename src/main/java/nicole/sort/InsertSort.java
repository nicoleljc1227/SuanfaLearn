package nicole.sort;

/**
 * Created by Administrator on 2016/12/25.
 *
 *
 */
public class InsertSort {

    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i]=a[j];
        a[j]=t;
    }
    private static void show(Comparable[] a)
    {
        //
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]+"");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a)
    {
        //
        for (int i = 1; i <a.length ; i++) {
            if (less(a[i],a[i-1]))
                return false;

        }
        return true;
    }

    public static void InserSort(Comparable[] a){

        int N = a.length;
        if (!isSorted(a)){
            for (int i = 1; i < N; i++) {
                //
                for (int j = i;j>0&&less(a[j],a[j-1]);j--){
                    exch(a,j,j-1);
                }
            }

        }
    }

    public static void main(String[] args) {
        Comparable[] a = {'S','O','R','T','E','X','A','M','P','L','E'};
        InserSort(a);
    }


}
