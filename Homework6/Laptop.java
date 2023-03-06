
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.    
// Создать множество ноутбуков.    
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
//     1 - ОЗУ
//     2 - Объем ЖД
//     3 - Операционная система
//     4 - Цвет
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class Laptop {

    private String name;
    private String ram;
    private String hardDisk;
    private String operatingSystem;
    private String colour;
    
    public Laptop(String name, String ram, String hardDisk, String operatingSystem, String colour) {
        this.name = name;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
    }
    public String getName() {
        return name;
    }
    public String getRam() {
        return ram;
    }
    public String getHardDisk() {
        return hardDisk;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }    
    public String getColour() {
        return colour;
    }
    @Override
    public String toString() {
        return "Notebook " + name + "/" + ram + "/" + hardDisk + "/"
                + operatingSystem + "/" + colour;
    }
}