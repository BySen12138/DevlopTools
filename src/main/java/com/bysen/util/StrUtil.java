package com.bysen.util;

/**
 * @ClassName StrUtil
 * @Author Bysen
 * @Date 2022/3/5 22:26
 * @Description TODO
 * @Version 1.0
 * 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
 **/
public final class StrUtil {
    private final static String Y = "Y";
    private final static String N = "N";

    /**
     *
     * @param str
     * @return
     */
    public static boolean isEqualsY(String str){
        if (Y.equals(str)) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param str
     * @return
     */
    public static boolean isEqualsN(String str){
        if (N.equals(str)) {
            return true;
        }
        return false;
    }

}
