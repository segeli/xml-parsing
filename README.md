# xml-parsing

  Güncel teknoloji kullanımlarına baktığımızda, bir veri değişimi biçimi olan JSON ın XML e göre daha çok rağbet gördüğünü 
biliyorsunuzdur. Bunun nedenleri arasında; Javascript ile çok da iyi kullanılası, İnsanların, JSON ı XML e göre hızlı bir şekilde oluşturulması.
  
  Güncel teknolojiler yazılımın geliştirilme sürecinde yazılımcılara sağladığı kolaylıklarla ve hazırladığı ortamla mutlu 
etse de, piyasa gerçekleri yazılımcıları bir yandan güncel olmaları bir yandan eski bilgilerini güncel tutmalarını 
gereksinim haline getiriyor.

  Yukarıda oluşturmuş olduğum XMLParsing maven projesinde, piyasa içerisinde XML verilerle çalışırken belli faktörler göz
önünde tutularak yapılan seçimlerle ilgili örnek çalışmalar yer almaktadır. 

### Parsing Tech

Standart ve standart olmaya çeşitler aşağıdaki gibidir:

* [DOM] - DOM parser işaret edilmiş XML Dokumanı işlerken bütün veriyi hafızaya yükler; sonrasında ağaç yapısı olarak modelleyerek, okunmasını ve değiştirilmesini sağlar. Standartdır.
* [SAX] - SAX, DOM un veriyi hafızada işlemesine karşın, yukarıdan aşağıya sıralı olarak okur. Standart değildir.
