package com.fjaisino.application.common.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @program: application
 * @description: 发送http请求工具类
 * @author: Mr.Peng
 * @create: 2018-12-07 22:55
 **/

public class HttpUtil {

    /*public static String sendPostRequest(String url, MultiValueMap<String,String> param){
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(10*1000);
        requestFactory.setReadTimeout(10*1000);

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpMethod httpMethod = HttpMethod.POST;
        //以表单方式提交请求
        httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //将请求头部和参数合成一个请求
        HttpEntity<MultiValueMap> httpEntity = new HttpEntity<MultiValueMap>(param,httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(url,httpMethod,httpEntity,String.class);
        String string = response.getBody();
        return string;


    }*/

    public static String sendPostRequest(String reqUrl,String xmlParam) throws IOException {
        String mes = "";
        URL url = new URL(reqUrl);
        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
        urlConn.setRequestMethod("POST");//这个要设成post同时还要设置如下三个：
        urlConn.setDoOutput(true);
        urlConn.setDoInput(true);
        urlConn.setUseCaches(false);
        //urlConn.setRequestProperty("Pragma:", "no-cache");
        urlConn.setRequestProperty("Cache-Control", "no-cache");
        urlConn.setRequestProperty("Content-Type", "text/xml");

        //post发送如下：
        DataOutputStream out = new DataOutputStream(urlConn.getOutputStream());
        // 正文，正文内容其实跟get的URL中'?'后的参数字符串一致
        String content = xmlParam;
        //content = URLEncoder.encode(content, "GBK");
        //System.out.println("http: "+content);
        out.write(content.getBytes("UTF-8"));
        out.flush();
        out.close();

        //urlConn.getInputStream() 调用该方法才真正意义上去取数据
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream(),"GBK"));
        String s ="";
        while((s=reader.readLine())!=null){
            mes += s;
        }
//    System.out.println("mes"+mes);
        reader.close();
        urlConn.disconnect();
        return mes;
    }
}
