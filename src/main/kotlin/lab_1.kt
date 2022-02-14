
    fun remoneDublicates(nums: IntArray): Int{

        var lastIndex : Int =0;
        for(i in 1 until   nums.size){
           if(nums[i] != nums[i-1]){
               lastIndex++
               nums[lastIndex] = nums[i]
           }//если элементравен предыдущему элементу

        }
        for((index, element) in nums.withIndex())
            println("index $index element $element ")
        return (lastIndex+1)
    }
//максимальная прибыль
/*fun maxProfit(prices: IntArray): Int {
    for ()
}*/

    //строка
    fun reverseString(s: CharArray): Unit {
        println(s)
        for(i in 0 until (s.size/2)){
            val a= s[i]
            s[i] = s[s.size-(i+1)];
            s[s.size-(i+1)] = a
        }
        println(s)
    }
    //сдвиг массива вправо
    fun rotate(nums: IntArray, k: Int): Unit {
        println("$nums")
        val arra : IntArray = intArrayOf(4)
        for()
    }