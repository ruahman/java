interface PersonInfoProvider {
    fun printInfo(person:Person)
}

interface SessionInfoProvider {
    fun getSession()
}

// by default classes are final
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    // you need to explicityl specify classes and properties are
    // open for extention
    public open val info:String = "BasicInfo"

    override fun printInfo(person: Person) {
        println("Info Provider: ${person.firstName}, ${person.lastName}, ${person.nickName}, $info")
    }

    override fun getSession() {
        println("...session")
    }
}

open class FancyInfoProvider: BasicInfoProvider(){
    override val info:String
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println(info)
    }
}

fun checkTypes(basicInfoP:BasicInfoProvider){
    if(basicInfoP is SessionInfoProvider){
        println("is a session provider")
        (basicInfoP as SessionInfoProvider).getSession()
    }
}