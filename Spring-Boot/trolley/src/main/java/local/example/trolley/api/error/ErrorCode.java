package local.example.trolley.api.error;

public enum ErrorCode {

    GENERIC_ERROR("CART-5001", "Unable Complete Request"),
    HTTP_MEDIA_TYPE_NOT_SUPPORTED("CART-5002", "Media Type Unsupported"),
    HTTP_MEDIA_TYPE_NOT_ACCEPTABLE("CART-5004", "Requested Accept Header Value Unsupported"),
    HTTP_MESSAGE_NOT_WRITABLE("CART-5003", "Missing Accept Header"),
    HTTP_MESSAGE_NOT_READABLE("CART-5006", "Payload at odds with Content-Type stated"),
    JSON_PARSE_ERROR("CART-5005", "JSON Object Invalid Payload");

    private final String errorCode;
    private final String errorMessageKey;

    ErrorCode(final String errorCode, final String errorMessageKey) {
        this.errorCode = errorCode;
        this.errorMessageKey = errorMessageKey;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessageKey() {
        return this.errorMessageKey;
    }
}
