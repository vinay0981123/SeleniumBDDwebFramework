package Test;

public class Testing {
    public String name;
    public void printlove() {
        System.out.println("I love you so much babeeeeee my babu shreya :) ");
    }
    protected String reply(){
        return "love you too "+name;
    }
}
class Testlove extends Testing{

    public void lovestatus(){

    }

}
class Main{
    public static void main(String[] args) {
        Testlove obj = new Testlove();
        obj.lovestatus();
        obj.printlove();
    }
}


