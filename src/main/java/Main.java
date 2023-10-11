
import java.util.Scanner;
public class Main
{
    public static void main( String[] args )
    {
        System.out.println("Введите количество человек для разделения счета");
        int countClients;
        Check check = new Check();
        while (true) {
            Scanner sc = new Scanner(System.in);
            String result = sc.nextLine();
            try {
                countClients = Integer.parseInt(result);
                if (countClients <= 1) {
                    System.out.println("Введен не верный формат, либо количество человек - 1 и менее, повторите попытку");
                } else {
                    System.out.println("Введено клиентов: " + countClients);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Введен не верный формат, либо количество человек - 1 и менее, повторите попытку");
            }
        }
        while (true) {
            System.out.println("Введите название товара.  Для завершения работы - введите \"Завершить\"");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("завершить")) {
                break;
            }
            System.out.println("Введите цену товара.");
            Double price = 0D;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextDouble()) {
                    Double result = scanner.nextDouble();
                    if (result <= 1) {
                        System.out.println("Вы ввели неверный формат цены, либо она составляет менее 1 рубля" +
                                ",\n введите цену в формате \"15.00\"");
                    } else {
                        price = result;
                        break;
                    }
                } else {
                    System.out.println("Вы ввели неверный формат цены, либо она составляет менее 1 рубля" +
                            ",\n введите цену в формате \"15.00\"");
                }
            }
            Good good = new Good(name, price);
            check.addSum(good.getPrice());
            check.addGoodName(good.getName(), good.getPrice());
        }
        Double sumToOneClient = check.div(countClients);
        Formator checker = new Formator(sumToOneClient);
        String result = "Вот Ваш чек: \n" + check.getGoods() + "\n" +
                "Общая стоимость: " + check.getSum() + "\n" +
                "Счет разделен на " + countClients + " человек\n" +
                "С каждого человека по " + String.format("%.2f", sumToOneClient) + " " + checker.formator();
        System.out.println(result);
    }
}