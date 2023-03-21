package by.itacademy.courses.hw7.Task3;

 class Fruit {
    String fruit;
    double weight;
    double fruitPrice;

    Fruit(String fruit,double weight,double fruitPrice){
        this.weight=weight;
        this.fruit=fruit;
        this.fruitPrice=fruitPrice;
    }
    double price(double weight) {
         return fruitPrice*weight;
     }

}

