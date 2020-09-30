package Main;

import java.util.Arrays;
import java.util.Stack;

public class Lgy extends ABS_Lgy {
	@Override
	public int[][] pailie(int[] a,int b) {
		// TODO Auto-generated method stub  
		int [][] arr = new int[100][3];
		int q = 0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					if(i!=j&&i!=k&&j!=k) {
						arr[q][0]=a[i];
						arr[q][1]=a[j];
						arr[q][2]=a[k];
						q++;
					}
					
				}
			}
		}
		//System.out.println("q:"+q);
		return arr;
	}
	
}
