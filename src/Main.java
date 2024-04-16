import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException{
        String bddName="utilisateurs";
        String urlDatabase="jdbc:mysql://localhost:3306/"+bddName;
        String login="root";
        String passwd="Darlish13524680";
        //création d'une connexion à la BDD/
        Connection conn=DriverManager.getConnection(urlDatabase,login,passwd);
        //Un objet de la classe Statement permet dvenvoyer des requêtes SQL/
                Statement stm=conn.createStatement();
        //création d'une requûte SQL/
        String req="SELECT * FROM user ;";
        /* envoi de la requites*/
        /* le résultat est stocké dans un objet de type ResulSet qui "pointe" sur lo table résultat*/
        ResultSet res=stm.executeQuery(req);
        /*1a méthode next permet d'accéder à la première ligne puis aux lignes suivanteg*/
        while(res.next()) { //si il y a un résultet (au moins une ligne)
            // accès au premier champ (première colonne)
            int id = res.getInt(1);
            //accès au deuxième champ
            String nom = res.getString(2);
            //effichages
            System.out.println(id + " : " + nom);
}
}
}