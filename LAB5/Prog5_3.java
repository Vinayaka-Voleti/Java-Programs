class apple{
    void show(){
        System.out.println("I am an apple");
    }
}
class banana extends apple{
    @Override
    void show(){
        System.out.println("I am a banana");
    }
}
class cherry extends apple{
    @Override
    void show(){
        System.out.println("I am a cherry");
    }
}


public class Prog5_3 {
    public static void main(String[] args) {
        apple a = new apple();
        a.show();
        apple b = new banana();
        b.show();
        cherry c = new cherry();
        c.show();
    }
}