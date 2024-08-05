package shuo.laoma.basic.c10;

import java.util.Scanner;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);   // Scanner用于获取输入
		System.out.println("please input password");
		int num = reader.nextInt();   // 读取整数
		int password = 6789;
		while(num!=password){    // 读取的整数与password进行比较，不然则继续打印密码输入提示直到输入正确密码为止
		    System.out.println("please input password");
		    num = reader.nextInt();
		}
		System.out.println("correct");
		reader.close();

	}

}
