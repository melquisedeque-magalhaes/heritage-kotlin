open class Person (name: String) {
    private var name = ""

    fun getName(): String {
        return this.name
    }

    fun setName(name: String) {
        this.name = name
    }

    init {
        setName(name)
    }

}