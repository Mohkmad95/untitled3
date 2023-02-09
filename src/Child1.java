public class Child1 extends Parent{
    private int age;
    private String name;
  public Child1(String name, int age){
      this.age = age;
      this.name = name;
  }
    @Override
    public void print() {
        System.out.println("\uD83E\uDDB9\uD83C\uDFFF\u200D♂️Первый сын капитана третьего звона звезды:" + age);
    }
}
