package local.example.trolley.api.error;

import org.apache.logging.log4j.util.Strings;

public class Error {

    private String errorCode;
    private String message;
    private Integer status;
    private String url = "Unavailable";
    private String requestMethod = "Unavailable";

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public Error setUrl(String url) {
        if (Strings.isNotBlank(url)) {
            this.url = url;
        }
        return this;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public Error setRequestMethod(String requestMethod) {
        if (Strings.isNotBlank(requestMethod)) {
            this.requestMethod = requestMethod;
        }
        return this;
    }
}