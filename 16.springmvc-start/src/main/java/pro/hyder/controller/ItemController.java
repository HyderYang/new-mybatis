package pro.hyder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/15 上午3:10
 */
@Controller
//@RequestMapping("item")
public class ItemController {
	@RequestMapping("queryItem")
	public String queryItem() {
		ModelAndView view = new ModelAndView();
		System.out.println("响应queryItem");
//		view.addObject("itemList", );
		return "view";
	}
}
