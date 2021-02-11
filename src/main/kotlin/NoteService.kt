object NoteService {
    private var noteAndCommentMap = mutableMapOf<Note, Array<Comment>>()
    private var commentList = emptyArray<Comment>()

    fun addNote(note: Note) {
        noteAndCommentMap[note] = commentList
    }

    fun createComment(comment: Comment) {
        noteAndCommentMap.forEach { (note, commentIn) ->
            if (note.id == comment.noteId && note.availableNote) {
                commentList += comment
                noteAndCommentMap[note] = commentList
            }
        }
    }


    fun deleteNote(note: Note) {
        noteAndCommentMap.forEach { (noteKey, _) ->
            if (note.id == noteKey.id) noteKey.availableNote = false
        }
    }


    fun deleteComment(comment: Comment) {
        noteAndCommentMap.forEach { (noteKey, commentValue) ->
            if (noteKey.id == comment.noteId) {
                commentValue.forEach { commentIn ->
                    if (commentIn.ownerId == comment.ownerId)
                        commentIn.availableСomment = false
                }
            }

        }
    }


    fun restoreComment(comment: Comment) {
        noteAndCommentMap.forEach { (_, commentValue) ->
            commentValue.forEach { commentIn ->
                if (comment.ownerId == commentIn.ownerId && !commentIn.availableСomment)
                    commentIn.availableСomment = true
            }
        }

    }


    fun getNotes() {
        noteAndCommentMap.forEach { (note, _) ->
            if (note.availableNote) println(note)
        }
    }


    fun getComments(note: Note) {
        noteAndCommentMap.forEach { (noteKey, commentValue) ->
            if (note.id == noteKey.id && noteKey.availableNote) {
                commentValue.forEach { commentIn ->
                    if (commentIn.availableСomment)
                        println(commentIn)
                }
            }
        }
    }


    fun getById(id: Int) {
        noteAndCommentMap.forEach { (note, _) ->
            if (note.id == id && note.availableNote) println(note)

        }
    }


    fun editNote(note: Note) {
        noteAndCommentMap.forEach { (noteKey, commentValue) ->
            if (noteKey.id == noteKey.id && noteKey.availableNote) noteAndCommentMap.replace(note, commentValue)

        }
    }


    fun editComment(comment: Comment) {
        noteAndCommentMap.forEach { (noteKey, commentValue) ->
            if (noteKey.id == comment.noteId && noteKey.availableNote)
                for (commentIn in commentList) {
                    if (commentIn.ownerId == comment.ownerId && commentIn.availableСomment)
                        commentIn.availableСomment = false
                    commentList += comment
                    noteAndCommentMap[noteKey] = commentList
                }
        }
    }
}








