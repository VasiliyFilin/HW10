public class Main {
    public static void main(String[] args) {
//        Задача 1:
        System.out.println("Задача 1:\n");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

//        Задача 2:
        System.out.println("\nЗадача 2:\n");

        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperFullName);

//        Задача 3:
        System.out.println("\nЗадача 3:\n");

        fullName = "Иванов Семён Семёнович";
        String fullNameFix = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника " + fullNameFix);
    }
}