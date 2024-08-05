package shuo.laoma.cls.c19;

import java.util.Arrays;

public class CompUtil {
	// 实现数组版本,如果没有为max传入指定的对象则返回null值
	public static Object max(MyComparable[] objs) {
		if (objs == null || objs.length == 0) {
			return null;
		}
		// 假设最大值是objs的第一个元素
		MyComparable max = objs[0];
		for (int i = 1; i < objs.length; i++) { // 将遍历数组,且使用MyComparable接口的compareTo方法进行比较
			if (max.compareTo(objs[i]) < 0) {
				max = objs[i];
			}
		}
		return max;
	}
	// 排序算法
	public static void sort(MyComparable[] objs) {
		for (int i = 0; i < objs.length; i++) {
			int min = i;
			for (int j = i + 1; j < objs.length; j++) {
				if (objs[j].compareTo(objs[min]) < 0) {
					min = j;
				}
			}
			if (min != i) {	// 交换两个值
				MyComparable temp = objs[i];
				objs[i] = objs[min];
				objs[min] = temp;
			}
		}
	}

	public static void main(String[] args) {
		Point[] points = new Point[] { new Point(2, 3), new Point(3, 4),
				new Point(1, 2) };
		System.out.println("max: " + CompUtil.max(points));
		CompUtil.sort(points);
		System.out.println("sort: " + Arrays.toString(points));
	}
}
