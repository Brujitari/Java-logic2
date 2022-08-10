public class Main {
    static class Persona {
        private int age;
        private String name;
        private int phone;
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return this.age;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }
        public int getPhone() {
            return this.phone;
        }
    }



    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setAge(4);
        miPersona.setName("Nat");
        miPersona.setPhone(465464646);

        int age = miPersona.getAge();
        String name = miPersona.getName();
        int phone = miPersona.getPhone();

        System.out.println(age);
        System.out.println(name);
        System.out.println(phone);
    }

}