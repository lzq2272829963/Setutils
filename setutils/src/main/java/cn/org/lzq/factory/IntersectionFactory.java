package cn.org.lzq.factory;

import cn.org.lzq.operation.Intersection;

public class IntersectionFactory {
	public static Intersection getIntersection(IntersectionType intersectionType) {
		Intersection intersection = null;
		try {
			intersection=(Intersection)Class.forName("cn.org.lzq.operation.impl."+intersectionType.getType()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return intersection;
	}
}
