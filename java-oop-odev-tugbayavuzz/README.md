## Java Ödevi


1. İki sayı için; toplama, çıkartma, çarpma ve bölme işlemlerini içeren bir Calculator interface'i oluşturunuz. Bir de Calculator interface'ini miras alacak olan, Scientific adında bir interface oluşturunuz, oluşturduğunuz bu alt interface'e bir sayının karesini ve bir sayının küpünü hesaplayan metot tanımlarını ekleyiniz. BasicCalculator isminde bir sınıf oluşturunuz ve bu sınıfa Calculator interface'ini uygulayınız. AdvancedCalculator isminde bir sınıf daha oluşturunuz, oluşturduğunuz bu sınıf BasicCalculator'ı miras alsın. Aynı zamanda AdvancedCalculator sınıfımızın bir bilimsel hesap makinesi olmasını istediğimiz için bilimsel hesaplama özelliklerini sağlayacak olan interface'i sınıfa uygulayınız. Son olarak oluşturduğunuz bu yapıyı kullanarak ana programda gelişmiş hesap makinemiz için bir nesne oluşturup;
    - İki sayı ile çarpma ve bölme işlemi için örnek yapınız.
    - Bir sayının karesi ve bir sayının küpü için örnek yapınız.


2. Television adında bir sınıf oluşturun ve width, height, screenSize, maxVolume, volume, power özelliklerine sahip olsun.
Televizyon nesnesi en, boy ve ekran boyutu özelliklerini parametre alacak şekilde oluşturulabilsin. Television sınıfında açma/kapama, ses arttırma ve
ses azaltma işlevlerini gerçekleştiren metotlar olsun.
    - Açma/kapama özelliği için power özelliğini true/false olarak değiştiren bir metot tanımlayabilirsiniz.
    - Ses azaltma özelliği için volume değerini 0'dan küçük olmamak koşuluyla azaltacak bir metot oluşturabilirsiniz.
    - Ses arttırma özelliği için volume değerini maksimum ses düzeyini geçmeyecek şekilde arttıran bir metot oluşturabilirsiniz.
Kurduğunuz bu yapı ile bir televizyon nesnesi oluşturup sesini arttırma, azaltma ve açma/kapama özelliklerini kullanarak örnek yapınız.
* Not: Nesnenizi Kapsülleme kurallarına uyacak şekilde oluşturunuz. 
Oluşturduğunuz televizyon nesnesinin ekran boyutuna television.screenSize diyerek direkt ulaşmaya çalıştığınızda hata almalısınız.


3. Pair adında bir sınıf oluşturunuz ve bu sınıf, parametre olarak iki tane jenerik tür alsın. Amacımız iki değere sahip bir obje tanımlarken değerlerin sahip olabileceği türleri dinamik hale getirmek, böylelikle farklı türlerde değer çiftleri tanımlayabiliyor olacağız. Sınıf içerisinde, değer çiftindeki ilk değer için T1 tipinde first özelliği, ikinci değer için ise T2 tipinde second özelliği tanımlayınız. Ve bu iki özellik için getter oluşturunuz. Ana programda ise oluşturduğunuz bu jenerik sınıftan iki adet örnek nesne üretiniz ve örnek nesnenizdeki değerlerin türleri birbirinden farklı olsun. (Örneğin; ilk değer Integer, ikincisi String türünde v.b.) Son olarak ana programda ürettiğiniz iki örnek nesneye ait ilk ve ikinci değerleri ekrana yazdırınız.


## HackerRank Challenge'ları


1. https://www.hackerrank.com/challenges/java-inheritance-1/problem

2. https://www.hackerrank.com/challenges/java-method-overriding/problem
