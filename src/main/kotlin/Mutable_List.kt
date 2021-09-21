fun main ()  // y hamari MUTABLE list h is m hm add, remove or change b kr skte hein
{
    //yahan m aik list banaunga number ki usko assign kiya listoff
    var nums = mutableListOf(1,2,3)  //iski type integer h q k m n integer ass kya h
    println(nums.indexOf(3))  //jaise he hm n NUMS lkha to us n bht saray methods hein  , yahan pr m n 3 pass kiya jis s wo uska index btayega index(0,1,2)
    println(nums.contains(4)) //contains method hamein y btayega k y wala index exist krta h ya nh, m n 4 pass kiya q k 4 mere element m mojood nh h
    nums[1] = 2  //jb m n elements ko change kiya tb b error d rha h iska mtlb is m koi getter setter nh h
    //value change krne p error a rha tha immutable mein to m n error ko dekha or usko mutable m kr diya jis s mera function mutablelistof hogya

    nums.add(5)  //is s 5 add hojayega list m
    nums.remove(1) //is s 1 remove hojayega list s


    //hamare pas aik important method b h
    //is method m y hoga k hm pori collection add kr skte hein NUMS wale list m
    val list = listOf(11,12)
    nums.addAll(list)    //is s y huwa k hamari pori list add hogaye [2,3,5,11,12]
    println(nums)
}