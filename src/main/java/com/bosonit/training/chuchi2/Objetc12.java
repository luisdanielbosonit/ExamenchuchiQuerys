package com.bosonit.training.chuchi2;

import io.netty.handler.codec.Headers;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Objetc12 {

    private List<String> paths=new ArrayList<>();
    private List<Map> querys= new ArrayList<>();
    private  List<Map> headers= new ArrayList<>();




    public Objetc12(String path1, String path2, HashMap<String,String> query,HashMap<String,String> header) {
        this.paths.add(path1);
        this.paths.add(path2);
        this.querys.add(query);
        this.headers.add(header);
    }

}
