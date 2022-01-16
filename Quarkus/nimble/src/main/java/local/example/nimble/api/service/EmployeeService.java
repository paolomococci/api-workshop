package local.example.nimble.api.service;

import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.sqlclient.RowSet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class EmployeeService {

    @Inject
    io.vertx.mutiny.pgclient.PgPool client;

    public Uni<RowSet<Row>> listAll() {
        return client.query("SELECT ID, NAME FROM EMPLOYEE ORDER BY NAME ASC").execute();
    }
}
