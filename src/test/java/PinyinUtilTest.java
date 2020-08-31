import org.junit.Test;
import util.PinyinUtil;

public class PinyinUtilTest {
    @Test
    public void testCChinese(){
        String s = "汉语";
        System.out.println(PinyinUtil.containsChinese(s));
        String s1 = "汉语123";
        System.out.println(PinyinUtil.containsChinese(s1));
        String s2 = "汉语sdad";
        System.out.println(PinyinUtil.containsChinese(s2));
        String s3 = "汉语+_.><";
        System.out.println(PinyinUtil.containsChinese(s3));
        String s4 = "sda";
        System.out.println(PinyinUtil.containsChinese(s4));
        String s5 = "ADC";
        System.out.println(PinyinUtil.containsChinese(s5));
        String s6 = "as';;";
        System.out.println(PinyinUtil.containsChinese(s6));
        String s7 = "ASD';";
        System.out.println(PinyinUtil.containsChinese(s7));
        String s8 = "12425";
        System.out.println(PinyinUtil.containsChinese(s8));
        String s9 = "45::";
        System.out.println(PinyinUtil.containsChinese(s9));
    }
}
