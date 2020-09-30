package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import Main.*;
class Test {
	Calclulate calclulate;
	ABS_Zhl zhl;
	ABS_Cyc cyc;
	ABS_Lgy lgy;
	ABS_Ys ys;
	String path;
	int j;
	int[] array;
	

	@org.junit.jupiter.api.Test
	void testPailie() {	
		Calclulate calclulate = new Calclulate();
		ABS_Zhl zhl = new Zhl();
		ABS_Cyc cyc = new Cyc();
		ABS_Lgy lgy = new Lgy();
		
		array = new int[] {2,3,5,4,1};
		
		calclulate.setZhl(zhl);
		calclulate.setCyc(cyc);
		calclulate.setLgy(lgy);

		j = 3;

		array = calclulate.paixu(array);
		int[][] a = calclulate.pailie(array,j);
	
		int num = calclulate.getPNum(array.length, j);
		
		int length=0;
		for(int i=0;i<100;i++) {
			if(a[i][0]!=0) {
				length++;
			}
		}
		for(int i=0;i<length;i++) {
			System.out.print(a[i][0]);
			System.out.print(a[i][1]);
			System.out.print(a[i][2]);
			System.out.println();
		}
		System.out.println("pailie:"+num+"  "+length);
		assertEquals(num,length);
		
	
	}
	@org.junit.jupiter.api.Test
	void testZuhe() {
		//System.out.println("arrayZ:"+array[0]+" "+j);
		Calclulate calclulate = new Calclulate();
		ABS_Zhl zhl = new Zhl();
		ABS_Cyc cyc = new Cyc();
		ABS_Ys ys = new Ys();
		
		array = new int[] {2,3,5,4,1};
		int[] arraytest = new int[] {1,2,3,4,5};
		
		calclulate.setZhl(zhl);
		calclulate.setCyc(cyc);
		calclulate.setYs(ys);
		j = 3;
		array = calclulate.paixu(array);
		for(int i=0;i<array.length;i++) {
			assertEquals(array[i],arraytest[i]);
		}
		int[][] a = calclulate.zuhe(array,j);
	
		int num = calclulate.getZNum(array.length, j);
		int length=0;
		for(int i=0;i<100;i++) {
			if(a[i][0]!=0) {
				length++;
			}
		}
		for(int i=0;i<length;i++) {
			System.out.print(a[i][0]);
			System.out.print(a[i][1]);
			System.out.print(a[i][2]);
			System.out.println();
		}
		System.out.println("zuhe:"+num+"  "+length);
		assertEquals(num,length);
	}


}
