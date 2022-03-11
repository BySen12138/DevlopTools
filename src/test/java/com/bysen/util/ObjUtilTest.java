package com.bysen.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObjUtilTest
 * @Author Bysen
 * @Date 2022/3/5 23:51
 * @Description TODO
 * @Version 1.0
 **/
@RunWith(PowerMockRunner.class)
@PrepareForTest({ObjUtil.class})
public class ObjUtilTest {

    List list = new ArrayList();
    @Test
    public void testIsNull(){
        Assert.assertEquals(ObjUtil.isNull(null),true);
        Assert.assertEquals(ObjUtil.isNull(new Object()),false);
        Assert.assertEquals(ObjUtil.isNull(""),true);
        Assert.assertEquals(ObjUtil.isNull("str"),false);
        Assert.assertEquals(ObjUtil.isNull(list),true);
        list.add(new Object());
        Assert.assertEquals(ObjUtil.isNull(list),false);
    }

    @Test
    public void testIsNotNull(){
        Assert.assertEquals(ObjUtil.isNotNull(null),false);
    }

    @Test
    public void testNvl(){
        Object object = new Object();
        Assert.assertEquals(ObjUtil.nvl(null,object),object);
        Assert.assertEquals(ObjUtil.nvl(object,null),object);
        Assert.assertEquals(ObjUtil.nvl(null,null),null);
    }
}
