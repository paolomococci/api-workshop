package local.example.demo.exception;

import com.fasterxml.jackson.core.JsonParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

import java.util.Locale;

@ControllerAdvice
public class RestApiErrorHandler {

    private static final Logger loggerFactory = LoggerFactory
            .getLogger(RestApiErrorHandler.class);

    public RestApiErrorHandler(MessageSource messageSource) {
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(
            HttpServletRequest httpServletRequest,
            Exception exception,
            Locale locale
    ) {
        exception.printStackTrace();

        Error error = ErrorUtil.createError(
                ErrorCode.GENERIC_ERROR.getErrorMessageKey(),
                ErrorCode.GENERIC_ERROR.getErrorCode(),
                HttpStatus.INTERNAL_SERVER_ERROR.value()
        ).setUrl(
                httpServletRequest.getRequestURL().toString()
        ).setRequestMethod(httpServletRequest.getMethod());

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResponseEntity<Error> handleHttpMediaTypeNotSupportedException(
            HttpServletRequest httpServletRequest,
            HttpMediaTypeNotSupportedException httpMediaTypeNotSupportedException,
            Locale locale
    ) {
        httpMediaTypeNotSupportedException.printStackTrace();

        Error error = ErrorUtil.createError(
                ErrorCode.HTTP_MEDIA_TYPE_NOT_SUPPORTED.getErrorMessageKey(),
                ErrorCode.HTTP_MEDIA_TYPE_NOT_SUPPORTED.getErrorCode(),
                HttpStatus.UNSUPPORTED_MEDIA_TYPE.value()
        ).setUrl(
                httpServletRequest.getRequestURL().toString()
        ).setRequestMethod(httpServletRequest.getMethod());

        loggerFactory.info(
                "HttpMediaTypeNotSupportedException httpServletRequest.getMethod() "
                        + httpServletRequest.getMethod()
        );

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(HttpMessageNotWritableException.class)
    public ResponseEntity<Error> handleHttpMessageNotWritableException(
            HttpServletRequest httpServletRequest,
            HttpMessageNotWritableException httpMessageNotWritableException,
            Locale locale
    ) {
        httpMessageNotWritableException.printStackTrace();

        Error error = ErrorUtil.createError(
                ErrorCode.HTTP_MESSAGE_NOT_WRITABLE.getErrorMessageKey(),
                ErrorCode.HTTP_MESSAGE_NOT_WRITABLE.getErrorCode(),
                HttpStatus.UNSUPPORTED_MEDIA_TYPE.value()
        ).setUrl(
                httpServletRequest.getRequestURL().toString()
        ).setRequestMethod(httpServletRequest.getMethod());

        loggerFactory.info(
                "HttpMessageNotWritableException httpServletRequest.getMethod() "
                        + httpServletRequest.getMethod()
        );

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    public ResponseEntity<Error> handleHttpMediaTypeNotAcceptableException(
            HttpServletRequest httpServletRequest,
            HttpMediaTypeNotAcceptableException httpMediaTypeNotAcceptableException,
            Locale locale
    ) {
        httpMediaTypeNotAcceptableException.printStackTrace();

        Error error = ErrorUtil.createError(
                ErrorCode.HTTP_MEDIA_TYPE_NOT_ACCEPTABLE.getErrorMessageKey(),
                ErrorCode.HTTP_MEDIA_TYPE_NOT_ACCEPTABLE.getErrorCode(),
                HttpStatus.UNSUPPORTED_MEDIA_TYPE.value()
        ).setUrl(
                httpServletRequest.getRequestURL().toString()
        ).setRequestMethod(httpServletRequest.getMethod());

        loggerFactory.info(
                "HttpMediaTypeNotAcceptableException httpServletRequest.getMethod() "
                        + httpServletRequest.getMethod()
        );

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Error> handleHttpMessageNotReadableException(
            HttpServletRequest httpServletRequest,
            HttpMessageNotReadableException httpMessageNotReadableException,
            Locale locale
    ) {
        httpMessageNotReadableException.printStackTrace();

        Error error = ErrorUtil.createError(
                ErrorCode.HTTP_MESSAGE_NOT_READABLE.getErrorMessageKey(),
                ErrorCode.HTTP_MESSAGE_NOT_READABLE.getErrorCode(),
                HttpStatus.NOT_ACCEPTABLE.value()
        ).setUrl(
                httpServletRequest.getRequestURL().toString()
        ).setRequestMethod(httpServletRequest.getMethod());

        loggerFactory.info(
                "HttpMessageNotReadableException httpServletRequest.getMethod() "
                        + httpServletRequest.getMethod()
        );

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(JsonParseException.class)
    public ResponseEntity<Error> handleJsonParseException(
            HttpServletRequest httpServletRequest,
            JsonParseException jsonParseException,
            Locale locale
    ) {
        jsonParseException.printStackTrace();

        Error error = ErrorUtil.createError(
                ErrorCode.JSON_PARSE_ERROR.getErrorMessageKey(),
                ErrorCode.JSON_PARSE_ERROR.getErrorCode(),
                HttpStatus.NOT_ACCEPTABLE.value()
        ).setUrl(
                httpServletRequest.getRequestURL().toString()
        ).setRequestMethod(httpServletRequest.getMethod());

        loggerFactory.info(
                "JsonParseException httpServletRequest.getMethod() "
                        + httpServletRequest.getMethod()
        );

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
