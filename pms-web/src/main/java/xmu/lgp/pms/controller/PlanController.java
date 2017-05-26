package xmu.lgp.pms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xmu.lgp.pms.manager.PlanManager;

@Controller
@RequestMapping("plan")
public class PlanController {
    
    @Resource
    PlanManager planManager;
    
    public PlanController() {
        System.out.println("init " + getClass());
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String showPlan() {
        return "123";
    }
    
}
