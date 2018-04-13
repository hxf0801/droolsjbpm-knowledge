package org.kie.api.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Where parameters for searching
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class WhereParameter implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer parameterPosition;
    private List<Object> values = new ArrayList<Object>();
    private boolean needIncludeGroupId;

    public WhereParameter() {

    }

    public WhereParameter(Integer parameterPosition) {
        this.parameterPosition = parameterPosition;
    }

    public void addParameterValue(Object paramValue) {
        this.values.add(paramValue);
    }

    public Integer getParameterPosition() {
        return parameterPosition;
    }

    public void setParameterPosition(Integer parameterPosition) {
        this.parameterPosition = parameterPosition;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

    public boolean isNeedIncludeGroupId() {
        return needIncludeGroupId;
    }

    public void setNeedIncludeGroupId(boolean needIncludeGroupId) {
        this.needIncludeGroupId = needIncludeGroupId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WhereParameter [parameterPosition=" + parameterPosition + ", values=[");
        if (null != values) {
            boolean isFirst = true;
            for (Object obj : values) {
                if (isFirst) {
                    isFirst = false;
                } else {
                    sb.append(", ");
                }
                sb.append(null == obj ? "" : obj.toString());
            }
        }
        sb.append("], needIncludeGroupId=").append(needIncludeGroupId).append("]");
        return sb.toString();
    }

}
