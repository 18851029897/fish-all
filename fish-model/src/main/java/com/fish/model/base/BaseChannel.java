package com.fish.model.base;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by fish on 2018/10/27.
 */
@Entity
@Table(name = "user_info")
public class BaseChannel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "channel_name")
    private String channelName;

    @Column(name = "channel_url")
    private String channelUrl;

    @Column(name = "channel_img_url")
    private String channelImgUrl;

    @Column(name = "is_del")
    private Integer isDel;

    @Column(name = "modify_date")
    private Date modifyDate;

    @Column(name = "create_date")
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelUrl() {
        return channelUrl;
    }

    public void setChannelUrl(String channelUrl) {
        this.channelUrl = channelUrl;
    }

    public String getChannelImgUrl() {
        return channelImgUrl;
    }

    public void setChannelImgUrl(String channelImgUrl) {
        this.channelImgUrl = channelImgUrl;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

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
