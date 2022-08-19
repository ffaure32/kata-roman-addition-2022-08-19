package com.zenika.roman;

import io.vavr.collection.List;

public class RomanCalculator {
    private List<Conversion> conversions;
    private List<Conversion> reversed;

    public RomanCalculator() {
        conversions = List.of(
                new Conversion("IIIII", "V"),
                new Conversion("IIII", "IV"),
                new Conversion("VV", "X"),
                new Conversion("VIV", "IX"),
                new Conversion("XXXXX", "L"),
                new Conversion("XXXX", "XL")
        );
        reversed = conversions.reverse();
    }

    public String add(String leftOperand, String rightOperand) {
        return normalizeResult(denormalizeOperand(rightOperand) + denormalizeOperand(leftOperand));
    }

    private String normalizeResult(String result) {
        return conversions.foldLeft(result, (acc, conversion) -> conversion.normalize(acc));
    }

    private String denormalizeOperand(String operand) {
        return reversed.foldLeft(operand, (acc, conversion) -> conversion.denormalize(acc));
    }


}
