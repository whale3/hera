package com.dfire.common.vo;

import com.dfire.common.enums.JobStatus;
import com.dfire.common.enums.TriggerTypeEnum;
import lombok.Builder;
import lombok.Data;


/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 10:54 2018/1/4
 * @desc 任务队列中job的实体
 */
@Data
@Builder
public class JobElement {

    /**
     * 版本号id
     */
    private String jobId;

    private int hostGroupId;

    private boolean fixedEmr;

    private Integer priorityLevel;

    private String historyId;

    private TriggerTypeEnum triggerType;

    private JobStatus status;

    private boolean isCancel;

    private Integer costMinute;



    public boolean equals(JobElement jobElement) {
        if (!jobElement.getJobId().equals(jobId)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return jobId.hashCode();
    }

    @Override
    public String toString() {
        return "JobElement{" +
                "jobId='" + jobId + '\'' +
                ", hostGroupId=" + hostGroupId +
                '}';
    }
}
