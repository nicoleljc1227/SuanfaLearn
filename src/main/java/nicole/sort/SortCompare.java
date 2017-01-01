package nicole.sort;

/**
 * Created by Administrator on 2016/12/25.
 *
 */
public class SortCompare {

    //
    public static double time(String alg,Double[] a){

        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) InsertSort.InserSort(a);
        if (alg.equals("Selection")) Selection.sort(a);
        //if (alg.equals("Shell"))
    }
}
