package com.sakigake.model.domain.referenceObject;

import com.sakigake.model.domain.valueObject.schedule.Description;
import com.sakigake.model.domain.valueObject.schedule.EndDate;
import com.sakigake.model.domain.valueObject.schedule.StartDate;
import com.sakigake.model.domain.valueObject.schedule.Title;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

/**
 *
 * スケジュール
 *
 */
@Builder
public class Schedule {

    @Getter
    @NonNull
    private Title title;

    @Getter
    private Description description;

    @Getter
    private StartDate startDate;

    @Getter
    private EndDate endDate;


}
