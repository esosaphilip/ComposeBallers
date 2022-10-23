package com.esosaphilip.composeaffirmations.data

import com.esosaphilip.composeaffirmations.R

class Datasource {
       fun loadBallers(): List<Ballers> {
           return listOf<Ballers>(Ballers(R.drawable.ben,"Karim Benzema",34, 1),
                                  Ballers(R.drawable.lewan,"Robert Lewandowski",34,1),
                                  Ballers(R.drawable.mane,"Sadio Mane",30,0),
                                  Ballers(R.drawable.mba,"Kylian Mbappe",23,0),
                                  Ballers(R.drawable.messi,"Lionel Messi",35,7),
                                  Ballers(R.drawable.mod,"Luka Modric",37,1),
                                  Ballers(R.drawable.ney,"Neymar jr",30,0),
                                  Ballers(R.drawable.ron,"Cristiano Ronaldo",37,5),
                                  Ballers(R.drawable.sal,"Mohamed Salah",30,0),
                                  Ballers(R.drawable.vini,"Vinicius jr",22,0))

       }
}