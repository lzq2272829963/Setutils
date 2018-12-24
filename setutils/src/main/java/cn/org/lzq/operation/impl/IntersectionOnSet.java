package cn.org.lzq.operation.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.ListUtils;

import cn.org.lzq.operation.Intersection;

public class IntersectionOnSet implements Intersection {

	@Override
	public <T> Object[] getResult(T[] a, T[] b) {
		List<T> result = new ArrayList<T>();
		Set<T> setA = new HashSet<T>();
		for(T instance:a) {
			setA.add(instance);
		}
		for(T instance:b) {
			if(setA.contains(instance)) {
				result.add(instance);
			}
		}
		return result.toArray();
	}

}
