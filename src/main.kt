fun main() {
    while (true) {
        println("Enter student name (or type 'quit' to exit):")
        val name = readln()
        if (name.lowercase() == "quit") {
            break
        }

        println("Enter student ID:")
        val id = readln()

        println("Enter course:")
        val course = readln()

        println("Enter mark:")
        val markInput = readln()
        val mark = markInput.toDoubleOrNull()

        if (mark == null) {
            println("Invalid mark. Please enter a number.")
            continue
        }

        val student = Student(id, name, course)
        // set the mark separately
        println("Student created: $student")
    }

    println("Program ended.")
}