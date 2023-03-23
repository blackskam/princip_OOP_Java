package Home_Work_1._2;

import java.sql.Array;
import java.util.ArrayList;

public class Cabinet {
    protected String name;
    protected int capacity;
    protected ArrayList<String> item_incloset;
    protected Сabinetcondition cabinetcondition;


    public Cabinet(String name) {
        this.name = name;
        this.capacity = 5; // вместимость
        item_incloset = new ArrayList<String>(); // предметы в шкафу
        cabinetcondition = Сabinetcondition.open;
    }

    public ArrayList<String> getitem_incloset() {
        if (Сabinetcondition.open == cabinetcondition) {
            return item_incloset;
        }
        else
        {
            return new ArrayList<String>();
        }
    }


    public void setitem_incloset(String item_incloset) {
        this.item_incloset.add(item_incloset);
    }

    public void delitem_incloset(String item_incloset) {
        this.item_incloset.remove(item_incloset);
    }
    public Сabinetcondition getCabinetcondition() {
        return cabinetcondition;
    }

    public void setCabinetcondition(Сabinetcondition cabinetcondition) {
        this.cabinetcondition = cabinetcondition;
    }

    @Override
    public String toString() {
        return String.format("%s, %s \n", this.name, getitem_incloset() );
    }
}
