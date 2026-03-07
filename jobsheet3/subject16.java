package jobsheet3;
public class subject16 {
    public String code;
    public String name;
    public int SKS;
    public int sumOftime;

    // Constructor with parameters
    public subject16 (String code, String name, int SKS, int sumOftime){
        this.code = code;
        this.name = name;
        this.SKS = SKS;
        this.sumOftime = sumOftime;
    }

    // Default constructor
    public subject16(){
    }
    
    // method addData
    public void addData(String code, String name, int SKS, int sumOftime){
        this.code = code;
        this.name = name;
        this.SKS = SKS;
        this.sumOftime = sumOftime;
    }

    // method printInfo
    public void printInfo(){
        System.out.println("SUBJECT CODE        : " + this.code);
        System.out.println("SUBJECT NAME        : " + this.name);
        System.out.println("SUBJECT SKS         : " + this.SKS);
        System.out.println("SUBJECT SUM OF TIME : " + this.sumOftime);
        System.out.println("----------------------------------");
    }
}
