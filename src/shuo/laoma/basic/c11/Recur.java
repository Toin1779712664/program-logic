package shuo.laoma.basic.c11;

public class Recur {
	// 斐波那契递归方式：
	public static long factorial(int n){
		// 基线条件，用于退出递归操作
	    if(n==0){
	        return 1;
	    }else{
	        return n*factorial(n-1);
	    }
	}
	// 斐波那契普通方式
	public static long factorial2(int n){
	    long result = 1;
		// 使用for方式
	    for(int i=1; i<=n; i++){
	        result*=i;
	    }
	    return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 添加测试
		long result1=factorial(5);
		System.out.println(result1);
		long resulut2=factorial2(5);
		System.out.println(result2);
	}

}
