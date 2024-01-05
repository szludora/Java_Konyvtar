## Könyvtár Program
>[!TIP]
>"Nyitunk" egy **Könyvtárat**, amely kizárólag **Regény** és **Képregény** típusú **Könyveket** tud tárolni. Mindkét objektum a Könyv osztály utódja.
> + A regény és a képregény közös őssel rendelkezik
> + A regény saját enum típussal, a képregény privát adattaggal rendelkezik.
> + Mindkét objektum saját toString() metódusai felülírják a közös ős metódusát.
>
> + A **KÖNYVTÁR**:
>     +  számon tartja a könyveit
>     +  annak darabszámát
>     +  hogy jelenleg üzemel-e (nyitva/zárva)
>     +  kezeli a beszerzést
>     +  kiad és visszavesz könyveket
>     +  le tud égni....
>        
> + A **KÖNYVTÁRPROGRAM**:
>     + Létrehozza a könyvtárunkat és irányítja azt
>     + leírást ad az összes tárolt könyvről és azok adatairól
>
> + A **KÖNYV**:
>     + tárolja saját adatait (szerző, cím, állapot, oldalszám, kölcsönző)
>     + getterekkel, setterekkel és toString metódussal rendelkezik
>     
> + A **REGÉNY**:
>     + saját típussal rendelkezik
>     + getter, setter, toString()
>
> + A **KÉPREGÉNY**:
>     + saját adattag (képek darabszáma)
>     + getter, setter, toString()

 #### Megvalósítás:

 | KönyvtárProgram            |        Könyvtár          |      Könyv          |           Regény           |    Képregény   |
 |--|--|--|--|--|
 | -Konyvtar Konyvtar :final  | -Konyv[] könyvek         | -szerző :String     | -RegényTipusok típus :enum | -kepDb :int    |
 | +konyvtarKonyveiKiir()     | -könyvDb :int            | -cím :String        | +getTipus()     	         | +getKepDb()    |
 |                            | -üzemel :boolean         | -állapot :enum      | +setTipus()                | +setKepDb()    |
 |                            | +beszerez(Könyv Könyv)   | -oldalszám :int     | +toString()                | +toString()    |
 |                            | +kiad(kölcsönző)         | -kölcsönző :String  |||
 |                            | +visszavesz(Könyv Könyv) | +getterek...()      |||
 |                            | +getKonyvekLeirasa()     | +setterek...()      |||
 |                            | +getKonyvek()            | +toString()         |||
 |                            | +leeg()                  | +leiras()           |||

>[!CAUTION]
> A fő belépésipontunk a KönyvtárProgramban van!



#### RegenyTipusok enum:
```
csalad, tortenelmi, fejlodes, tarsadalmi, tezis, allam, kaland, haborus,
pikareszk, ifjusagi, krimi, szerelmes, tudomanyos, essze, blog, thriller,
lelektani, scifi, fantasy, besorolatlan,
```

#### Allapotok enum:
```
kivalo, ujszeru, jo, serult, bevizsgalatlan
```
