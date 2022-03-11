package com.bysen.util;

/**
 * @ClassName StrUtil
 * @Author Bysen
 * @Date 2022/3/5 22:26
 * @Description TODO
 * @Version 1.0
 **/
public final class StrUtil {
    private final static String Y = "Y";
    private final static String N = "N";

    /**
     *用于判断字符串是否等于 Y
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
     *用于判断字符串是否等于 N
     * @param str
     * @return
     */
    public static boolean isEqualsN(String str){
        if (N.equals(str)) {
            return true;
        }
        return false;
    }


    /**
     *判断两个字符是否相等，会处理空值
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isEquals(String str1,String str2){
        if(str1 == null && str2 == null){
            return true;
        }
        if(str1 != null){
            return str1.equals(str2);
        }
        return false;
    }

    /**
     * 在字符串左侧添加指定字符串
     * @param source
     * @param num
     * @param prefix
     * @return
     */
    public static String leftAdd(String source,int num,String prefix){
        if(ObjUtil.isNull(prefix)||ObjUtil.isNull(num)|| num <= 0){return source;}
        if (ObjUtil.isNull(source)){source = "";}
        StringBuffer sb = new StringBuffer(source);
        for (int i=1;i<=num;i++){
            sb.insert(0,prefix);
        }
        return sb.toString();
    }

    /**
     * 在字符串右侧添加字符串
     * @param source
     * @param num
     * @param prefix
     * @return
     */
    public static String rightAdd(String source,int num,String prefix){
        if(ObjUtil.isNull(prefix)||ObjUtil.isNull(num)|| num <= 0){return source;}
        if (ObjUtil.isNull(source)){source = "";}
        StringBuffer sb = new StringBuffer(source);
        for (int i=1;i<=num;i++){
            sb.append(prefix);
        }
        return sb.toString();
    }
}
