package com.sakigake.model.domain.valueObject.schedule;

import com.sakigake.model.domain.valueObject.ValueObjectAbstract;
import com.sakigake.model.domain.valueObject.ValueObjectInterface;
import lombok.Getter;

import java.util.Date;

public class StartDate extends ValueObjectAbstract implements ValueObjectInterface {

    @Getter
    private Date startDate;

    @Getter
    private final String NAME = "開始日時";

    /** コンストラク */
    public StartDate(Date startDate) {
        isCheck();
        this.startDate = startDate;
    }

    /** 値チェック */
    protected void isCheck() {

    }

}
