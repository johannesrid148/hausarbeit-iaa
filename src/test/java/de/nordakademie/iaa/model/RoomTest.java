package de.nordakademie.iaa.model;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class RoomTest {

    @Test
    public void expectToCreateRoom() {
        // given
        final Room room = new Room("A", "001");

        // when

        // then
        assertThat(room.getBuilding(), is("A"));
        assertThat(room.getNumber(), is("001"));
    }
}
