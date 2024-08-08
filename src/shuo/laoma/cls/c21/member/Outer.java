package shuo.laoma.cls.c21.member;

public class Outer {
    private int a = 100;
    
    public class Inner {
        public void innerMethod(){
            System.out.println("outer a " +a);
            Outer.this.action();
        }
    }
    
    private void action(){
        System.out.println("action");
    }
    
    public void test(){
        Inner inner = new Inner();
        inner.innerMethod();
    }
    // 这是一个简单的代码示例，该代码声明一个内部类Inner并定义了innerMethod方法，该方法调用外部定义的action方法。在使用inner.innerMethod()时它先打印innerMethod内的pritnln语句接着调用action方法并打印里面的内容。
}
