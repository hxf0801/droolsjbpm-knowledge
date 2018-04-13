package org.kie.api.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Custom search criteria for combining jbpm data and business data 
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchCriteria implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * query start position
     */
    private int firstResult = -1;
    /**
     * maximum number of query result
     */
    private int maxResults = -1;
    private String userId;
    private List<String> groupIds;
    private String whereStr;
    private String orderBy;
    private boolean isExcludedUser = false;
    private String excludedUserIds;
    private List<WhereParameter> params;
    private List<String> buNames;
    private String siteCode;
    private boolean wfeCheckBuFlag;

    public void addWhereParameter(WhereParameter param) {
        if (null == params) {
            params = new ArrayList<WhereParameter>();
        }
        this.params.add(param);
    }

    public int getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    public String getWhereStr() {
        return whereStr;
    }

    public void setWhereStr(String whereStr) {
        this.whereStr = whereStr;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public boolean isExcludedUser() {
        return isExcludedUser;
    }

    public void setExcludedUser(boolean isExcludedUser) {
        this.isExcludedUser = isExcludedUser;
    }

    public String getExcludedUserIds() {
        return excludedUserIds;
    }

    public void setExcludedUserIds(String excludedUserIds) {
        this.excludedUserIds = excludedUserIds;
    }

    public List<WhereParameter> getParams() {
        return params;
    }

    public void setParams(List<WhereParameter> params) {
        this.params = params;
    }

    public List<String> getBuNames() {
        return buNames;
    }

    public void setBuNames(List<String> buNames) {
        this.buNames = buNames;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public boolean isWfeCheckBuFlag() {
        return wfeCheckBuFlag;
    }

    public void setWfeCheckBuFlag(boolean wfeCheckBuFlag) {
        this.wfeCheckBuFlag = wfeCheckBuFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchCriteria {").append("firstResult=" + firstResult).append(", maxResults=" + maxResults)
          .append(", userId=" + userId).append(", isExcludedUser=" + isExcludedUser).append(", excludedUserIds=" + excludedUserIds);
        sb.append(", siteCode=" + siteCode).append(", groupIds=[");
        if (null != this.groupIds && this.groupIds.size() > 0) {
            boolean isFirst = true;
            for (String s : this.groupIds) {
                if (isFirst) {
                    isFirst = false;
                } else {
                    sb.append(", ");
                }
                sb.append(null == s ? "" : s);
            }
        }
        sb.append("]");
        sb.append(", buNames=[");
        if (null != this.buNames && this.buNames.size() > 0) {
            boolean isFirst = true;
            for (String s : this.buNames) {
                if (isFirst) {
                    isFirst = false;
                } else {
                    sb.append(", ");
                }
                sb.append(null == s ? "" : s);
            }
        }
        sb.append("]").append(", wfeCheckBuFlag=").append(wfeCheckBuFlag);
        sb.append(", whereStr=(" + whereStr).append("), params=[");
        if (null != this.params && this.params.size() > 0) {
            for (WhereParameter o : this.params) {
                sb.append(o);
            }
        }
        sb.append("], orderBy=" + orderBy).append("}");
        return sb.toString();
    }

}
