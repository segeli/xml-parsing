### XMLParsing

```
  Güncel teknoloji kullanımlarına baktığımızda, bir veri değişimi biçimi olan JSON ın XML e 
göre daha çok rağbet gördüğünü biliyorsunuzdur. Bunun nedenleri arasında; Javascript ile çok
iyi kullanılması, insanların JSON ı XML e göre hızlı bir şekilde oluşturulması.
  
  Güncel teknolojiler yazılımın geliştirilme sürecinde yazılımcılara sağladığı kolaylıklarla
ve hazırladığı ortamla mutlu etse de, piyasa gerçekleri yazılımcıları bir yandan güncel 
olmaları bir yandan eski bilgilerini güncel tutmalarını gereksinim haline getiriyor.

  Yukarıda oluşturmuş olduğum XMLParsing maven projesinde, piyasa içerisinde XML verilerle
çalışırken, belli faktörler gözönünde tutularak yapılan tekonoloji seçimine göre yapılan 
örnek çalışmalar yer almaktadır. 
```

#### Parsing Tech

```
  Java JDK içerisinde gömülü olarak 2 xml parser bulunmaktadır. Aşağıda açıkladığım gibi, 
birbirine karşı artı ve eksileri bulunmaktadır.

* [DOM] - DOM parser işaret edilmiş XML Dokumanı işlerken bütün veriyi hafızaya yükler; 
sonrasında ağaç yapısı olarak modelleyerek, okunmasını ve değiştirilmesini sağlar. 
Standarttır.
* [SAX] - SAX, DOM un veriyi hafızada işlemesine karşın, yukarıdan aşağıya sıralı olarak
okur. Standart değildir.

  **DOM** ve **SAX** ile ilgili örnekler proje içerisinde bulunmaktadır.
  **JAXB** örneğide içeren proje, xmlden objeye ve objeden xmle çevirilme işlemini ayrı
paket ve sınıfla gösteriyor.
```
