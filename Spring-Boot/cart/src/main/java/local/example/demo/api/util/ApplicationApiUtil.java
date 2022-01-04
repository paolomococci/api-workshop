package local.example.demo.api.util;

import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ApplicationApiUtil {

    public static void setExampleResponse(
            NativeWebRequest nativeWebRequest,
            String contentType,
            String example
    ) {
        try {
            HttpServletResponse httpServletResponse = nativeWebRequest
                    .getNativeResponse(HttpServletResponse.class);
            if (httpServletResponse != null) {
                httpServletResponse.setCharacterEncoding("UTF-8");
                httpServletResponse.addHeader("Content-Type", contentType);
                httpServletResponse.getWriter().print(example);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
