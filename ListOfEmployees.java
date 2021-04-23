package main.java.pack_5;

class employee {
    private String name;
    private String position;
    private String mail;
    private long tel;
    private int cash;
    private int age;

    public employee(){

    }

    public employee (String name, String position, String mail, long tel, int cash, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.tel = tel;
        this.cash = cash;
        this.age = age;
        }

    public void info() {
        System.out.println(
                " Имя работника: " + name + ";" + "\n" +
                " Должность: " + position + ";" +"\n" +
                " Эл. почта: " + mail + ";" + "\n" +
                " Телефон: " + tel + ";" + "\n" +
                " Зарплата: " + cash + ";" + "\n" +
                " Возраст: " + age);
    }

}
