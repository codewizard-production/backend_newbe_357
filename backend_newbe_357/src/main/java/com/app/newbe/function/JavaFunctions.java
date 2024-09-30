package com.app.newbe.function;

import com.app.newbe.model.Pet;
import com.app.newbe.model.PetCareCenter;
import com.app.newbe.model.PetOwner;
import com.app.newbe.model.Document;
import com.app.newbe.model.PetService;
import com.app.newbe.enums.PetServiceType;
import com.app.newbe.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.newbe.repository.PetServiceRepository;
import com.app.newbe.repository.PetOwnerRepository;
import com.app.newbe.repository.PetCareCenterRepository;
import com.app.newbe.repository.DocumentRepository;
import com.app.newbe.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
