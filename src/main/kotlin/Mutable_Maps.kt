//MAP COLLECTION
// key value pair ko hm maps kehte hein, maps simple collection h jo hamaray key value pair ko maintain krt hein
//example: STUDENT [1 (key) , Ryan (pair)]
// maps m b IMMUTABLE or MUTABLE hota h
//

fun main ()
{
    val students = mutableMapOf<Int ,String>()
    students.put(1, "Farooq")   //map m add krne k lye get ka method
    students.put(2, "Shahid")
    students.put(3,"Zubair")

    //key hamari unique honi chaye
    println(students.get(1))  // map m get krne k lye get ka method
    println(students.get(4))  // y m n aese key value pass ki jo exist nh krt h OUTPUT = NULL
    println("----------------------")
    //hm apne MAP p looop b laga skte hein
    for ((key,value ) in students)  //yahan pr type inference h
    {
        println("$key = $value")
    }

    println("------Simple or easy way to Add or get ----------------")

    students[4] = "Shakil"  //y b aik tareka h k hm maps m elements ko add kr skte hein
    println(students[4])   // y b aik tarika h k hm maps m elements ko get kese kr skte hein


}