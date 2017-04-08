package sort;

/**
 * 简单插入
 * 插入排序不是通过交换位置而是通过比较找到合适的位置插入元素来达到排序的目的
 * 插入一个数的时候要保证这个数前面的数已经有序。简单插入排序的时间复杂度也是O(n^2)
 *
 * Created by xl on 2017/4/8.
 */
public class InsertSort_ {

    public static void inserSort(int[] array){
        if(array == null || array.length == 0){
            return;
        }

        for (int i = 1; i < array.length; i++) {
            /* 这里如果用for循环的话 就不能直接赋值给array[i]而是交换2个值的位置
            for (j = i-1; j > 0; j--) {//前面i个有序元素（从小到大），j从后向前找
                if(less(target,array[j])){//一旦发现 待插入元素小于某个元素时，先不插入，先移动
                    //将元素j移动到 待插入i位置（直接赋值，因为i的值被target记住了）,继续比较待插入元素i和新的j的大小
                    array[i] = array[j];//3,5,5,8,6,3
                }
            }*/
            int j = i;
            int target = array[i];
            while(j>0&& target< array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            //直到i和j以前的元素都比较结束之后，j所在的位置就是要插入的位置
            array[j] = target;
        }
    }
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,8,6,3};
        inserSort(arr);

    }
}
