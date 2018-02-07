package yinyao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HoldContext {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
}
