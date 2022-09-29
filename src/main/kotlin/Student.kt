class Student(name: String, registration: String): Person(name) {
    private var registration = ""

    fun getRegistration(): String {
        return this.registration
    }

    fun setRegistration(registration: String) {
        this.registration = registration
    }

    private fun showInfoStudents() {
        println("Nome do aluno: " + super.getName())
        println("Matricula do aluno: " + getRegistration())
    }

    init {
        setRegistration(registration)
        showInfoStudents()
    }
}