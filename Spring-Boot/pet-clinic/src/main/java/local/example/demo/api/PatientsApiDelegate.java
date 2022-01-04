package local.example.demo.api;

import local.example.demo.model.Patient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

public interface PatientsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /patients : Pet clinic database API
     *
     * @param limit How many patients to return at one time (optional)
     * @return A paged array of pet-clinic patients (status code 200)
     *         or unexpected error (status code 200)
     * @see PatientsApi#listOfLittlePatients
     */
    default ResponseEntity<List<Patient>> listOfLittlePatients(Integer limit) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /patients/{patientId} : Info for a specific patient
     *
     * @param patientId The id of the patientt to retrieve (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     * @see PatientsApi#showPatientById
     */
    default ResponseEntity<Patient> showPatientById(String patientId) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /patients : Create a patient
     *
     * @return Null response (status code 201)
     *         or unexpected error (status code 200)
     * @see PatientsApi#toRecordPatients
     */
    default ResponseEntity<Void> toRecordPatients() {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
