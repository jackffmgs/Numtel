import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//public class NumTel {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите свой телфон");
//        String number = in.nextLine();
//
//        if (number.replaceAll("[^0-9]", "").length() < 11) {
//            System.out.println(number.replaceAll("[^0-9]", ""));
//        } else {
//            System.out.println(number.replaceAll("[^0-9]", "").substring(1));
//        }
//    }
//}
//
//}
//     Задача с 4.5 c вводом текста
public class NumTel{
    public static void main(String[] args) {

        String text =
                "Every day in elementary school in America begins at 9.20 a.m. Children have classes till 3.15 p.m. At 12 o’clock children have lunch. Many boys and girls bring their lunch from home. But some of them go for lunch to a school cafeteria.\n" +
                "Mrs. Bradley prepares school lunches almost every weekday for her two children. Sometimes she gives the children money and they eat in the school cafeteria. But usually the children prefer to take a lunch from home.";

        text = text.replaceAll("[\\.\\,0-9]","");
        ArrayList<String> newText = new ArrayList<String>(Arrays.asList(text.split("\\s+")));
        for(int i = 0; i < newText.size(); i++)
        {
            System.out.println(newText.get(i));
        }
    }
}
//Задание FIO без Array #########################################################################
//public class NumTel
//{
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите ваше ФИО");
//        String num = in.nextLine();
//        if (num.replaceAll("[а-яА-Яa-zA-Z]","").length() == 2)
//        {
//            System.out.println("Фамилия: " + num.substring(0,num.indexOf(' ')));
//            System.out.println("Имя: " + num.substring(num.indexOf(' '), num.lastIndexOf(' ')));
//            System.out.println("Отчество: " + num.substring(num.lastIndexOf(' '), num.length()));
//        }
//        else {
//            System.out.println("Введите в верном формате ваше ФИО");
//        }
//    }
//}
//Задание FIO без Array #########################################################################