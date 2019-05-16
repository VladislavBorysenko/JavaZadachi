package JavaZadachi.oop;

public class Lighter {
    public String color;
    public static int gas;
    public static int chirk;

    public Lighter(String color, int gas, int chirk) {

       this.color = color;
        this.gas = gas;
        this.chirk = chirk;
        System.out.println("Lighter "+" gas "+gas+" color "+color);
    }
    public Lighter( int gas, int chirk) {

        this.color = " green ";
        this.gas = gas;
        this.chirk = chirk;
        System.out.println("Lighter "+" gas"+gas+" color "+color);
    }



    public static int click(){
int click = 0;
if (Lighter.gas<=0){

}
click=Lighter.gas-1;


return click;
    }

    @Override
    public String toString() {
        return "Lighter{" +
                "color='" + color + '\'' +
                ", gas=" + gas +
                ", chirk=" + chirk +
                '}';
    }
}