class Comment(
    val noteId: Int,
    val ownerId: Int,
    val message: String? = null,
    val guid: Int? = null,
    var availableСomment: Boolean = true
)  {

}