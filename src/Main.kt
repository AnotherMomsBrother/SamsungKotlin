fun main() {
    val student: Student? = Student()

    val unit = student?.let { st -> // let{лямбда-выражение}
        st.hi()
        st.bye()
        st.name = "Oleg"
    } // let ничего не возвращает, только изменяет объект
    println(student?.name)

    val student2 = student?.apply { // apply {что "применить" к классу} (apply - применить)
        hi()
        bye()
        name = "Stephan"
    } // apply уже возвращает изменённый объект
    println(student2?.name)

    val ageStudent = Student().run {
        hi()
        bye()
        name = "Marina"
        age = 10
        age
    } // значение age будет возвращено как выходное значение
    println(ageStudent)

    val ageStudent2 = with(Student()) {

    } // просто другая реализация run

    val moreStudents = Student().also { st -> // работает с объектом через ключевое слово
        st.hi()
        st.bye()
        st.name = "Viktoria"
    }
}