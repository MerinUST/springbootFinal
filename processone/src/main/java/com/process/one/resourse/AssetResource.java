package com.process.one.resourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.process.one.exceptions.ResourceNotFoundException;
import com.process.one.model.Asset;
import com.process.one.model.FTTIssueBase;
import com.process.one.repositories.FTTIssueBaseRepository;
import com.process.one.serviceimpl.AssetImpl;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@RestController
@RequestMapping("/api")
@Validated
public class AssetResource {
	

	Asset asset;
	
	@Autowired
	AssetImpl service;
	
	
	
	@GetMapping(value="/asset-lookup/v1asset/",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Asset> showInstrById(@NotNull(message="INSTRID is missing") 
	@Pattern(regexp="INSTRID") 
	@RequestParam (required=false)  String type,  
	@Size(min=10 , max=10, message="id value should be 10 digits") 
	@RequestParam (required=false) String id ) throws ResourceNotFoundException {

		Optional<FTTIssueBase> optional = service.findById(id);
		
		
		if(optional.isEmpty()) {
			throw new ResourceNotFoundException("No INSTRID found with the id "+ id);
		}
		FTTIssueBase base =  optional.get();
		
		
	    asset = transform(base);         
		return new ResponseEntity<>(asset, HttpStatus.OK);
	}

	
	private Asset transform(FTTIssueBase base)
	{
		

		 asset = new Asset();
		asset.setIntstrid(base.getIntstrid());
		asset.setStatType(base.getStatType());
		asset.setDemoCurrCode(base.getDemoCurrCode());
		asset.setIssueType(base.getIssueType());
		asset.setMaturityExxpiryTms(base.getMaturityExpiryTms());
		asset.setIssueSearchText(base.getIssueSearchText());  // double
        asset.setNominalValue( ((Double)(base.getNominalValue() + base.getNominalValueDecimal())).toString());
 	    asset.setReturnCode("0");
        asset.setReturnDesc("SUCCESS");
	   
        return asset;
	}
	
	
	
	
	
}