import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

       // for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

            List<String> Names = new ArrayList<>();
            List<String> cities = Arrays.asList("Delhi","Bombay","Kolkatta","Chennai");

            List<String> SortCities = cities.stream().sorted().toList();

            System.out.println(SortCities);

            List<Integer> num = Arrays.asList(1,7,9,8,0,3,12,18);
            List<Integer> evennum = num.stream().filter(i->i%2==0).toList();
            System.out.println(evennum);

        Employee person1 =new Employee(20,20000,"dhiraj");
        Employee person2 =new Employee(10,10000,"raj");
        Employee person3 =new Employee(40,40000,"vikash");

        System.out.println(person1);


      //  }
    }
}

class Employee{
    int age;

    public Employee(int age) {
        this.age = age;
    }

    public Employee(int i, int i1, String s) {
        i = this.age;
        i1 = this.salary;
        s = this.name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int salary;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}