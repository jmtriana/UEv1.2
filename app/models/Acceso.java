package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.ArrayList;


public class Acceso extends Model {
    public int id;
    public double standar_time_ac=0;
    public int fallos_ac=0;
    public Item itemsAcceso;

    private static Acceso instance = null;

    public final static String TAG = "Acceso";

    public ArrayList<Item> itemsAcs;
    public ArrayList<Item> itemsHSEa;
    public ArrayList<Item> itemsRack;
    public ArrayList<Item> itemsEquip;
    public ArrayList<Item> itemsCables;
    public ArrayList<Item> itemsEnergy;
    public ArrayList<Item> itemsCyE;

    public Acceso() {

        itemsAcs = new ArrayList<>();
        itemsHSEa = new ArrayList<>();
        itemsRack = new ArrayList<>();
        itemsEquip = new ArrayList<>();
        itemsCables = new ArrayList<>();
        itemsEnergy = new ArrayList<>();
        itemsCyE = new ArrayList<>();

        Item x = null;

        //Primer Encabezado HSE
        Item item0ac = new Item("HSE y adicionales", 0, "", "acceso", "");
        itemsAcs.add(item0ac);
        itemsHSEa.add(item0ac);
        x = Item.finderItems.where().like("descripcion", item0ac.descripcion).findUnique();
        if (x == null) {
            item0ac.save();
        }
        Item item1ac = new Item(" Toda la documentacion legal como documentos de EPS, ARP, carnet de la empresa y certificado de huawei deben se portado por el cooperador.", 1, "", "dwdm", "24.1.061");
        itemsAcs.add(item1ac);
        itemsHSEa.add(item1ac);
        x = Item.finderItems.where().like("descripcion", item1ac.descripcion).findUnique();
        if (x == null) {
            item1ac.save();
        }
        Item item2ac = new Item("Elementos de seguridad industrial y herramientas adecuadas para la instalacion deben ser llevadas por cada uno de los integrantes de la cuadrilla.", 1, "", "dwdm", "24.1.062");
        itemsAcs.add(item2ac);
        itemsHSEa.add(item2ac);
        x = Item.finderItems.where().like("descripcion", item2ac.descripcion).findUnique();
        if (x == null) {
            item2ac.save();
        }
        Item item3ac = new Item(" El cuarto de equipos debe estar limpio y organizado, las partes sobrantes deben quedar organizadas registradas y entregadas al cliente.", 0.2, "", "dwdm", "19.1.005");
        itemsAcs.add(item3ac);
        itemsHSEa.add(item3ac);
        x = Item.finderItems.where().like("descripcion", item3ac.descripcion).findUnique();
        if (x == null) {
            item3ac.save();
        }

        // Segundo Encabezado: Instalación Gabinete.
        Item item4ac = new Item("Instalación Gabinete", 0, "", "acceso", "");
        itemsAcs.add(item4ac);
        itemsRack.add(item4ac);
        x = Item.finderItems.where().like("descripcion", item4ac.descripcion).findUnique();
        if (x == null) {
            item4ac.save();
        }
        Item item5ac = new Item("Todas las medidas anticorrosivas y de impermeabilizacion deben ser adoptadas para equipos y racks.",4,"","acceso","1.1.001");
        itemsAcs.add(item5ac);
        itemsRack.add(item5ac);
        x = Item.finderItems.where().like("descripcion", item5ac.descripcion).findUnique();
        if (x == null) {
            item5ac.save();
        }
        Item item6ac = new Item("Las partes de soporte del rack  deben ser instaladas correcta y firmemente, todos los tornillos deben ser instalados de acuerdo con los requerimientos.Todas las partes de aislamineto del rack deben ser instaladas como lo son arandelas o placas de impermeabilización.",1.5,"","acceso","1.1.003");
        itemsAcs.add(item6ac);
        itemsRack.add(item6ac);
        x = Item.finderItems.where().like("descripcion", item6ac.descripcion).findUnique();
        if (x == null) {
            item6ac.save();
        }
        Item item7ac = new Item(" El rack debe ser instalado de acuerdo a la posición indicada en el documento de ingeniería.",0.5,"","acceso","1.1.008");
        itemsAcs.add(item7ac);
        itemsRack.add(item7ac);
        x = Item.finderItems.where().like("descripcion", item7ac.descripcion).findUnique();
        if (x == null) {
            item7ac.save();
        }
        Item item8ac = new Item("Las caras del rack deben estar alineadas tanto vertical como horizontalmente.",0.2,"","acceso","1.1.010");
        itemsAcs.add(item8ac);
        itemsRack.add(item8ac);
        x = Item.finderItems.where().like("descripcion", item8ac.descripcion).findUnique();
        if (x == null) {
            item8ac.save();
        }
        Item item9ac = new Item("La manila antiestatica debe ser insertada en el orificio del equipo correspondiente.",0.2,"","acceso","1.1.011");
        itemsAcs.add(item9ac);
        itemsRack.add(item9ac);
        x = Item.finderItems.where().like("descripcion", item9ac.descripcion).findUnique();
        if (x == null) {
            item9ac.save();
        }
        Item item10ac = new Item("Todos los paneles falsos del equipo deben ser ubicados en sus slots correspondientes.",0.2,"","acceso","1.1.012");
        itemsAcs.add(item10ac);
        itemsRack.add(item10ac);
        x = Item.finderItems.where().like("descripcion", item10ac.descripcion).findUnique();
        if (x == null) {
            item10ac.save();
        }
        Item item11ac = new Item("El rack debe estar sin ningun golpe o daño en su estructura.",1.5,"","acceso","1.1.013");
        itemsAcs.add(item11ac);
        itemsRack.add(item11ac);
        x = Item.finderItems.where().like("descripcion", item11ac.descripcion).findUnique();
        if (x == null) {
            item11ac.save();
        }
        Item item12ac = new Item("La resistencia entre el punto de tierra y los pernos de fijacion debe ser minimo de 5MΩ",6,"","acceso","6.1.007");
        itemsAcs.add(item12ac);
        itemsRack.add(item12ac);
        x = Item.finderItems.where().like("descripcion", item12ac.descripcion).findUnique();
        if (x == null) {
            item12ac.save();
        }

        //Tercer Encabezado: Instalacion equipos
        Item item13ac = new Item("Instalación Equipos",0,"","acceso","");
        itemsAcs.add(item13ac);
        itemsEquip.add(item13ac);
        x = Item.finderItems.where().like("descripcion", item13ac.descripcion).findUnique();
        if (x == null) {
            item13ac.save();
        }
        Item item14ac = new Item("Las partes de soporte del HW, ODF y MDF  deben ser instaladas correcta y firmemente, todos los tornillos deben ser instalados de acuerdo con los requerimientos.  ",1.5,"","acceso","1.1.004");
        itemsAcs.add(item14ac);
        itemsEquip.add(item14ac);
        x = Item.finderItems.where().like("descripcion", item14ac.descripcion).findUnique();
        if (x == null) {
            item14ac.save();
        }

        //Cuarto Encabezado: Instalacion de cables
        Item item15ac = new Item("Instalacion de cables",0,"","acceso","");
        itemsAcs.add(item15ac);
        itemsCables.add(item15ac);
        x = Item.finderItems.where().like("descripcion", item15ac.descripcion).findUnique();
        if (x == null) {
            item15ac.save();
        }
        Item item16ac = new Item("No existe daño o ruptura en el conector del cable suscriptor.",2,"","acceso","4.1.001");
        itemsAcs.add(item16ac);
        itemsCables.add(item16ac);
        x = Item.finderItems.where().like("descripcion", item16ac.descripcion).findUnique();
        if (x == null) {
            item16ac.save();
        }
        Item item17ac = new Item("La forma y organización del cable dentro del rack debe ser correcta y como se especifico en el documento de diseño del sitio.  ",0.5,"","acceso","4.1.009");
        itemsAcs.add(item17ac);
        itemsCables.add(item17ac);
        x = Item.finderItems.where().like("descripcion", item17ac.descripcion).findUnique();
        if (x == null) {
            item17ac.save();
        }
        Item item18ac = new Item("El cableado debe ser amarrado de forma uniforme y por capas, el amarrado debe ser limpio y los amarres blancos deben asegurar hacia un mismo lado. los cortes de sobrante del amarre no deben tener puntas o filos que puedan afectar elementos de la instalación o a los mismos instaladores.",0.5,"","acceso","4.1.014");
        itemsAcs.add(item18ac);
        itemsCables.add(item18ac);
        x = Item.finderItems.where().like("descripcion", item18ac.descripcion).findUnique();
        if (x == null) {
            item18ac.save();
        }
        Item item19ac = new Item("La fibra optica debe ser figurada con velcro, sin cruces ni tensiones.",0.5,"","acceso","5.1.009");
        itemsAcs.add(item19ac);
        itemsCables.add(item19ac);
        x = Item.finderItems.where().like("descripcion", item19ac.descripcion).findUnique();
        if (x == null) {
            item19ac.save();
        }
        Item item20ac = new Item(" La marquilla del cable suscriptor debe estar ubicada a 2cm del conector con información correcta y legible.",0.5,"","acceso","2.1.020");
        itemsAcs.add(item20ac);
        itemsCables.add(item20ac);
        x = Item.finderItems.where().like("descripcion", item20ac.descripcion).findUnique();
        if (x == null) {
            item20ac.save();
        }
        Item item21ac = new Item("La marquilla de la fibra óptica debe estar ubicada a 2cm del conector con información correcta y legible.",0.5,"","acceso","2.1.021");
        itemsAcs.add(item21ac);
        itemsCables.add(item21ac);
        x = Item.finderItems.where().like("descripcion", item21ac.descripcion).findUnique();
        if (x == null) {
            item21ac.save();
        }

        //Quinto Encabezado: Cable de energia
        Item item22ac = new Item("Cable de energia",0,"","acceso","");
        itemsAcs.add(item22ac);
        itemsEnergy.add(item22ac);
        x = Item.finderItems.where().like("descripcion", item22ac.descripcion).findUnique();
        if (x == null) {
            item22ac.save();
        }
        Item item23ac = new Item("La protección de tierra del cable de poder DC se debe conectar al barraje de tierra que nos provea el cliente.",4,"","acceso","3.1.005");
        itemsAcs.add(item23ac);
        itemsEnergy.add(item23ac);
        x = Item.finderItems.where().like("descripcion", item23ac.descripcion).findUnique();
        if (x == null) {
            item23ac.save();
        }
        Item item24ac = new Item("Cables de poder y tierras deben ser conectados correcta y firmemente.",3,"","acceso","3.2.004");
        itemsAcs.add(item24ac);
        itemsEnergy.add(item24ac);
        x = Item.finderItems.where().like("descripcion", item24ac.descripcion).findUnique();
        if (x == null) {
            item24ac.save();
        }
        Item item25ac = new Item("La organización del cable de poder y de tierras debe realizarse según el diseño de documento de ingeniería.",0.5,"","acceso","3.2.025");
        itemsAcs.add(item25ac);
        itemsEnergy.add(item25ac);
        x = Item.finderItems.where().like("descripcion", item25ac.descripcion).findUnique();
        if (x == null) {
            item25ac.save();
        }
        Item item26ac = new Item("Los cables de poder no se deben cruzar entre si con cables existentes. El recorrido y figurado se debe hacer con amarres blancos y en bloque. Si son figurados en paralelo, debe existir como minimo 3 cm de espaciamiento entre ellos.",0.5,"","acceso","3.2.044");
        itemsAcs.add(item26ac);
        itemsEnergy.add(item26ac);
        x = Item.finderItems.where().like("descripcion", item26ac.descripcion).findUnique();
        if (x == null) {
            item26ac.save();
        }
        Item item27ac = new Item("Todas las marquillas deben ser instaladas, cable DC, cable de tierras, cable de alarma y cable de transmision, deben ser marquillados a ambos lados es decir del puerto que salen y en el puerto al que entran.",0.5,"","acceso","7.1.013");
        itemsAcs.add(item27ac);
        itemsEnergy.add(item27ac);
        x = Item.finderItems.where().like("descripcion", item27ac.descripcion).findUnique();
        if (x == null) {
            item27ac.save();
        }

        //Sexto Encabezado: Canaleta y escalerilla
        Item item28ac = new Item("Canaleta y Escalerilla",0,"","acceso","");
        itemsAcs.add(item28ac);
        itemsCyE.add(item28ac);
        x = Item.finderItems.where().like("descripcion", item28ac.descripcion).findUnique();
        if (x == null) {
            item28ac.save();
        }
        Item item29ac = new Item("La escalerilla debe ser instalada adecuadamente con los accesorios necesarios para garantizar la fijación de la misma. Debe quedar a nivel y aterrizada a barraje de sitio.",1,"","access","10.0.001");
        itemsAcs.add(item29ac);
        itemsCyE.add(item29ac);
        x = Item.finderItems.where().like("descripcion", item29ac.descripcion).findUnique();
        if (x == null) {
            item29ac.save();
        }
        Item item30ac = new Item("La canaleta debe ser instalada adecuadamente con los accesorios necesarios garantizando la fijacion de la misma.Debe quedar a nivel y aterrizada al barraje del sitio.",1,"","acceso","10.0.002");
        itemsAcs.add(item30ac);
        itemsCyE.add(item30ac);
        x = Item.finderItems.where().like("descripcion", item30ac.descripcion).findUnique();
        if (x == null) {
            item30ac.save();
        }


    }

    public ArrayList<Item> retornaAcc(String ac){

        if(ac.equals("ac")){
            return itemsHSEa;
        }else if(ac.equals("ac1")){
            return itemsRack;
        }else if(ac.equals("ac2")){
            return itemsEquip;
        }else if(ac.equals("ac3")){
            return  itemsCables;
        }else if(ac.equals("ac4")){
            return  itemsEnergy;
        }else if(ac.equals("ac5")){
            return  itemsCyE;
        }
        return null;
    }

    public static Acceso getInstance (){
        if(instance==null ){
            instance = new Acceso();
        }
        return instance;
    }

}
