package nz.denys.restservice.model;

import graphql.annotations.GraphQLAnnotations;
import graphql.schema.GraphQLSchema;

/**
 * Created by denys on 15/10/17.
 */
public class FlightSchema {
    private final GraphQLSchema schema;

    public FlightSchema() {
        schema = GraphQLSchema.newSchema().query(GraphQLAnnotations.object(FlightQuery.class)).build();
    }

    public GraphQLSchema getSchema() {
        return schema;
    }
}
