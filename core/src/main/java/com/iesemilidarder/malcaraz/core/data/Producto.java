package com.iesemilidarder.malcaraz.core.data;

import java.util.UUID;

public abstract class Producto {
    private UUID id;
    private Double precio;
    private String name;
    private String descripcion;
    private String imgUri;

    protected Producto() {
    }
}
