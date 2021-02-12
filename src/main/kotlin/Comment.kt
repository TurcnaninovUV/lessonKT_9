class Comment(
    val noteId: Long,
    val ownerId: Long,
    val message: String? = null,
    val guid: Int? = null,
    var availableСomment: Boolean = true
) : NoteAndComment<Comment> {
    private val commentList = mutableListOf<Comment>()

    override fun add(entity: Comment) {
        commentList.add(entity)
    }

    override fun delete(id: Long) {
        commentList.forEach { commentIn ->
            if (id == commentIn.ownerId) commentIn.availableСomment = false
        }
    }

    override fun edit(entity: Comment) {
        commentList.forEach { commentIn ->
            if (entity.ownerId == commentIn.ownerId) {
                commentList.remove(commentIn)
                commentList.add(entity)
            }
        }
    }

    override fun read() {
        commentList.forEach { commentIn ->
            if (commentIn.availableСomment) println(commentIn)
        }
    }

    override fun getById(id: Long) {
        commentList.forEach { commentIn ->
            if (commentIn.ownerId == id) println(commentIn)
        }
    }

    override fun restore(id: Long) {
        commentList.forEach { commentIn ->
            if (id == commentIn.ownerId) commentIn.availableСomment = true
        }
    }
}