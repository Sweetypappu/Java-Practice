public class Machine implements Info{
    public String name = "Machine Type 1";
    public void start(){

        System.out.println("Machine Started!!");

    }

    public void stop(){


        System.out.println("Stopped");
    }

    @Override
    public void showInfo() {
        System.out.println("I am a machine");
    }
}
