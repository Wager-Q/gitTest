public class Main {

    private Integer id;
    private String name;
    private String sex;

    Main(){}

    Main(Integer id,String name,String sex){
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return id + ":" + name + ":" + sex;
    }

    public static void main(String[] args) {
        Main ex = new Main(1,"岳","女");
        System.out.println(ex);
    }
}
