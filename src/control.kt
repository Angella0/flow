fun main() {
println(isEven(3))
    print(sent("Banana"))
}

fun isEven(number:Int):Boolean{
  if(number%2 ==0){
      return true
  }
    else{
        return false
  }

}

data class Product(var name:String, var weight:Double, var price:Int, var category: String ){

}
fun sent(str:String):String{
    var a = " "
    for(items in str){
        if(str.indexOf(items)%2==0){
     print(items)
        }
    }

return "${a}"
}


