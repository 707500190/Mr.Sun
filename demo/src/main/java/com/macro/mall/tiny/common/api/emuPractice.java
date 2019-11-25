package com.macro.mall.tiny.common.api;

/**
 * 枚举通过构造器传参
 * 将枚举的值通过构造器的参数 一一对应传给属性  构造器参数类型 一一对应 与枚举值里面的值 否则报错
 *
 */
public enum emuPractice {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");


    private emuPractice(long code, String mess) {
        System.out.println("code"+code+"  mess "+mess);
        this.code = code;
        this.mess = mess;

    }


    private long code;
    private String mess;

    public long getCode() {
        return code;
    }


}
