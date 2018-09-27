package seedu.addressbook.logic;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;

public abstract class Storage {

    /** Default file path used if the user doesn't provide the file name. */
    public static final String DEFAULT_STORAGE_FILEPATH = "addressbook.txt";

    public abstract AddressBook load() throws StorageOperationException;

    public abstract void save(AddressBook addressBook) throws StorageOperationException;

    public abstract String getPath();


    /**
     * Signals that the given file path does not fulfill the storage filepath constraints.
     */
    public class InvalidStorageFilePathException extends IllegalValueException {
        public InvalidStorageFilePathException(String message) {
            super(message);
        }
    }

    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage file.
     */
    public class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }

}
