package bubbasoft.possum.servlet;

import java.util.ArrayList;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import bubbasoft.possum.beans.Person;

public class PeoplePopulatorListener implements HttpSessionListener {

  @Override
  public void sessionCreated(HttpSessionEvent evt) {
    ArrayList<Person> people = new ArrayList<Person>();
    people.add(new Person("Cunningham", "Richie"));
    people.add(new Person("Fonzarelli", "Arthur"));
    people.add(new Person("Cunningham", "Howard"));
    people.add(new Person("Cunningham", "Marion"));
    people.add(new Person("Cunningham", "Joanie"));
    people.add(new Person("Weber", "Potsie"));
    people.add(new Person("Malph", "Ralph"));
    people.add(new Person("Matsuo Takahashi", "Arnold"));
    people.add(new Person("Delvecchio", "Al"));
    people.add(new Person("Arcola", "Chachi"));
    
    evt.getSession().setAttribute("PEOPLE", people);
  }

  @Override
  public void sessionDestroyed(HttpSessionEvent evt) {
  }
}
