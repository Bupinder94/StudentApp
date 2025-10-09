//class Student(
//    val id: String,
//    val name: String,
//    val course: String,
//    val mark: Double
//) {
//    override fun toString(): String {
//        return "Student(name='$name', course='$course', mark=$mark)"
//    }
}

class Student(val name: String) {
    var mark: Int = 0
        set(value) {
            if (value in 0..100) {
                field = value
            } else {
                println("Invalid mark '$value'. Mark must be between 0 and 100.")
            }
        }

    fun getGrade(): String {
        return when (mark) {
            in 70..100 -> "First"
            in 60..69 -> "2/1"
            in 50..59 -> "2/2"
            in 40..49 -> "Third"
            else -> "Fail"
        }
    }

    fun didPass(): Boolean {
        return mark >= 40
    }
}
