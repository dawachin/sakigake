package com.sakigake.model.domain.valueObject.schedule;

import com.sakigake.model.domain.valueObject.ValueObjectInterface;
import com.sakigake.model.domain.valueObject.ValueObjectAbstract;
import lombok.Getter;

public class Title extends ValueObjectAbstract implements ValueObjectInterface {

    @Getter
    private String title;

    @Getter
    private final String NAME = "タイトル";

    /** コンストラク */
    public Title(String title) {
        isCheck();
        this.title = title;
    }

    /** 値チェック */
    private void isCheck() {

    }

}
