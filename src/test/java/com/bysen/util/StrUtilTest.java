package com.bysen.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @ClassName StrUtilTest
 * @Author Bysen
 * @Date 2022/3/6 22:59
 * @Description TODO
 * @Version 1.0
 **/
@RunWith(PowerMockRunner.class)
@PrepareForTest({StrUtil.class})
public class StrUtilTest {
    @Test
    public void testIsEqualsY(){
        Assert.assertEquals(StrUtil.isEqualsY(""),false);
        Assert.assertEquals(StrUtil.isEqualsY(null),false);
        Assert.assertEquals(StrUtil.isEqualsY("Y"),true);

    }

    @Test
    public void testIsEqualsN(){
        Assert.assertEquals(StrUtil.isEqualsN(""),false);
        Assert.assertEquals(StrUtil.isEqualsN(null),false);
        Assert.assertEquals(StrUtil.isEqualsN("N"),true);
    }

    @Test
    public void testIsEquals(){
        Assert.assertEquals(StrUtil.isEquals(null,null),true);
        Assert.assertEquals(StrUtil.isEquals(null,"str2"),false);
        Assert.assertEquals(StrUtil.isEquals("","str2"),false);
        Assert.assertEquals(StrUtil.isEquals("",null),false);
        Assert.assertEquals(StrUtil.isEquals("str1",null),false);
        Assert.assertEquals(StrUtil.isEquals("str","str"),true);

    }

    @Test
    public void testLeftAdd(){
        Assert.assertEquals(StrUtil.leftAdd("",1,"A"),"A");
        Assert.assertEquals(StrUtil.leftAdd("A",1,"A"),"AA");
        Assert.assertEquals(StrUtil.leftAdd("B",2,"A"),"AAB");
    }

    @Test
    public void testRightAdd(){
        Assert.assertEquals(StrUtil.rightAdd("",1,"A"),"A");
        Assert.assertEquals(StrUtil.rightAdd("A",1,"A"),"AA");
        Assert.assertEquals(StrUtil.rightAdd("B",2,"A"),"BAA");
    }

}
