package local.example.demo.api;

import local.example.demo.model.Growing;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import java.util.Set;

public interface GrowingApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /growing
     *
     * @param growing  (optional)
     * @return OK (status code 200)
     * @see GrowingApi#growingDelete
     */
    default ResponseEntity<Set<Growing>> growingDelete(Growing growing) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /growing
     *
     * @return OK (status code 200)
     * @see GrowingApi#growingGet
     */
    default ResponseEntity<Set<Growing>> growingGet() {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /growing
     *
     * @param growing  (optional)
     * @return OK (status code 200)
     * @see GrowingApi#growingPost
     */
    default ResponseEntity<Set<Growing>> growingPost(Growing growing) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /growing
     *
     * @param growing  (optional)
     * @return OK (status code 200)
     * @see GrowingApi#growingPut
     */
    default ResponseEntity<Set<Growing>> growingPut(Growing growing) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
