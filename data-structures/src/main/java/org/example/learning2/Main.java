package org.example.learning2;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact> emailSet = new HashSet<>(emails);
        Set<Contact> phoneSet = new HashSet<>(phones);
        printData("Email Set", emailSet);
        printData("Phone Set", phoneSet);

        int i = emails.indexOf(new Contact("Robin Hood"));
        Contact contact = emails.get(i);
        contact.addEmail("IG India");
        System.out.println(contact);
        contact.addEmail("IG India");

        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(phoneSet);
        unionAB.addAll(emailSet);
        printData("A \u222A B Union of phones (A) and emails (B)", unionAB);

        Set<Contact> intersectionAB = new HashSet<>();
        intersectionAB.addAll(phoneSet);
        intersectionAB.retainAll(emailSet);
        printData("A \u2229 B Intersection of phones (A) and emails (B)", intersectionAB);

        Set<Contact> unionBA = new HashSet<>();
        unionBA.addAll(emailSet);
        unionBA.addAll(phoneSet);
        printData("B \u222A A Union of emails (B) and phones (A) ", unionBA);

        Set<Contact> intersectionBA = new HashSet<>();
        intersectionBA.addAll(emailSet);
        intersectionBA.retainAll(phoneSet);
        printData("B \u2229 A Intersection of emails (B) and phones (A)", intersectionBA);

        Set<Contact> AminusB = new HashSet<>();
        AminusB.addAll(phoneSet);
        AminusB.removeAll(emailSet);
        printData("A - B phones (A) - emails (B)", AminusB);

        Set<Contact> BminusA = new HashSet<>();
        BminusA.addAll(emailSet);
        BminusA.removeAll(phoneSet);
        printData("B - A emails (B) - phones (A)", BminusA);

        Set<Contact> symmetricAB = new HashSet<>();
        symmetricAB.addAll(AminusB);
        symmetricAB.addAll(BminusA);
        printData("Symmetric of A and B", symmetricAB);

        Set<Contact> symmetricAB2 = new HashSet<>();
        symmetricAB2.addAll(unionAB);
        symmetricAB2.removeAll(intersectionAB);
        printData("Symmetric of A and B v2", symmetricAB2);
    }

    public static void printData(String header, Collection<Contact> contacts) {

        System.out.println("----------------------------------------------");
        System.out.println(header);
        System.out.println("----------------------------------------------");
        contacts.forEach(System.out::println);
    }
}
