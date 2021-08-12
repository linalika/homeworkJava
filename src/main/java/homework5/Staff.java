package homework5;

import java.util.HashMap;
import java.util.Map;

public class Staff {
    public static void main(String[] args) {
        String[] fullName = {"VМаксим", "Елена", "Аркадий","Айндрей", "Мария"};
        String[] position = {"Редактор","Менеджер","Руководитель","Аналитик","Бухгалтер"};
        String[] email = {"lkwe@ef.com","jkerf@.com","kjn@kmd","jn2@.co","kdj@kl.com"};
        String [] phoneNumber = {"79898989","79498989","79867989","78983456723","79898989"};
        int [] salary = {59000,89234,120897,78948,80900};
        int [] age = {34,45,38,44,38};
        Employee[] staff = new Employee[5];
        for (int i=0 ; i< staff.length; i++) {
            staff[i] = new Employee(fullName[i],position[i],email[i],phoneNumber[i],salary[i],age[i]);
        }
        for (int i=0 ; i< staff.length; i++) {
            staff[i].info();
        }
    }



}
