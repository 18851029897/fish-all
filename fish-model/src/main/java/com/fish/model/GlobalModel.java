package com.fish.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by fish on 2018/11/5.
 */
public class GlobalModel implements Serializable {

    private Date modifyDate;

    private Date createDate;

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
