public class What {
    public static void main(String[] args) {
        Dog gaf = new Dog();
        Cat jopa = new Cat();
        Popug myay = new Popug();
        Enchik Wova = new Enchik();

        gaf.all_data(" Король Ночи", "6", "верховно-черный","СМЭЭЭЭЭЭЭрть"       );
        System.out.println(gaf.getall_data());
        jopa.all_data(" СВЯТОЙ МЯУКАЛО", "8", "Серо-буро-малиновый","мяу" );
        System.out.println(jopa.getall_data());
        myay.all_data(" Летучая мышь", "1", "темненький","Попка дурак"       );
        System.out.println(myay.getall_data());
        Wova.all_data(" Воришка Вова", "100", "темно-белый в полску","хыхыххыхыхыы"       );
        System.out.println(Wova.getall_data());

    }
}