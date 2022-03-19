package creational;

import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONValue;

import java.util.*;

public class YAMLBookMetadataFormatter extends JSONBookMetadataFormatter {

    public YAMLBookMetadataFormatter() {
        super();
    }

    private String toString(String val) {
        if (val.indexOf(':') >= 0) {
            return "'" + val + "'";
        } else if (StringUtils.isNumeric(val)) {
            return "'" + val + "'";
        } else if (!JSONValue.escape(val).equals(val)) {
            return '"' + val + '"';
        }
        return JSONValue.escape(val);
    }

    private String toString(List<?> list) {
        StringBuilder out = new StringBuilder();
        boolean first = true;

        for (Object value : list) {
            if (first) {
                first = false;
            } else {
                out.append("\n");
            }

            out.append("- ");
            if (value instanceof String) {
                out.append(toString((String) value));
            } else if (value instanceof Map) {
                String map = toString((Map<?, ?>) value);
                out.append(map.replaceAll("\n", "\n  "));
            }
        }
        return out.toString();
    }

    private String toString(Map<?, ?> map) {
        StringBuilder out = new StringBuilder();
        boolean first = true;

        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (first) {
                first = false;
            } else {
                out.append("\n");
            }

            out.append(entry.getKey()).append(": ");
            Object value = entry.getValue();
            if (value instanceof String) {
                out.append(toString((String) value));
            } else if (value instanceof List) {
                out.append("\n");
                out.append(toString((List<?>) value));
            }
        }

        return out.toString();
    }

    @Override
    public String getMetadataString() {
        System.out.println("!!Warning!! YAML have limited feature and not complete all specification.");
        System.out.println("!!Warning!! Do not change TestData and structure.");
        return "---\n" + toString(books) + "\n";
    }
}
