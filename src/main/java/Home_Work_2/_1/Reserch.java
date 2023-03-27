package Home_Work_1._1;

import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> all_up_down(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
                all_up_down(t.p2, re);
            }
        }
        return result;
    }

    public ArrayList<String> all_descendants(Person p) {
        return all_up_down(p, Relationship.parent);
    }

    public ArrayList<String> all_ancestors(Person p) {
        return all_up_down(p, Relationship.children);
    }


}