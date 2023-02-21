package ca.qc.sol_td05.models.dao;

import java.util.List;

import ca.qc.sol_td05.models.entities.Contact;

//contrats
public interface IContacDAO {
    List<Contact> getAllContacts();
}
