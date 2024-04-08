package model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Role")
public class Role {
    @Id
    @GeneratedValue(GeneratedValue.UUIDGenerator.class)
    private String id;
    private String nombre;
    private String estado;

    public Role(String id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }
}
