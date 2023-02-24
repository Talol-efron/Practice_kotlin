class Student(name: String) {
    var name = name
    fun calAvg(scoreList: IntArray): Int {
        var sum = 0
        for(score in scoreList){
            sum += score
        }
        var avg = sum / scoreList.count()
        return avg
    }

    fun judge(avg: Int): String {
        var result: String
        if (avg >= 60){
            result = "passed"
        }else{
            result = "failed"
        }
        return result
    }
}

fun main() {
    var a001 = Student("Taro")
    var scoreList = intArrayOf(90, 81, 77, 92, 88)
    var avg = a001.calAvg(scoreList)
    var result = a001.judge(avg)
    println(a001.name + "さんの平均点は" + avg + "で、結果は" + result)
    //println(avg)
    //println(result)
}