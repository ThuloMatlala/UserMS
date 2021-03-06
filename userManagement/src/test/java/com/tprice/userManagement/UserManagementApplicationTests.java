package com.tprice.userManagement;

import com.tprice.userManagement.config.TestConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserManagementApplicationTests {

	@Mock
	TestConfig testConfig;

	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void contextLoads() {
	}

	@Test
	public void shouldLoadTestConfiguration(){
		when(testConfig.getContextString()).thenReturn("This is the test config bruh");

	}

}
