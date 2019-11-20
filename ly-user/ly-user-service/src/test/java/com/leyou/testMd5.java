package com.leyou;

import com.leyou.user.utils.CodecUtils;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testMd5 {
    public static void main(String[] args) {
        String s = CodecUtils.md5Hex("123456", "05b0f203987e49d2b72b20b95e0e57d9");
        System.out.println(s);
    }
}
