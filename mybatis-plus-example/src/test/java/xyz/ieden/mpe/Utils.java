package xyz.ieden.mpe;

import org.junit.Test;

/**
 * @author lianghongwei01
 * @date 2019/4/8 9:41
 */
public class Utils {

    @Test
    public void testUserDir() {
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);
    }

}
