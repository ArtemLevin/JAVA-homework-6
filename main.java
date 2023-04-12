import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class main {

    public static Set<Notebook> creating_notebook_storage(){

        Random rnd = new Random();
    
        ArrayList<String> nb_brands = new ArrayList<>();
        
        nb_brands.add("Toshiba");
        nb_brands.add("Samsung");
        nb_brands.add("Acer");
        nb_brands.add("Sony");
        nb_brands.add("HP");
    
        ArrayList<String> nb_operatingSys = new ArrayList<>();
        nb_operatingSys.add("Windows 11");
        nb_operatingSys.add("Linux");
        nb_operatingSys.add("Ubuntu");
        nb_operatingSys.add("Windows 10");
        nb_operatingSys.add("Windows XP");
    
        ArrayList<String> nb_ram = new ArrayList<>();
        nb_ram .add("1");
        nb_ram .add("2");
        nb_ram .add("4");
        nb_ram .add("8");
        nb_ram .add("16");
    
        ArrayList<String> nb_hdd = new ArrayList<>();
        nb_hdd.add("128");
        nb_hdd.add("256");
        nb_hdd.add("512");
        nb_hdd.add("1024");
        nb_hdd.add("2048");
    
        Set<Notebook> nb_set = new HashSet<>();
        
        Notebook nb_1 = new Notebook(nb_brands.get(rnd.nextInt(4)), nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_1);
        Notebook nb_2 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_2);
        Notebook nb_3 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_3);
        Notebook nb_4 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_4);
        Notebook nb_5 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_5);
        Notebook nb_6 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_6);
        Notebook nb_7 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_7);
        Notebook nb_8 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_8);
        Notebook nb_9 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_9);
        Notebook nb_10 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_10);
        Notebook nb_11= new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_11);
        Notebook nb_12= new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_12);
        Notebook nb_13= new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_13);
        Notebook nb_14 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_14);
        Notebook nb_15 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_15);
        Notebook nb_16 = new Notebook(nb_brands.get(rnd.nextInt(4)), nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_16);
        Notebook nb_17 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_17);
        Notebook nb_18 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_18);
        Notebook nb_19 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_19);
        Notebook nb_20 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_20);
        Notebook nb_21 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_21);
        Notebook nb_22 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_22);
        Notebook nb_23 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_23);
        Notebook nb_24 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_24);
        Notebook nb_25 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_25);
        Notebook nb_26= new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_26);
        Notebook nb_27= new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_27);
        Notebook nb_28= new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_28);
        Notebook nb_29 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_29);
        Notebook nb_30 = new Notebook(nb_brands.get(rnd.nextInt(4)),nb_operatingSys.get(rnd.nextInt(4)), nb_ram.get(rnd.nextInt(4)), nb_hdd.get(rnd.nextInt(4)));
        nb_set.add(nb_30);

        return nb_set;

    }

    public static Map<Integer, String> customer_choice_method(){

        Scanner input = new Scanner(System.in);
        Map<Integer, String> customer_choice = new HashMap<Integer, String>();
        
        
        customer_choice.put(3, "0");
        customer_choice.put(4, "0");
        
        boolean proccess = true;
        
        while(proccess == true){
            
            System.out.println("Выберите цифру, соответствующую необходимому критерию:");
            System.out.println("1 ----> брэнд");
            System.out.println("2 ----> операционная система");
            System.out.println("3 ----> объем оперативной памяти");
            System.out.println("4 ----> объем жесткого диска");
            System.out.println("0 ----> выйти из меню выбора фильтра ");
            System.out.print("Введите цифру от 1 до 4 или 0 для выхода ----> ");
    
            int choice = input.nextInt();
    
            System.out.println();
    
            if (choice == 1){
    
                System.out.println("Ноутбук какого брэнда Вы бы хотели выбрать? ");
                System.out.println("Toshiba ----> 1 ");
                System.out.println("Samsung ----> 2");
                System.out.println("Acer ----> 3");
                System.out.println("Sony ----> 4");
                System.out.println("HP ----> 5");
                System.out.print("Введите цифру от 1 до 5 для выбора бренда ----> ");
    
                Integer customer_nb_brand = input.nextInt();
    
                System.out.println();
    
                if(customer_nb_brand == 1) customer_choice.put(1, "Toshiba");
                if(customer_nb_brand == 2) customer_choice.put(1, "Samsung");
                if(customer_nb_brand == 3) customer_choice.put(1, "Acer");
                if(customer_nb_brand == 4) customer_choice.put(1, "Sony");
                if(customer_nb_brand == 5) customer_choice.put(1, "HP");
                
        
            }
            
            else if(choice == 2){
    
                System.out.println("Какой тип операционной системы Вас интересует? ");
                System.out.println("Windows 11 ----> 1 ");
                System.out.println("Linux ----> 2 ");
                System.out.println("Ubuntu ----> 3 ");
                System.out.println("Windows 10 ----> 4 ");
                System.out.println("Windows XP ----> 5 ");
                System.out.print("Введите цифру от 1 до 5 для выбора операционной системы ----> ");
    
                Integer customer_nb_operatingSys = input.nextInt();
    
                System.out.println();
    
                if(customer_nb_operatingSys == 1) customer_choice.put(2, "Windows 11");
                if(customer_nb_operatingSys == 2) customer_choice.put(2, "Linux");
                if(customer_nb_operatingSys == 3) customer_choice.put(2, "Ubuntu");
                if(customer_nb_operatingSys == 4) customer_choice.put(2, "Windows 10");
                if(customer_nb_operatingSys == 5) customer_choice.put(2, "Windows XP");
                               
            }
    
            else if(choice == 3){
    
                System.out.print("Какой минимальный объем оперативной памяти Вас интересует? ");
                System.out.print("Введите 1 или 2 или 4 или 8 или 16 ----> ");
                String customer_nb_ram = input.next();
                customer_choice.put(3, customer_nb_ram );
    
                System.out.println();
                
            }
    
            else if(choice == 4){
    
                System.out.print("Какой минимальный объем жесткого диска Вас интересует? ");
                System.out.print("Введите 128 или 256 или 512 или 1024 или 2048 ----> ");
                String customer_nb_hdd = input.next();
                customer_choice.put(4, customer_nb_hdd);
    
                System.out.println();
                
            }
    
            else if(choice == 0) proccess = false;
            
        }

        input.close();  
        return customer_choice;
    }

    public static void filtration_method(Set<Notebook> nb_set, Map<Integer, String> customer_choice){

        int counter = 0;

        Iterator<Notebook> nb_set_iterator = nb_set.iterator();

        while(nb_set_iterator.hasNext()) {

            Notebook next_one = nb_set_iterator.next();
           
            if(customer_choice.get(1) == next_one.getBrand() && customer_choice.get(2) == next_one.getOperSys() && 
            Integer.parseInt(customer_choice.get(3)) <= Integer.parseInt(next_one.getRam()) && 
            Integer.parseInt(customer_choice.get(4)) <= Integer.parseInt(next_one.getHdd())){
    
                counter ++;
                System.out.println("Ноутбук номер ----> " + counter + " Характеристики:  Брэнд: " + next_one.getBrand() + " Операционная система: " + next_one.getOperSys() + " ОЗУ: " + next_one.getRam() + " Жесткий диск: " + next_one.getHdd() );
    
            }
    
            else if(customer_choice.containsKey(1) != true && customer_choice.get(2) == next_one.getOperSys() && 
            Integer.parseInt(customer_choice.get(3)) <= Integer.parseInt(next_one.getRam()) && 
            Integer.parseInt(customer_choice.get(4)) <= Integer.parseInt(next_one.getHdd())){
    
                counter ++;
                System.out.println("Ноутбук номер ----> " + counter + " Характеристики:  Брэнд: " + next_one.getBrand() + " Операционная система: " + next_one.getOperSys() + " ОЗУ: " + next_one.getRam() + " Жесткий диск: " + next_one.getHdd() );
    
            }
    
            else if(customer_choice.get(1) == next_one.getBrand() && customer_choice.containsKey(2) != true && 
            Integer.parseInt(customer_choice.get(3)) <= Integer.parseInt(next_one.getRam()) && 
            Integer.parseInt(customer_choice.get(4)) <= Integer.parseInt(next_one.getHdd())){
    
                counter ++;
                System.out.println("Ноутбук номер ----> " + counter + " Характеристики:  Брэнд: " + next_one.getBrand() + " Операционная система: " + next_one.getOperSys() + " ОЗУ: " + next_one.getRam() + " Жесткий диск: " + next_one.getHdd() );
    
            }
    
            else if(customer_choice.containsKey(1) != true && customer_choice.containsKey(2) != true && 
            Integer.parseInt(customer_choice.get(3)) <= Integer.parseInt(next_one.getRam()) && 
            Integer.parseInt(customer_choice.get(4)) <= Integer.parseInt(next_one.getHdd())){
    
                counter ++;
                System.out.println("Ноутбук номер ----> " + counter + " Характеристики:  Брэнд: " + next_one.getBrand() + " Операционная система: " + next_one.getOperSys() + " ОЗУ: " + next_one.getRam() + " Жесткий диск: " + next_one.getHdd() );
    
            }
    
        } 
    
        if(counter == 0) System.out.println("Ноутбука, который удовлетворяет заданным критериям, нет ");
          
    }

    public static void main(String[] args) {

        System.out.println("Заполняем склад ноутбуками...");
        System.out.println();
        Set<Notebook> nb_set = creating_notebook_storage();

        System.out.println("Покупатель настривает критерии фильтрации...");
        System.out.println();
        Map<Integer, String> customer_choice = customer_choice_method();
        
        System.out.println("Выводим ноутбуки, которые удовлетворяют критериям поиска...");
        System.out.println();
        filtration_method(nb_set, customer_choice);  
    }
}