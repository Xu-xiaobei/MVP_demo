package com.zuowen.magic.myapplication.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by worm on 2016/3/25.
 */
public class Content {
    public String title;
    public String body;

    public Content(String title, String body) {
        this.title = title;
        this.body = body;
    }
    //所有数据
    public static Map<String,Content> VALUE_MAP=new HashMap<String,Content>();

    static {
        VALUE_MAP.put("敲敲demo",new Content("真的敲敲demo","提升自己敲demo"));

    }
}
