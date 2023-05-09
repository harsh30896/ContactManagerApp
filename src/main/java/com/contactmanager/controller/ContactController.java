package com.contactmanager.controller;

import com.contactmanager.Entity.Contact;
import com.contactmanager.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/getAll")
    public List<Contact> getAllContacts()
    {
        return contactService.getAllContact();
    }

    @GetMapping("/{id}")
    public List<Contact> getContactsByPostalCode(@PathVariable("id") String postalCode){
        return contactService.getContactsByPostalCode(postalCode);
    }

    @PostMapping("/createContact")
    public Contact createContact(@RequestBody Contact contact){
        return contactService.createContact(contact);
    }

}
