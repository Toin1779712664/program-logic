package shuo.laoma.basic.c12;

public class Recur {
	// 使用递归方式打印斐波那契
	public static int factorial(int n) {
	    if(n==0){
	        return 1;
	    }else{
	        return n*factorial(n-1);
	    }
	}

	public static void main(String[] args) {
	    int ret = factorial(4);
	    System.out.println(ret);
	}

}
