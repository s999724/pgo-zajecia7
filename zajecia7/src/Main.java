import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Zadanie 1
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Dodge charger", 2001));
        carList.add(new Car("Dodge ram", 2011));
        carList.add(new Car("Honda (probably trashed)", 2010));
        carList.add(new Car("Audi S3", 1997));
        carList.add(new Car("Mazda 6", 2015));
        carList.add(new Car("Passat", 2002));
        carList.add(new Car("Cardboard box with wheels", 1992));
        carList.add(new Car("Mercedes???", 1952));
        carList.add(new Car("Porsche 911", 2008));
        carList.add(new Car("Tesla model alphabet", 2023));
        carList.sort(null);
        for (Car car : carList){
            System.out.println("Year made: " + car.getYearMade() + " car name: " + car.getCarName());
        }

        //Zadanie 2
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item(11, "Brazil"));
        itemList.add(new Item(22, "Dodge Charger"));
        itemList.add(new Item(33, "Rubber band"));
        itemList.add(new Item(44, "Pas silnikowy do malucha"));
        itemList.add(new Item(55, "Lidl mousepad"));
        for (int x = 0; x < itemList.size(); x++){
            itemList.get(x).show();
        }
        Map<Integer, String> itemMap = new HashMap<>();
        for(Item item : itemList){
            itemMap.put(item.getItemID(), item.getItemName());
        }
        for (Map.Entry<Integer, String> entry : itemMap.entrySet()){
            System.out.println("Item ID: " + entry.getKey() + " item name: " + entry.getValue());
        }
        //Zadanie 3
        itemList.add(new Item(10, "Vietnam"));
        itemList.add(new Item(20, "Dodge Ram"));
        itemList.add(new Item(30, "Rubber eraser"));
        itemList.add(new Item(40, "Pas do spodni"));
        itemList.add(new Item(50, "Lidl headphones"));
        itemList.add(new Item(60, "Ball pen"));
        itemList.add(new Item(70, "Drawer from Ikea"));
        itemList.add(new Item(80, "Broken glass"));
        itemList.add(new Item(90, "A pile of dirt"));
        itemList.add(new Item(100, "Cyberdeck"));
        HashSet<Item> itemSet = new HashSet<>();
        var subArray = itemList.subList(0, 5);
        itemSet.addAll(subArray);
        for (Item item : itemSet){
            System.out.println(item.getItemName());
        }
        //Zadanie 4
        int[] intTable = new int[10];
        InputNumber.fillArray(intTable);
        for (int x : intTable){
            System.out.println("Number in table: " + x);
        }
    }
}
