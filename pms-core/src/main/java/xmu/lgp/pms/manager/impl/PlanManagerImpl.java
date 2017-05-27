package xmu.lgp.pms.manager.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import xmu.lgp.pms.domain.PlanInfo;
import xmu.lgp.pms.manager.PlanManager;
import xmu.lgp.pms.service.PlanService;

@Service
public class PlanManagerImpl implements PlanManager {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Resource
    PlanService planService;
    
    @Override
    public int getTotalPalnNums() {
        return planService.getTotalPalnNums();
    }

    @Override
    public void add(String content) {
        logger.info("增加·计划，content={}", content);
    }

    @Override
    public void delete(String planId) {
        logger.info("删除·计划，planId={}", planId);
    }

    @Override
    public void update(PlanInfo planInfo) {
        logger.info("更新·计划，planInfo={}", planInfo);
    }
    
    @Override
    public PlanInfo findPlanInfoById(String planId) {
        logger.info("查询·计划，planId={}", planId);
        PlanInfo planInfo = new PlanInfo();
        planInfo.setId(planId);
        planInfo.setContent("更新计划");
        planInfo.setTime(new Date());
        
        return planInfo;
    }

}
