package com.itheima.common.conversion;/**
 * @类名:TrimConverter
 * @描述:TODO
 * @作者:wanglei
 * @日期:19/8/11 上午1:31
 * @版本:1.0
 **/


import org.springframework.core.convert.converter.Converter;

/**
 *@类名:TrimConverter
 *@描述:自定义转换去掉前后空格
 *@作者:wanglei
 *@日期:19/8/11 上午1:31
 *@版本:1.0
 **/
public class TrimConverter implements Converter<String,String> {

    @Override
    public String convert(String s) {
        try {
            if (s!=null){
                s = s.trim();
                if (!"".equals(s)){
                    return s;
                }
            }
        }catch (Exception e){

        }
        return null;
    }
}
