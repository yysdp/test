package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Zhl extends ABS_Zhl {
	@Override
	public int getPailieNum(int a, int b) {
		// TODO Auto-generated method stub
		int num = 1;
		for(int i = a;i>a-b;i--) {
			num*=i;
		}
		
		return num;
	}

	@Override
	public int getZuheNum(int a, int b) {
		// TODO Auto-generated method stub
		int num = getPailieNum(a, b);
		for(int i=b;i>0;i--) {
			num/=i;
		}
		return num;
	}


	

}
