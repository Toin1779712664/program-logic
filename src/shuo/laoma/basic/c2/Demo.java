package shuo.laoma.basic.c2;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 基本类型打印
		byte b = 23;
		short s = 3333;
		int i = 9999;
		long l = 32323;
		
		long a = 3232343433L;
		
		double d = 333.33;
		
		float f = 333.33f;
		
		int[] arr = {1,2,3};
//		int[] arr = new int[]{1,2,3};
//		int[] arr = new int[3]; 
//		arr[0]=1; arr[1]=2; arr[2]=3;
		// 基本打印方式
		System.out.println(b);
		// 数组的基本打印方式
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		// foreach打印方式1:此时i将代表arr的下标
		for(int i:arr){
			System.out.println(arr[i]);
		}
		// foreach打印方式2:此时i将代表arr数组里的值
		for(int i:arr){
			System.out.println(i);
		}

	}

}
