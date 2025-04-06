package easy._0800_0899._0824;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", solution.toGoatLatin("I speak Goat Latin"));

        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                solution.toGoatLatin("The quick brown fox jumped over the lazy dog"));

        assertEquals("Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa",
                solution.toGoatLatin("Each word consists of lowercase and uppercase letters only"));
    }
}
