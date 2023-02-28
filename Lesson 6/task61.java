public class task61 {
    public static class Laptop {
                int id;
                String model, brand, color;
                int RAM, memory;
                boolean OS;
        
                public Laptop(int id, String model, String brand, String color, boolean OS, int memory, int RAM) {
                        this.id = id;
                        this.model = model;
                        this.OS = OS;
                        this.brand = brand;
                        this.color = color;
                        this.memory = memory;
                        this.RAM = RAM;
                }
        
                public String toString(int number) {
                        String temp = this.OS ? "Male" : "Female";
                        return "Cat's number: " + number + "\n" +
                                "Name: " + model + "\n" +
                                "Gender: " + temp + "\n" +
                                "Breed: " + brand + "\n" +
                                "Colour: " + color + "\n" +
                                "Weight: " + memory + "\n" +
                                "Age: " + RAM + "\n";
                }
        
        
                public static StringBuilder getLaptopsByOS(Laptop[] LPs, boolean OS){
                        StringBuilder result = new StringBuilder();
                        for (Laptop c: LPs) {
                                if (c.OS==OS){
                                        result.append(c.model);
                                        result.append(" ");
                                }
                        }
                        return result;
                }
        
        
        
        }
    public static void main(String[] args) {

        Laptop LP1 = new Laptop(1, "Macbook", "Apple", "black", true, 256, 16);
        Laptop LP2 = new Laptop(2, "Galaxy Book", "Samsung", "silver", true, 512, 16);
        Laptop LP3 = new Laptop(3, "Legion", "Lenovo", "blue", true, 1024, 32);
        Laptop LP4 = new Laptop(4, "TUF", "Asus", "blue", false, 1024, 32);

        Laptop[] laptops = new Laptop[]{LP1, LP2, LP3, LP4};

        System.out.println(Laptop.getLaptopsByOS(laptops, false));
        System.out.println(Laptop.getLaptopsByOS(laptops, true));
    }
}
