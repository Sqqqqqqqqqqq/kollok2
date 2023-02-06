import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class Execute {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; ++i) {
            list.add(i);
        }
        NewIterator iterator = new NewIterator(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class NewClass {
    private ArrayList<Integer> list  = new ArrayList<>();
}
class NewIterator {
    int index = 0;
    ArrayList<Integer> list;
    public NewIterator(ArrayList<Integer> list) {
        this.list = list;
    }
    public boolean hasNext() {
        return index < list.size();
    }

    public Integer next() {
        return list.get(index++);
    }

}