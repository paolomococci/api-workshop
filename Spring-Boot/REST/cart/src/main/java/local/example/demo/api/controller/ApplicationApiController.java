package local.example.demo.api.controller;

import local.example.demo.api.ApplicationApi;
import local.example.demo.api.delegate.ApplicationApiDelegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


@Controller
@RequestMapping("${openapi.cart.base-path:}")
public class ApplicationApiController
        implements ApplicationApi {

    private final ApplicationApiDelegate delegate;

    public ApplicationApiController(
            @Autowired(required = false) ApplicationApiDelegate delegate
    ) {
        this.delegate = Optional
                .ofNullable(delegate)
                .orElse(new ApplicationApiDelegate() { });
    }

    @Override
    public ApplicationApiDelegate getDelegate() {
        return delegate;
    }
}
