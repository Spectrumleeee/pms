package xmu.lgp.pms.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import xmu.lgp.pms.domain.PlanInfo;
import xmu.lgp.pms.dto.SensitiveDataDto;
import xmu.lgp.pms.manager.PlanManager;

@Controller
@RequestMapping("plans")
public class PlanController {

    @Resource
    PlanManager planManager;

    public PlanController() {
        System.err.println("init " + getClass());
    }

    @RequestMapping("show")
    public String show() {
        System.err.println("showPlan:" + planManager.getTotalPalnNums());
        return "plan";
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
