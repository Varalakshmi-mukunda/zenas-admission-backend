package com.school.admission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.admission.entity.Enquiry;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {

}