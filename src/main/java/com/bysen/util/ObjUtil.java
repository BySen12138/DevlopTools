package com.bysen.util;

import java.util.Collection;
import java.util.List;

/**
 * @ClassName ObjUtil
 * @Author Bysen
 * @Date 2022/3/5 23:32
 * @Description TODO
 * @Version 1.0
 **/
public final class ObjUtil {

    /**
     *判断是否为空
     * @param object
     * @return boolean
     */
    public static boolean isNull(Object object){
        if(object == null){
            return true;
        }
        if(object instanceof String){
            return object == "";
        }
        if(object instanceof Collection){
            return ((Collection) object).size() == 0;
        }
        return false;
    }

    /**
     * 判断是否不为空
     * @param object
     * @return boolean
     */
    public static boolean isNotNull(Object object){
        return !isNull(object);
    }

    /**
     *入参1不为空时直接返回，否则返回入参2
     * @param obj1
     * @param obj2
     */
    public static Object nvl(Object obj1, Object obj2){
        return obj1 == null?obj2:obj1;
    }
}
