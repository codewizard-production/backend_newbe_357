package com.app.newbe.function;

import com.app.newbe.model.Pet;
import com.app.newbe.model.PetCareCenter;
import com.app.newbe.model.PetOwner;
import com.app.newbe.model.Document;
import com.app.newbe.model.PetService;




import com.app.newbe.enums.PetServiceType;
import com.app.newbe.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  