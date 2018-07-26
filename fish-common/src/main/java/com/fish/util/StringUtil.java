package com.fish.util;

/**
 * Created by fish on 2018/7/26.
 */
public class StringUtil {

    /**
     * 是否为空
     *
     * @param o
     * @return
     */
    public static boolean isEmpty(Object o) {
        if (o == null) {
            return true;
        }
        if ("".equals(filterNull(o.toString()))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 是否不为空
     *
     * @param o
     * @return
     */
    public static boolean isNotEmpty(Object o) {
        if (o == null) {
            return false;
        }
        if ("".equals(filterNull(o.toString()))) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 过滤空NULL
     *
     * @param o
     * @return
     */
    public static String filterNull(Object o) {
        return o != null && !"null".equals(o.toString()) ? o.toString().trim() : "";
    }


    /**
     * unicode 转字符串
     */
    public static String unicode2String(String unicode) {
        StringBuffer string = new StringBuffer();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            // 转换出每一个代码点
            int data = Integer.parseInt(hex[i], 16);
            // 追加成string
            string.append((char) data);
        }
        return string.toString();
    }


    /**
     * 获取随机字符串
     *
     * @param length
     * @return
     */
    public static String getRandomString(int length) {
        return getRandomString(length, true, true, true);
    }

    /**
     * @param length
     * @param includeUpper
     * @param includeLower
     * @param includeDigital
     * @return
     */
    public static String getRandomString(int length, boolean includeUpper, boolean includeLower, boolean includeDigital) {
        if (length > 100) {
            length = 100;
        }

        if (length > 100) {
            throw new IllegalArgumentException("生成的字符串长度必须<100！");
        }
        String s = "";
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < length; i++) {
            sb.append(s.charAt((int) Math.round(Math.random() * (len - 1))));
        }
        return sb.toString();
    }

}