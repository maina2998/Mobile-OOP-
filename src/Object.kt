fun main() {
    var stew=Human("Grace",21,56.1.toFloat())
    stew.eat(6)
    println(stew.weight)

    stew.speak("am a student at AkiraChix")

    stew.birthday()



    var user = User("Grace", "Maina", "mainagracewacheke@gmail.com", "am not alone", "0789650090")
    println(user.email)
    println(user.password)





}
class Human(var name:String,var age:Int,var weight:Float){
fun eat(foodWeight:Int):Float {
    println("I am eating $foodWeight kgs of food")
    weight=weight+foodWeight
    return weight


}
    fun speak(speech:String){
        println("$speech")
    }
    fun birthday(){
        age++
        println(age)
    }
}

data class User(var firstName:String,var lastName:String,var email:String,var password: String,var phoneNumber: String)