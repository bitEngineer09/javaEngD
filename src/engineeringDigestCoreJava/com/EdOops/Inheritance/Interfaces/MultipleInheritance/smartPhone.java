package engineeringDigestCoreJava.com.EdOops.Inheritance.Interfaces.MultipleInheritance;

public class smartPhone implements camera, musicPlayer{
    @Override
    public void takePhoto(){
        System.out.println("Taking pics");
    }

    @Override
    public void recordVideo(){
        System.out.println("Record videos");
    }

    @Override
    public void playMusic(){
        System.out.println("playing music.");
    }

    @Override
    public void stopMusic(){
        System.out.println("Stop music");
    }
}
