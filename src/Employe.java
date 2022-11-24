public class Employe {
    private String name;
    private double salary;

    //constructer-1
    public Employe(){}
    public Employe(String name, double salary){
        this.name=name;
        this.salary=salary;
        System.out.println("constructor working ");
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return  salary;
    }




}
