
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
    fun rotate(numsi: IntArray, k: Int): Unit {
        println(Arrays.toString(numsi) )   //numsi.joinToString "coming $numsi")
        var kBuf= k;
        for(i in numsi.size-1 downTo 0){
            if(kBuf>0){
                var buf =numsi[numsi.size-1];
                for (y in numsi.size-1 downTo 0){
                    println("i= $i , y = $y ")
                    if(y == 0)
                        numsi[y] = buf
                    else
                        numsi[y] = numsi[y-1]
                }
                kBuf--;
            }
            else
                break
        }
        println(numsi.contentToString())
    }

    //повторяются ли элементы в массиве
    fun containsDuplicate(nums: IntArray): Boolean {
        for((index, element) in nums.withIndex()){
            for (i in index+1 until nums.size){
                if(nums[i] == element)
                    return true
            }
        }
        return false
    }