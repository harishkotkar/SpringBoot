package com.harish.java.Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleClass {

    public static void main(String args[]) {
        List<String> urls = new ArrayList<>();
        urls.add("https://www.domain.com?param1=val1&param2=val2");
        urls.add("https://www.domain.com?param1=val11&param2=val22");

        Map<String, String> map = getParams(urls);
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

    //https://www.domain.com?param1=val1&param2=val2

    public static Map<String, String> getParams(List<String> urls) {
        Map<String, String> map = new HashMap<>();

        for (String url: urls) {
            String[] vars = url.substring(23).split("&");
            String val1 = vars[0].substring(7);
            String val2 = vars[1].substring(7);
            if (val1 != null && val2 != null) {
                map.put(val1, val2);
            }
        }

        return map;
    }

}
