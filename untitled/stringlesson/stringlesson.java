package untitled.stringlesson;
public class stringlesson {
    public static void main(String[] args) {
        String str = "Java Is A Programming Language!";
        String str2 = "java";

        System.out.println(str.length());              // длина строки
        System.out.println(str.toLowerCase());         // перевод в нижний регистр
        System.out.println(str.toUpperCase());         // перевод в верхний регистр
        System.out.println(str.equals(str2));          // сравнение строк с учётом регистра

        System.out.println(str.equalsIgnoreCase(str2)); // сравнение без учёта регистра
        System.out.println(str.charAt(0));              // символ по индексу
        System.out.println(str.indexOf("Program"));     // индекс подстроки
        System.out.println(str.contains("Language"));   // содержит ли подстроку
        System.out.println(str.replace("Java", "Python")); // замена подстроки
        System.out.println(str.substring(8, 19));       // подстрока с 8 по 18 символ
        System.out.println(str.startsWith("Java"));     // начинается ли с "Java"
        System.out.println(str.endsWith("!"));          // заканчивается ли на "!"
        System.out.println(str.isEmpty());              // проверка на пустую строку
        System.out.println(str.trim());                 // убирает пробелы в начале и в конце
    }
}