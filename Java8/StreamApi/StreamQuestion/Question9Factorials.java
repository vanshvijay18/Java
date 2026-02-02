package com.streamQuestion;

import java.util.Arrays;
import java.util.List;

public class Question9Factorials {
	
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
	list.stream().map(i->{
		int facto=1;
		for(int j=1;j<=i;j++) {
			facto*=j;
		}
		return facto;
		
	}).forEach(i->System.out.println(i));
	}
}
