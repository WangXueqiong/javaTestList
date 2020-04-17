package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import myUtil.DateFormater;

public class test {
    public static void main(String[] args) throws IOException {
        String a ="1";
        String b ="1";
        String c ="1"+"";
        String d =a+"1";
        String e ="1";
        String f ="1";

        System.out.println(c == d);


        Integer aa = 1;
        Integer bb = 1;
        System.out.println(aa == bb);


        String lastMonth = DateFormater.DateToString(DateFormater.getAfterMonth(new Date(), -1), "yyyy_MM");
        lastMonth=lastMonth.substring(2, lastMonth.length());
        System.out.println(lastMonth);

        Double dd = 2.1;
        System.out.println(dd - dd.intValue() == 0);

    }


}
