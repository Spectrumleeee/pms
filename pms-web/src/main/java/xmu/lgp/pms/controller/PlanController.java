package xmu.lgp.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("plan")
public class PlanController {
    
    public PlanController() {
        System.out.println("init " + getClass());
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String showPlan() {
        return "123";
    }
    
}
