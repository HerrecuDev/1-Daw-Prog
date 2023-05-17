package clases;

public class Pokemon 
{
    //Atributo :
    private int id;
    private int num;
    private String name;
    private String type;
    private double height;
    private double weight;
    private String weaknesses;
    private Next_Evolution [] next_Evolutions;


    //Contructor:
    public Pokemon()
    {
        
    }


    //Metodos:

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String getWeaknesses() {
        return weaknesses;
    }


    public void setWeaknesses(String weaknesses) {
        this.weaknesses = weaknesses;
    }


    public Next_Evolution[] getNext_Evolutions() {
        return next_Evolutions;
    }


    public void setNext_Evolutions(Next_Evolution[] next_Evolutions) {
        this.next_Evolutions = next_Evolutions;
    }


    

    
    
}
