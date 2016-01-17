/**
 * 
 */
package com.hongbao.entity;

/**
 * @author hzllb
 *
 * 2016年1月17日
 */
public class Outer {

	private int outer_i  = 0;
	
	public Inner getInner(){
		String string = new Another().nameString;

		return new Inner();
	}
	
	private static int static_i = 1;
	public Inter getInter(){
		return new ProtectedInner();
	}
	
	public Inter getPInter(){
		return new PrivateInner();
	}
	
	public static class StaticInnerClass{
		public int inner_i = 1;
		public static int inner_static_i = 2;
		public void act(){
			static_i = 3;
			
		}
	}
	public class Inner implements Inter{

		private int inner_i = 2;
		public Inner(){
			outer_i = 2;
			static_i = 3;
			Outer.this.outer_i = 2;
		}
		public void action(){
			System.out.println("inner action");
		}
		/* (non-Javadoc)
		 * @see com.hongbao.entity.Inter#active()
		 */
		public void active() {
			// TODO Auto-generated method stub
			
		}
	}
	
	protected class ProtectedInner implements Inter{

		/* (non-Javadoc)
		 * @see com.hongbao.entity.Inter#active()
		 */
		public void active() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class PrivateInner implements Inter{

		/* (non-Javadoc)
		 * @see com.hongbao.entity.Inter#active()
		 */
		public void active() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
