package yinyao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.haoxingart.base.util.JsonUtil;

import cn.yinyao.entity.User;
import cn.yinyao.entity.UserParam;
import cn.yinyao.service.UserService;


public class ServiceTest {
 
	@Resource
	private UserService userService;
	private static Logger logger = Logger.getLogger(ServiceTest.class);
	@Before
	public void Test(){
		userService = HoldContext.context.getBean(UserService.class);
	}
	@Test
	public void test() {
		userService.delete(15);
	}
	
	@Test
	public void saveAll() {
		List<UserParam> list = new ArrayList<UserParam>();
		UserParam a = new UserParam();
		a.setAddress("山东省师生是");
		a.setPassword("fsfsdfsdfsdf");
		a.setUsername("展昭sdsds");
		UserParam a1 = new UserParam();
		a1.setAddress("北京市");
		a1.setPassword("sas");
		a1.setUsername("包青天daren");
		list.add(a1);
		list.add(a);
		userService.saveAll(list);
	}
	@Test
	public void getPage() {
		List<User> list = userService.getPage(3,5);
		System.out.println(JsonUtil.toString(list,true));
		
	}
}
