package xmu.lgp.pms.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import xmu.lgp.pms.domain.PlanInfo;
import xmu.lgp.pms.dto.SensitiveDataDto;
import xmu.lgp.pms.manager.PlanManager;

/**
 * 
 * 123123123
 * @author ASUS
 * 123456
 */
@Controller
@RequestMapping("plans")
public class PlanController {

	public static List<String> prettyStone = new ArrayList<String>();
	
	public static Random random = new Random();
	
	static {
		prettyStone.add("石倩是个大坏蛋");
		prettyStone.add("石倩是个大笨蛋");
		prettyStone.add("石倩是个大傻瓜");
		prettyStone.add("石倩是个大好人");
		prettyStone.add("石倩是个大蒜头");
		prettyStone.add("石倩是个大西瓜");
		prettyStone.add("石倩是个大萝卜");
	}
	
    @Resource
    PlanManager planManager;

    public PlanController() {
        System.err.println("init " + getClass());
    }

    @RequestMapping("show")
    public ModelAndView show() {
        
        ModelAndView model = new ModelAndView("prettyStone");
        String content = prettyStone.get(random.nextInt(prettyStone.size()));
        
        System.err.println("showPlan:" + content);
        
        model.addObject("content", content);
        
        return model;
    }
    
    @RequestMapping("update")
    public String update() {
        PlanInfo planInfo = new PlanInfo();
        planInfo.setId("123");
        planInfo.setContent("每天步行10000步");
        planInfo.setTime(new Date());
        planManager.update(planInfo);
        return "plan";
    }
    
    @RequestMapping("add")
    public String add() {
        planManager.add("每天步行20000步");
        return "plan";
    }
    
    @RequestMapping("delete")
    public String delete() {
        planManager.delete("123");
        return "plan";
    }
    
    @RequestMapping("query")
    public String query() {
        SensitiveDataDto sensitiveData = new SensitiveDataDto();
        sensitiveData.setPhone("15999592916");
        PlanInfo planInfo = planManager.findPlanInfoById("123", sensitiveData);
        System.err.println("query: " + planInfo);
        return "plan";
    }

}
