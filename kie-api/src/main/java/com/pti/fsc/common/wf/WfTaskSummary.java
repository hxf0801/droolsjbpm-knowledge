package com.pti.fsc.common.wf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Work flow task. Its map property has the following usages:
 * 
 * <pre>
 *  <li>Storing generic information persisted in extra table. Referring to 
 * them by paired business field names defined in mapping configuration. 
 *  <li>Storing defined input parameters and their values in name-value pair mode.
 * </pre>
 */
public class WfTaskSummary implements Serializable {

    /**
     * serial version UID
     */
    private static final long serialVersionUID = 1L;

    private long pk;
    private Date createdDate;
    private long duration;
    private Date endDate;
    private long processinstanceid;
    private Date startDate;
    private String taskStatus;
    private long taskId;
    private String taskName;
    private String userId;
    private int optLock;
    private String char1;
    private String char2;
    private String companyCode;
    private Date date1;
    private Date date2;
    private Date date3;
    private BigDecimal decimal1;
    private BigDecimal decimal2;
    private long integer1;
    private long integer2;
    private String itemKey;
    private String itemType;
    private BigDecimal money1;
    private BigDecimal money2;
    private BigDecimal money3;
    private String optType;
    private String processGroup;
    private String serviceCode;
    private String siteCode;
    private String text1;
    private String text2;
    private String text3;
    private String text4;
    private String text5;
    private Date timestamp1;
    private Date timestamp2;

    private int totalRows;
    private int totalPages;

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public long getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(long processinstanceid) {
        this.processinstanceid = processinstanceid;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartdate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getOptLock() {
        return optLock;
    }

    public void setOptLock(int optLock) {
        this.optLock = optLock;
    }

    public String getChar1() {
        return char1;
    }

    public void setChar1(String char1) {
        this.char1 = char1;
    }

    public String getChar2() {
        return char2;
    }

    public void setChar2(String char2) {
        this.char2 = char2;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public Date getDate3() {
        return date3;
    }

    public void setDate3(Date date3) {
        this.date3 = date3;
    }

    public BigDecimal getDecimal1() {
        return decimal1;
    }

    public void setDecimal1(BigDecimal decimal1) {
        this.decimal1 = decimal1;
    }

    public BigDecimal getDecimal2() {
        return decimal2;
    }

    public void setDecimal2(BigDecimal decimal2) {
        this.decimal2 = decimal2;
    }

    public long getInteger1() {
        return integer1;
    }

    public void setInteger1(long integer1) {
        this.integer1 = integer1;
    }

    public long getInteger2() {
        return integer2;
    }

    public void setInteger2(long integer2) {
        this.integer2 = integer2;
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public BigDecimal getMoney1() {
        return money1;
    }

    public void setMoney1(BigDecimal money1) {
        this.money1 = money1;
    }

    public BigDecimal getMoney2() {
        return money2;
    }

    public void setMoney2(BigDecimal money2) {
        this.money2 = money2;
    }

    public BigDecimal getMoney3() {
        return money3;
    }

    public void setMoney3(BigDecimal money3) {
        this.money3 = money3;
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType;
    }

    public String getProcessGroup() {
        return processGroup;
    }

    public void setProcessGroup(String processGroup) {
        this.processGroup = processGroup;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public String getText5() {
        return text5;
    }

    public void setText5(String text5) {
        this.text5 = text5;
    }

    public Date getTimestamp1() {
        return timestamp1;
    }

    public void setTimestamp1(Date timestamp1) {
        this.timestamp1 = timestamp1;
    }

    public Date getTimestamp2() {
        return timestamp2;
    }

    public void setTimestamp2(Date timestamp2) {
        this.timestamp2 = timestamp2;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        return builder.toString();
    }

}
