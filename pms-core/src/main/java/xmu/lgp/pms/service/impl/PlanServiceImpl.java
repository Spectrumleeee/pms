package xmu.lgp.pms.service.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import xmu.lgp.pms.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {
    
    Random random = new Random();
    
    @Override
    public int getTotalPalnNums() {
        return random.nextInt(100);
    }

}
