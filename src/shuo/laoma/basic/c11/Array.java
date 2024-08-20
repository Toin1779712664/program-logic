package shuo.laoma.basic.c11;

public class Array {
		// 数组遍历，将对应下标的数组设置为索引
	public static void reset(int[] arr){
	    for(int i=0;i<arr.length;i++){
	        arr[i] = i;
	    }
	}

	public static void main(String[] args) {
	    int[] arr = {10,20,30,40};
		// 修改数组arr的值，输出为0 1 2 3 4
	    reset(arr);
		// 输出修改之后的数组
	    for(int i=0;i<arr.length;i++){
	        System.out.println(arr[i]);
	    }
	}

}
