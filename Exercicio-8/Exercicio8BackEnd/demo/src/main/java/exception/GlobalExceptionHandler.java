package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<ApiErrorDto> handleValidationError(MethodArgumentNotValidException exception) {
        return exception.getBindingResult().getAllErrors().stream().map((ex) ->{
            return new ApiErrorDto("Erro de validacao", ex.getObjectName() + ": " + ex.getDefaultMessage());
        }).toList();
    }
}
