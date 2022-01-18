package local.example.trolley.api.error;

public enum ErrorCode {

    CONSTRAINT_VIOLATION("CART-5008", "Validation Constraint Failed"),
    CUSTOMER_NOT_FOUND("CART-5011", "Customer Not Found"),
    GENERIC_ERROR("CART-5001", "Unable Complete Request"),
    HTTP_MEDIA_TYPE_NOT_SUPPORTED("CART-5002", "Media Type Unsupported"),
    HTTP_MEDIA_TYPE_NOT_ACCEPTABLE("CART-5004", "Requested Accept Header Value Unsupported"),
    HTTP_MESSAGE_NOT_WRITABLE("CART-5003", "Missing Accept Header"),
    HTTP_MESSAGE_NOT_READABLE("CART-5006", "Payload at odds with Content-Type stated"),
    HTTP_REQUEST_METHOD_NOT_SUPPORTED("CART-5007", "Request Method Not Supported"),
    ILLEGAL_ARGUMENT_EXCEPTION("CART-5009", "Invalid Data Sent"),
    ITEM_NOT_FOUND("CART-5012", "Item Not Found"),
    JSON_PARSE_ERROR("CART-5005", "JSON Object Invalid Payload"),
    RESOURCE_ALREADY_EXISTS("CART-5013", "Resource Already Exists"),
    RESOURCE_NOT_FOUND("CART-5010", "Resource Not Found");

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
