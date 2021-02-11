import org.junit.Test

import org.junit.Assert.*

class NoteServiceTest {

    @Test
    fun addNote() {
        val note = Note(1)

        val expected = NoteService.addNote(note)

        val result = NoteService.addNote(note)

        assertEquals(expected, result)

    }

    @Test
    fun createComment() {
        val note = Note(1)
        val comment = Comment(1, ownerId = 4)
        NoteService.addNote(note)

        val expected = NoteService.createComment(comment)

        val result = NoteService.createComment(comment)

        assertEquals(expected, result)
    }

    @Test
    fun deleteNote() {
        val note = Note(1)
        NoteService.addNote(note)
        NoteService.deleteNote(note)

        val expected = !note.availableNote

        val result = !note.availableNote

        assertEquals(expected, result)
    }

    @Test
    fun deleteComment() {
        val note = Note(1)
        val comment = Comment(1, ownerId = 4)
        NoteService.addNote(note)
        NoteService.createComment(comment)
        NoteService.deleteComment(comment)

        val expected = !comment.availableСomment

        val result = !comment.availableСomment

        assertEquals(expected, result)


    }

    @Test
    fun restoreComment() {
        val note = Note(1)
        val comment = Comment(1, ownerId = 4)
        NoteService.addNote(note)
        NoteService.createComment(comment)
        NoteService.deleteComment(comment)
        NoteService.restoreComment(comment)

        val expected = comment.availableСomment

        val result = comment.availableСomment

        assertEquals(expected, result)

    }

    @Test
    fun getNotes() {
        val note = Note(1)
        NoteService.addNote(note)


        val expected = NoteService.getNotes()

        val result = NoteService.getNotes()

        assertEquals(expected, result)

    }

    @Test
    fun getComments() {
        val note = Note(1)
        val comment = Comment(1, ownerId = 4)
        NoteService.addNote(note)
        NoteService.createComment(comment)

        val expected = NoteService.createComment(comment)

        val result = NoteService.createComment(comment)

        assertEquals(expected, result)

    }

    @Test
    fun getById() {
        val note = Note(1)
        NoteService.addNote(note)


        val expected = NoteService.getById(1)

        val result = NoteService.getById(1)

        assertEquals(expected, result)
    }

    @Test
    fun editNote() {
        val note = Note(1)
        NoteService.addNote(note)


        val expected = NoteService.editNote(note)

        val result = NoteService.editNote(note)

        assertEquals(expected, result)

    }

    @Test
    fun editComment() {
        val note = Note(1)
        val comment = Comment(1, ownerId = 4)
        val comment2 = Comment(1, ownerId = 4, guid = 5)
        NoteService.addNote(note)
        NoteService.createComment(comment)

        val expected = NoteService.editComment(comment)

        val result = NoteService.editComment(comment)

        assertEquals(expected, result)

    }
}