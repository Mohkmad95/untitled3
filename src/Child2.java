public class Child2  extends Parent {
    private String address;
    public String name;
    public Child2(String name, String address){
        this.name = name;
        this.address = address;
    }
    @Override
    public void print() {
        System.out.println("\uD83E\uDDB9\uD83C\uDFFF\u200D♂️Второй сын:" + address +
                "\nПланета ниберу, ул.Юговосточный восход звезды рождение ux:");

    }
}
