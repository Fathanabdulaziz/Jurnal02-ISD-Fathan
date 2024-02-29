public class main {
    public static void main(String[] args) {
        toko_ABC<atk> atklist = new toko_ABC<>(5);
        toko_ABC<bag> baglist = new toko_ABC<>(5);
    
        atklist.addData(new atk("A001", "Spidol", "Manusia Salju", 10));
        atklist.addData(new atk("A002", "Pensil", "kastil fiber", 10));
        atklist.addData(new atk("A003", "Pulpen", "Joinko", 10));
        atklist.addData(new atk("B001", "Buku tulis", "Joinko", 10));
        atklist.addData(new atk("A001", "Kertas", "Joinko", 10));

        baglist.addData(new bag("C001", "tempat pensil", "shaun the sheep", 10));
        baglist.addData(new bag("C002", "Tas", "confess", 10));
        baglist.addData(new bag("C003", "Tas", "shaun the sheep", 10));
        baglist.addData(new bag("C004", "tempat pensil", "Manusia iron", 10));
        baglist.addData(new bag("C005", "tempat pensil", "Power Ranger", 10));
        

        atklist.display();
        baglist.display();
        
        System.out.println("---------------------------------------------------");
        System.out.println("------------------REMOVE DATA----------------------");
        System.out.println("---------------------------------------------------");

        atklist.removeData(1);
        atklist.display();
        baglist.removeData(3);
        baglist.display();

        System.out.println("---------------------------------------------------");
        System.out.println("-------------------SET DATA------------------------");
        System.out.println("---------------------------------------------------");
        
        atklist.setData(3, new atk("A002", "Pensil", "Joinko", 2));
        atklist.display();
    }
}
