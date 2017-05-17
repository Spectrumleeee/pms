package xmu.lgp.pms.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import xmu.lgp.pms.manager.PlanManager;
import xmu.lgp.pms.service.PlanService;

@Service
public class PlanManagerImpl implements PlanManager {

    @Resource
    PlanService planService;
    
    @Override
    public int getTotalPalnNums() {
        return planService.getTotalPalnNums();
    }

}
