package xmu.lgp.pms.domain;

import java.io.Serializable;
import java.util.Date;

import xmu.lgp.lly.common.entity.BaseEntity;

public class PlanInfo extends BaseEntity implements Serializable {
    
    private static final long serialVersionUID = -2593296397433836692L;

    private String id;
    
    private String content;
    
    private Date time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
}
