fun main() {
    println(isEven(20))
    println(isEven(19))
    println(isEven(13))
//ascending//lastIndex//
    var num= listOf(10,50,90,40)
    var ascendingNum=num.sorted()
    println(ascendingNum)
    println(num.lastIndex)
    println(num.reversed())
    student()
    digit()
    var kiosk= mutableListOf(

    Product("sharon",12.8,59.3,"hygiene")
    )
    //listOf(categorizedproduct(kiosk))
    main()
    digit()
}
// even and odd
fun isEven(num:Int):Boolean{
    if (num%2==1){
        return true
    }
    return false
}
fun student() {
    var citizen = listOf("sharon", "sheila", "faith", "barnaba", "jack", "constant")
    for (p in citizen) {
        if (p == "faith") {
            continue
        }
        println(p)

    }
}
fun digit() {
    var number = 1
    while (number < 2000) {
        var digit=number*number
        if (number > 2000) {
            break
        }
        println(digit)
        number++
    }
}
data class Product(var name:String,var weight:Double,var price:Double,var category: String)
fun  categorizedproduct(product: Product){
    var groceriesList= mutableListOf<Product>()
    var hygieneList= mutableListOf<Product>()
    var otherList= mutableListOf<Product>()
    when(product.category){
        "groceries"->groceriesList.add(product)
        "hygiene" ->hygieneList.add(product)
        else->otherList.add(product)
    }
    println(groceriesList)
    println(hygieneList)
    println(otherList)
}
fun black(args:Array<String>){
    var p =19
    var result=-1
    if(p%2==0){
        result=p+1

    }
    else{
        result=p
    }
    println("The resuilt of making a ood &resuilt")

}
fun digit (args: Array<String>){
    val item= listOf(29,40,50,100,12,46)
    var m=item.size
    do {
        m--
        println(item[m])
    }
        while (m>0)

}





