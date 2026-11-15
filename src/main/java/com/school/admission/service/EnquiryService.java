package com.school.admission.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.school.admission.entity.Enquiry;
import com.school.admission.repository.EnquiryRepository;

@Service
public class EnquiryService {

    private final EnquiryRepository enquiryRepository;

    public EnquiryService(EnquiryRepository enquiryRepository) {
        this.enquiryRepository = enquiryRepository;
    }

    // Save enquiry
    public Enquiry saveEnquiry(Enquiry enquiry) {
        return enquiryRepository.save(enquiry);
    }

    // Get all enquiries
    public List<Enquiry> getAllEnquiries() {
        return enquiryRepository.findAll();
    }

    // Get enquiry by ID
    public Enquiry getEnquiryById(Long id) {
        return enquiryRepository.findById(id).orElse(null);
    }

    // Delete enquiry
    public void deleteEnquiry(Long id) {
        enquiryRepository.deleteById(id);
    }
    public Enquiry updateEnquiry(Long id, Enquiry enquiry) {

    if (!enquiryRepository.existsById(id)) {
        throw new RuntimeException("Enquiry not found");
    }

    enquiry.setId(id);

    return enquiryRepository.save(enquiry);
}
}