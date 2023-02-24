fun checkAge(age: Int) {
    if(age >= 10 && age < 20){
        println("10代")
    }else if(age >= 20 && age < 30){
        println("20代")
    }else if(age >= 30 && age < 40){
        println("30代")
    }else{
        println("それ以外")
    }
}

fun main() {
    val ageList = arrayListOf(10, 21, 35, 2)
    for (num in ageList){
        checkAge(num)
    }
}