package com.example.dpachecor.qrbarcode;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MiConexion extends SQLiteOpenHelper{

    static final String DB_NAME = "CONTROLACTIVOS.db";

    static final int DB_VERSION = 1;


    public MiConexion(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        /*String MARCA = "create table marca(idmarca number primary key autoincrement, nomMarca text)";*/


        String TABLA="create table activo(idactivo text primary key,nombre text not null," +
                                            "tipo num, responsable text,proveedor text,marca num," +
                                            "modelo num, serie text,stock num,placa text,ubicacion text," +
                                            "fecha_compra date,valor_comprar real,fecha_registro date," +
                                            "aseguradora text,agente text,deptSolic text,nombSolic text," +
                                            "destino text,fechasalida date,condiciones text," +
                                            "FECHA_HORA_SINC DATETIME);";
        sqLiteDatabase.execSQL(TABLA);

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

