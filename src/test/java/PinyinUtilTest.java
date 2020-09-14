import org.junit.Test;
import util.PinyinUtil;

public class PinyinUtilTest {
    /**
     * 测试确定是否为中文字符的功能
     */
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

    /**
     * 测试关于字符串的处理
     */
    @Test
    public void testGet(){
        PinyinUtil.get("在 萨迪      ");
        PinyinUtil.get("发の");
        PinyinUtil.get("发의.");
        PinyinUtil.get("6543发");
        PinyinUtil.get("AD发");
        PinyinUtil.get("12发 ");
        PinyinUtil.get("*766发");
    }
}
