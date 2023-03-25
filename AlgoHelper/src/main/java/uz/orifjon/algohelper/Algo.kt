package uz.orifjon.algohelper

import java.lang.StringBuilder

object Algo {

    fun checkChar(text:String, char: Char):Boolean{
        for (c in text) {
            if(c == char) return true
        }
        return false
    }

    fun binarySearch(searchNumber:Int,list:ArrayList<Int>):Int{
        var low = 0
        var high = list.size-1
        var mid:Int
        while(low <= high) {
            mid = low + ((high - low) / 2)
            when {
                searchNumber >list[mid]   -> low = mid+1
                searchNumber == list[mid] -> return mid
                searchNumber < list[mid]  -> high = mid-1
            }
        }
        return -1
    }

    fun convertCase(text: String):String{
        val str = StringBuilder()
        for (c in text) {
            if(c.isLowerCase()) {
                str.append(c.uppercase())
            }else{
                str.append(c.lowercase())
            }
        }
        return str.toString()
    }

    fun checkDivided(a:Int,b:Int):Boolean = a % b == 0
    infix fun Int.add(a:Int):Int = this + a
    
}