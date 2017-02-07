package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

// Parent Class of Address, Email and Phone
public class Contact {

        private boolean isPrivate;
        public String value;
        
        public Contact(String contact, boolean isPrivate) throws IllegalValueException {
            this.isPrivate = isPrivate;
            String trimmedContact = contact.trim();
            this.value = trimmedContact;
        }
        
        
        //Override
        public boolean equals(Object otherContact) {
            return otherContact == this 
                    || (otherContact instanceof Contact 
                    && this.value.equals(((Contact) otherContact).value)); 
            //taken from other students on GitHub
        }
        
        //Override
        public String toString() {
            return value;
        }
        
        //Override
        public int hashCode() {
            return value.hashCode();
        }
        
        public boolean isPrivate() {
            return isPrivate;
        }
}