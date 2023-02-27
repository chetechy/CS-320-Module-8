package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import application.Contact;
import application.ContactService;

class ContactServiceTest {
	
	@Test
	void testContactServiceClass() {
		ContactService.addContact("James", "Smith", "6618886118", "123 Fake St. Encino, CA 91158");
		assertTrue(ContactService.contactList.get(0).getContactId().equals("1000000002"));
		assertTrue(ContactService.contactList.get(0).getFirstName().equals("James"));
		assertTrue(ContactService.contactList.get(0).getLastName().equals("Smith"));
		assertTrue(ContactService.contactList.get(0).getPhone().equals("6618886118"));
		assertTrue(ContactService.contactList.get(0).getAddress().equals("123 Fake St. Encino, CA 91158"));
	}
	@Test
	void testDeleteContact() {
		ContactService.addContact("James", "Smith", "6618886118", "123 Fake St. Encino, CA 91158");
		int size = ContactService.contactList.size();
		ContactService.deleteContact("1000000002");
		assertTrue(ContactService.searchContact("1000000002") == 2);
	}
	@Test
	void testUpdateFirstName() {
		ContactService.addContact("Jack", "Skellingto", "6618886118", "Halloween Ave.");
		int size = ContactService.contactList.size();
		ContactService.updateFirstName("1000000002", "Mary");
		assertTrue(ContactService.contactList.get(size - 1).getFirstName().equals("Mary"));
	}
	@Test
	void testUpdateLastName() {
		int size = ContactService.contactList.size();
		ContactService.updateLastName("1000000003", "Poppins");
		assertTrue(ContactService.contactList.get(size - 1).getLastName().equals("Poppins"));
	}
	@Test
	void testUpdatePhone() {
		int target = 0;
		target = ContactService.findIndex("1000000003");
		ContactService.updatePhoneNum("1000000003", "8884446161");
		assertTrue(ContactService.contactList.get(target).getPhone().equals("8884446161"));
	}
	@Test
	void testUpdateAddress() {
		int target = 0;
		target = ContactService.findIndex("1000000003");
		ContactService.updateAddress("1000000003", "456 Fake St. Acton, CA 91542");
		assertTrue(ContactService.contactList.get(target).getAddress().equals("456 Fake St. Acton, CA 91542"));
	}
	@Test
	void testUniqueId() {
		Contact newContact = new Contact("49594", "Smith", "Smithson", "6618886118", "Original Contact Address");
		ContactService.addContact(newContact);
		Contact duplicateId = new Contact("49594", "Smith", "Smithson", "6618886118", "Duplicate Contact Address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService.addContact(duplicateId);
		});
	}
}
