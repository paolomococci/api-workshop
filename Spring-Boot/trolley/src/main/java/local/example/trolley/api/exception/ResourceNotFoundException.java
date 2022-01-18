package local.example.trolley.api.exception;

import local.example.trolley.api.error.ErrorCode;

public class ResourceNotFoundException
        extends RuntimeException {

    private final String errorMessageKye;
    private final String errorCode;

    public ResourceNotFoundException(ErrorCode errorCode) {
        super(errorCode.getErrorMessageKey());
        this.errorMessageKye = errorCode.getErrorMessageKey();
        this.errorCode = errorCode.getErrorCode();
    }

    public ResourceNotFoundException(final String message) {
        super(message);
        this.errorMessageKye = ErrorCode.RESOURCE_NOT_FOUND.getErrorMessageKey();
        this.errorCode = ErrorCode.RESOURCE_NOT_FOUND.getErrorCode();
    }
}
