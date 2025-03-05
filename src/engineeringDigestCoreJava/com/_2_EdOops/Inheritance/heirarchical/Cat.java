package engineeringDigestCoreJava.com._2_EdOops.Inheritance.heirarchical;

public class Cat extends Animal {

    @Override // ye likhna achhi practice hai, agar ye annotation nahi daalte,
//    and suppose humne sound ki jagah soundss likh diya tab error bataega hee nahi
    public void sound() {
        System.out.println("meow!!");
    }
}
