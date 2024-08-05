package shuo.laoma.basic.c11;

public class VarArg {
	// 在C++中该方式被称为可变参方式
	public static int max(int min, int ... a){
		// 返回最大的值
	    int max = min;
	    for(int i=0;i<a.length;i++){
	        if(max<a[i]){	如果当前的值小于a[i]的值那么将max设置为当前最大的这个值
	            max = a[i];
	        }
	    }
	    return max;
	}

	public static void main(String[] args) {
	    System.out.println(max(0));	// 返回 0
	    System.out.println(max(0,2)); // 返回 2
	    System.out.println(max(0,2,4)); // 返回 4
	    System.out.println(max(0,2,4,5)); // 返回 5
	}

}
