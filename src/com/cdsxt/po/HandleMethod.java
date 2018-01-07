package com.cdsxt.po;

import javax.persistence.*;
import java.util.Date;

/**
 * 处理投诉的方式, 与投诉为多对一关系
 * 处理开始时间	处理结束时间		回访的时间    问题是否解决    .....
 */

@Entity
@Table(name = "crm_handle_method")
public class HandleMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 与投诉多对一
    @ManyToOne
    @JoinColumn(name = "complaint_id")
    private Complaint complaint;

    private Date startDate;
    private Date endDate;
    private Date callbackDate;
    private Boolean isDone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCallbackDate() {
        return callbackDate;
    }

    public void setCallbackDate(Date callbackDate) {
        this.callbackDate = callbackDate;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }
}