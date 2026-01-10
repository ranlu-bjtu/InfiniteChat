package com.bjtu.freeChat.authenticationservice;

import com.bjtu.freeChat.authenticationservice.utils.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthenticationServiceApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(JwtUtil.generate("1"));
	}

}
