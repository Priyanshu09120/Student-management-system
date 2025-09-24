import java.util.*;

public class StudentService {
    private final Map<Integer, Student> store = new HashMap<>();

    public boolean add(Student s) {
        if (store.containsKey(s.getId())) return false;
        store.put(s.getId(), s);
        return true;
    }

    public Student get(int id) {
        return store.get(id);
    }

    public boolean update(int id, String newName, String newContact) {
        Student s = store.get(id);
        if (s == null) return false;
        if (newName != null && !newName.isBlank()) s.setName(newName);
        if (newContact != null && !newContact.isBlank()) s.setContact(newContact);
        return true;
    }

    public boolean delete(int id) {
        return store.remove(id) != null;
    }

    public List<Student> listAll() {
        List<Student> list = new ArrayList<>(store.values());
        list.sort(Comparator.comparingInt(Student::getId));
        return list;
    }
}
