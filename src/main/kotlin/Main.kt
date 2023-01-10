fun main(){
    val myList = listOf<Int>(1,2,3,4,5)

    myList.map {it -> it.toString() }.forEach{it -> println("List number transformed to String: $it")}



}