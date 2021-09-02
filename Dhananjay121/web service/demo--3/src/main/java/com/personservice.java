package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class personservice {

 static HashMap<Integer, person> personIdMap = getPersonIdMap(); //map list

 public personservice() {
super();

 if (personIdMap == null) {
personIdMap = new HashMap<Integer, person>();
// Creating some objects of Person while initializing
person indiaperson = new person(1, "ram1", "ram@gmail.com", "delhi");
person chinaperson = new person(2, "ram2", "ram@gmail.com", "delhi");
person nepalperson = new person(3, "ram3", "ram@gmail.com", "delhi");
person bhutanperson = new person(4, "ram4", "ram@gmail.com", "delhi");

 //adding map list of collections in java
personIdMap.put(1, indiaperson);
personIdMap.put(4, chinaperson);
personIdMap.put(3, nepalperson);
personIdMap.put(2, bhutanperson);
}
}

 public List<person> getAllPersonlist() {
List<person> personlist = new ArrayList<person>(personIdMap.values());
return personlist;
}

 public person getperson(int id) {
person person = personIdMap.get(id);
return person;
}
// add person
public person addPerson(person person) {
person.setId(getMaxId()+ 1);
// key , value
personIdMap.put(person.getId(), person); ///logic class
return person;
}
//update
public person updatePerson(person person) {
if (person.getId() <= 0)
return null;
personIdMap.put(person.getId(), person);
return person;

 }
//delete

 public void deletePerson(int id) {
personIdMap.remove(id);
}

 public static HashMap<Integer, person> getPersonIdMap() {
return personIdMap;
}

 // Utility method to get max id
public static int getMaxId() {
int max = 0;
for (int id : personIdMap.keySet()) {
if (max <= id)
max = id;

 }
return max;
}
}