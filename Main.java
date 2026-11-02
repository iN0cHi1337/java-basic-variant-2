public class Main {
    public static void main(String[] args) {
        // Код вашего варианта (условия, циклы, массивы)
        int[] t = {65,72,85,78,81,90,75,68,83,70};
        int sum=0;
        System.out.println("Проверка температуры оборудования...");
        for(int i=0;i< t.length;i++){
            int currentT=t[i];
            sum+=t[i];
            if(t[i]>80){
        System.out.println("Минута " + (i+1) + ":температура "+ t[i] + " Градуса(Тревога!)");
    }
}
double avg = (double) sum/t.length;
System.out.println("Средняя температура: " +avg + " градусов");
System.out.println("Модуль успешно инициализирован в Git!");
 }
}
//Комментарий в коде 
