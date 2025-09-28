fun main(){

    val task = mutableListOf<String>()

    while(true){
        println("\n==== Welcome ! To-Do App ====")
        println("1. Add task")
        println("2. View tasks")
        println("3. Delete task")
        println("4. Exit")

        when(readLine()){
            "1"-> {
                print("Enter task: ")
                val t = readLine()!!
                task.add(t)
            }
            "2"->{
                for((index,item) in task.withIndex()) {
                    println("${index+1}. $item")
                }
            }
            "3"->{
                println("\nYour tasks: ")
                for((index,item) in task.withIndex()){
                    println("${index+1}. $item ")
                }
                print("Enter task to delete: ")
                val num = readLine()?.toIntOrNull()?.toInt()
                if(num != null && num in 1..task.size) {
                    val remove = task.removeAt(num-1)
                }
            }
            "4"->{
                println("Exiting the App")
                break
            }
        }
    }
}