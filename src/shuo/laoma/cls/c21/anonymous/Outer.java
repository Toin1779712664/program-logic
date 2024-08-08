package shuo.laoma.cls.c21.anonymous;
 // 导入自定义的Point类
import shuo.laoma.cls.c14.Point;

public class Outer {
    public void test(final int x, final int y){
        Point p = new Point(2,3){                
            // 重写distance方法使其返回new Point的结果                                   
            @Override                              
            public double distance() {             
                return distance(new Point(x,y));     
            }                                      
        };                                       
                                                 
        System.out.println(p.distance());        
    }

}
