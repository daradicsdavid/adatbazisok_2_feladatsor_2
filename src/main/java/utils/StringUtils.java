package utils;


import org.apache.commons.text.StrSubstitutor;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringUtils {

    public String transformTemplate(String template, Map.Entry<String, Object>... data) {
        Map<String, Object> dataMap = Arrays.stream(data).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        StrSubstitutor sub = new StrSubstitutor(dataMap, "$(", ")");

        return sub.replace(template);
    }
}
