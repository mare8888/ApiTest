package db;

import db.service.UserTable;
import org.testng.annotations.Test;

public class DBTest {

    private final UserTable userTable = new UserTable();

    @Test
    void shouldBeAddedAndChangeAlice() {
        userTable.insertAlice();
        userTable.updateAlice();
        userTable.selectAllUsers();

    }

    @Test
    void shouldBeAddedAndDeleteTomy() {
        userTable.insertAlice();
        userTable.updateAlice();
        userTable.deleteTomy();
        userTable.selectAllUsers();
    }

}
