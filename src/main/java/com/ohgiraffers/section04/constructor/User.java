package com.ohgiraffers.section04.constructor;

public class User {
        private String id;
        private String pwd;
        private String name;
        private java.util.Date enrollDate;

        /*필기. 생성자의 작성위치
        *  문법상으로 크래스 내부에 작성하면 되지만, 통상적으로 필드 선언부와 메소드 선언부 사이에 적는 것이 관례이다.*/

    /*필기. 생성자의 사용목적
    *  1.인스턴스 생성시점에 수행할 명령이 있는 경우 사용한다
    *  2.매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화 하며 인스턴스를 생성할 목적으로 주로 사용된다
    *  3.작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미
    *  따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 있다 (초기값 전달 강제)*/

    /*필기. 생성자 작성시 주의 할 점.
    *  1. 생성자 메소드는 반드시 클래스의 이름과 동일해야한다. (대/소문자까지)
    *  2. 생성자 메소드는 반환형을 작성하지않는다. (작성하는 경우 생성자가 아닌 일반 메소드로 인식한다)
    *  */

    /*필기. 생성자의 종류
    *  1. 기본 생성자 (매개변수 없는 생성자)
    *  2. 매개변수 있는 생성자*/


    /*목차. 1. 기본생성자 (default constructor)*/
    public User() {
        System.out.println("User 클래스의 기본 생성자 호출함...");
    }

    /*목차. 2. 매개변수 있는 생성자*/
    /*필기. id, pw, name의 초기화를 담당할 생성자*/

    public User(String id, String pwd, String name) {

        /*필기. 매개변수있는 생성자의 주 목적은 인스턴스 생성 시점에 매개변수로 전달받은 값을 이용해서 필드를 초기화 하는 목적이다.*/
        this.id = id;  //필드의 있는 값으로 덮기위해서 this를 씀.
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name 을 초기화 하는 생성자 호출함...");

    }
    /*목차. 3. 모든필드를 초기화 하는 생성자를 호출하여 인스턴스 생성후 필드 값 출력*/
    public User(String id, String pwd, String name, java.util.Date enrollDate) {
        this.id = id;
        this.pwd =pwd;
        this.enrollDate =enrollDate;

        System.out.println("User 클래스의 모든 필드를 초기화 하는 생성자 호출함...");
    }

    public String getInfo() {


        return "User [id = " + this.id + " , pwd= " + this.pwd + ", name = "+this.name + ",enrollDate =" +this.enrollDate +"]";
    }
}
