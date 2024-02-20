class train {
    var number = 0.0
    var depature = "пункт отправления"
    var destination = "пункт назначения"
    var date = "0000.00.00"
    var timeDepature = 0.0
    var time = 0.0

    fun info(){
        print ("Номер поезда - ")
        number = readLine()!!.toDouble()
        print ("Поезд следует из - ")
        depature = readLine()!!.toString()
        print ("Поезд следует в - ")
        destination = readLine()!!.toString()
        println ("Дата отправления - ")
        date = readLine()!!.toString()
        print ("Время отправления - ")
        timeDepature = readLine()!!.toDouble()
        print ("Время в пути - ")
        time = readLine()!!.toDouble()
    }
    
    fun present(){
        println("Поезд $number следует из $depature до $destination $date в $timeDepature. Время в пути $time")
    }

}