package cn.com.xiaofen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/T")
public class T {
	@RequestMapping("/t_1")
	public String t_1() {
		System.out.println("t_1");
		return "index";
	}

	@RequestMapping(value = "t_2", method = RequestMethod.POST,params={"name=xiaofen","pass=root"},headers={"Content-Type=application/x-www-form-urlencoded"})
	public String t_2() {
		System.out.println("t_2");
		return "index";
	}
}
