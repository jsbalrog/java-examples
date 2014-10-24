public class GardenMaker {
    private Garden garden;

    public Garden getGarden(String type) {
        garden = new VeggieGarden(); // Default type
        if(type.equals("Flower")) {
            garden = new FlowerGarden();
        }
        return garden;
    }

    public static void main(String[] args) {
        GardenMaker gardenMaker = new GardenMaker();
        Garden garden1 = gardenMaker.getGarden("Flower");
        Garden garden2 = gardenMaker.getGarden("Veggie");
        Plant borderPlantForVeggie = garden2.getBorder();
        System.out.println(borderPlantForVeggie.getName());
    }
}

