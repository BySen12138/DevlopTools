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
}
