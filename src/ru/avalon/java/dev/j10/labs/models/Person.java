package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    
    /*
     * TODO(Студент): Создайте класс Address.
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
     *
     * 2. Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле.
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе.
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */
    public Passport passport;
    public Address address;
    
    public Person(String name, String surname, String middleName, String secondName){
        
        this.passport = new Passport(name, surname, middleName, secondName);
        this.address = new Address();
    }
    
    public void SetAddress(int index, String city, String street, String houseNumber, String apartmentNumber){
        address.index = index;
        address.city = city;
        address.street = street;
        address.houseNumber = houseNumber;
        address.apartmentNumber = apartmentNumber;
        
    }
    
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        if (passport.middleName != null) {
            return passport.name+" "+passport.surname+" "+passport.middleName;
        }
        else if (passport.secondName != null) {
            return passport.name+" "+passport.secondName.charAt(0)+". "+passport.surname;
        }    
        else {    
            return passport.name+" "+passport.surname;
        }
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        String fullAddress = null;
        if (address.index != 0) {
            fullAddress = fullAddress+", "+address.index;
        } 
        if (address.city != null) {
            if (fullAddress != null) {
                fullAddress = fullAddress+", "+address.city;
            }
        }
        if (address.street != null) {
            if (fullAddress != null) {
                fullAddress = fullAddress+", "+address.street;
            }
        }
        if (address.houseNumber != null) {
            if (fullAddress != null) {
                fullAddress = fullAddress+", "+address.houseNumber;
            }
        }
        if (address.apartmentNumber != null) {
            if (fullAddress != null) {
                fullAddress = fullAddress+", "+address.apartmentNumber;
            }
        }
        
        if (fullAddress == null){
            return "Не указан";
        }
        else{
            return fullAddress;
        }        
    }
}