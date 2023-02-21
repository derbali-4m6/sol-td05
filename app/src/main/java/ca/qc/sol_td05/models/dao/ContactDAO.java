package ca.qc.sol_td05.models.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import ca.qc.sol_td05.models.entities.Contact;

public class ContactDAO implements  IContacDAO{
    MyDbHelper helper;
    public ContactDAO(Context context) {
        this.helper = new MyDbHelper(context);
    }

    @Override
    public List<Contact> getAllContacts() {
        SQLiteDatabase db = this.helper.getReadableDatabase();
        String request ="SELECT * FROM Contact";
        Cursor cursor = db.rawQuery(request, null);
        if(cursor !=null){
            cursor.moveToFirst();
            List<Contact> contacts = new ArrayList<>();
            while(!cursor.isAfterLast()){
                Contact contact = new Contact();
                contact.setId(cursor.getInt(0)); //id
                contact.setName(cursor.getString(1)); //name
                contact.setPhoneNumber(cursor.getString(2)); //phoneNumber
                //ajouter le contact à la liste
                contacts.add(contact);
                cursor.moveToNext();
            }
            db.close();
            return contacts;
        }
        return null;
    }
}
