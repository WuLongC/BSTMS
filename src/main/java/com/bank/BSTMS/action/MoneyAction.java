/**
 * @author: coke
 * @Title:	MoeneyAction.java
 * @CreateTime:	2019-06-19 10:50
 */
package com.bank.BSTMS.action;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @Title:	index
 * @author: coke
 * @Descrition:	初始化取款页面
 * @return:	String 取款页面
 * 
 */
@Controller
public class MoneyAction {
	
	@RequestMapping(value="gm",method=RequestMethod.GET)
	public String index() {
		return "gm";
	}
	
	@RequestMapping("getMoney")
	@ResponseBody
	public Map<String,String> getMoney(@RequestParam Map<String,String> paramMap){
		String v = paramMap.get("value");
		return paramMap;
	}
}
