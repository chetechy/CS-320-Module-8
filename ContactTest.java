package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import application.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
		assertTrue(contact.getContactId().equals("4561"));
		assertTrue(contact.getFirstName().equals("Chidubem"));
		assertTrue(contact.getLastName().equals("Onyekaba"));
		assertTrue(contact.getPhone().equals("7702867894"));
		assertTrue(contact.getAddress().equals("356 Queen St, Wonder, Ga 30326"));
	}
	
	// tests requirements of each object
	@Test
	void testContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("456178945654","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
		});
	}
	@Test
	void testContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4561","Chidubemyay", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
		});
	}
	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4561","Chidubem", "Onyekabalkj","7702867894", "356 Queen St, Wonder, Ga 30326");
		});
	}
	@Test
	void testContactPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4561","Chidubem", "Onyekaba","77028678945", "356 Queen St, Wonder, Ga 30326");
		});
	}
	@Test
	void testContactPhoneToShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4561","Chidubem", "Onyekaba","770286789", "356 Queen St, Wonder, Ga 30326");
		});
	}
	@Test
	void testContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4561","Chidubem", "Onyekaba","7702867894", "3565 Queen St, Wonderville, Ga 30326");
		});
	}
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null,"Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
		});
	}
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4561",null, "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
		});
	}
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4561","Chidubem", null,"7702867894", "356 Queen St, Wonder, Ga 30326");
		});
	}
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4561","Chidubem", "Onyekaba",null, "356 Queen St, Wonder, Ga 30326");
		});
	}
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("4561","Chidubem", "Onyekaba","7702867894", null);
		});
	}
	
	// tests setter methods
		@Test
		void testSetFirstName() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			newContact.setFirstName("Kilah");
			assertTrue(newContact.getFirstName().equals("Kilah"));
		}
		@Test
		void testSetFirstNameTooLong() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newContact.setFirstName("Chidubemyay");
			});
		}
		@Test
		void testSetFirstNameNull() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newContact.setFirstName(null);
			});
		}
		@Test
		void testSetLastName() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			newContact.setLastName("Pickles");
			assertTrue(newContact.getLastName().equals("Pickles"));
		}
		@Test
		void testSetLastNameTooLong() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newContact.setLastName("Onyekabalkj");
			});
		}
		@Test
		void testSetLastNameNull() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newContact.setLastName(null);
			});
		}
		@Test
		void testSetPhone() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			newContact.setPhone("6785624561");
			assertTrue(newContact.getPhone().equals("6785624561"));
		}
		@Test
		void testSetPhoneTooLong() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newContact.setPhone("77028678947");
			});
		}
		@Test
		void testSetPhoneNull() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newContact.setPhone(null);
			});
		}
		@Test
		void testSetPhoneTooShort() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newContact.setPhone("67894");
			});
		}
		@Test
		void testSetAddress() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			newContact.setAddress("254 Goddess Dr, Pup, Ga 3266");
			assertTrue(newContact.getAddress().equals("254 Goddess Dr, Pup, Ga 3266"));
		}
		@Test
		void testSetAddressTooLong() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newContact.setAddress("3565 Queen St, Wonderville, Ga 30326");
			});
		}
		@Test
		void testSetAddressNull() {
			Contact newContact = new Contact("4561","Chidubem", "Onyekaba","7702867894", "356 Queen St, Wonder, Ga 30326");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newContact.setAddress(null);
			});
		}
}
