package xmu.lgp.pms.dto;

import java.io.Serializable;

import xmu.lgp.lly.common.annotation.*;
import xmu.lgp.lly.common.entity.BaseEntity;

public class SensitiveDataDto extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -8320013656800801562L;
    
    @Encrypt(context={@NameValue(name="SensitiveType", value="MOBI_NO")})
    private String phone;
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
