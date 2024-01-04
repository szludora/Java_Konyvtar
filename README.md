# Könyvtár Program

 "Nyitunk" egy könyvtárat, amely kizárólag Regény és Képregény típusú könyveket tud tárolni. Mindkét objektum a Könyv osztály utódja.
 A Könyvtől megörökli a következő tulajdonságokat is funkciókat:

  + szerző, cím, állapot, kölcsönző, oldalszám,
  + getterek, setterek
  + toString metódus.
  
  A Regény annyiban tér el a Könyv ősétől, hogy rendelkezik ún. regénytípus tulajdonsággal, amit egy enum típussal lehet beállítani.
 A Képregénynél ezzel szemben beállítható, hogy mennyi képet tartalmaz összesen.
 A Könyvtár listában tárolja a könyveket, valamint számontartja, mikor üzemel (nyit/zár) és aszerint lehet kölcsönözni, visszaadni könyvet.
 Emellett külön tudja kezelni a beszerzést, valamint megkérhetjük őt, hogy égjen le. Mármint az épület. :)
A fő belépési pontunk a KönyvtárProgramban van, ahonnan egyszerű utasításokkal menedzselhetjük vállalkozásunkat.
