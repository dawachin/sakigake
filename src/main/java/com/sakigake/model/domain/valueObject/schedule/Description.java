package com.sakigake.model.domain.valueObject.schedule;

import com.sakigake.model.domain.valueObject.ValueObjectAbstract;
import com.sakigake.model.domain.valueObject.ValueObjectInterface;
import lombok.Getter;

public class Description extends ValueObjectAbstract implements ValueObjectInterface {

    @Getter
    private String description;

    @Getter
    private final String NAME = "説明";

    /** コンストラク */
    public Description(String description) {
        isCheck();
        this.description = description;
    }

    /** 値チェック */
    protected void isCheck() {

    }

}
