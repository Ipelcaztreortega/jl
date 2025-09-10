package Fundamentals.GenericsExtra.utils;

import java.util.ArrayList;
import java.util.List;

// Allows user to query or search for a list
public class QueryList <T extends QueryItem>{
    private List<T> items;

    public QueryList(List<T> items) {
        this.items = items;
    };

    // This T type parameter is a totally different type, separate from the type parameter declared for the class itself
    public static <T extends QueryItem> List<T> getMatches(List<T> items, String field, String value) {
        List<T> matches = new ArrayList<>();
        for (var item: items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public List<T> getMatches(String field, String value) {
        List<T> matches = new ArrayList<>();
        for (var item: items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
