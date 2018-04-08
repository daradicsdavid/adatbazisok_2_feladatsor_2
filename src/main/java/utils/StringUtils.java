package utils;


import org.apache.commons.text.StrSubstitutor;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringUtils {

    public static String transformTemplate(String template, Map.Entry<String, Object>... data) {
        Map<String, Object> dataMap = Arrays.stream(data).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        StrSubstitutor sub = new StrSubstitutor(dataMap, "${", "}");

        return sub.replace(template);
    }


    public static void printImportantTemplate(String template, Map.Entry<String, Object>... data) {
        printTemplate("=====================================================");
        printTemplate(template, data);
        printTemplate("=====================================================");
    }

    public static void printTemplate(String template, Map.Entry<String, Object>... data) {
        System.out.println(transformTemplate(template, data));
        System.out.println();
    }

    public static Map.Entry<String, Object> entry(String string, Object object) {
        return new AbstractMap.SimpleEntry<>(string, object);
    }
}
