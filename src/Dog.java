/**
 * Практикум 3 Cтворення членів класів. Практикум 4 - створення документації (у файлі .gitignore)
 */
    class Dog extends Animal implements Cloneable {  // Практикум 6 - Абстрактні класи, спадкування
        private String breed;
        private boolean isTrained;
        public Dog(String name, int age, String breed, boolean isTrained) { //
            super(name, age);
            this.breed = breed;
            this.isTrained = isTrained;
        }
        public String getBreed() {
            return breed;
        }
        public boolean isTrained() {
            return isTrained;
        }
        public void setTrained(boolean isTrained) {
            this.isTrained = isTrained;
        }
        @Override
        public void bark() {
            System.out.println("Woof!");
        }

    // Практикум 5 Оператори, умовні конструкції, цикли
        @Override
        public boolean equals(Object o) {  // Практикум 7 Логіка дорівнює - не дорівнює
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return isTrained == dog.isTrained && getName().equals(dog.getName()) && getBreed().equals(dog.getBreed());
        }

        public Dog clone() {  // Практикум 8 - Клонування об'єктів
            try {
                return (Dog) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", breed='" + breed + '\'' +
                    ", isTrained=" + isTrained +
                    '}';
        }
    }

