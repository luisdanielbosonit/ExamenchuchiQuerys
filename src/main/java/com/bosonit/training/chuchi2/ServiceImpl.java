package com.bosonit.training.chuchi2;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ServiceImpl {



public Objetc12 objetc12(String path1, String path2, HashMap<String,String> query, HashMap<String,String> header){

    return new Objetc12(path1,path2,query,header);

}



}
