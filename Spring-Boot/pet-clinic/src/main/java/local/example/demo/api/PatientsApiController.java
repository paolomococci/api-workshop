package local.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("${openapi.petClinic.base-path:}")
public record PatientsApiController(PatientsApiDelegate delegate)
        implements PatientsApi {

    public PatientsApiController(
            @Autowired(required = false) PatientsApiDelegate delegate
    ) {
        this.delegate = Optional
                .ofNullable(delegate)
                .orElse(new PatientsApiDelegate() {
                });
    }

    @Override
    public PatientsApiDelegate getDelegate() {
        return delegate;
    }
}
