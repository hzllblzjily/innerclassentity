package com.hongbao.innerclassentity;

import com.hongbao.entity.Outer;
import com.hongbao.entity.Outer.Inner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Outer outer = new Outer();
        
        Outer.Inner inner = outer.new Inner();

        Inner inner2 = outer.getInner();
        inner.action();
        inner2.action();
        
        new Outer.StaticInnerClass().act();
        
        outer.getInter().active();
        outer.getPInter().active();
        
    }
}
