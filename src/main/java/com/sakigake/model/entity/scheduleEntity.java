package com.sakigake.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class scheduleEntity {

    /** スケジュールID */
    private String id;

    /** スケジュール　タイトル */
    private String title;

    /** スケジュール　説明 */
    private String description;

    /** スケジュール　開始日時 */
    private Date startDate;

    /** スケジュール　終了日時 */
    private Date endDate;

}
