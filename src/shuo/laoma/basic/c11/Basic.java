package shuo.laoma.basic.c11;

public class Basic {

	// 求和
	public static int sum(int a, int b){
	    int sum = a + b;
	    return sum;
	}
	// 打印三个换行
	public static void print3Lines(){
	    for(int i=0;i<3;i++){
	        System.out.println();
	    }
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    int a = 2;
	    int b = 3;
		// 输出：5
	    int sum = sum(a, b);

	    System.out.println(sum);
	    print3Lines();
		// 输出：7
	    System.out.println(sum(3,4));

	}

}
