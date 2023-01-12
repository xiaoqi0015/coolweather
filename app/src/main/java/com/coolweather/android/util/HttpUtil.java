package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author shkstart
 * @create 2023-01-10-9:34
 */
public class HttpUtil {

    //发起一条HTTP请求只需要调用sendOkHttpRequest
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        //创建一个OkHttpClient的实例
        Request request = new Request.Builder().url(address).build();
        //发送HTTP请求，build方法之前有很多的连缀可以丰富这个Request对象，比如通过url方法来设置目标的网络地址
        client.newCall(request).enqueue(callback);
        //调用OkHttpClient的newCall方法来创建一个Call对象，并调用它的execute方法来发送请求并获取服务器返回的数据

    }
}
