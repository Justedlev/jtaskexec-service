package com.justedlev.taskexec.executor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskResultResponse {
    private String taskName;
    private String error;
    @Builder.Default
    private Date executedAt = new Date();
}
