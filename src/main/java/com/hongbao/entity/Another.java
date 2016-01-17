/**
 * 
 */
package com.hongbao.entity;


/**
 * @author hzllb
 *
 * 2016年1月17日
 */
public class Another {

	protected String nameString;
	public Another(){
		new Outer().new Inner();
		
		//局部内部类
		class AnnotherLocalInner{
			public void action(){
				
			}
		}
		new AnnotherLocalInner().action();
		
		//匿名内部类
		new Object(){
			{System.out.println("匿名内部类构造器");}
			public void action(){
				
			}
		}.action();
	}
}
