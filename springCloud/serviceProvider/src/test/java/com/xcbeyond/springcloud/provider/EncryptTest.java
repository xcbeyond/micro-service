package com.xcbeyond.springcloud.provider;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 参数加密测试用例
 * @author xcbeyond
 * 2018年9月2日上午12:22:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EncryptTest {
	
	@Autowired
    public StringEncryptor stringEncryptor;
	
	@Test
	public void encryptPwd() {
		 String result = stringEncryptor.encrypt("root");
	     System.out.println(result);
	}
	
	@Test
    public void decryptTest() {
        String result = "eZLNwFxeSKENBh1pu/M/rMB76nxo/RLhWSLHa8+0=";
        result = stringEncryptor.decrypt(result);
        System.out.println(result);
    }
}
