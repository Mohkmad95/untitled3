public class Child3 extends Parent{
    private int salary;
    private String name;
    private String work;
    public Child3(String name, int salary, String work){
        this.name = name;
        this.salary = salary;
        this.work = work;

    }

    @Override
    public void print() {
        System.out.println("\uD83E\uDDB9\uD83C\uDFFF\u200D♂️Третий сын капитана третьего звона звезды" + salary +
                "\nОхрана млечного пути и начальник войска черной дыры \" +\n" +
                "                    \"охрана солнечной системы где идет скопление всех планет радиуса четвертого поколение");
    }
}
