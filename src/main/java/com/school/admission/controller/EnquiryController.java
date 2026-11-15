package com.school.admission.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.school.admission.entity.Enquiry;
import com.school.admission.service.EnquiryService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/enquiries")
@CrossOrigin(origins = "http://localhost:5173")
public class EnquiryController {

    private final EnquiryService enquiryService;

    public EnquiryController(EnquiryService enquiryService) {
        this.enquiryService = enquiryService;
    }

    // Submit enquiry
    @PostMapping
    public Enquiry saveEnquiry(@RequestBody Enquiry enquiry) {
        return enquiryService.saveEnquiry(enquiry);
    }

    // Get all enquiries
    @GetMapping
    public List<Enquiry> getAllEnquiries() {
        return enquiryService.getAllEnquiries();
    }

    // Get enquiry by ID
    @GetMapping("/{id}")
    public Enquiry getEnquiryById(@PathVariable Long id) {
        return enquiryService.getEnquiryById(id);
    }

    // Delete enquiry
    @DeleteMapping("/{id}")
    public String deleteEnquiry(@PathVariable Long id) {
        enquiryService.deleteEnquiry(id);
        return "Enquiry deleted successfully";
    }
    @PutMapping("/{id}")
public Enquiry updateEnquiry(@PathVariable Long id, @RequestBody Enquiry enquiry) {
    return enquiryService.updateEnquiry(id, enquiry);
}
}