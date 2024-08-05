package shuo.laoma.basic.c12;

public class ArrayMax {

    public static int max(int min, int[] arr) {
        int max = min;
        // 使用foreach方式:返回最大的值
        for(int a : arr){
            if(a>max){
                max = a;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4};
        int ret = max(0, arr);
        System.out.println(ret);
    }

}
