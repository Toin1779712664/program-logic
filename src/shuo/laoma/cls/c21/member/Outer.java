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
    // 这是一个简单的代码示例，该代码声明一个内部类Inner并定义了innerMethod方法，该方法调用外部定义的action方法。在使用inner.innerMethod()时它将先打印action里的内容记者在输出innerMethod()里的内容
}
