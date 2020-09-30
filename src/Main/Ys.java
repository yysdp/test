package Main;

import java.util.Arrays;
import java.util.Stack;

public class Ys extends ABS_Ys {
	
	@Override
	public int[][] zuhe(int[] a,int b) {
		int [][] arr = new int[100][3];
		int q = 0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {					
					arr[q][0]=a[i];
					arr[q][1]=a[j];
					arr[q][2]=a[k];
					q++;
				}
			}
		}
		return arr;
	}

}
