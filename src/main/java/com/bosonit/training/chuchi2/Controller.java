package com.bosonit.training.chuchi2;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@RestController
public class Controller {

    @Autowired
    ServiceImpl service;

    @GetMapping(value ={"*","/{path1}","/{path1}/{path2}"})
    public Object entrOther(@PathVariable(required = false)@NotNull String path1,
                            @PathVariable(required = false) String path2,
                            @RequestParam(required = false) HashMap<String,String> query,
                            @RequestHeader(required = false) HashMap<String,String> header){
        if((header.containsKey("redirige") && header.containsValue("SALTA"))) {
            return new ModelAndView("redirect:/salt");
        }

        return new Objetc12(path1, path2,query,header);
    }

    @GetMapping({"/","one"})
    public String entrOne(){
        return "tienes One";
    }
    @GetMapping(value={"/salt"})
    public String entryJump() {
        return "he ido a Jump";
    }
}

