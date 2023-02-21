package ca.qc.sol_td05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import ca.qc.sol_td05.models.dao.ContactDAO;
import ca.qc.sol_td05.models.entities.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Tag TD05", "Hello World !");
        ContactDAO dao = new ContactDAO(this);
        List<Contact> contacts = dao.getAllContacts();
        for (Contact c:
             contacts) {
            Log.d("Tag TD05", c.toString());
        }
    }
}