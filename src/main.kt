import java.util.Objects

fun main() {
//Qn1
    getStrings(listOf("sarahmark", "toyocars", "treeplant", "chair", "sorting", "four","fruit", "errors", "people","words"))


    // Qn2
    println(getAvheight(listOf(12,25,66,30,8,24,50)))


    //Qn3
val james = Person("james", 19, 8,45.0)
    val sarah = Person("sarah", 23,12,55.5)
    val people = listOf(james, sarah)

    val sortedPeople =people.sortedByDescending { person -> person.age }
    println(sortedPeople)


    //Qn4

var x = Person("Henry", 33,25,66.7)
    var y = Person("yerins",19,27,55.2)
    var people1 = listOf(x,y)
    println(people1)

    //  Qn5
    val toyota = Car("AB69XYZ",12000)
    val bmw = Car("CU57ABC",24000)
    val items = listOf(toyota,bmw)
   println(getAvOfMile(items))

}

//Question1
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun getStrings (str:List<String>):List<String>{
str.forEachIndexed { index, s ->
    if(index%2==0){
        println(s)
    }
}
return str
}


//Question2
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun getAvheight(height:List<Int>): String {
    var sum = height.average()
    var total = height.sum()
    var output = "$sum $total "
    return output
}


//Question3
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String, var age:Int, var height:Int, var weight:Double )


//Question4
// Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

fun createTwo(objects:List<String>):List<String> {
    return listOf()
}


//Question5
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car(var reg:String, var mileage:Int )

fun getAvOfMile(car:List<Car>):Int {
   var num = 0
    car.forEach { vehi -> vehi.mileage
        num +=vehi.mileage
    }
    return num / car.count()

}