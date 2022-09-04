package local.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("${openapi.growing.base-path:}")
public record GrowingApiController(GrowingApiDelegate delegate)
        implements GrowingApi {

    public GrowingApiController(
            @Autowired(required = false) GrowingApiDelegate delegate
    ) {
        this.delegate = Optional
                .ofNullable(delegate)
                .orElse(new GrowingApiDelegate() {
                });
    }

    @Override
    public GrowingApiDelegate getDelegate() {
        return delegate;
    }
}
