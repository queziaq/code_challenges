package org.challenge.onemonthprep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MatchingStrings {

    /*  There is a collection of input strings and a
    collection of query strings. For each query string,
    determine how many times it occurs in the list of input strings.
    Return an array of the results. */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Integer sumUp = 0;

        for(String query: queries) {
            for(String str: strings) {
                if(query.equals(str)) {
                    sumUp++;
                }
            }
            result.add(sumUp);
            sumUp = 0;
        }

        queries.forEach(e -> {
            result.add(strings.stream().filter(s -> s.equals(e))
                    .collect(Collectors.toList()).size());
        });

        return result;

    }
}
