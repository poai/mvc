package cn.com.xiaofen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class T1 {
	@RequestMapping("/detil?")
	public String t_1() {
		System.out.println("xiaofen");
		return "index";
	}
	@RequestMapping("/detil*")
	public String t_2() {
		System.out.println("xiaofen");
		return "index";
	}
	@RequestMapping("/detil/**")
	public String t_3() {
		System.out.println("xiaofen");
		return "index";
	}
}
