/*
Дана последовательность целых чисел а1, а2, ... , an. Образовать новую последовательность,
выбросив из исходной те числа, которые равны min(a1, a2, ... , an).
*/

public class Task8 {    
    public static void main(String[] args) {
        int array[] = new int[20];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 21 - 10);
        }        
        System.out.print("Исходный массив: ");
        for(int x : array) {
            System.out.print(x + "  ");
        }
        int min = array[0];              
        for(int i = 0; i < array.length; i++) {  // ищем минимум в массиве
            if(array[i] < min) min = array[i];
        }
        System.out.println("\nМинимум: " + min);
        int n = 0;
        for(int x : array) {   // подсчитываем число элементов, которые не равны минимуму
            if(x != min) n++;
        }
        int array2[] = new int[n];   // создаем новый массив и заполняем его элементами массива, которые не равны минимуму
        for(int i = 0, j = 0; i < array.length; i++) {
            if(array[i] == min) continue;
            array2[j] = array[i];
            j++;            
        }        
        System.out.print("Новый массив: ");
        for(int x : array2) {
            System.out.print(x + "  ");
        }
    }
}
