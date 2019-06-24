/**
 * @Title: UserAction.java
 * @author coke
 * @CreateTime:2019-6-19 10:46
 */
package com.bank.BSTMS.action;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bank.BSTMS.pojo.CardInfo;
import com.bank.BSTMS.svc.CardInfoSvc;

/**
 * 
 * @ClassName: UserAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author coke
 * @date 2019年6月19日
 * @since JDK 1.8
 */
@Controller
public class UserAction {
	
	@Autowired
	private CardInfoSvc cardInfoSvc;
	
	@RequestMapping("/")
	public String index(HttpServletRequest request) {
		request.setAttribute("key", "value");
		System.out.println("---------------------------------------------->");
		return "login";
	}

	@RequestMapping("getUser")
	public String getUser(@RequestParam String username, @RequestParam String password, HttpSession session) {
		
		//验证用户名是否合法
		Pattern p = Pattern.compile("[1-9][0-9]{5}");
		Matcher m = p.matcher(username);
		boolean flag = m.matches();		//验证是否匹配，true：验证成功；false：验证失败
		CardInfo cardInfo = null;
		
		String page = "login";
		if(flag) {
			cardInfo = cardInfoSvc.getCardById(username);
			session.setAttribute("user",cardInfo);
			page = "index";
		}else {
			session.setAttribute("error", "格式不正确");
			page = "login";
		}		
		
		return page;
	}
	
}