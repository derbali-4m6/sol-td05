package ca.qc.sol_td05.models.dao;

import java.util.List;

import ca.qc.sol_td05.models.entities.Contact;

//contrats
public interface IContactDAO {
    List<Contact> getAllContacts();
    Contact getContactById(int id);
    Contact addContact(Contact contact);
    Contact updateContactById(int id, Contact contact);
    Contact deleteContactByID(int id);
}
