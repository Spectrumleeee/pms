package xmu.lgp.pms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import xmu.lgp.pms.manager.PlanManager;

@Controller
@RequestMapping("plans")
public class PlanController {

    @Resource
    PlanManager planManager;

    public PlanController() {
        System.err.println("init " + getClass());
    }

    @RequestMapping("")
    public String showPlan() {
        System.err.println("showPlan:" + planManager.getTotalPalnNums());
        return "plan";
    }

}
