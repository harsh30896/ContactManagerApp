package com.contactmanager.service;

import com.contactmanager.Entity.Contact;
import com.contactmanager.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    Logger logger = LoggerFactory.getLogger(ContactService.class);
    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContact(){
        return contactRepository.findAll();
    }

    public List<Contact> getContactsByPostalCode(String postalCode){
        return contactRepository.findByAddressPostalCode(postalCode);
    }

    public Contact createContact(Contact contact)
    {
        Contact savedContact = contactRepository.save(contact);
        //System.out.println("Contact created with id: "+savedContact.getId());
        logger.info("Contact created with id: "+savedContact.getId());
        return savedContact;
    }



}
