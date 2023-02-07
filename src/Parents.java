import java.util.ArrayList;

public class Parents {

    private ArrayList<Human> parents = new ArrayList<>();


    public Parents(Human h1, Human h2){
        parents.add(h1);
        parents.add(h2);
    }


    public Parents(Human h) {
        parents.add(h);
    }


    public ArrayList<Human> getParents() {
        return parents;
    }


    public int getSizeFamily() {
        return parents.size();
    }


    public void addParent(Human parent) {
        if (parents.size()<2) {
            parents.add(parent);
        } else {
            System.out.println("Ошибка: Родителей не может быть больше двух");
        }
    }


    public void changeParent(Human whom, Human onWhom) {
        if (parents.indexOf(whom)!=-1 || parents.indexOf(onWhom)==-1) {
            parents.remove(parents.indexOf(whom));
            parents.add(onWhom);
        } else {
            if (parents.indexOf(whom)==-1) {
                System.out.println("Ошибка: Человека которого нужно заменить, нету в родителях");
            }
            if (parents.indexOf(onWhom)!=-1) {
                System.out.println("Ошибка: Человек которого нужно сделать родителем, уже им является");
            }
        }
    }

    public void removeParent(Human parent) {
        if (parents.indexOf(parent)!=-1) {
            parents.remove(parents.indexOf(parent));
        } else {
            System.out.println("Ошибка: Человек не является родителем");
        }
    }

}