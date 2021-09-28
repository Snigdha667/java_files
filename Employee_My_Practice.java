import java.util.Scanner;
public class Employee {
    public int eid;
    public String ename;
    public int emp_sal;
    public String c_name;
    public Employee(int id, int sal, String name, String cname)
    {
        eid = id;
        ename = name;
        emp_sal = sal;
        c_name = cname;
    }
    public void result(Employee arr[]){
        int x = 0;
        int y = 0;
        for (int i =0; i<arr.length;i++){
            if (arr[i].c_name.equals("A")){
                if (arr[i].emp_sal>x){
                    x = arr[i].emp_sal;
                }
            }
            else
            {
                if(arr[i].emp_sal>y)
                {
                    y = arr[i].emp_sal;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        Employee arr1[] = new Employee[a];
        for (int j=0;j< arr1.length;j++)
        {
            arr1[j] = new Employee(id = s.nextInt(), name = s.next(), sal = s.nextInt(), cname = s.next() );
            
        }
        for (int k=0;k< arr1.length;k++){

            if (arr1[k].emp_sal.equals(x)){
                System.out.println(Employee.result(arr1[k]));
            }
            if (arr1[k].emp_sal.equals(y)){
                System.out.println(Employee.result(arr1[k]));
            }
            
        }
    }
}
