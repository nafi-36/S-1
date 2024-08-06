import java.util.ArrayList;

class Employee {
    private String name;
    private int income;

    public Employee(String name, int income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }

    public String toString() {
        return "Employee => " + "name : " + name + ", income : " + income + "\n";
    }
}

public class sortingObject {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Jake", 200000));
        emp.add(new Employee("Jay", 120000));
        emp.add(new Employee("Rose", 100000));
        emp.add(new Employee("Jae", 340000));
        emp.add(new Employee("Jane", 250000));

        System.out.println("===== DESCENDING SORT =====");
        System.out.println("Data sebelum diurutkan :");
        System.out.println(emp);

        selectionSort(emp);

        System.out.println("Data setelah diurutkan :");
        System.out.println(emp);
    }

    static void selectionSort(ArrayList<Employee> emp) {
        for (int i = 0; i < emp.size() - 1; i++) {
            int mindex = i;
            for (int j = i + 1; j < emp.size(); j++) {
                if (emp.get(j).getIncome() > emp.get(mindex).getIncome()) {
                    mindex = j;
                }
            }

            Employee temp = emp.get(mindex);
            emp.set(mindex, emp.get(i));
            emp.set(i, temp);
        }
    }
}