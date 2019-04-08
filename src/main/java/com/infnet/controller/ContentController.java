package com.infnet.controller;


import com.infnet.model.*;
import com.infnet.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.*;

import java.util.*;


@RestController
@EnableWebMvc
public class ContentController {

    @Autowired
    private MaterialService materialService;

    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public Map<String, String> ping() {
        Map<String, String> pong = new HashMap<>();
        pong.put("pong", "Hello, World!");
        return pong;
    }

    @RequestMapping(path = "/portal", method = RequestMethod.GET)
    public List<Material> getAllMaterials() {
        return materialService.list();
    }

    @RequestMapping(path = "/portal", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> insertMaterial(@RequestBody Material material) {
        Material materialSaved = materialService.save(material);
        Map<String, String> resposta = new HashMap<>();
        resposta.put("pong", materialSaved.toString());
        return resposta;
    }
}
