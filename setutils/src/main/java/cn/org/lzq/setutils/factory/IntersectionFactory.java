package cn.org.lzq.setutils.factory;

import cn.org.lzq.setutils.core.IntersectionType;
import cn.org.lzq.setutils.operation.Intersection;

public class IntersectionFactory {
	public static Intersection getIntersection(IntersectionType intersectionType) {
		Intersection intersection = null;
		try {
			intersection=(Intersection)Class.forName("cn.org.lzq.setutils.operation.impl."+intersectionType.getType()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return intersection;
	}
}
