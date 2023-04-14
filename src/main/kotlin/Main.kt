
fun main(){
    school("kenyatta", "Mombasa", "Machakos", "Kitui")
    cities()
    digits()

    println(places("nakuru","nairobi","kisii"))
}
//Create a function that takes in 4 strings and creates an array out of them then
//prints out the array
fun school(sch1:String,sch2:String,sch3:String,sch4:String) {
    var schl = arrayOf(sch1, sch2, sch3, sch4)
    println(schl.contentToString())
    digits()
}
//Create a function that given an array below:

//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.

fun cities(){
    var cities= arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { city-> println(city.capitalize()) }
}
//Create one function that given the below array:

//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order

fun digits(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = (numbers[1]+numbers[4])
    println(sum)
    println(numbers.indexOf(158))
    var sortedNum=numbers.sortedArray()
    println(sortedNum.contentToString())

}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun places(place1:String,place2:String,place3:String):String {
    var places = arrayOf(place1, place2, place3)
    return places.contentToString()

}