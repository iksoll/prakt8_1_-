class product {
    var name = "название"
    var price = 0.0
    var measurement = "Ед. измерения"
    var view = "Вид товара"
    var quantity = 0

    fun info () {
        print("Введите название товара - ")
        name = readLine()!!.toString()
        print("Введите цену товара - ")
        price = readLine()!!.toDouble()
        print("Введите ед. измерения - ")
        measurement = readLine()!!.toString()
        print("Введите вид товара - ")
        view = readLine()!!.toString()
        print("Введите количество товара - ")
        quantity = readLine()!!.toInt()
    }

    fun precent(){
        print("Товар $name по цене $price. Вид товара $view, на складе осталось $quantity $measurement")
    }
}