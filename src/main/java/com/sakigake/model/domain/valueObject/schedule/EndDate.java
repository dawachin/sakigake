package com.sakigake.model.domain.valueObject.schedule;

import com.sakigake.model.domain.valueObject.ValueObjectAbstract;
import com.sakigake.model.domain.valueObject.ValueObjectInterface;
import lombok.Getter;

import java.util.Date;

public class EndDate extends ValueObjectAbstract implements ValueObjectInterface {

    @Getter
    private Date endDate;

    @Getter
    private final String NAME = "";

    /** コンストラク */
    public EndDate(Date endDate) {
        isCheck();
        this.endDate = endDate;
    }

    /** 値チェック */
    protected void isCheck() {

    }

}
