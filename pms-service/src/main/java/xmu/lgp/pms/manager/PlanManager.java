package xmu.lgp.pms.manager;

import xmu.lgp.pms.domain.PlanInfo;
import xmu.lgp.pms.dto.SensitiveDataDto;

public interface PlanManager {
    
    public int getTotalPalnNums();
    
    public void add(String content);
    
    public void delete(String planId);
    
    public void update(PlanInfo planInfo);
    
    public PlanInfo findPlanInfoById(String planId, SensitiveDataDto sensitiveData);
    
}
