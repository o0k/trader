package cn.trader.common.exception;

import cn.trader.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TrException extends RuntimeException {

    private ExceptionEnum exceptionEnum;


}
