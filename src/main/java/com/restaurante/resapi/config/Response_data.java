package com.restaurante.resapi.config;

import java.util.List;

public class Response_data  {
    private String msj;
    private boolean err;
    private Object data;

    public  Response_data (){

    }

    public Response_data(String msj, boolean err,Object data) {
        this.msj = msj;
        this.err = err;
        this.data = data;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public boolean isErr() {
        return err;
    }

    public void setErr(boolean err) {
        this.err = err;
    }

    public Object getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
