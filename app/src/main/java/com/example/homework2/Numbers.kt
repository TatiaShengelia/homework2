package com.example.homework2

enum class Numbers(val value:String) {
    E1("ერთი"),
    E2("ორი"),
    E3("სამი"),
    E4("ოთხი"),
    E5("ხუთი"),
    E6("ექვსი"),
    E7("შვიდი"),
    E8("რვა"),
    E9("ცხრა"),
    E10("ათი"),
    E11("თერთმეტი"),
    E12("თორმეტი"),
    E13("ცამეტი"),
    E14("თოთხმეტი"),
    E15("თხუთმეტი"),
    E16("თექვსმეტი"),
    E17("ჩვიდმეტი"),
    E18("თვრამეტი"),
    E19("ცხრამეტი"),
    E20("ოცი"),
    E40("ორმოცი"),
    E60("სამოცი"),
    E80("ოთხმოცი"),
    E100("ასი"),
    E1000("ათასი");


    companion object {
        fun getValueForNumber(n: Int): String? {
            return when (n) {
                1 -> E1.value
                2 -> E2.value
                3 -> E3.value
                4 -> E4.value
                5 -> E5.value
                6 -> E6.value
                7 -> E7.value
                8 -> E8.value
                9 -> E9.value
                10 -> E10.value
                11 -> E11.value
                12 -> E12.value
                13 -> E13.value
                14 -> E14.value
                15 -> E15.value
                16 -> E16.value
                17 -> E17.value
                18 -> E18.value
                19 -> E19.value
                20 -> E20.value
                40 -> E40.value
                60 -> E60.value
                80 -> E80.value
                100 -> E100.value
                1000 -> E1000.value
                else -> null
            }
        }
    }
}