package com.example.myapplication.hackerrank

fun main() {
//    solution(
//        phone_numbers = arrayOf<String>("123-456-123"),
//        phone_owners = arrayOf<String>("Henry T."),
//        number = "123-456-123"
//    ).also { println(it) }

    getPaidCoursesWithTheNumbersOfSubscribedStudents(2)
}

fun solution(phone_numbers: Array<String>, phone_owners: Array<String>, number: String): String {
    phone_numbers.zip(phone_owners).find { it.first == number }.also { return it?.first ?: number }
}


data class Student(
    val subscribedCourses: List<Course>
)
data class Course(
    val name: String,
    val isPaid: Boolean,
)

fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int) {
    val repository: List<Student> = listOf(
        Student(
            listOf(
                Course(name = "Math", isPaid = false),
                Course(name = "Art", isPaid = true)
            )
        ),
        Student(
            listOf(
                Course(name = "History", isPaid = true),
                Course(name = "Bio", isPaid = true)
            )
        ),
        Student(
            listOf(
                Course(name = "Ph", isPaid = true),
                Course(name = "History", isPaid = true)
            )
        ),

        )

    repository.map {
        val list = it.subscribedCourses.mapNotNull { courses ->
            courses.takeIf { isPaid -> isPaid.isPaid }
        }.groupBy { coursee -> coursee.name }.also { println("herre: ${it.keys.groupBy { gro -> gro }.count()}") }
    }
}