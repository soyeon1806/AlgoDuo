package soyeon.ETC;

import java.io.*;
import java.util.*;

public class 구름공원 {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] list = input.split(" ");
		int N = Integer.parseInt(list[0]);
		int M = Integer.parseInt(list[1]);
		
		input = br.readLine();
		list = input.split(" ");
	  int[] bench = Arrays.stream(list).mapToInt(Integer::parseInt).toArray();
		
		
		int total = Arrays.stream(bench).sum();
		
		int list_max = Arrays.stream(bench).max().orElse(0);
		
		int bench_max = list_max + M;
		int bench_min = 0;
		
		if((M + total) % N == 0){
			bench_min = (M + total) / N;
		}
		else{
			bench_min = ((M + total) / N) + 1;
		}
		
		if (list_max > bench_min) {
    bench_min = list_max;
		}
		
		
	  System.out.println(bench_min + " " + bench_max);
	}
}
