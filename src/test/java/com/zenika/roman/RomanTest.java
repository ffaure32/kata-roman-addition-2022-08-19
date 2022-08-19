package com.zenika.roman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanTest {


    @ParameterizedTest
    @CsvSource({
            "I,I,II",
            "I,II,III",
            "II,I,III",
            "I,III,IV",
            "III,I,IV",
            "II,II,IV",
            "II,III,V",
            "I,IV,V",
            "IV,I,V",
            "II,V,VII",
            "IV,IV,VIII",
            "IV,V,IX",
            "V,VII,XII",
            "IX,IX,XVIII",
            "XIX,XXVI,XLV",
            "XLV,V,L",
    })
    void additionTest(String leftOperand, String rightOperand, String expectedResult) {
        String result = new RomanCalculator().add(leftOperand, rightOperand);

        assertThat(result).isEqualTo(expectedResult);
    }


}
