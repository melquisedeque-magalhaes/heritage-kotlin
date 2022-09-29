fun main() {
    val student = Student("Melqui", "12345")

    print("Digite o nome completo do aluno: ")
    val name: String = readLine()!!

    student.setName(name)

    println("Novo nome do aluno " + student.getName())

    print("Digite a nova matricula do aluno: ")
    val registration:String = readLine()!!

    student.setRegistration(registration)

    println("Nova matricula do aluno " + student.getRegistration())
}