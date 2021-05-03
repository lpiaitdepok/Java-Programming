package aplikasilogin;

/**
 *
 * @author Hp
 */
public class usersession {
    private static int id;
    private static String username;    
    private static String nama;
    
    public static int get_id(){
        return id;
    }
    
    public static void set_id(int id){
        usersession.id = id;
    }
    
    public static String get_username(){
        return username;
    }
    
    public static void set_username(String username){
        usersession.username = username;
    }
    
    public static String get_nama(){
        return nama;
    }
    
    public static void set_nama(String nama){
        usersession.nama = nama;
    }

}
