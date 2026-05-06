// this the super class to  part 1 of the final project

public class game {
    //Field
    private String name;

    //Constructor
    public game(String name){
        this.name = name;

    }

    // Getter
    public String getName(){
        return name;
    }
    
    //Methods
    public void start(){
        System.out.println("Starting:" + name);
    }

    public void play(){
        System.out.println("Playing:" + name);

    }

    public void end(){
        System.out.println("thanks for playing " + name);
    }

}