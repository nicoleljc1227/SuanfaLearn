package sort;

/**
 * 类似于冒泡排序
 * 都是在一次排序后把最小的元素放到最前面。
 * 但是过程不同，冒泡排序是通过相邻的比较和交换。而选择排序是通过对整体的选择。
 * 每一次选出除了第一个元素以外的剩下元素中最小的来和第一个元素交换
 * 其实选择排序可以看成冒泡排序的优化
 * Created by xl on 2017/4/8.
 */
public class SelectSort {

    public static void selectSort(int [] array){
        if(array == null || array.length == 0){
            return;
        }
        int min = 0;
        for (int i = 0; i < array.length-1; i++) {//比较n-1次
            min = i+1;//或者min为min= i 则下面是j<length
            for (int j = i+1; j < array.length-1; j++) {//j<length-1 选择最小值过程，j指向倒数第二个的时候，j+1指向最后一个 若是j<length 数组越界
                if(less(array[j+1],array[min])){
                    min = j+1;
                }

            }
            if (less(array[min],array[i])){
                swap(array,min,i);
            }

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
        selectSort(arr);

    }
}
