fun main(){


    var map1 = mapOf(1 to "Raj",2 to "Raman")
    println(map1)
    var map = mutableMapOf<Int,String>()
    map.put(1,"JACK")
    map.put(2,"OGGY")
    map.put(3,"JABLU")
    map.put(3,"JACKSON")
    println(map)
    for((key,value) in map){
        println("$key, $value")
    }

}