class Note(
    val id: Long,
    val title: String? = null,
    val text: String? = null,
    val privacyView: Boolean? = null,
    val privacyComment: Boolean? = null,
    var availableNote: Boolean = true
) : NoteAndComment<Note> {
    private val noteList = mutableListOf<Note>()

    override fun add(entity: Note) {
        noteList.add(entity)
    }

    override fun delete(id: Long) {
        noteList.forEach { noteIn ->
            if (id == noteIn.id) noteIn.availableNote = false
        }
    }

    override fun edit(entity: Note) {
        noteList.forEach { noteIn ->
            if (entity.id == noteIn.id) {
                noteList.remove(noteIn)
                noteList.add(entity)
            }
        }
    }

    override fun read() {
        noteList.forEach { noteIn ->
            if (noteIn.availableNote) println(noteIn)
        }
    }

    override fun getById(id: Long) {
        noteList.forEach { noteIn ->
            if (noteIn.id == id) println(noteIn)
        }
    }

    override fun restore(id: Long) {
        noteList.forEach { noteIn ->
            if (id == noteIn.id) noteIn.availableNote = true
        }
    }
}