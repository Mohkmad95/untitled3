public class Main {
public static void main(String[] args){
    Printabel[] printabels ={createObject("Child1"), createObject("Child2"),
            createObject("Child3"), createObject("Parent")};
    for (Printabel printabel: printabels){
        printabel.print();
    }
    }

    public static Printabel createObject(String className) {
    switch (className) {
        case "Child1":
             Child1 child1 = new Child1("Первый сын капитана третьего звона звезды:",23);
             return child1;
        case "Child2":
            Child2 child2 = new Child2("Второй сын капитана третьего звона звезды:",
                    " Планета ниберу, ул.Юговосточный восход " +
                    "звезды рождение ux:");
            return child2;
        case "Child3":
            Child3 child3 = new Child3("Третий сын капитана третьего звона звезды: ",
                     321 ," Охрана млечного пути и начальник войска черной дыры " +
                    "охрана солнечной системы где идет скопление всех планет радиуса четвертого поколение:"); // Фантазии больше нет
            return child3;
     }
        return null;
    }

    }
