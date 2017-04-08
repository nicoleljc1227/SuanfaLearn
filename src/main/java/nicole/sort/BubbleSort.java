package sort;

/**
 * @Description:<p>冒泡排序</p>
 * 通过与相邻元素的比较和交换来把小的数交换到最前面。这个过程类似于水泡向上升一样
 * 从后向前冒泡,每一次排序都从最后一个元素开始向前冒泡，i每加一次相当于已经排好前面i个元素，i从0开始
 * 冒泡排序的时间复杂度为O(n^2)
 * Created by xl on 2017/4/8.
 */
public class BubbleSort {
    public static void bubbleSort(int [] array){
        if(array == null || array.length == 0){
            return;
        }
        //i是从0-length-1 假设数组长5 相当于前面4个排好后i指向第四个就停止
        for (int i = 0; i < array.length-1; i++) {
            for (int j = array.length-1; j > 0 ; j--) {
                if (array[j] < array[j-1]){
                    swap(array,j,j-1);
                }
            }
        }

    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,4,8,6,3};
        bubbleSort(arr);
    }

}
