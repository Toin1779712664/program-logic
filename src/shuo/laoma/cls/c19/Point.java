package shuo.laoma.cls.c19;
// 实现MyComparable接口的compareTo功能
public class Point implements MyComparable {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(){
		return Math.sqrt(x*x+y*y);
	}
	// 实现这个接口的功能
	@Override
	public int compareTo(Object other) {
		if(!(other instanceof Point)){ // 使用instanceof判断传入的参数是否是Point类型,如果不是则抛出IllegalArgumentException异常(如果other是Point类型,那么返回结果为true,通过逻辑非运算符将结果变为false使这if语句不可运行)
			throw new IllegalArgumentException();
		}
		Point otherPoint = (Point)other;
		double delta = distance() - otherPoint.distance();
		if(delta<0){
			return -1;
		}else if(delta>0){
			return 1;
		}else{
			return 0;
		}
	}
	// 重载toStirng方法输出自定义格式
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
}


