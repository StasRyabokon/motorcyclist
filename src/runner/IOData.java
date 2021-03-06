package runner;

import model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOData {

        public static void writeMotoObj(Motorcyclist motorcyclist) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("MotoObjects/"+motorcyclist.hashCode() + ".txt"));
        outputStream.writeObject(motorcyclist);
        outputStream.flush();
        outputStream.close();
    }
    public static void writeMotoObjToMotoList() throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("MotoObjects/motoList.txt"));
        Equipment jacket1 = new Jacket(400, 2.5, "Jacket", "Leather", "XL");
        Equipment jacket2 = new Jacket(350, 2.1, "Jacket", "Leatherette", "XXL");
        Equipment jacket3 = new Jacket(800, 2.6, "Jacket", "Composite", "S");
        Equipment jacket4 = new Jacket(630, 2.4, "Jacket", "Textile", "M");

        Equipment helmet1 = new Helmet(700, 3.6, "Helmet", "Black", true);
        Equipment helmet2 = new Helmet(750, 3.4, "Helmet", "Red", false);
        Equipment helmet3 = new Helmet(620, 3.0, "Helmet", "Yellow", true);
        Equipment helmet4 = new Helmet(1100, 2.9, "Helmet", "White", false);

        Equipment gloves1 = new Gloves(115, 0.300, "Gloves", false, "Black");
        Equipment gloves2 = new Gloves(180, 0.225, "Gloves", true, "Blue");
        Equipment gloves3 = new Gloves(230, 0.160, "Gloves", false, "Red");
        Equipment gloves4 = new Gloves(155, 0.200, "Gloves", true, "White");

        Equipment motoProtection1 = new MotoProtection(1130, 5.5, "MotoProtection", "Back", "XL");
        Equipment motoProtection2 = new MotoProtection(1850, 6.0, "MotoProtection", "Back", "XXL");
        Equipment motoProtection3 = new MotoProtection(1000, 6.2, "MotoProtection", "Back", "S");
        Equipment motoProtection4 = new MotoProtection(1360, 7.5, "MotoProtection", "Back", "M");

        Equipment jacket5 = new Jacket(320, 2.3, "Jacket", "Leather", "XS");
        Equipment jacket6 = new Jacket(370, 2.9, "Jacket", "Leatherette", "M");
        Equipment jacket7 = new Jacket(760, 2.5, "Jacket", "Composite", "XXL");
        Equipment jacket8 = new Jacket(660, 2.8, "Jacket", "Textile", "M");

        Equipment helmet5 = new Helmet(690, 3.9, "Helmet", "Black", true);
        Equipment helmet6 = new Helmet(770, 3.3, "Helmet", "Red", false);
        Equipment helmet7 = new Helmet(600, 3.7, "Helmet", "Yellow", true);
        Equipment helmet8 = new Helmet(1120, 2.7, "Helmet", "White", false);

        Equipment gloves5 = new Gloves(130, 0.320, "Gloves", false, "Green");
        Equipment gloves6 = new Gloves(165, 0.245, "Gloves", true, "Yellow");
        Equipment gloves7 = new Gloves(250, 0.130, "Gloves", false, "Purple");
        Equipment gloves8 = new Gloves(130, 0.200, "Gloves", true, "Black");

        Equipment motoProtection5 = new MotoProtection(1120, 5.4, "MotoProtection", "Back", "XS");
        Equipment motoProtection6 = new MotoProtection(2000, 6.9, "MotoProtection", "Back", "M");
        Equipment motoProtection7 = new MotoProtection(1900, 6.3, "MotoProtection", "Back", "XXL");
        Equipment motoProtection8 = new MotoProtection(1300, 7.7, "MotoProtection", "Back", "M");

        List<Equipment> list1 = new ArrayList<>();
        list1.add(jacket1);
        list1.add(helmet1);
        list1.add(gloves1);
        list1.add(motoProtection1);
        List<Equipment> list2 = new ArrayList<>();
        list2.add(jacket2);
        list2.add(helmet2);
        list2.add(gloves2);
        list2.add(motoProtection2);
        List<Equipment> list3 = new ArrayList<>();
        list3.add(jacket3);
        list3.add(helmet3);
        list3.add(gloves3);
        list3.add(motoProtection3);
        List<Equipment> list4 = new ArrayList<>();
        list4.add(jacket4);
        list4.add(helmet4);
        list4.add(gloves4);
        list4.add(motoProtection4);

        List<Equipment> list5 = new ArrayList<>();
        list5.add(jacket5);
        list5.add(helmet5);
        list5.add(gloves5);
        list5.add(motoProtection5);
        List<Equipment> list6 = new ArrayList<>();
        list6.add(jacket6);
        list6.add(helmet6);
        list6.add(gloves6);
        list6.add(motoProtection6);
        List<Equipment> list7 = new ArrayList<>();
        list7.add(jacket7);
        list7.add(helmet7);
        list7.add(gloves7);
        list7.add(motoProtection7);
        List<Equipment> list8 = new ArrayList<>();
        list8.add(jacket8);
        list8.add(helmet8);
        list8.add(gloves8);
        list8.add(motoProtection8);

        Motorcyclist cay = new Motorcyclist("Cay", "S. Horstmann", list1);
        Motorcyclist mark = new Motorcyclist("Mark", "Zuckerberg", list2);
        Motorcyclist alan = new Motorcyclist("Alan", "Turing", list3);
        Motorcyclist bill = new Motorcyclist("Bill", "Gates", list4);

        Motorcyclist gary = new Motorcyclist("Gary", "Cornell", list5);
        Motorcyclist steve = new Motorcyclist("Steve", "Jobs", list6);
        Motorcyclist ada = new Motorcyclist("Ada", "Lovelace", list7);
        Motorcyclist charles = new Motorcyclist("Charles", "Babbage", list8);

        outputStream.writeObject(cay);
        outputStream.writeObject(mark);
        outputStream.writeObject(alan);
        outputStream.writeObject(bill);
        outputStream.writeObject(gary);
        outputStream.writeObject(steve);
        outputStream.writeObject(ada);
        outputStream.writeObject(charles);
        outputStream.flush();
        outputStream.close();
    }

    public static void main(String[] args) throws IOException {
        List<Equipment> list3 = new ArrayList<>();
        Motorcyclist motorcyclist = new Motorcyclist("", "", list3);
        try {
            writeMotoObjToMotoList();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Motorcyclist> readMotoObj(Motorcyclist motorcyclist) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("MotoObjects/"+motorcyclist.hashCode() + ".txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        List<Motorcyclist> list = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            list.add((Motorcyclist) inputStream.readObject());
        }
        return list;

    }

    public static List<Motorcyclist> readFromMotoList() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("MotoObjects/motoList.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        List<Motorcyclist> list = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            list.add((Motorcyclist) inputStream.readObject());
        }
        return list;

    }

    public static boolean isExist(String path) {
        File file = new File(path);
        return file.exists();
    }

}
