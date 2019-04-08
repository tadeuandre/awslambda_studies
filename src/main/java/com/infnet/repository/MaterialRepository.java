package com.infnet.repository;

import com.infnet.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {
}
