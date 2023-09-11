class kotlinClasses

class Contact(val id: Int, var email: String)

fun main(){
    val kotlinClasses = kotlinClasses() //a kotlinClasses foi instanciada mas ainda não foi usada
    val contact = Contact(1, "natalia.medeiroscosta@gmail.com")

    println(contact.id)
    println(contact.email)
}