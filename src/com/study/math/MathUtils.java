package com.study.math;

import java.math.BigDecimal;
import org.apache.commons.math3.distribution.BetaDistribution;

public class MathUtils {

    public static final int MAX_RANK = 100000;
    public static final int MAX_SCORE = 100000;
    private static final int DEFAULT_SCALE_LIMIT = 10;

    public static double betaDistribution(double impression, double click) {
        if (click <= 0) {
            impression = 1;
            click = 1;
        }

        BetaDistribution betaDistribution = new BetaDistribution(click, impression);
        return doubleRound(betaDistribution.sample(), DEFAULT_SCALE_LIMIT);
    }

    public static double doubleRound(double number, int scaleLimit) {
        BigDecimal bd = new BigDecimal(number);
        return bd.setScale(scaleLimit, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double customWeight(double weight) {
        return Math.log(weight + 1) / Math.log(Double.MAX_VALUE);
    }

    public static double boostScore(double weight) {
        return doubleRound(weight / MAX_SCORE, DEFAULT_SCALE_LIMIT);
    }
}
