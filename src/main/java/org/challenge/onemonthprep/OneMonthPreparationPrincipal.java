package org.challenge.onemonthprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.challenge.onemonthprep.MatchingStrings.*;

import static org.challenge.onemonthprep.FlippedBits.flippingBits;
import static org.challenge.onemonthprep.MatchingStrings.matchingStrings;
import static org.challenge.onemonthprep.Median.findMedian;
import static org.challenge.onemonthprep.MiniMaxSum.miniMaxSum;
import static org.challenge.onemonthprep.NumberOfCombinations.birthday;
import static org.challenge.onemonthprep.PlusMinus.plusMinus;
import static org.challenge.onemonthprep.StringXOR.stringsXOR;

public class OneMonthPreparationPrincipal {

    public static void execute() {
        System.out.println(matchingStrings(List.of("ab", "ab", "abc"),
                List.of("ab", "abc", "bc")));

        plusMinus(List.of(1, 1, 0, -1, 1));
        System.out.println(birthday(List.of(2, 2, 1, 3, 2), 4, 2));
        miniMaxSum(List.of(1,3,5,7,9));
        System.out.println(stringsXOR("10101", "00101"));
        System.out.println(flippingBits(0));
        System.out.println(findMedian(List.of(5,7,9,4,56,7,9,0,5)));
    }

}
