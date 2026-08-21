package pl.mikolaj.javapractice.y2026.m08.leetcode.longestpalindromicsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void returnsSingleCharacterForSingleCharacterInput() {
        Solution solution = new Solution();
        assertEquals("a", solution.longestPalindrome("a"));
    }

    @Test
    void findsPalindromeInEvenLengthString() {
        Solution solution = new Solution();
        assertEquals("abba", solution.longestPalindrome("abba"));
    }

    @Test
    void findsPalindromeInOddLengthString() {
        Solution solution = new Solution();
        assertEquals("aba", solution.longestPalindrome("aba"));
    }

    @Test
    void findsLongestPalindromeInMixedString() {
        Solution solution = new Solution();
        assertEquals("anana", solution.longestPalindrome("bananas"));
    }

    @Test
    void handlesStringWithNoPalindrome() {
        Solution solution = new Solution();
        assertEquals("a", solution.longestPalindrome("abc"));
    }

    @Test
    void handlesExample1() {
        Solution solution = new Solution();
        assertEquals("bab", solution.longestPalindrome("babad"));
    }

    @Test
    void handlesExample2() {
        Solution solution = new Solution();
        assertEquals("bb", solution.longestPalindrome("cbbd"));
    }

    @Test
    void handlesExample2a() {
        Solution solution = new Solution();
        assertEquals("bb", solution.longestPalindrome("bb"));
    }

    @Test
    void handlesTestCase129() {
        Solution solution = new Solution();
        assertEquals("rbobr", solution.longestPalindrome("busislnescsicxpvvysuqgcudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwphrweyfkbnjgerkmifbirubhseuhrugwrabnjafnbdfjnufdstjbkuwtnpflffaqmjbhssjlnqftgjiglvvequhapasarlkcvbmkwnkuvwktbgfoaxteprobdwswcdyddyvrehvmxrrjiiidatidlpihkbmmruysmhhsncmfdanafdrfpdtfgkglcqpwrrtvacuicohspkounojuziittugpqjyhhkwfnflozbispehrtrnizowrlzcuollagxwtznjwzcumvedjwokueuqktvvouwnsmpxqvvpuwprezrbobrpnwaccwljchdguubjulyilzvmandjjleitweybqkjttschrjjlebnmponvlktzzcdtuybugggcqffkcffpamauvxfbonjrobgpvlyzveiwemmtdvbjciaytvesnocnjrwodtcokgcuoiicxapmrzpkfphjniuvzjrhbnqndfshoduejyktebgdabidxlkstepuwvtrtgbxaeheylicvhrxddijshcvdadxzsccmainyfpfdhqdanfccqkzlmhsfilvoybqojlvbcixjzqpbngdvesuokbxhkomsiqfyukvspqthlzxdnlwthrgaxhtpjzhrugqbfokrdcyurivmzgtynoqfjbafboselxnfupnpqlryvlcxeksirvufepfwczosrrjpudbwqxwldgjyfjhzlzcojxyqjyxxiqvfhjdwtgoqbyeocffnyxhyyiqspnvrpxmrtcnviukrjvpavervvztoxajriuvxqveqsrttjqepvvahywuzwtmgyrzduxfqspeipimyoxmkadrvrdyefekjxcmsmzmtbugyckcbjsrymszftjyllfmoeoylzeahnrxlxpnlvlvzltwnmldi"));
    }
}
