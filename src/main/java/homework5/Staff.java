package homework5;

import java.util.HashMap;
import java.util.Map;

public class Staff {
    public static void main(String[] args) {
        String[] fullName = {"VМаксим", "Елена", "Аркадий","Айндрей", "Мария"};
        String[] position = {"Редактор","Менеджер","Руководитель","Аналитик","Бухгалтер"};
        String[] email = {"lkwe@ef.com","jkerf@.com","kjn@kmd","jn2@.co","kdj@kl.com"};
        String [] phoneNumber = {"79898989","79498989","79867989","78983456723","79898989"};
        String [] salary = {"59000","89234","120897","78948","80900"};
        String [] age = {"34","45","38","44","38"};
        Employee[] staff = new Employee[5];
        for (int i=0 ; i< staff.length; i++) {
            staff[i] = new Employee(fullName[i],position[i],email[i],phoneNumber[i],salary[i],age[i]);
        }
        for (int i=0 ; i< staff.length; i++) {
            staff[i].info();
        }
        System.out.println("Через Map");
        // такой вариант жизнеспособоный? или лучше оставить только массивы?
        // моя мысль в том что с map удобнее работать, например, чтобы вынсти заполнение в отдельный метод и не передавать 6 массивов
        Map<Integer, Map<String,String>> map= new HashMap<>();
        for (int i=0 ; i< staff.length; i++) {
            map.put(i, new HashMap<>());
            map.get(i).put("fullName", fullName[i]);
            map.get(i).put("position", position[i]);
            map.get(i).put("email", email[i]);
            map.get(i).put("phoneNumber", phoneNumber[i]);
            map.get(i).put("salary", salary[i]);
            map.get(i).put("age", age[i]);
        }

        Employee[] staffAnother = new Employee[5];
        for (int i=0 ; i< staffAnother.length; i++) {
            staffAnother[i] = new Employee(map.get(i).get("fullName"),map.get(i).get("position"),map.get(i).get("email"),
                    map.get(i).get("phoneNumber"),map.get(i).get("salary"),map.get(i).get("age"));
        }
        for (int i=0 ; i< staffAnother.length; i++) {
            staffAnother[i].info();
        }

    }
    public void createEmployeeObject(){

    }

}