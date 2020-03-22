package cn.trader.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    PRICE_CANNOT_BE_NULL(400,"价格别为空啊"),
    PRICE_CANNOT_BE_NULL2(400,"价格别为空啊")
    ;
    private int code;
    private String msg;
}
