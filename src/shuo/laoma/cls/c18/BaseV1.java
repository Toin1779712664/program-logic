package shuo.laoma.cls.c18;

public class BaseV1 {
	private static final int MAX_NUM = 1000;
	private int[] arr = new int[MAX_NUM];
	private int count;
	
	public void add(int number){
		if(count<MAX_NUM){
			arr[count++] = number;	
		}
	}
	
	public void addAll(int[] numbers){
		for(int num : numbers){
			add(num);
		}
	}
	// 以上代码没有问题,但count最好还是初始化为0,而addAll初始化对应的数组(使用add方法)
}




