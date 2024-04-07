package org.example.mutability.practice1;

public class Driver {
    public static void main(String[] args) {
        testV1();
        testV2();
        testV3();
        testV4();
        testV5();
    }

    private static void testV1() {
        PersonV1 personV1 = new PersonV1();
        personV1.setName("Katheer");
        personV1.setDob("30/11/1999");
        PersonV1[] kids = new PersonV1[4];
        PersonV1 kid1 = new PersonV1();
        kid1.setName("A");
        kid1.setDob("01/03/2025");

        PersonV1 kid2 = new PersonV1();
        kid2.setName("B");
        kid2.setDob("01/03/2027");

        PersonV1 kid3 = new PersonV1();
        kid3.setName("C");
        kid3.setDob("01/03/2029");

        PersonV1 kid4 = new PersonV1();
        kid4.setName("D");
        kid4.setDob("01/03/2031");

        kids[0] = kid1;
        kids[1] = kid2;
        kids[2] = kid3;
        kids[3] = kid4;

        personV1.setKids(kids);

        System.out.println("==> Object built for the first time");
        System.out.println(personV1);

        System.out.println("==> Data being mutated by setters");
        personV1.setName("Abd");
        kid1.setName("AA");
        kid2.setDob("N/A");
        System.out.println(personV1);

        System.out.println("-".repeat(10) + " END " + "-".repeat(10));
    }

    private static void testV2() {
        PersonV2[] kids = new PersonV2[4];
        PersonV2 kid1 = new PersonV2("A", "01/03/2025");
        PersonV2 kid2 = new PersonV2("B", "01/03/2027");
        PersonV2 kid3 = new PersonV2("C", "01/03/2029");
        PersonV2 kid4 = new PersonV2("D", "01/03/2031");

        kids[0] = kid1;
        kids[1] = kid2;
        kids[2] = kid3;
        kids[3] = kid4;

        PersonV2 personV2 = new PersonV2("Katheer", "30/11/1999", kids);

        System.out.println("==> Object built for the first time");
        System.out.println(personV2);

        System.out.println("==> Data being mutated by objects passed in constructor");
        kids[0] = null;
        kids[1] = null;
        System.out.println(personV2);

        System.out.println("-".repeat(10) + " END " + "-".repeat(10));
    }

    private static void testV3() {
        PersonV3[] kids = new PersonV3[4];
        PersonV3 kid1 = new PersonV3("A", "01/03/2025");
        PersonV3 kid2 = new PersonV3("B", "01/03/2027");
        PersonV3 kid3 = new PersonV3("C", "01/03/2029");
        PersonV3 kid4 = new PersonV3("D", "01/03/2031");

        kids[0] = kid1;
        kids[1] = kid2;
        kids[2] = kid3;
        kids[3] = kid4;

        PersonV3 personV3 = new PersonV3("Katheer", "30/11/1999", kids);

        System.out.println("==> Object built for the first time");
        System.out.println(personV3);

        System.out.println("==> No impact when mutated by objects passed in constructor");
        kids[0] = null;
        kids[1] = null;
        System.out.println(personV3);

        System.out.println("==> But, it has impact when mutated by getting objects via getter");
        PersonV3[] kidsFromGetter = personV3.getKids();
        kidsFromGetter[0] = null;
        kidsFromGetter[1] = null;
        System.out.println(personV3);

        System.out.println("-".repeat(10) + " END " + "-".repeat(10));
    }

    private static void testV4() {
        PersonV4[] kids = new PersonV4[4];
        PersonV4 kid1 = new PersonV4("A", "01/03/2025");
        PersonV4 kid2 = new PersonV4("B", "01/03/2027");
        PersonV4 kid3 = new PersonV4("C", "01/03/2029");
        PersonV4 kid4 = new PersonV4("D", "01/03/2031");

        kids[0] = kid1;
        kids[1] = kid2;
        kids[2] = kid3;
        kids[3] = kid4;

        PersonV4 personV4 = new PersonV4("Katheer", "30/11/1999", kids);

        System.out.println("==> Object built for the first time");
        System.out.println(personV4);

        System.out.println("==> No impact when mutated by objects passed in constructor");
        kids[0] = null;
        kids[1] = null;
        System.out.println(personV4);

        System.out.println("==> No impact when mutated by getting objects via getter");
        PersonV4[] kidsFromGetter = personV4.getKids();
        kidsFromGetter[0] = null;
        kidsFromGetter[1] = null;
        System.out.println(personV4);

        System.out.println("-".repeat(10) + " END " + "-".repeat(10));
    }

    private static void testV5() {
        PersonV5[] kids = new PersonV5[4];
        PersonV5 kid1 = new PersonV5("A", "01/03/2025");
        PersonV5 kid2 = new PersonV5("B", "01/03/2027");
        PersonV5 kid3 = new PersonV5("C", "01/03/2029");
        PersonV5 kid4 = new PersonV5("D", "01/03/2031");

        kids[0] = kid1;
        kids[1] = kid2;
        kids[2] = kid3;
        kids[3] = kid4;

        PersonV5 personV5 = new PersonV5("Katheer", "30/11/1999", kids);

        System.out.println("==> Object built for the first time");
        System.out.println(personV5);

        System.out.println("==> No impact when mutated by objects passed in constructor");
        kids[0] = null;
        kids[1] = null;
        System.out.println(personV5);

        System.out.println("==> No getters, finally!!!");
        personV5.domainLogic();
        personV5.addKid(new PersonV5("E", "01/03/2033"));

        System.out.println("-".repeat(10) + " END " + "-".repeat(10));
    }
}
