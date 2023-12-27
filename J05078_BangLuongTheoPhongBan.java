import java.util.*;
class Room{
    private String id, name;

    public Room(String inp) {
        String[] arr = inp.trim().split("\\s+");
        this.id = arr[0];
        this.name = String.join(" ",Arrays.copyOfRange(arr, 1, arr.length));
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Employee{
    private String id, name;
    private Room room;
    private int basicSalary, wordDay, totalSalary;

    public Employee(String id, String name, int basicSalary, int wordDay) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.wordDay = wordDay;
        this.totalSalary = getTotalSalary();
    }

    public String getId() {
        return id;
    }

    public Room getRoom() {
        return room;
    }

    public int getTotalSalary() {
        int mul;
        int year = Integer.parseInt(id.substring(1, 3));
        if(id.startsWith("A")){
            if(year > 16) mul = 20;
            else if(year >= 9) mul = 14;
            else if(year >= 4) mul = 12;
            else mul = 10;
        }
        else if(id.startsWith("B")){
            if(year > 16) mul = 16;
            else if(year >= 9) mul = 13;
            else if(year >= 4) mul = 11;
            else mul = 10;
        }
        else if(id.startsWith("C")){
            if(year > 16) mul = 14;
            else if(year >= 9) mul = 12;
            else if(year >= 4) mul = 10;
            else mul = 9;
        }
        else{
            if(year > 16) mul = 13;
            else if(year >= 9) mul = 11;
            else if(year >= 4) mul = 9;
            else mul = 8;
        }
        return basicSalary * mul * wordDay * 1000;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + totalSalary;
    }
}

public class J05078_BangLuongTheoPhongBan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Room> map = new LinkedHashMap<>();
        int n = sc.nextInt(); sc.nextLine();
        for(int i = 0; i < n; i++){
            Room tmp = new Room(sc.nextLine());
            map.put(tmp.getId(), tmp);
        }
        int m = sc.nextInt(); sc.nextLine();
        Employee[] employees = new Employee[m];
        for(int i = 0; i < m; i++){
            employees[i] = new Employee(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            employees[i].setRoom(map.get(employees[i].getId().substring(3)));
        }
        String name = sc.nextLine();
        System.out.println("Bang luong phong " + map.get(name).getName() + ":");
        for(Employee x : employees)
            if(x.getRoom().getId().equals(name))
                System.out.println(x);
    }
}