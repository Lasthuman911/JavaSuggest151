package com.wu.string;

/**
 * 建议53：推荐是用replace方法进行字符串替换的操作
 * Created by lszhen on 2017/9/13.
 */
public class StringUtils {
    public static String remove(String source,String sub){
        return source.replace(sub,"");
        //return source.replaceAll(sub,"");-1.5之前，容易产生bug
    }
}