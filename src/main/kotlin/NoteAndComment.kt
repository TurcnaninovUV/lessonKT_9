interface NoteAndComment <E> {

    fun add(entity: E)

    fun delete(id: Long)

    fun edit(entity: E)

    fun read()

    fun getById(id: Long)

    fun restore(id: Long)

}