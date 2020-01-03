package com.sunshine.free.utils;

/**
 * @ClassName:
 * @Descrition:
 * @author Free
 * @date 2019-06-20
 */
public enum StatusEnums {

    OK("0", "正常"), DISABLE("1", "停用"), DELETED("-1", "删除");

    private final String code;
    private final String info;

    StatusEnums(String code, String info)
    {
        this.code = code;
        this.info = info;
    }

    public String getCode()
    {
        return code;
    }

    public String getInfo()
    {
        return info;
    }

}
