package com.example.dpachecor.qrbarcode.Data.tablas;

import java.security.PublicKey;

/**
 * Created by dpachecor on 16/06/2017.
 */

public class TablaActivo {

    public static final String TABLE_NAME= "ACTIVO";

    public static final String Codigo  ="IDACTIVO";
    public static final String Tipo = "TIPO";
    public static final String Responsable = "RESPONSABLE";
    public static final String Proveedor = "PROVEEDOR";
    public static final String Marca = "MARCA";
    public static final String Modelo = "MODELO";
    public static final String Serie ="SERIE";

    /*
    public static final String Stock = "STOCK";
    public static final String Placa ="PLACA";
    public static final String Ubicacion ="UBICACION";
    */

    public static final String Fechacompra="FECHA_COMPRA";
    public static final String Valorcompra = "VALOR_COMPRAR";
    public static final String FechaRegistro ="FECHA_REGISTRO";

    /*
    public static final String Aseguradora = "Aseguradora";
    public static final String Agente ="AGENTE";
    public static final String DeptSolic ="DEPTSOLIC";
    public static final String NombSolic= "NOMBSOLIC";
    public static final String Destino ="DESTINO";
    */
    public static final String FechaSalida = "FECHA_SALIDA";
    public static final String Condiciones ="CONDICIONES";
    public static final String FECHAHORASINC = "FECHA_HORA_SINC";

    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " +

            Codigo + " TEXT NOT NULL, " +
            Tipo + " NUMBER NULL, " +
            Responsable + " TEXT NULL, " +
            Proveedor + " TEXT NULL, " +
            Marca + " NUM NULL, " +
            Modelo + " NUM NULL, " +
            Serie + "TEXT NULL, "+
            Fechacompra + " DATETIME NULL, " +
            Valorcompra + " REAL NULL, " +
            FechaRegistro + "DATETIME NULL, " +
            FechaSalida + " DATETIME NULL, " +
            Condiciones + " TEXT NULL, " +
            FECHAHORASINC + " DATETIME NULL, " +
            "PRIMARY KEY (CODIGO) " +
            ")";

    public static final String SELECT_TABLE = "SELECT " +
            Codigo + ", " +
            Tipo + ", " +
            Responsable + ", " +
            Proveedor + ", " +
            Marca + ", " +
            Modelo + ", " +
            Serie + ", " +
            Fechacompra + ", " +
            Valorcompra + ", " +
            FechaRegistro + ", " +
            FechaSalida + ", " +
            Condiciones + ", " +
            FECHAHORASINC + ", " +
            "FROM " + TABLE_NAME;

}
