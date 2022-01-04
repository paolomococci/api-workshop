package local.example.demo.api;

import io.swagger.annotations.*;

import local.example.demo.model.Error;
import local.example.demo.model.Patient;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

import java.util.List;

@Validated
@Api(value = "patients")
public interface PatientsApi {

    default PatientsApiDelegate getDelegate() {
        return new PatientsApiDelegate() {};
    }

    /**
     * GET /patients : Pet clinic database API
     *
     * @param limit How many patients to return at one time (optional)
     * @return A paged array of pet-clinic patients (status code 200)
     *         or unexpected error (status code 200)
     */

    @ApiOperation(
            value = "Pet clinic database API", 
            nickname = "listOfLittlePatients", 
            response = Patient.class, 
            responseContainer = "List", 
            tags = { "patients", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "A paged array of pet-clinic patients", response = Patient.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/patients",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Patient>> listOfLittlePatients(
            @ApiParam(value = "How many patients to return at one time") 
            @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        return getDelegate().listOfLittlePatients(limit);
    }


    /**
     * GET /patients/{patientId} : Info for a specific patient
     *
     * @param patientId The id of the patient to retrieve (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */

    @ApiOperation(
            value = "Info for a specific patient", 
            nickname = "showPatientById", 
            response = Patient.class, 
            tags = { "patients", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = Patient.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) 
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/patients/{patientId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Patient> showPatientById(
            @ApiParam(value = "The id of the patient to retrieve", required = true) 
            @PathVariable("patientId") String patientId
    ) {
        return getDelegate().showPatientById(patientId);
    }


    /**
     * POST /patients : Create a patient
     *
     * @return Null response (status code 201)
     *         or unexpected error (status code 200)
     */

    @ApiOperation(
            value = "Create a patient",
            nickname = "toRecordPatients",
            tags = { "patients", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Null response"),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/patients",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> toRecordPatients() {
        return getDelegate().toRecordPatients();
    }
}
