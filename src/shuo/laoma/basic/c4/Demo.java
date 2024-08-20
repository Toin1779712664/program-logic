package shuo.laoma.basic.c4;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 25; 
		// Integer和Long包装类的使用方法:使用对应的转换方法
		System.out.println(Integer.toBinaryString(a)); //二进制
		System.out.println(Integer.toHexString(a));  //十六进制
		System.out.println(Long.toBinaryString(a)); //二进制
		System.out.println(Long.toHexString(a));  //十六进制
	}

}
