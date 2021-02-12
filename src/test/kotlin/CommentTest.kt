import org.junit.Test

import org.junit.Assert.*

class CommentTest {

    @Test
    fun add() {
        val comment = Comment(1, ownerId = 4)

        val expected = comment.add(comment)

        val result = comment.add(comment)

        assertEquals(expected, result)
    }

    @Test
    fun delete() {
        val comment = Comment(1, ownerId = 4)

        val expected = comment.delete(4)

        val result = comment.delete(4)

        assertEquals(expected, result)
    }

    @Test
    fun edit() {
        val comment = Comment(1, ownerId = 4)

        val expected = comment.edit(comment)

        val result = comment.edit(comment)

        assertEquals(expected, result)
    }

    @Test
    fun read() {
        val comment = Comment(1, ownerId = 4)

        val expected = comment.read()

        val result = comment.read()

        assertEquals(expected, result)
    }

    @Test
    fun getById() {
        val comment = Comment(1, ownerId = 4)

        val expected = comment.getById(4)

        val result = comment.getById(4)

        assertEquals(expected, result)
    }

    @Test
    fun restore() {
        val comment = Comment(1, ownerId = 4)

        val expected = comment.restore(4)

        val result = comment.restore(4)

        assertEquals(expected, result)
    }
}