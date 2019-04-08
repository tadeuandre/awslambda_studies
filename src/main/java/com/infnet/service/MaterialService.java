package com.infnet.service;

import com.infnet.model.*;
import com.infnet.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository repository;

    public Material save(Material material) {
        return repository.save(material);
    }

    public Material findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Material> list() {
        return repository.findAll();
    }
}
