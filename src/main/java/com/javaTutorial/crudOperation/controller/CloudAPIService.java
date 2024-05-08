package com.javaTutorial.crudOperation.controller;

import com.javaTutorial.crudOperation.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CloudAPIService {
    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
    }

    @PostMapping()
    public String postCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Successfully created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Successfully updated";
    }

    @DeleteMapping
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Successfully deleted";
    }


}
