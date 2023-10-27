class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {

        System.out.println("Hayvan konuşuyor...");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {

        System.out.println(getName() + " ötüyor...");
    }


    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }


        @Override
        public void speak() {

            System.out.println(getName() + " havlıyor...");
        }


        static class Horse extends Animal {
            public Horse(String name) {
                super(name);
            }


            @Override
            public void speak() {

                System.out.println(getName() + " kişniyor...");
            }
        }

        public static class Main {

            public static void speaktry(Animal animal) {

                animal.speak();
            }

            public static void main(String[] args) {

                Animal animal = new Animal("Hayvan");

                Bird bird = new Bird("Limon");

                Dog dog = new Dog("Karabaş");

                Horse horse = new Horse("Şahbatur");

              /*  animal.speak();

                bird.speak();

                dog.speak();

                horse.speak();*/

               speaktry(new Bird("Limon"));




            }
        }
    }
}
