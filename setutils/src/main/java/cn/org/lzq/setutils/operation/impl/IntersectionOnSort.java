package cn.org.lzq.setutils.operation.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import cn.org.lzq.setutils.comparator.DefaultComparator;
import cn.org.lzq.setutils.operation.Intersection;
import cn.org.lzq.sort.core.SortDirection;
import cn.org.lzq.sort.core.SortType;
import cn.org.lzq.sort.factory.SortFactory;
import cn.org.lzq.sort.sort.Sort;

public class IntersectionOnSort implements Intersection {
	private Sort sort = SortFactory.getSort(SortType.BubbleSort);
	private Comparator comparator = new DefaultComparator();
	
	@Override
	public <T> Object[] getResult(T[] setA, T[] setB) {
		List<Object> result = new ArrayList<Object>();
		sort.getResult(setA, SortDirection.Positive, comparator);
		sort.getResult(setB, SortDirection.Positive, comparator);
		T[] smaller = setA;
		T[] bigger = setB;
		if(comparator.compare(setA[0], setB[0])<0) {
			bigger = setB;
			smaller = setA;
		}
		int index = 0;
		outter:
		for(int i=0;i<bigger.length;i++) {
			inner:
			for(int j=index;j<smaller.length;j++) {
				if(bigger[i]==smaller[j]) {
					result.add(bigger[i]);
					index=j;
					break inner;
				}else if(comparator.compare(bigger[i], smaller[j])<0){
					index=j;
					break inner;
				}else if(j==smaller.length-1){
					break outter;
				}
			}
		}
		return result.toArray();
	}
}
