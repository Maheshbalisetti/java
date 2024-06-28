
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        HashMap hs = new HashMap();
        Employee e1 = new Employee("rohit","india","js");
        Employee e2 = new Employee("kohli","india","ks");
        Employee e3 = new Employee("dhoni","india","ms");

        hs.put(120, e1);
        hs.put(121, e2);
        hs.put(122, e3);

        System.out.println("Hash Map output");
        System.out.println(hs);
        System.out.println("________________");

        LinkedHashMap lhs = new LinkedHashMap();
        lhs.put(120, e1);
        lhs.put(121, e2);
        lhs.put(122, e3);
        System.out.println("Linked Hash Map output");
        System.out.println(lhs);
        System.out.println("________________");

        TreeMap tr = new TreeMap();
        tr.put(120, e1);
        tr.put(121, e2);
        tr.put(122, e3);

        System.out.println(" output");
        System.out.println(tr);

    }

}

class Employee{
    String name ;
    String address;
    String role;
    public Employee(String name, String address, String role) {
        super();
        this.name = name;
        this.address = address;
        this.role = role;
    }
    @Override
    public String toString() {
        return "[name=" + name + ", address=" + address + ", role=" + role + "]";
    }




}
