package com.contactmanager.repository;

import com.contactmanager.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact,Long> {
    List<Contact> findByAddressPostalCode(String postalCode);
}
