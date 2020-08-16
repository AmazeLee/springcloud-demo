package com.sh.test;


import com.sh.bean.EnableUserBean;
import com.sh.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableUserBean
public class TestApplication {

	/**
	 *   --> EnableUserBean --> UserImportSelector --> UserConfiguration --> User
	 * @param args
	 */
	public static void main(String[] args) {
		//获取spring容器
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestApplication.class);
		User bean = ac.getBean(User.class);
		System.out.println(bean);
	}
}
