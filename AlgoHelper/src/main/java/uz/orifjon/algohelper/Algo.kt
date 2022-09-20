package uz.orifjon.algohelper

object Algo {

    fun checkChar(text:String, char: Char):Boolean{
        for (c in text) {
            if(c == char) return true
        }
        return false
    }
}