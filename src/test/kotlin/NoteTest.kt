import org.junit.Test

import org.junit.Assert.*

class NoteTest {

    @Test
    fun add() {
        val note = Note(1)

        val expected = note.add(note)

        val result = note.add(note)

        assertEquals(expected, result)
    }

    @Test
    fun delete() {
        val note = Note(1)

        val expected = note.delete(4)

        val result = note.delete(4)

        assertEquals(expected, result)
    }

    @Test
    fun edit() {
        val note = Note(1)

        val expected = note.edit(note)

        val result = note.edit(note)

        assertEquals(expected, result)
    }

    @Test
    fun read() {
        val note = Note(1)

        val expected = note.read()

        val result = note.read()

        assertEquals(expected, result)
    }

    @Test
    fun getById() {
        val note = Note(1)

        val expected = note.getById(4)

        val result = note.getById(4)

        assertEquals(expected, result)
    }

    @Test
    fun restore() {
        val note = Note(1)

        val expected = note.restore(4)

        val result = note.restore(4)

        assertEquals(expected, result)
    }
}