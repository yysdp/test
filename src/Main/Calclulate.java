package Main;

import java.util.Stack;

public class Calclulate extends ABS_Calclulate {
	private ABS_Zhl zhl;
	private ABS_Ys ys;
	private ABS_Cyc cyc;
	private ABS_Lgy lgy;


	public ABS_Zhl getZhl() {
		return zhl;
	}
	public void setZhl(ABS_Zhl zhl) {
		this.zhl = zhl;
	}
	public ABS_Ys getYs() {
		return ys;
	}
	public void setYs(ABS_Ys ys) {
		this.ys = ys;
	}
	public ABS_Cyc getCyc() {
		return cyc;
	}
	public void setCyc(ABS_Cyc cyc) {
		this.cyc = cyc;
	}
	public ABS_Lgy getLgy() {
		return lgy;
	}
	public void setLgy(ABS_Lgy lgy) {
		this.lgy = lgy;
	}

	
	public int[] paixu(int[] a) {
		return cyc.paixu(a);		
	}
	public int[][] pailie(int[] a,int i) {
		return lgy.pailie(a,i)	;	
	}
	public int[][] zuhe(int[] a,int i) {
		return ys.zuhe(a,i);	
	}
	public int getPNum(int a, int b) {
		return zhl.getPailieNum(a, b);	
	}
	public int getZNum(int a, int b) {
		return zhl.getZuheNum(a, b);	
	}
	

	@Override
	public int[][] getPailieResult(int[] a, int b) {
		// TODO Auto-generated method stub
		return pailie(paixu(a),b);
	}
	@Override
	public int[][] getZuheResult(int[] a, int b) {
		// TODO Auto-generated method stub
		return zuhe(paixu(a),b);
	}
	@Override
	public int getPailieNum(int a, int b) {
		// TODO Auto-generated method stub
		return getPNum(a, b);	
	}
	@Override
	public int getZuheNum(int a, int b) {
		// TODO Auto-generated method stub
		return getZNum(a, b);	
	}
	


}
