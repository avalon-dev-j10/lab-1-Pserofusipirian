package ru.avalon.java.dev.j10.labs.models;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    
    //область видимости - в пределах пакета, т.к. нет необходимость использовать где-либо еще
    String passportNumber;
    String name;
    String surname;
    String middleName;
    String secondName;
    Date birthDate;
    Date issueDate;
    String issuedBy;
        
    Passport(String name, String surname, String middleName, String secondName) {
        
        this.name = name;
        this.surname = surname;
        
        if (!middleName.equals("")){
        this.middleName = middleName;
        }
        
        if (!secondName.equals("")){
        this.secondName = secondName;
        }
    }
    
    Passport(String name, String surname, String middleName, String secondName, Date birthDate, 
            String passportNumber, Date issueDate, String issuedBy) {
        this(name, surname, middleName, secondName);
        this.birthDate = birthDate;
        this.passportNumber = passportNumber;
        this.issueDate = issueDate;
        this.issuedBy = issuedBy;        
    }
    
    void SetBirthDate(Date birthDate) {
        this.birthDate = birthDate;        
    }
    
    void SetPassportData(String passportNumber, Date issueDate, String issuedBy) {
        this.passportNumber = passportNumber;
        this.issueDate = issueDate;
        this.issuedBy = issuedBy;        
    }
    
    String GetName(){
        return name;
    }
    
    String GetSurname(){
        return surname;
    }
    
    String GetMiddleName(){
        return middleName;
    }
    
    String GetSecondName(){
        return secondName;
    }
    
    Date GetBirthDate(){
        return birthDate;
    }
    
    String GetPassportData(){
        DateFormat formatOnlyDate = new SimpleDateFormat("dd.MM.yyyy");
        
        return "Паспорт: "+passportNumber+", Выдан: "+issuedBy+", Дата выдачи: "+formatOnlyDate.format(issueDate);
    }
}
