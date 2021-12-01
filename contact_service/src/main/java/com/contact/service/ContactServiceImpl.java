package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list=List.of(

            new Contact(11L,"chetanchauhan0408@gmail.com","Chetan",111L),
            new Contact(12L,"aman@gmail.com","Aman",121L),
            new Contact(13L,"vishu@gmail.com","Vishu",123L),
            new Contact(14L,"amit@gmail.com","Amit",111L)

    );
    @Override
    public List<Contact> getContactById(Long uid) {

        return list.stream().filter(contact -> contact.getUserId().equals(uid)).collect(Collectors.toList());


    }
}
