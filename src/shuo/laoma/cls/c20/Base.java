package shuo.laoma.cls.c20;
    // 调用AbstractAdder接口,并在当前文件中实现add方法
public class Base extends AbstractAdder {
    private static final int MAX_NUM = 1000;
    private int[] arr = new int[MAX_NUM];
    private int count;
    // add方法对传入进来的number进行存放到arr数组的操作
    @Override
    public void add(int number){
        if(count<MAX_NUM){
            arr[count++] = number;    
        }
    }
}
