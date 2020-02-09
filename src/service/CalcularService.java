package service;

import java.util.List;

import entities.Produto;

public interface CalcularService {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista não existe");
		}
		
		T max = list.get(0);
		for(T item: list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		
		return max;
	}
	
	public static <T extends Comparable<T>> T min(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista não existe");
		}
		
		T min = list.get(0);
		for(T item: list) {
			if(item.compareTo(min) < 0) {
				min = item;
			}
		}
		
		return min;
		
	}
}
