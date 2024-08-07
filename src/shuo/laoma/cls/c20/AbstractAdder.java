package shuo.laoma.cls.c20;
    // 定义抽象类,该抽象类实现接口addAll方法,该方法又调用了add方法
public abstract class AbstractAdder implements IAdd {
    @Override
    public void addAll(int[] numbers) {
        for(int num : numbers){
            add(num);
        }
    }
}
