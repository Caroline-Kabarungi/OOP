fun main(){
    var d=Human("carol",56,78)
    println(d.eat(5))
    var Speech=("I love coding")
    println(Speech)
    d.birthday()
    //
    var suzan=User("jane","bridget","carol@gmail.com","0771420924","ccr12")
println(suzan.email)
    println(suzan.phonenumber)

}
//create a class called human with these attributes:name,age,weight.it has the following functions;

    class Human(var name:String,var age:Int,var weight:Int) {
        fun eat(foodweight: Int): Int {
            println("I am eating $foodweight kgs of food")
            weight += foodweight
            return weight

        }

        //speak(speech:String):prints the string past to it.
        fun speak(Speech: String): String {
            println(Speech)
            return Speech

        }

        //birthday(): increments human's age by one.
        fun birthday() {
            age +=1
            println(age)
        }
    }

//que:2
data class User(var firstname:String,var secondname:String,var email:String,var phonenumber:String,var password:String)

