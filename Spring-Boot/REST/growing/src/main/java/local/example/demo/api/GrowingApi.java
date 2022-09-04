package local.example.demo.api;

import io.swagger.annotations.*;

import local.example.demo.model.Growing;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

import java.util.Set;

@Validated
@Api(value = "growing")
public interface GrowingApi {

    default GrowingApiDelegate getDelegate() {
        return new GrowingApiDelegate() {};
    }

    /**
     * DELETE /growing
     *
     * @param growing  (optional)
     * @return OK (status code 200)
     */

    @ApiOperation(
            value = "",
            nickname = "growingDelete",
            response = Growing.class,
            responseContainer = "Set",
            tags = { "Growing Resource", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Growing.class, responseContainer = "Set")
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/growing",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Set<Growing>> growingDelete(
            @ApiParam @Valid @RequestBody(required = false) Growing growing
    ) {
        return getDelegate().growingDelete(growing);
    }


    /**
     * GET /growing
     *
     * @return OK (status code 200)
     */

    @ApiOperation(
            value = "",
            nickname = "growingGet",
            response = Growing.class,
            responseContainer = "Set",
            tags = { "Growing Resource", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Growing.class, responseContainer = "Set")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/growing",
        produces = { "application/json" }
    )
    default ResponseEntity<Set<Growing>> growingGet() {
        return getDelegate().growingGet();
    }


    /**
     * POST /growing
     *
     * @param growing  (optional)
     * @return OK (status code 200)
     */

    @ApiOperation(
            value = "",
            nickname = "growingPost",
            response = Growing.class,
            responseContainer = "Set",
            tags = { "Growing Resource", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Growing.class, responseContainer = "Set")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/growing",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Set<Growing>> growingPost(
            @ApiParam @Valid @RequestBody(required = false) Growing growing
    ) {
        return getDelegate().growingPost(growing);
    }


    /**
     * PUT /growing
     *
     * @param growing  (optional)
     * @return OK (status code 200)
     */

    @ApiOperation(
            value = "",
            nickname = "growingPut",
            response = Growing.class,
            responseContainer = "Set",
            tags = { "Growing Resource", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Growing.class, responseContainer = "Set")
    })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/growing",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Set<Growing>> growingPut(
            @ApiParam @Valid @RequestBody(required = false) Growing growing
    ) {
        return getDelegate().growingPut(growing);
    }
}
