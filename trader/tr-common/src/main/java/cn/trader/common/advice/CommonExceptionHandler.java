package cn.trader.common.advice;

import cn.trader.common.exception.TrException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(TrException.class)
    public ResponseEntity<String> handleExcption(RuntimeException e) {
        System.out.println("★★★★handleExcption★★★★");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("张澎,价格不能为空");
    }

}
