package com.app.newbe.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.newbe.model.Pet;
import com.app.newbe.model.PetCareCenter;
import com.app.newbe.model.PetOwner;
import com.app.newbe.model.Document;
import com.app.newbe.model.PetService;
import com.app.newbe.enums.PetServiceType;
import com.app.newbe.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterServices")
@Table(schema = "\"newbe\"", name = "\"PetCareCenterServices\"")
@Data
public class PetCareCenterServices{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"ServiceId\"")
    private Integer serviceId;
 
}