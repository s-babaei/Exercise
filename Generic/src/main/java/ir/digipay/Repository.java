package ir.digipay;

import java.util.ArrayList;
import java.util.List;

public class Repository<E extends Test> {

    List<E> list = new ArrayList<>();

    public void save(E e) {
        list.add(e);
    }

    public E findById(Long id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return list.get(i);
            }
        }
        return null;
    }

    public void remove(E e) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == e.getId()) {
                list.remove(i);

            }
        }

    }

    List<E> getAll() {
        return list;
    }

    E update(E e, Long id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                list.add(i, e);//tar
                return e;
            }
        }
        return null;
    }
}