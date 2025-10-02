class Student(
    val id: String,
    val name: String,
    val course: String,
    val mark: Double
) {
    override fun toString(): String {
        return "Student(name='$name', course='$course', mark=$mark)"
    }
}