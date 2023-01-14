package ru.belogurow;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1061Test {

    private final Solution1061 solution = new Solution1061();

    @Test
    void smallestEquivalentString_VerifyAnswer() {
        String s1 = "cgokcgerolkgksgbhgmaaealacnsshofjinidiigbjerdnkolc";
        String s2 = "rjjlkbmnprkslilqmbnlasardrossiogrcboomrbcmgmglsrsj";
        String baseStr = "bxbwjlbdazfejdsaacsjgrlxqhiddwaeguxhqoupicyzfeupcn";

        Assertions.assertThat(solution.smallestEquivalentString(s1, s2, baseStr))
                .isEqualTo("axawaaaaazaaaaaaaaaaaaaxaaaaawaaauxaaauaaayzaauaaa");

    }

    @Test
    void smallestEquivalentString_VerifyAnswer2() {
        String s1 = "parker";
        String s2 = "morris";
        String baseStr = "parser";

        Assertions.assertThat(solution.smallestEquivalentString(s1, s2, baseStr))
                .isEqualTo("makkek");
    }

    @Test
    void smallestEquivalentString_VerifyAnswer3() {
        String s1 = "acb";
        String s2 = "bdd";
        String baseStr = "par";

        Assertions.assertThat(solution.smallestEquivalentString(s1, s2, baseStr))
                .isEqualTo("par");
    }
}