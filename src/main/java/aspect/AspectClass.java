package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {

	@Before("Within(Controller.*)")
	public void say() {
		System.out.println("我在spring之前执行");
	}
	@After("Within(Controller.*)")
	public void syso() {
		System.out.println("wozaitazhihou");
		
	}
}
