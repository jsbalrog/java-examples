class Dog {
    int size;
    String name;
    
    void bark(int numBarks) {
        while(numBarks > 0) {
            if(size > 60) {
                System.out.println("Woof!");
            } else if (size > 14) {
                System.out.println("Ruff!");
            } else {
                System.out.println("Yip!");
            }
            numBarks = numBarks - 1;
        }
    }
    
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 10;
        Dog three = new Dog();
        three.size = 55;
        
        one.bark(2);
        two.bark(5);
        three.bark(3);
    }
}
